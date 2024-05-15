package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("informe o nome do usuario");
		String nome = ler.nextLine();
		int i= 0;
		while(i <=10) {
			System.out.println(nome);
			i++;
		}
	}

}
