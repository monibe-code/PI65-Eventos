package eventos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		setTitle("Respondiendo");
		setBounds(300,300,500,350);
		setVisible(true);
		//creamos la instancia del oyente
		M_Ventana oyenteVentana = new M_Ventana();
		//preparamos el marco para recibir el oyente
		addWindowListener(oyenteVentana);
		
	}
}
class M_Ventana implements WindowListener{
	//tenemos que declarar todos aunque sólo usemos uno
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {
		//cuando minimicemos la ventana, se imprime en consola:
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e) {}
	
	
}
