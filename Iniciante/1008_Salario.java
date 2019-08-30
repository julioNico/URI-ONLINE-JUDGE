//Aprendendo a utilizar a Biblioteca BigDecimal e seus métodos.

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario = 0;
        int valorHora = 0;
        Double horaTrabalhada = 0.00;
        Double valorFinal = 0.00;
        
        numeroFuncionario = ler.nextInt();
        valorHora = ler.nextInt();
        horaTrabalhada = ler.nextDouble();

        valorFinal = valorHora * horaTrabalhada;

        BigDecimal numeroArredendado = new BigDecimal(valorFinal);
        numeroArredendado = numeroArredendado.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println("NUMBER = "+ numeroFuncionario);
        System.out.println("SALARY = U$ "+ numeroArredendado);
    }
 
}
