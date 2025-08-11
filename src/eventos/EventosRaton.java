package eventos;

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
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
	}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("Has salido");
	}
}