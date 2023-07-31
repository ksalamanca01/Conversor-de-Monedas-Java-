package Conversiones;
import javax.swing.JOptionPane;




public class Conversor {
	
	
	public static void main(String[] args) {
		
		
		Conversor();
		
		
	}
		
	private static void Conversor() {
				
		
		 Object[] posiblesopciones = { "Conversor de Moneda", "Convesor de Temperatura" };

		 Object seleccionoopcion = JOptionPane.showInputDialog(null,
		             "Seleccione una Opcion de Conversion", "Conversor ONE",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             posiblesopciones, posiblesopciones[0]);
		 
		 
		try { 		
		if (seleccionoopcion == "Conversor de Moneda") {
			
			conversormoneda moneda= new conversormoneda();
			moneda.moneda();
			
			
		}else if(seleccionoopcion == "Convesor de Temperatura"){
			
			conversortemperatura temperatura = new conversortemperatura();
			temperatura.temperatura();	
			
			
		}	
		
		} catch( NumberFormatException n ) {
			
			JOptionPane.showMessageDialog(null, "Solo se Aceptan Numeros");
			Conversor();
			
		}
		
		
		
		int continuar = JOptionPane.showConfirmDialog(null, 
                "Desea Continuar?", "Selecciona una opcion",JOptionPane.YES_NO_CANCEL_OPTION);
		
		
		String mensaje = "";
        switch (continuar) {
        case 0:           
            Conversor();
            break;
        case 1:
            mensaje = "Programa Finalizado";
            JOptionPane.showMessageDialog(null, mensaje);
            break;
        case 2:
            mensaje = "Programa Finalizado";
            JOptionPane.showMessageDialog(null, mensaje);
            
        }
        
		
	}
		
	
}

