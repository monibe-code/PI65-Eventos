package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTeclas mimarco = new MarcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas() {
		setVisible(true);
		setBounds(700,300,600,450);
		//le indicamos al marco quién es el oyente, con lo que 
		//tenemos que crear una instancia de esa clase:
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		
		//y ponemos esa instancia a la escucha
		addKeyListener(tecla);
	}
}

//creación de un oyente que detecte las teclas que pulsamos
class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//getKeyCode nos da el código de la tecla presionada en el evento
		int codigo = e.getKeyCode();
		System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//getKeyChar nos da el carácter de la tecla presionada y soltada en el evento e
		char letra = e.getKeyChar();
		
		System.out.println(letra);
	}
	
}