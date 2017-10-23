
using UnityEngine;
using System.Collections.Generic;
public class Spiel : MonoBehaviour
{
                                                                                    // spieler == spielstein 
    public Spieler[,] Spieler2 { set; get; }
    private Spieler selectedspieler;

                                                                                    //Deaktivierung der Spielsteine durch X-/Y-Wert = -1
    private const float Kachel_Groese = 1.0f;
    private const float Kachel_Durchmesser = 0.5f;

    private int selectionX = -1;
    private int selectionY = -1;

    public List<GameObject> spielsteine_1;
    private List<GameObject> aktivespielsteine;

    private Quaternion orientation = Quaternion.Euler(0, 180, 0);

    public bool isWhiteTurn = true;

    private void Start()
    {
        SpawnAlles();

    }                                                                               //spawner

    private void SpawnAlles()
    {
        aktivespielsteine = new List<GameObject>();
        Spieler2 = new Spieler[8, 16];

                                                                                    // Weises team

                                                                                    //Weis rund 1 

        SpawnStein(0, 2, 3);

        SpawnStein(1, 3, 3);

        SpawnStein(2, 4, 3);

        SpawnStein(3, 5, 3);

                                                                                    //weis rund 2  

        SpawnStein(4, 2, 2);

        SpawnStein(5, 3, 2);

        SpawnStein(6, 4, 2);

        SpawnStein(7, 5, 2);

                                                                                    //Weis viereck 1

        SpawnStein(8, 0, 1);

        SpawnStein(9, 1, 1);

        SpawnStein(10, 6, 1);

        SpawnStein(11, 7, 1);

                                                                                    //Weis viereck 2

        SpawnStein(12, 0, 0);

        SpawnStein(13, 1, 0);

        SpawnStein(14, 6, 0);

        SpawnStein(15, 7, 0);

                                                                                     //weis Dreieck 1

        SpawnStein(16, 0, 2);

        SpawnStein(17, 1, 2);

        SpawnStein(18, 6, 2);

        SpawnStein(19, 7, 2);

                                                                                     //weis Dreieck 2

        SpawnStein(16, 2, 1);

        SpawnStein(17, 3, 1);

        SpawnStein(18, 4, 1);

        SpawnStein(19, 5, 1);

                                                                                     // schwarz kreis 1

        SpawnStein(20, 2, 12);

        SpawnStein(21, 3, 12);

        SpawnStein(23, 4, 12);

        SpawnStein(24, 5, 12);

                                                                                    // schwarz kreis 2


        SpawnStein(25, 2, 13);

        SpawnStein(26, 3, 13);

        SpawnStein(27, 4, 13);

        SpawnStein(28, 5, 13);


    }                                                                               // steine methode (x/z position) 

    private Vector3 Mitte(int x, int z)
    {
        Vector3 ursprung = Vector3.zero;
        ursprung.x += (Kachel_Groese * x) + Kachel_Durchmesser;
        ursprung.z += (Kachel_Groese * z) + Kachel_Durchmesser;
        return ursprung;
    }                                                                               // spawn punkt fuktion
    
                                                                                    // Update  wird einmal pro frame aufgerufen
    public void Update() {

        UpdateSelection();
        Brett();

        if (Input.GetMouseButtonDown(0))                                            // Auswählen (0= linke maustaste)
        {
            if (selectionX >= 0 && selectionY >= 0)
            {
                if (selectedspieler == null)
                {
                                                                                    // wähle spieler aus
                    SelectSpieler(selectionX,selectionY);
                }
                else
                {
                                                                                    // bewege den spieler
                    bewegeSpieler(selectionX, selectionY);
                }

            }
        }
    }

    private void SelectSpieler (int x, int y)
     {
        if (Spieler2[x, y] == null)
            return;

        if (Spieler2[x, y].isWhite != isWhiteTurn)
            return;

        selectedspieler = Spieler2[x, y];

        
     }

    private void bewegeSpieler(int x,int y)
    {
        if (selectedspieler.PossibleMove(x, y))
        {
            Spieler2[selectedspieler.CurrentX, selectedspieler.CurrentY] = null;
            selectedspieler.transform.position = Mitte(x, y);
            Spieler2[x, y] = selectedspieler;
            isWhiteTurn = !isWhiteTurn;
        }

        selectedspieler = null;
    }
    
    private void UpdateSelection()
    {
        if (!Camera.main)
            return;

        RaycastHit hit;
        if (Physics.Raycast(Camera.main.ScreenPointToRay(Input.mousePosition), out hit, 25.0f, LayerMask.GetMask("SpielBrett")))
        {
            
            selectionX = (int)hit.point.x;
            selectionY = (int)hit.point.z;
        }
        else
        {
            selectionX = -1;
            selectionY = -1;
        }
    }

    public void  Brett()
    {
        Vector3 breiteLinie = Vector3.right * 8;
        Vector3 laengeLinie = Vector3.forward * 16;
        for (int i = 0; i <= 16; i++)
        {
            Vector3 start = Vector3.forward * i ; 
            Debug.DrawLine(start,start +breiteLinie );
            for (int k = 0; k <= 8; k++)
            {
                 start = Vector3.right  * k;
                Debug.DrawLine(start, start + laengeLinie);
            }
        }
        

                                                                                     // selection
      if(selectionX >= 0 && selectionY >= 0)
        {
            Debug.DrawLine(
                Vector3.forward * selectionY + Vector3.right * selectionX,
                Vector3.forward * (selectionY + 1) + Vector3.right * (selectionX + 1));

            Debug.DrawLine(
                 Vector3.forward *( selectionY + 1) + Vector3.right * selectionX,
                 Vector3.forward * selectionY  + Vector3.right * (selectionX + 1));

        }
    }
                                                                                    // spawnt steine methode
    public void SpawnStein(int index,int x, int y)
    {
        GameObject go = Instantiate(spielsteine_1[index], Mitte(x,y) , orientation) as GameObject; //macht steine mit dem index 
        go.transform.SetParent(transform);
        Spieler2 [x, y] = go.GetComponent<Spieler>() ;
        Spieler2[x, y].SetzePositon(x, y); 
        aktivespielsteine.Add(go);
    }
}

