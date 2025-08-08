package eventos;

import javax.swing.*;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.*;

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

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Azul");
	
	public LaminaBotones() {
		add(botonAzul);
		botonAzul.addActionListener(this); //ponemos a escuchar a la propia lámina
		
	}
	//construcción del método de la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.BLUE);
	}
	
}
