package TrocaDevariaveis;

import java.util.Scanner;

public class TrocaDeVariaveis {
public static void main(String[] args) {
	int troca ;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Informe o primeiro valor");
	int A = scan.nextInt();
	
	System.out.println("Informe o segundo valor");
	int B = scan.nextInt();
	
	 troca = A;
	 A = B;
     B = troca;
	
	System.out.println(" O valor de A é igual " + A);
	System.out.println(" O valor de B  é igual " + B );
	


}
}
