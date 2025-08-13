package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setVisible(true);
		setBounds(300,300,600,450);
		add(new LaminaFoco());
		
		
	}
}

class LaminaFoco extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setLayout(null);
		
		//instanciamos aquí las variables de tipo JTextField
		cuadro1= new JTextField();
		cuadro2= new JTextField();
		
		//tenemos que darle tanto tamaño como posición
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		//añadimos los cuadros de texto a la lámina
		add(cuadro1);
		add(cuadro2);
		
		//creamos una instancia de la clase oyente
		LanzaFocos elFoco = new LanzaFocos();
		//hacemos que cuadro1 ejecute un código al perder el foco
		cuadro1.addFocusListener(elFoco);
		
		
	}
	

	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("He perdido el foco");
		}
		
	}
	//declaramos dos variables de tipo JTextField:
	JTextField cuadro1;
	JTextField cuadro2;
}


