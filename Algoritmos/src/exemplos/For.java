package exemplos;

import javax.swing.JOptionPane;




public class For {
	public static void main(String[] args) {
		
		int _qtdMeses = 12;
		String _valorMensalString = JOptionPane.showInputDialog(null, "Digite o valor mensal ");
		int _valorMensal = Integer.parseInt(_valorMensalString);
		double soma = 0;
		

		
		for(int aux = 0; aux < _qtdMeses; aux++){
			soma += _valorMensal;
		}
		
		System.out.println("Valor da soma é "+soma);
		JOptionPane.showMessageDialog(null, "Valor da soma é "+soma);
		
	}

}
