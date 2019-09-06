import java.io.IOException;
 
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double A, B, MEDIA;

        A = ler.nextDouble();
        B = ler.nextDouble();


        MEDIA = (A*3.5+B*7.5)/11;

        System.out.printf(Locale.ENGLISH,"MEDIA = %.5f\n",MEDIA);
 
    }
 
}
