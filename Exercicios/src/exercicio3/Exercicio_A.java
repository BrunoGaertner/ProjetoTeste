package exercicio3;

import java.util.Scanner;

public class Exercicio_A {
	public static void main(String[] args) {

		// a. somar duas vari�veis int e imprimir os valores
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);

		System.out.println("Digite um n�mero ");
		int num1 = numero1.nextInt();

		System.out.println("Digite outro n�mero ");
		int num2 = numero2.nextInt();

		System.out.println("A soma dos dois n�meros � " + (num1 + num2));

	}

}
