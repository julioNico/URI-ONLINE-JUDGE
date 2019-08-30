//Aprendendo a utilizar Vetores e treinando Fluxo de Controle.

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        //Elementos do vetor
        float[] vet = new float[3];

        float aux = 0;
        int i = 0;

        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

        vet[0] = ler.nextFloat();
        vet[1] = ler.nextFloat();
        vet[2] = ler.nextFloat();

        //Varrendo todos os elementos
        for (i = 0; i < vet.length; i++) {

            //Varrendo uma quantidade a menos do tamanho do vetor.
            //Exemplo: Se o vetor possui 5 posições estamos fazendo apenas 4 trocas.
            for (int j = 0; j < vet.length - 1; j++) {

                //Pegando elemento atual e comparando com a próxima posição
                if (vet[j] < vet[j + 1]) {

                    //Se for maior estamos invertendo os valores
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }


        if (vet[0] >= (vet[1] + vet[2])) {
            System.out.println("NAO FORMA TRIANGULO");

        }else if ((vet[0] * vet[0]) == ((vet[1] * vet[1]) + (vet[2] * vet[2]))) {
            System.out.println("TRIANGULO RETANGULO");

        }else  if ((vet[0] * vet[0]) > ((vet[1] * vet[1]) + (vet[2] * vet[2]))) {
            System.out.println("TRIANGULO OBTUSANGULO");

        }if ((vet[0] * vet[0]) < ((vet[1] * vet[1]) + (vet[2] * vet[2]))) {
            System.out.println("TRIANGULO ACUTANGULO");

        }if ((vet[0] == vet[1] && vet[0] == vet[2])) {
            System.out.println("TRIANGULO EQUILATERO");

        }if (( ( (vet[0] == vet[1]) && (vet[0] != vet[2]) ) || ( (vet[0] == vet[2]) && (vet[0] != vet[1]) ) || ( (vet[1] == vet[2]) && (vet[1] != vet[0]) )  )){
            System.out.println("TRIANGULO ISOSCELES");

        }
    }
 
}
