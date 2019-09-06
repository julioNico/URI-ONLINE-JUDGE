import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 

        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        float numero = ler.nextFloat();
        int cem, cinquenta, vinte, dez, cinco, dois, um;


//NOTAS:
        cem = (int) numero / 100;
        cinquenta = (int) (numero % 100) / 50;
        vinte = (int) ((numero % 100) % 50) / 20;
        dez = (int) (((numero % 100) % 50) % 20) / 10;
        cinco = (int) ((((numero % 100) % 50) % 20) % 10) / 5;
        dois = (int) (((((numero % 100) % 50) % 20) % 10) % 5) / 2;
        um = (int)((((((numero%100)%50)%20)%10)%5)%2);

        System.out.println((int)numero);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
 
    }
 
}
