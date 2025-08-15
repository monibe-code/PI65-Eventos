package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrincipal mimarco= new MarcoPrincipal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoPrincipal extends JFrame{
	public MarcoPrincipal() {
	setTitle("Prueba varios");
	setBounds(1300,100,300,200);
	LaminaPrincipal lamina=new LaminaPrincipal();
	add(lamina);
	}
}

class LaminaPrincipal extends JPanel{
	public LaminaPrincipal () {
		JButton botonNuevo = new JButton ("nuevo");
		add(botonNuevo);
		botonCerrar= new JButton("Cerrar todo");
		add(botonCerrar);
		OyenteNuevo mioyente = new OyenteNuevo();
		botonNuevo.addActionListener(mioyente);
		
	}
	
	private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			
			
		}
		
	}
	
	JButton botonCerrar;
}

class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(JButton boton_de_principal) {
		
		contador++;
		setVisible(true);
		setTitle("Ventana"+ contador);
		setBounds(40*contador, 40*contador, 300, 150);
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodos implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			//método dispose() cierra todos los objetos y libera recursos
			dispose();
		}
		
	}
	private static int contador=0;
	
}