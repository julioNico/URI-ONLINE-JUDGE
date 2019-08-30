import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);

        int A = 0, B = 0, C = 0, D = 0;

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        if((B > C) && (D > A)){
            if((C+D) > (A+B)){
                if((C >= 0) && (D >= 0)){
                    if((A%2) == 0){
                        System.out.println("Valores aceitos");
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
 
}
