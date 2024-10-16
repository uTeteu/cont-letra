package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String string = sc.nextLine().toLowerCase();
		
		System.out.println("Digite a letra que deseja saber: ");
		char letra = Character.toLowerCase(sc.next().charAt(0));
		
		char[] vetor = string.toCharArray();

		int cont = 0;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] == letra) {
				cont++;
			}
		}
		
		if (cont > 0) {
			System.out.println("A letra \"" + letra + "\" aparece " + cont + " vezes nessa string.");
		} else {
			System.out.println("A string não contém a letra escolhida.");
		}
		sc.close();
	}
}
