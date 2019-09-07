import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
//Variaveis
        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double A, B, C = 0, MEDIA;

//Calculo

        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        MEDIA = (A*2 + B*3.0 + C*5.0)/10;

        System.out.printf(Locale.ENGLISH,"MEDIA = %.1f\n",MEDIA);

    }
 
}
