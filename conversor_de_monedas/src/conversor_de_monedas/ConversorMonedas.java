package conversor_de_monedas;

public class ConversorMonedas {
	private double valorConvertido;
	private double valorDivisa;
	private String divisa;
	
	public double getValorConvertido() {
		return valorConvertido;
	}

	public double convertirPesosMoneda(double cantidad, double valorDivisa) {
		this.valorConvertido = cantidad/valorDivisa;
		return this.valorConvertido;
	};
	
	public double convertirMonedaPesos(double cantidad, double valorDivisa) {
		this.valorConvertido =cantidad*valorDivisa;
		return this.valorConvertido; 
	};
	
	public void asignarValorDivisa(String divisa) {
		if (divisa == "De Pesos a Dólar" || divisa == "De Dólar a Pesos" ) { 
			this.valorDivisa= 4180;
				if(divisa == "De Pesos a Dólar") {
					this.divisa = "Dolares";
				} else {
					this.divisa = "Pesos";
				}
			}
		if (divisa == "De Pesos a Euro" || divisa == "De Euro a Pesos" ) { 
			this.valorDivisa= 4553.9;
				if(divisa == "De Pesos a Euro") {
					this.divisa = "Euros";
				} else {
					this.divisa = "Pesos";
				}
			}
		if (divisa == "De Pesos a Libras" || divisa == "De Libras a Pesos" ) { 
			this.valorDivisa= 5326.16;
				if(divisa == "De Pesos a Libras") {
					this.divisa = "Libras esterlinas";
				} else {
					this.divisa = "Pesos";
				}
			}
		if (divisa == "De Pesos a Yen" || divisa == "De Yen a Pesos" ) { 
			this.valorDivisa= 29.03;
				if(divisa == "De Pesos a Yen") {
					this.divisa = "Yen";
				} else {
					this.divisa = "Pesos";
				}
			}
		if (divisa == "De Pesos a WonCoreano" || divisa == "De WonCoreano a Pesos" ) { 
			this.valorDivisa= 3.20;
				if(divisa == "De Pesos a WonCoreano") {
					this.divisa = "Won Coreanos";
				} else {
					this.divisa = "Pesos";
				}
			}
	}

	public double getValorDivisa() {
		return valorDivisa;
	}


	public String getDivisa() {
		return divisa;
	}

}
