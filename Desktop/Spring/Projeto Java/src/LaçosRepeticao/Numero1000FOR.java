package La�osRepeticao;
/*1-Informar todos os n�meros de 1000 a 1999
 *  que quando divididos por 11 obtemos resto = 5. 
 */
import java.util.*;
public class Numero1000FOR {
public static void main(String args[])	
{
 Scanner ler= new Scanner (System.in);
 int num=1000;
 
 for(num=1000;num<=1999;num++)
 {
	if(num%11==5)
	
	System.out.printf("\n %d",num);
 }
}
}