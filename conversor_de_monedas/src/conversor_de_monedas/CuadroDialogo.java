package conversor_de_monedas;
import javax.swing.JOptionPane;

public class CuadroDialogo {
	public static void main(String[] args) {
		tipoConversor();
	}
	public static void tipoConversor() {
		boolean continuar = true;
		while(continuar) {
			String conversor[] = {"Conversor de moneda","Conversor de temperatura"};
			String opcionConversor = (String) JOptionPane.showInputDialog(null,"Elija un tipo de conversor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, conversor,conversor[0]);
			
			if (opcionConversor == "Conversor de moneda") {
				try {
					double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero (en números) que deseas convertir: "));
					String monedas [] = {"De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a WonCoreano","De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De WonCoreano a Pesos"};
					String opcionDivisa = (String) JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir su dinero: ", "Monedas", JOptionPane.DEFAULT_OPTION, null, monedas,monedas[0]);
					
					//Inicializando las variables. Posteriormente tendran su valor segun lo que solicite el usuario
					String valorConvertido = "";
					ConversorMonedas convertir = new ConversorMonedas();
					//Uso de los metodos de ConversorMonedas
					convertir.asignarValorDivisa(opcionDivisa);
					String divisa = convertir.getDivisa();
					double valorDivisa = convertir.getValorDivisa();
					
					if(opcionDivisa == "De Pesos a Dólar" || opcionDivisa == "De Pesos a Euro" || opcionDivisa == "De Pesos a Libras" || opcionDivisa == "De Pesos a Yen" || opcionDivisa == "De Pesos a WonCoreano") {
						valorConvertido = String.valueOf(Math.round(convertir.convertirPesosMoneda(cantidad, valorDivisa)*100.00)/100.00);
					}else {
						valorConvertido = String.valueOf(Math.round(convertir.convertirMonedaPesos(cantidad, valorDivisa)*100.00)/100.00);
					}
					JOptionPane.showMessageDialog(null,"Tienes $"+ valorConvertido+" "+divisa, "Valor de divisa convertido", 1);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no valido", "Error", 0);
				}	
			}
			if (opcionConversor == "Conversor de temperatura") {
				try {
					double grados = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de grados de temperatura (en números) que deseas convertir: "));
					String undsTemperatura [] = {"De Celsius a Farenheit","De Celsius a Kelvin","De Farenheit a Celsius","De Kelvin a Celsius"};
					String opcionTemperatura = (String) JOptionPane.showInputDialog(null,"Elija la unidad a la que desea convertir sus grados de temperatura: ", "Unidades de temperatura", JOptionPane.DEFAULT_OPTION, null, undsTemperatura,undsTemperatura[0]);
					//Inicializando las variables. Posteriormente tendran su valor segun lo que solicite el usuario
					String valorConvertido = "";
					ConversorTemperatura convertirTemp = new ConversorTemperatura();
					
					if(opcionTemperatura == "De Celsius a Farenheit" || opcionTemperatura == "De Celsius a Kelvin") {
						valorConvertido = String.valueOf(Math.round(convertirTemp.convertirCelsiusUnidad(grados, opcionTemperatura)*100.00)/100.00);
					}else {
						valorConvertido = String.valueOf(Math.round(convertirTemp.convertirUnidadCelcius(grados, opcionTemperatura)*100.00)/100.00);
					}
					String temperatura = convertirTemp.getTemperatura();
					JOptionPane.showMessageDialog(null,"El valor equivalente es "+ valorConvertido+" °"+temperatura, "Valor de temperatura convertido", 1);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Valor no valido", "Error", 0);
				}
			}
			int option = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			if(option == 1 || option == 2) {
				continuar = false;
				JOptionPane.showMessageDialog(null, "Programa terminado", "Fin", 1);
			}
		}
	}
}
