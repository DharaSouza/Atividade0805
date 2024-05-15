package estruturaPosCondicionada;
import java.util.Scanner;
public class Atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, idade=0, soma = 0;
		while (i< 20) {
			System.out.println("Informe sua idade?");
			idade += ler.nextInt();
					i++;
					if (idade >=18) {
						soma = soma +1;
						System.out.println("Informe a quantidade de pessoas maiores de idade:" + soma);
					}
					System.out.println(soma);
		}
		

	}

}
