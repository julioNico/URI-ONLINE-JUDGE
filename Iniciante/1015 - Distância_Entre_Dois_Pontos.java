import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 

        float x1,y1,x2,y2,distancia;
        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        x1 = ler.nextFloat();
        y1 = ler.nextFloat();

        x2 = ler.nextFloat();
        y2 = ler.nextFloat();

        distancia = (float) Math.sqrt((x2-x1)*(x2-x1) + (y2 - y1)*(y2 - y1));

        System.out.printf(Locale.ENGLISH,"%.4f\n",distancia);

 
    }
 
}
