import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
//Variaveis:
        int codigo, quantidade;

        Scanner ler = new Scanner(System.in);

        codigo = ler.nextInt();
        quantidade = ler.nextInt();

//Switch_case



        switch(codigo){

            case 1:

                System.out.printf(Locale.ENGLISH,"Total: R$ %.2f\n", (float)(quantidade * 4.00));
                break;

            case 2:

                System.out.printf(Locale.ENGLISH,"Total: R$ %.2f\n", (float)(quantidade * 4.5));
                break;
            case 3:

                System.out.printf(Locale.ENGLISH,"Total: R$ %.2f\n", (float)(quantidade * 5.00));
                break;
            case 4:

                System.out.printf(Locale.ENGLISH,"Total: R$ %.2f\n", (float)(quantidade * 2.00));
                break;
            case 5:

                System.out.printf(Locale.ENGLISH,"Total: R$ %.2f\n", (float)(quantidade * 1.50));
                break;
        }
    }
 
}
