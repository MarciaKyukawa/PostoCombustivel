import javax.swing.JOptionPane;

public class Posto {
	public static void main(String[] args) {
		
		BombaGasolina b1;
		
		b1 = new BombaGasolina("Alcool", 2.50);
		
		String texto;
		int opcao;
		boolean fim;
		
		fim = false;
		
		do {
		texto = JOptionPane.showInputDialog("Abastecer por: 1- Litros ou por 2- Valor? || 3-Fim ");
		opcao = Integer.parseInt(texto);
		switch (opcao){
			case 1:
				texto = JOptionPane.showInputDialog("Qtos Litros:");
				b1.abastecerLitros(Double.parseDouble(texto));
				JOptionPane.showMessageDialog(null, b1.imprimirRecibo());
				break;
			case 2:
				texto = JOptionPane.showInputDialog("Qual Valor:");
				b1.abastecerPreco(Double.parseDouble(texto));
				JOptionPane.showMessageDialog(null, b1.imprimirRecibo());
				break;
			case 3:
				fim = true;
				break;
		}
		}
		while (!fim);
		}
	}
