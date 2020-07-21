package exercicios;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numPreferencia;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		System.out.println("Votação de preferenia");
		System.out.println("");
		numPreferencia = scan.nextInt();
		
		while(numPreferencia != 4) {
			if(numPreferencia == 1) {
				alcool+=1;
				System.out.println("Alcool: " + alcool);
			} else if(numPreferencia == 2) {
				gasolina+=1;
				System.out.println("Gasolina: " + gasolina);
			}else if(numPreferencia == 3) {
				disel+=1;
				System.out.println("Disel: " + disel);
			}else {
				System.out.println("Código inválido!");
			}
			System.out.println("Infome seu voto: ");
			numPreferencia = scan.nextInt();
		}
		System.out.println("MUITO OBRIGADA");
		scan.close();

	}

}
