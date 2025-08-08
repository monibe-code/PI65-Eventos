package eventos;

import javax.swing.JFrame;

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
	}
}