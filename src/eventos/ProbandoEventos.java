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
	JButton botonVerde = new JButton("Verde");
	JButton botonAmarillo = new JButton("Amarillo");
	
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonVerde);
		add(botonAmarillo);
		
		botonAzul.addActionListener(this); //ponemos a escuchar a la propia lámina
		botonVerde.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}
	//construcción del método de la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if (botonPulsado == botonAzul) {
		setBackground(Color.BLUE);
		}
		else if(botonPulsado==botonVerde) {
			setBackground(Color.GREEN);
		}else setBackground(Color.YELLOW);
	}
	
}
