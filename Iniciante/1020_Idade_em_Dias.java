import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner ler = new Scanner(System.in);

    int N, anos = 0, meses = 0, dias = 0;

    N = ler.nextInt();

    anos = N/365;

    meses = (N%365)/30;

    dias = ((N%365)%30);


        System.out.println(anos + " ano(s)" + "\n" + meses + " mes(es)" + "\n" + dias + " dia(s)");

    }
 
}
