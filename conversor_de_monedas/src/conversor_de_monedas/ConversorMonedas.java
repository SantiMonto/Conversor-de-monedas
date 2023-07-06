package conversor_de_monedas;

public class ConversorMonedas {
	private double valorConvertido;
	
	public double getValorConvertido() {
		return valorConvertido;
	}

	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}

	public double convertirPesosMoneda(double cantidad, double valorDivisa) {
		this.valorConvertido = cantidad/valorDivisa;
		return this.valorConvertido;
	};
	
	public double convertirMonedaPesos(double cantidad, double valorDivisa) {
		this.valorConvertido =cantidad*valorDivisa;
		return this.valorConvertido; 
	};
}
