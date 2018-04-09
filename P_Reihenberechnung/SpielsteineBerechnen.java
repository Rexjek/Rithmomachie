
import java.util.Arrays;
public class SpielsteineBerechnen
{
    // instance variables - replace the example below with your own
    private double[] w;
    private double[] s;

    public SpielsteineBerechnen()
    {
        w = new double[24];
        s = new double[24];

        weissBerechnen();
        schwarzBerechnen();

        Arrays.sort(w);
        Arrays.sort(s);
        /*
        for(int i = 0; i < 24; i++)
        {
            System.out.println(s[i]);
        }
        */
    }

    private void weissBerechnen()
    {
        int n = 2;
        int x = 0;

        for(int z = 1; z < 5; z++)
        {
            for(int i = 0; i < 6; i++)
            {
                switch(i)
                {
                    case 0: w[x] = n;
                    break;
                    case 1: w[x] = n*n;
                    break;
                    case 2: w[x] = n*(n+1);
                    break;
                    case 3: w[x] = (n+1)*(n+1);
                    break;
                    case 4: w[x] = (n+1)*(2*n+1);
                    break;
                    case 5: w[x] = (2*n+1)*(2*n+1);
                    break;
                    default:
                    break;
                }
                x++;
            }
            n = n + 2;
        }
    }

    private void schwarzBerechnen()
    {
        int n = 3;
        int x = 0;

        for(int z = 1; z < 5; z++)
        {
            for(int i = 0; i < 6; i++)
            {
                switch(i)
                {
                    case 0: s[x] = n;
                    break;
                    case 1: s[x] = n*n;
                    break;
                    case 2: s[x] = n*(n+1);
                    break;
                    case 3: s[x] = (n+1)*(n+1);
                    break;
                    case 4: s[x] = (n+1)*(2*n+1);
                    break;
                    case 5: s[x] = (2*n+1)*(2*n+1);
                    break;
                    default:
                    break;
                }
                x++;
            }
            n = n + 2;
        }
    }

    public double getW(int x)
    {
        return w[x];
    }

    public double getS(int x)
    {
        return s[x];
    }
}

                    
      
