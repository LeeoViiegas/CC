package parcial1;

/*Algoritmo da 3 Questao:*/

import java.util.Scanner;
 
public class NotaMedia { 
    public static void main(String[] args) {
        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;
        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("Entre com o nome do aluno n∫ "+(i+1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno n∫ "+(i+1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
        }
        media = soma / 10;
        System.out.println("A media dos alunos é: "+ media);
       
        
        }
    }