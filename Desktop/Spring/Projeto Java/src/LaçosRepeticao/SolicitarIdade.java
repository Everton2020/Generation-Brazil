package La�osRepeticao;
/*3-	Solicitar a idade de v�rias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99.(WHILE)
 */

import java.util.*;
public class SolicitarIdade {
public static void main (String args[])
{
 Scanner ler= new Scanner (System.in);
 int idade=0,juve=0,adult=0,idos=0;
 		 
 while (idade>=0 && idade<99)
{
System.out.println("Entre com a idade: ");
idade=ler.nextInt();
if (idade<21)
{
juve++;
}
else if (idade>50)
{
idos++;
}
else
{
adult++;
}
}
System.out.println("O total de pessoas com menos de 21: "+juve);
System.out.println("O total de pessoas com mais de 50: "+idos);
System.out.println("O total de pessoas com mais de 21 e menos 50: "+adult);
}
}