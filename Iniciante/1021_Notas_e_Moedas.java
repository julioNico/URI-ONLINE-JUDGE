//Exercício extremamente imporante para aprender a utilizar métodos de arredondamento da biblioteca Math.

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 

    Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);

    float numero = ler.nextFloat();
    int cem, cinquenta, vinte, dez, cinco, dois, um;
    float decimal;
    int cCinquenta, cVinteCinco, cDez, cCinco, cUm;
//    float cum;

        decimal = numero - (int)numero;


//NOTAS:
    cem = (int)numero/100;
    cinquenta = (int)(numero%100)/50;
    vinte = (int)((numero%100)%50)/20;
    dez = (int)(((numero%100)%50)%20)/10;
    cinco = (int)((((numero%100)%50)%20)%10)/5;
    dois = (int)(((((numero%100)%50)%20)%10)%5)/2;

    System.out.println("NOTAS:");
    System.out.println(cem + " nota(s) de R$ 100.00");
    System.out.println(cinquenta + " nota(s) de R$ 50.00");
    System.out.println(vinte + " nota(s) de R$ 20.00");
    System.out.println(dez + " nota(s) de R$ 10.00");
    System.out.println(cinco + " nota(s) de R$ 5.00");
    System.out.println(dois + " nota(s) de R$ 2.00");


//MOEDAS:
    um = (int)((((((numero%100)%50)%20)%10)%5)%2);
    cCinquenta = (int) (decimal/(0.50));
    cVinteCinco = (int) (decimal%(0.50)/(0.25));
    cDez = (int)(((decimal%(0.50))%(0.25))/(0.10));
    cCinco = (int)((((decimal%(0.50))%(0.25))%(0.10))/0.05);
    cUm = (int) Math.round((((((decimal%(0.50))%(0.25))%0.10)%(0.05))/0.01));
//    cum = (float)(((((decimal%(0.50))%(0.25))%0.10)%(0.05))/0.01);

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(cVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(cDez + " moeda(s) de R$ 0.10");
        System.out.println(cCinco + " moeda(s) de R$ 0.05");
        System.out.println(cUm + " moeda(s) de R$ 0.01");
//        System.out.println(cum + " moeda(s) de R$ 0.01");
 
    }
 
}
