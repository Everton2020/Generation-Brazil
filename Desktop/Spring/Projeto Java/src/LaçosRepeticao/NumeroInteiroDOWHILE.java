package La�osRepeticao;

import java.util.*;
public class NumeroInteiroDOWHILE {
public static void main (String args[])
{
	Scanner ler= new Scanner(System.in);
	int num=0,soma=0;
	
	do
	{
	soma=num+soma;
	System.out.println("Entre com um numero: ");
	num=ler.nextInt();
	}
	while(num!=0);
	System.out.print("A soma foi de:"+soma);
}
}