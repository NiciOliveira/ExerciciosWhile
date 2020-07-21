package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x,y;
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}else if(x > 0 && y < 0) {
				System.out.println("Segundo quadrante");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}else {
				System.out.println("Quarto quadrante");
			}
			x = scan.nextInt();
			y = scan.nextInt();
		}
		scan.close();
	}
}
