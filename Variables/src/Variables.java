import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Variables extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	JLabel lblEnteros = new JLabel("Enteros");
	JLabel lblDecimales = new JLabel("Decimales");
	private JTextField caja2;
	private JLabel lblBoolean;
	private JTextField caja3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Variables frame = new Variables();
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
	public Variables() {
		//ZONA DE VARIALBES
		int valor=0;
		int valor2=13;
		float decimal=2.34f;
		float decimal2,decimal3;
		boolean si=true;
		String valorcaja="Gabriel";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JTxetField para mostrar informacion
		caja = new JTextField();
		caja.setBounds(10, 48, 102, 26);
		contentPane.add(caja);
		caja.setColumns(10);

		//Etiqueta Enteros
		lblEnteros.setBounds(10, 11, 102, 26);
		contentPane.add(lblEnteros);
		
		//Visualizar variable
		valor=10;
		valor=valor2;
		valorcaja=Integer.toString(valor);
		
		//Conversiones caja
		valorcaja=Integer.toString(valor);
		
		System.out.println(valor);
		caja.setText(valorcaja);
		
		//Etiqueta Decimales
		lblDecimales.setBounds(10, 97, 102, 26);
		contentPane.add(lblDecimales);
		
		//Caja 2
		caja2 = new JTextField();
		caja2.setText("13");
		caja2.setColumns(10);
		caja2.setBounds(10, 134, 102, 26);
		contentPane.add(caja2);
		
		//Conversiones caja2
		valorcaja=Float.toString(decimal);
		caja2.setText(valorcaja);
		
		//Etiqueta Boolean
		lblBoolean = new JLabel("Boolean");
		lblBoolean.setBounds(10, 190, 102, 26);
		contentPane.add(lblBoolean);
		
		//Caja 3
		caja3 = new JTextField();
		caja3.setText("13");
		caja3.setColumns(10);
		caja3.setBounds(10, 227, 102, 26);
		contentPane.add(caja3);
		
		//Conversiones caja3
		valorcaja=Boolean.toString(si);
		caja3.setText(valorcaja);
	}
}
