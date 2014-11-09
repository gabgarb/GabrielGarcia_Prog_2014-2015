import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Inicializacion extends JFrame {
	
	//Objetos de la ventana
	private JPanel contentPane;
	private JTextField Caja;
	private JLabel lblTexto;
	
	//Mis variables
	String texto="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//Arranque Ventana
			public void run() {
				try {
					//Creariamos la Ventana
					Inicializacion frame = new Inicializacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//Fin Arranque Ventana
		});
	}

	/**
	 * Creamos la Ventana
	 */
	public Inicializacion() {
		
		//Configuaraciones Iniciales de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        lblTexto = new JLabel("Texto");
		lblTexto.setBounds(10, 10, 86, 20);
		contentPane.add(lblTexto);
		
		Caja = new JTextField();
		Caja.setBounds(10, 41, 86, 20);
		contentPane.add(Caja);
		Caja.setColumns(10);
		
		//Asignar valor a la caja
		Caja.setText(texto);
	}
}
