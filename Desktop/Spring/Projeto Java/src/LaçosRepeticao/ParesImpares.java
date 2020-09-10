package LaçosRepeticao;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares*/

import java.util.*;
public class ParesImpares {
public static void main (String args[])
{
	Scanner ler= new Scanner (System.in);
	int x,impar=0,par=0;
	
	for(x=0;x<=10;x++)
 {
	System.out.println("Entre com um numero: ");
	x=ler.nextInt();
	
	if (x%2==0)
	{
	par++;
	}
	else
	{
	impar++;
	}
 }
	System.out.println("Pares inseridos:"+par);
	System.out.println("Impares inseridos:"+impar);	
}
}