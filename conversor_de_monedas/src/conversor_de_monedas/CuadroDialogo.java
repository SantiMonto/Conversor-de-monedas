package conversor_de_monedas;

import javax.swing.JOptionPane;

public class CuadroDialogo {

	public static void main(String[] args) {
		tipoConversor();
	}
	
	public static void tipoConversor() {
		String conversor[] = {"Conversor de moneda","Conversor de temperatura"};
		String opcionConversor = (String) JOptionPane.showInputDialog(null,"Elija un tipo de conversor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, conversor,conversor[0]);
		
		if (opcionConversor == "Conversor de moneda") {
			double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir: "));
			String monedas [] = {"De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a WonCoreano","De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De WonCoreano a Pesos"};
			String opcionDivisa = (String) JOptionPane.showInputDialog(null,"Elija la moneda a la que desea convertir su dinero: ", "Monedas", JOptionPane.DEFAULT_OPTION, null, monedas,monedas[0]);
			double valorDivisa = 0;
			String divisa = "";
			ConversorMonedas convertir = new ConversorMonedas();
			if (opcionDivisa == "De Pesos a Dólar" ) { 
				valorDivisa= 4000;
				divisa = "Dolares";
				}
			String valorConvertido = String.valueOf(convertir.convertirPesosMoneda(cantidad, valorDivisa));
			
			JOptionPane.showMessageDialog(null,"Tienes $"+ valorConvertido+" "+divisa, "Valor convertido", 1);

			
		}
	}
}
