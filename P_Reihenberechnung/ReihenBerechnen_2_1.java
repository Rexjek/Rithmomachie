/**
 * Beschreiben Sie hier die Klasse ReihenBerechnen_2_1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ReihenBerechnen_2_1
{
    private SpielsteineBerechnen stein;
    private String[] WGR;
    private String[] WHR;
    private String[] SHR;

    /**
     * Konstruktor f¸r Objekte der Klasse ReihenBerechnen_2_1
     */
    public ReihenBerechnen_2_1()
    {
        // Instanzvariable initialisieren
        stein = new SpielsteineBerechnen();
        
        weissGeoReiheBerechnenAwBwCw();
        weissGeoReiheBerechnenAwBwCs();
        weissGeoReiheBerechnenAwBsCw();
        weissGeoReiheBerechnenAsBwCw();
        
        weissHarmoReiheBerechnenAwBwCw();
        weissHarmoReiheBerechnenAwBwCs();
        weissHarmoReiheBerechnenAwBsCw();
        weissHarmoReiheBerechnenAsBwCw();
        
        schwarzHarmoReiheBerechnenAsBsCs();
        schwarzHarmoReiheBerechnenAsBsCw();
        schwarzHarmoReiheBerechnenAsBwCs();
        schwarzHarmoReiheBerechnenAwBsCs();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter f¸r eine Methode
     * @return        die Summe aus x und y
     */
    private void weissGeoReiheBerechnenAwBwCw()
    {
        double a;
        double b;
        int count = 0;

        WGR = new String[999];

        System.out.println("Geometriche Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Weiﬂ ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = (b * b)/a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WGR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WGR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissGeoReiheBerechnenAwBwCs()
    {
        double a;
        double b;
        int count = 0;

        WGR = new String[999];

        System.out.println("Geometriche Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Weiﬂ ; c: Schwarz");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = (b * b)/a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WGR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WGR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissGeoReiheBerechnenAwBsCw()
    {
        double a;
        double b;
        int count = 0;

        WGR = new String[999];

        System.out.println("Geometriche Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Schwarz ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getS(y);

                double wert = (b * b)/a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WGR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WGR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissGeoReiheBerechnenAsBwCw()
    {
        double a;
        double b;
        int count = 0;

        WGR = new String[999];

        System.out.println("Geometriche Reihen Weiss:");
        System.out.println("a: Schwarz ; b: Weiﬂ ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getW(y);

                double wert = (b * b)/a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WGR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WGR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    
    
    
    private void weissHarmoReiheBerechnenAwBwCw()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Weiﬂ ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }
        
                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissHarmoReiheBerechnenAwBwCs()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Weiﬂ ; c: Schwarz");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }
        
                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissHarmoReiheBerechnenAwBsCw()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
        System.out.println("a: Weiﬂ ; b: Schwarz ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }
        
                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void weissHarmoReiheBerechnenAsBwCw()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
        System.out.println("a: Schwarz ; b: Weiﬂ ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getW(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }
        
                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    
    
    
    private void schwarzHarmoReiheBerechnenAsBsCs()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println("a: Schwarz ; b: Schwarz ; c: Schwarz");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void schwarzHarmoReiheBerechnenAsBsCw()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println("a: Schwarz ; b: Schwarz ; c: Weiﬂ");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void schwarzHarmoReiheBerechnenAsBwCs()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println("a: Schwarz ; b: Weiﬂ ; c: Schwarz");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getW(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    private void schwarzHarmoReiheBerechnenAwBsCs()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println("a: Weiﬂ ; b: Schwarz ; c: Schwarz");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SHR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
}
