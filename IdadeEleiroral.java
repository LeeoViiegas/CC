package parcial1;

/*Algoritmo da 1 Questao:*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class IdadeEleiroral
{

public static void main(String[] args)
{
Calendar cal = GregorianCalendar.getInstance();
int anoAtual = cal.get(Calendar.YEAR);

int mesAtual = cal.get(Calendar.MONTH);
int diaAtual = cal.get (Calendar.DAY_OF_MONTH);

Scanner in = new Scanner(System.in);
System.out.println("Qual o dia de Nascimento?");
int diaNasc = in.nextInt();
System.out.println("Qual o mes de Nascimento?");
int mesNasc = in.nextInt();
System.out.println("Qual o ano de Nascimento?");
int anoNasc = in.nextInt();
int idade = (anoAtual - anoNasc);
System.out.println("voce tem: " + idade + " anos.");

if (idade >= 18 && idade <= 65)
    {
        System.out.println("Votar é obrigatorio");
    }
        if (idade < 16)
        {
            System.out.println("Nao pode votar");
        }
if (idade  >= 16 && idade <= 17 || idade > 65) 
    {
        System.out.println("Votar é facultativo");
    }
}
}