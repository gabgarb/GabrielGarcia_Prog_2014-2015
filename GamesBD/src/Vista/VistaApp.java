package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JPanel ventanas;
	
	

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
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//JPanel que contendra los JPanel de Principal, Juego y Perfil.
		ventanas = new JPanel();
		contentPane.add(ventanas);
		ventanas.setLayout(new CardLayout(0, 0));
		
		VistaPrincipal principal = new VistaPrincipal();
		ventanas.add(principal, "vPrincipal");
		

	}
}
