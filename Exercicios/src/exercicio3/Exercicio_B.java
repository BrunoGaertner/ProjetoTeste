package exercicio3;

import java.util.Scanner;

public class Exercicio_B {
	private static Scanner numero2;
	private static Scanner numero1;

	public static void main(String[] args) {

		// b. somar duas vari�veis double e imprimir os valores

		numero1 = new Scanner(System.in);
		numero2 = new Scanner(System.in);

		System.out.println("Digite um n�mero ");
		double num1 = numero1.nextDouble();

		System.out.println("Digite outro n�mero ");
		double num2 = numero2.nextDouble();

		System.out.println("A soma dos dois n�meros � " + (num1 + num2));
	}

}
