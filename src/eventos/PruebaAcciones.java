package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion mimarco= new MarcoAccion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoAccion extends JFrame{
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina= new PanelAccion();
		add(lamina);
	}
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor accionAmarillo = new AccionColor("Amarillo",new ImageIcon("src/eventos/bolaAmarilla.gif"), Color.YELLOW);
		AccionColor accionRojo = new AccionColor("Rojo",new ImageIcon("src/eventos/bolaRoja.gif"), Color.RED);
		AccionColor accionAzul = new AccionColor("Azul",new ImageIcon("src/eventos/bolaAzul.gif"), Color.blue);
		
		
		//creación y añadidura de botones
		add(new JButton(accionAmarillo));
		add(new JButton(accionRojo));
		add(new JButton (accionAzul));
		
		//otra forma de crear botones más larga:
//		JButton botonAmarillo = new JButton("Amarillo");
//		JButton botonAzul = new JButton("Azul");
//		JButton botonRojo = new JButton("Rojo");
//		
//		add(botonAmarillo);
//		add(botonAzul);
//		add(botonRojo);
//		
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color color_boton) {
			//método putValue para guardar la info en formato clave-valor
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+ nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		public void actionPerformed(ActionEvent e) {
			Color c=(Color) getValue("color_de_fondo");
			setBackground(c);
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+". Descripción: "+ getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
	
}

