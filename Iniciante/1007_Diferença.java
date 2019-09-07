import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
//Variaveis
        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        int A, B, C , D , DIFERENCA;

//Calculo

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = "+DIFERENCA);

 
    }
 
}
