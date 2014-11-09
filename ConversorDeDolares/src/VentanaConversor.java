import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorDolares;

	
	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valorConversion) {
		setTitle("Ventana Conversion/u00F3n Dolares");
		setResizable(false);
		
		//Ventana.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Zona Euros.
		JLabel lblValorEuros = new JLabel("Valor Euros");
		lblValorEuros.setBounds(10, 30, 80, 25);
		contentPane.add(lblValorEuros);
		
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 66, 80, 25);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		//Zona Dolares.
		JLabel lblValorDolares = new JLabel("Valor Dolares");
		lblValorDolares.setBounds(283, 30, 80, 25);
		contentPane.add(lblValorDolares);
		
		valorDolares = new JTextField();
		valorDolares.setColumns(10);
		valorDolares.setBounds(283, 66, 80, 25);
		contentPane.add(valorDolares);
		
		//Boton de conversion.
		JButton btnNewButton = new JButton("CONVERSION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(valorEuros.getText());
				valorDolares.setText(String.valueOf(euros*valorConversion));
			}
		});
		btnNewButton.setBounds(129, 67, 113, 23);
		contentPane.add(btnNewButton);
		
	}
}
