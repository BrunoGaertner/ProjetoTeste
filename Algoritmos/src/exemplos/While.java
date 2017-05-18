package exemplos;

import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {

		int _qtdMeses = 12;
		int _valorMensal = 10;
		int aux = 0;
		double soma = 0;
		
		

		while (aux < _qtdMeses) {

			soma += _valorMensal;
			aux++;

		}

		
		System.out.println("Valor da somaé "+soma);
		JOptionPane.showMessageDialog(null, "Valor da soma é "+soma);
	}

}
