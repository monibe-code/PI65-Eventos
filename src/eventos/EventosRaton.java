package eventos;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		//determinar un oyente
		EventosDeRaton eventoRaton = new EventosDeRaton();
		addMouseListener(eventoRaton);
	}
}

class EventosDeRaton extends MouseAdapter{
//	public void mouseClicked(MouseEvent e) {
//		//System.out.println("Coordenada X: "+ e.getX()+ "Coordenada Y: "+ e.getY());
//		System.out.println(e.getClickCount());
//	}
	
	public void mousePressed(MouseEvent e) {
		//System.out.println(e.getModifiersEx());
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el botón izquierdo del ratón");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del ratón");
		}else if(e.getModifiersEx()==4096) {
			System.out.println("Has pulsado el botón DERECHO del ratón");
		}
	}
}