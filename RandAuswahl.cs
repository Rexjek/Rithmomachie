using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RandAuswahl : MonoBehaviour {

    public static RandAuswahl Instance { set; get; }             // durch Instance von fast überall anwählbar 

    public GameObject AuswahlPrefab;
    private List<GameObject> Auswahl;                            // neue Liste 
    private void Start() 
    {
        Instance = this;
        Auswahl = new List<GameObject> ();
    }
    private GameObject DasAuswahlObjekt() 
    {
        GameObject go = Auswahl.Find(g => !g.activeSelf);       //sucht ein inaktives Objekt (mit !g.activeSelf)

        if (go == null)                                         // Wenn man kein Objekt findet wird ein neues erstellt 
        {
            go = Instantiate(AuswahlPrefab); 
            Auswahl.Add(go); 
        }
        return go;
    }

    public void AuswahlErlaubterBewegung(bool[,] moves)
    {
        for (int i = 0; i < 16; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if(moves[i,j])
                {
                    GameObject go = DasAuswahlObjekt();        // wir haben ein inaktives objekt oder erstellen eins
                    go.SetActive(true);                        // setzt das objekt auf aktiv
                    go.transform.position = new Vector3(i, 0, j);
                }
            }
        }
    }

    public void VersteckteAuswahl()                             //Setzt das durch versteckte Kachel aktiv gesetzte Objekt wieder inaktiv
    {

        foreach (GameObject go in Auswahl)
            go.SetActive(false);
        
            
    }
    

}