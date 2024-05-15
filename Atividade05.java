package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0, num;
		String nome;
		
		System.out.println("informe um nome:");
		nome = ler.nextLine();
		
		System.out.println("informe um número:");
		num = ler.nextInt();

		while (i <= num) {
			System.out.println(nome);
			i++;
		}
		ler.close();
	}

}
