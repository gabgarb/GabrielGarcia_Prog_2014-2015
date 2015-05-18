package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;

import Controlador.MainController;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JPanel ventanas;
	private VistaPrincipal iPrincipal;
	private VistaJuego iJuego;

	/**
	 * Create the frame.
	 */
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 470);
		
		//Barra principal del menu.
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Submenu del menu principal
		JMenu menuPrincipal = new JMenu("Principal");
		menuBar.add(menuPrincipal);
		
		//Submenu del menu principal
		JMenu menuJuegos = new JMenu("Juegos");
		menuBar.add(menuJuegos);
		
		//Submenu del menu principal
		JMenu menuPerfil = new JMenu("Perfil");
		menuBar.add(menuPerfil);
		
		//Acciones del item corredores
		JMenuItem mntmUsuarios = new JMenuItem(new AbstractAction("Usuario") {
		    public void actionPerformed(ActionEvent ae) {
		    	MainController.getInstance().showUsuario();
		    }
		});
		menuBar.add(mntmUsuarios);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//JPanel que contendra los JPanel de Principal, Juego y Perfil.
		ventanas = new JPanel();
		contentPane.add(ventanas);
		ventanas.setLayout(new CardLayout(0, 0));
		
		//Añadimos las diferentes ventanas
		iPrincipal = new VistaPrincipal();
		ventanas.add(iPrincipal,"Principal");
				
		iJuego = new VistaJuego();
		ventanas.add(iJuego, "Juegos");

	}



	public void showInicial(ArrayList<String> usuario) {
		this.iPrincipal.putUsuario(usuario);		
	}


	//Muestra los diferennt
	public void showVPrincipal() {
		CardLayout c= (CardLayout) this.contentPane.getLayout();
		c.show(ventanas, "Principal");
	}



	public void showVJuego(Object usuario) {
		CardLayout c= (CardLayout) this.contentPane.getLayout();
		c.show(ventanas, "Juegos");
		
	}
	
	//
}
