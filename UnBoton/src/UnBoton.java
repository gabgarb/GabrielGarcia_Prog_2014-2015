import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UnBoton extends JFrame {

	private JPanel contentPane;
	private JLabel lblValor;
	private JTextField Caja1;
	private JLabel lblValor_1;
	private JTextField Caja2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnBoton frame = new UnBoton();
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
	public UnBoton() {
		
		//Panel visual
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblValor = new JLabel("Valor 1");
		lblValor.setBounds(10, 10, 86, 20);
		contentPane.add(lblValor);
		
		//CAJA1
		Caja1 = new JTextField();
		Caja1.setBounds(10, 41, 86, 20);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		lblValor_1 = new JLabel("Valor 2");
		lblValor_1.setBounds(10, 115, 86, 20);
		contentPane.add(lblValor_1);
		
		//CAJA2
		Caja2 = new JTextField();
		Caja2.setColumns(10);
		Caja2.setBounds(10, 146, 86, 20);
		contentPane.add(Caja2);
		
		//BOTON
		JButton Boton = new JButton("Copiar");
		//CODIGO BOTON
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textoCaja1="";
				textoCaja1=Caja1.getText(); 	
				Caja2.setText(textoCaja1);
			}
		});
		Boton.setBounds(10, 81, 89, 23);
		contentPane.add(Boton);
	}
}
