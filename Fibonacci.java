package parcial1;

/*Algoritmo da 2 Questao:*/

public class Fibonacci {
 
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
 
 
    public static void main(String[] args) {
	
	 // teste do programa. Imprime os 30 primeiros termos
        for (int i = 1; i <= 30; i++) {
            System.out.println(" " + Fibonacci.fibo(i));
        }
 
    }
 
}