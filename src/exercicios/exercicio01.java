
package exercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int senha;
		System.out.print("Digite a senha: ");
		senha = scan.nextInt();
		while(senha != 2002) {
			System.out.println("Senha Invalida!");
			System.out.print("Digite novamente: ");
			senha = scan.nextInt();			
		}
		System.out.println("Acesso Permitido!");
		scan.close();
	}

}
