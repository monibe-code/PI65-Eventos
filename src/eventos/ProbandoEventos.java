package eventos;

import javax.swing.*;
import javax.swing.JFrame;

public class ProbandoEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco= new MarcoBotones();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoBotones extends JFrame{
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}

class LaminaBotones extends JPanel{
	
}
