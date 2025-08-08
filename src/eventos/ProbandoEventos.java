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

class LaminaBotones extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonVerde = new JButton("Verde");
	JButton botonAmarillo = new JButton("Amarillo");
	
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonVerde);
		add(botonAmarillo);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul= new ColorFondo(Color.BLUE);
		ColorFondo Verde = new ColorFondo(Color.GREEN);
		
		
		botonAzul.addActionListener(Azul); 
		botonVerde.addActionListener(Verde);
		botonAmarillo.addActionListener(Amarillo);
	}
	private class ColorFondo implements ActionListener{
		public ColorFondo(Color c) {
			colorDeFondo=c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
			
		}
		private Color colorDeFondo;
	}
}


