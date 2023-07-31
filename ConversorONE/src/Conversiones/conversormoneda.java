package Conversiones;
import javax.swing.JOptionPane;


public class conversormoneda {
	
	
	public void moneda() {
		
	
	
		double valorusuario;
	
		valorusuario = Double.parseDouble(JOptionPane.showInputDialog("Por Favor ingrese la cantidad de dinero a convertir:"));
		
		
		Object[] posiblesopcionesconversion = { "Peso a Dolar", "Peso a Yen" };
		
	
		 Object seleccionoopcionconversion = JOptionPane.showInputDialog(null,
		             "Seleccione una Opcion a convertir", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             posiblesopcionesconversion, posiblesopcionesconversion[0]);
		
		
	  	if (seleccionoopcionconversion == "Peso a Dolar") {
	  		
	  		  	double resultado = valorusuario / 4000; 	
	  		  	JOptionPane.showMessageDialog(null,resultado + " Dolar");
	  		  	
	  		  	
	  	}
	  	if(seleccionoopcionconversion == "Peso a Yen"){
	  		double resultado = valorusuario / 28.5; 	
  		  	JOptionPane.showMessageDialog(null,resultado + " Yen");	  		
	  		
	  		
	  	}

	}
}
