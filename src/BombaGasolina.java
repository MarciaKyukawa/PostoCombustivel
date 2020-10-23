
public class BombaGasolina {
	private String nome;
	private double precoLitro;
	private double qtdeLitro;
	private double totalPagar;
		
	
	public BombaGasolina(String nome, double preco) {
		this.nome = nome;
		this.precoLitro = preco;
		this.qtdeLitro = 0;
		this.totalPagar = 0;
	}
	
	public void abastecerLitros (double litros) {
		qtdeLitro = litros;
		totalPagar = precoLitro * litros;
	}
	
	public void abastecerPreco (double precoFim) {
		qtdeLitro = precoFim / precoLitro;
		totalPagar = precoFim;
	}
	
	public String imprimirRecibo() {
		String msg;
		msg = "RECIBO - "+nome+" - "+String.format("%.2f",precoLitro)+ " R$ / l "+"("+ String.format("%.1f",qtdeLitro)+" litros)"+" ---> Valor Pagar R$ "+String.format("%.2f",totalPagar);
		return msg;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitro() {
		return qtdeLitro;
	}
	public void setQtdeLitro(double qtdeLitro) {
		this.qtdeLitro = qtdeLitro;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	

}
