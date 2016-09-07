package parcial1;

/*Algoritmo da 4 Questao:*/

import java.util.Scanner;

public class LacoDigitacao
{

public static void main(String[] args)
{
    
    Scanner in = new Scanner(System.in);
    int N1 = 0;
    int cont = 0;
    int soma = 0;
    while (N1 >= 0) { 
        System.out.println("Digite um numero");
        N1 = in.nextInt();
        soma = soma + N1;
        cont = cont + 1; 
        
    }
    int media = soma/cont;
    System.out.println("Foram digitados " + cont + " numeros.");
    System.out.println("A media do numero digitados é " + media);
    
}    
}    