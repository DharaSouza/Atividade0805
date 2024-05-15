package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i = 0;
	int num, soma = 0;
	while (i<10) {
		System.out.println("digite um número:");
		num = ler.nextInt();
		i++;
		soma += num;
		
	}
	System.out.println("A soma foi de:" + soma);
	ler.close();
	}

}
