package La�osRepeticao;
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares*/

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