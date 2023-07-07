package conversor_de_monedas;

public class ConversorTemperatura {
	private double valorConvertido;
	private String temperatura;
	
	public String getTemperatura() {
		return temperatura;
	}
	
	public double convertirCelsiusUnidad(double cantidad, String unidad) {
		if (unidad == "De Celsius a Farenheit") {
			this.valorConvertido = cantidad * 1.8 + 32;
			this.temperatura = "Farenheit";
		}else {
			this.valorConvertido = cantidad + 273.15;
			this.temperatura = "Kelvin";
		}
		
		return this.valorConvertido;
	};
	
	public double convertirUnidadCelcius(double cantidad, String unidad) {
		if (unidad == "De Farenheit a Celsius") {
			this.valorConvertido = (cantidad - 32)*5/9;
		}else {
			this.valorConvertido = cantidad - 273.15;
		}
		this.temperatura = "Celsius";
		return this.valorConvertido;
	};

}
