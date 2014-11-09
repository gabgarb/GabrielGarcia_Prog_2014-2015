import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ActividadDeSeguimiento extends JFrame {

	//Objetos de la ventana
	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja2;
	private JTextField Caja3;
	private JTextField Caja4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActividadDeSeguimiento frame = new ActividadDeSeguimiento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActividadDeSeguimiento() {
		
		//Configuaraciones de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja1
		Caja1 = new JTextField();
		Caja1.setBounds(10, 40, 86, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		//Caja2
		Caja2 = new JTextField();
		Caja2.setColumns(10);
		Caja2.setBounds(238, 40, 86, 20);
		contentPane.add(Caja2);
		
		//Caja3
		Caja3 = new JTextField();
		Caja3.setColumns(10);
		Caja3.setBounds(238, 197, 86, 20);
		contentPane.add(Caja3);
		
		//Caja4
		Caja4 = new JTextField();
		Caja4.setColumns(10);
		Caja4.setBounds(10, 197, 86, 20);
		contentPane.add(Caja4);
		
		//Boton1
		JButton Boton1 = new JButton("Copiar");
		//Codigo Boton1-Copia texto de caja1 en caja2
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoCaja1="";
				textoCaja1=Caja1.getText();
				Caja2.setText(textoCaja1);
			}
		});
		Boton1.setBounds(120, 39, 89, 23);
		contentPane.add(Boton1);
		
		//Boton2
		JButton Boton2 = new JButton("Copiar");
		//Codigo Boton2-Copia texto de caja2 en caja3
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoCaja2="";
				textoCaja2=Caja2.getText();
				Caja3.setText(textoCaja2);
			}
		});
		Boton2.setBounds(235, 115, 89, 23);
		contentPane.add(Boton2);
		
		//Boton3
		JButton Boton3 = new JButton("Copiar");
		//Codigo Boton3-Copia texto de caja3 en caja4
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoCaja3="";
				textoCaja3=Caja3.getText();
				Caja4.setText(textoCaja3);
			}
		});
		Boton3.setBounds(120, 196, 89, 23);
		contentPane.add(Boton3);
		
		//Boton4
		JButton Boton4 = new JButton("Copiar");
		//Codigo Boton4-Copia texto de caja4 en caja1
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoCaja4="";
				textoCaja4=Caja4.getText();
				Caja1.setText(textoCaja4);
			}
		});
		Boton4.setBounds(10, 115, 89, 23);
		contentPane.add(Boton4);
		
	}
}
