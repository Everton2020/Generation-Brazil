package La�oCondicional;
import java.util.*;
public class ParImpar {
public static void main (String args[])
{
	Scanner ler= new Scanner(System.in);
	
	double num,par,impar;
	
	System.out.println("Entre com numero: ");
	num=ler.nextDouble();
	
	par=Math.sqrt(num);
	impar=Math.pow(num,2);
	
	if(num%2==0)
	{
	System.out.println("O numero "+num+" � par. Ent�o sua raiz �: "+par);
	}
	else if(num%2!=0 && num>=0)
	{
	System.out.println("O numero "+num+" � impar. Ent�o seu quadrado �: "+impar);
	}
	else
	{
	System.out.println("ERROR");
	}
}
}