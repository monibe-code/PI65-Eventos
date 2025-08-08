package eventos;

import javax.swing.JFrame;
import java.awt.event.*;
import java.util.EventListener;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		MarcoVentana mimarco2= new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		mimarco.setBounds(300,300,500,350);
		mimarco2.setBounds(900,300,500,350);

	}

}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
//		//creamos la instancia del oyente
//		M_Ventana oyenteVentana = new M_Ventana();
//		//preparamos el marco para recibir el oyente
//		addWindowListener(oyenteVentana);
		//creamos la instancia dentro del método addWindowListener, simplificando el código:
		addWindowListener(new M_Ventana());
	}
}
class M_Ventana extends WindowAdapter{
	/*al heredar de la clase adaptadora 
	 * Window Adapter, podemos usar sólo los métodos que necesitemos*/
	
	public void windowIconified(WindowEvent e) {
		//cuando minimicemos la ventana, se imprime en consola:
		System.out.println("Ventana minimizada");
	}
	
}

