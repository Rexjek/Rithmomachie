 public class ReihenBerechnen
{
    private SpielsteineBerechnen stein;
    private String[] WGR;
    private String[] SGR;
    private String[] WAR;
    private String[] SAR;
    private String[] WHR;
    private String[] SHR;


    public ReihenBerechnen()
    {
        stein = new SpielsteineBerechnen();
        
        weissGeoReiheBerechnen();
        schwarzGeoReiheBerechnen();
        weissAriReiheBerechnen();
        schwarzAriReiheBerechnen();
        weissHarmoReiheBerechnen();
        schwarzHarmoReiheBerechnen();
    }

    private void weissGeoReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        WGR = new String[999];

        System.out.println("Geometriche Reihen Weiss:");
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
    private void schwarzGeoReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        SGR = new String[999];

        System.out.println("Geometriche Reihen Schwarz:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (b * b)/a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SGR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SGR[count] = ("" + a + b + wert);

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

    private void weissAriReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        WAR = new String[999];

        System.out.println("Arithmetische Reihen Weiss:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = 2*b - a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(WAR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getW(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            WAR[count] = ("" + a + b + wert);

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
    private void schwarzAriReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        SAR = new String[999];

        System.out.println("Arithmetische Reihen Schwarz:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = 2*b - a;
                
                if( a != b && a < b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SAR[anzahl].equals(("" + a + b + wert)))
                            {
                                neu = false;
                            }
                        }

                        if(wert == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                                
                            SAR[count] = ("" + a + b + wert);

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

    private void weissHarmoReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
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
    private void schwarzHarmoReiheBerechnen()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                if( a != b )
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
    
    public void schwarzHarmoReiheBerechnen2()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                /*
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
                        {*/
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                            /*    
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }*/
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    public void weissHarmoReiheBerechnen2()
    {
        double a;
        double b;
        int count = 0;

        WHR = new String[999];

        System.out.println("Harmonische Reihen Weiss:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getW(x);
                b = stein.getW(y);

                double wert = (a*b)/(2*a-b);
                /*
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
                        {*/
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wert);
                            /*    
                            SHR[count] = ("" + a + b + wert);

                            count++;
                        }
                    }
                }*/
            }
        }

        System.out.println();
        System.out.println("Anzahl an Reihen: " + count);
        System.out.println();
    }
    
    public void schwarzHarmoReiheGrdBerechnen()
    {
        double a;
        double b;
        int count = 0;

        SHR = new String[999];

        System.out.println("Harmonische Reihen Schwarz:");
        System.out.println();

        for(int x = 0; x < 24; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                a = stein.getS(x);
                b = stein.getS(y);

                double wert = (a*b)/(2*a-b);
                
                double wertG = Math.round(wert);
                
                if( a != b )
                {
                    for(int z = 0; z < 24; z++)
                    {
                        boolean neu = true;
                        for(int anzahl = 0; anzahl < count; anzahl++)
                        {
                            if(SHR[anzahl].equals(("" + a + b + wertG)))
                            {
                                neu = false;
                            }
                        }

                        if(wertG == stein.getS(z) && neu == true)
                        {
                            System.out.println("a = " + a + " , b = " + b + "  --> c = " + wertG);
                                
                            SHR[count] = ("" + a + b + wertG);

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
