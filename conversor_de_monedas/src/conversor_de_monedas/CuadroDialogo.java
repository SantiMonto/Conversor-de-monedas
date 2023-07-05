package conversor_de_monedas;

import javax.swing.JOptionPane;

public class CuadroDialogo {

	public static void main(String[] args) {
		tipoConversor();
	}
	
	public static void tipoConversor() {
		String conversor[] = {"Conversor de moneda","Conversor de temperatura"};
		String opcion = (String) JOptionPane.showInputDialog(null,"Elija un tipo de conversor: ", "Menu", JOptionPane.DEFAULT_OPTION, null, conversor,conversor[0]);
		
		if (opcion == "Conversor de moneda") {
			double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir: "));
		}
	}
}
