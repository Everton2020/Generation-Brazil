package La�oCondicional;
import java.util.*;
public class IdadeNome {
public static void main(String args[])
{
	Scanner ler= new Scanner (System.in);
	
	int idade;
	String nome;
	
	System.out.println("Entre com sua idade: ");
	idade=ler.nextInt();
	
	ler.nextLine(); /*limpar buffer*/
	
	System.out.println("Entre com seu nome: ");
	nome=ler.nextLine();
	
	System.out.printf("Seu nome �: %s",nome);
	System.out.printf("\nSua idade �: %d",idade);
	
	if(idade>=18)
	{
	System.out.println("\nVoc� � de Maior");
	}
	else if(idade<18 && idade>=0)
	{
	System.out.println("\nVoc� � de Menor");
	}
	else
	{
	System.out.println("\nOp��o Invalida");
	}
}
}
