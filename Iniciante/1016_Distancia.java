import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x,total;

        Scanner ler = new Scanner(System.in);

        x = ler.nextInt();

        total = x*2;

        System.out.println(total + " minutos");
 
    }
 
}
