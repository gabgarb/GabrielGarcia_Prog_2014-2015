import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCopiado extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCampo;
	private JTextField textField_1;
	private JLabel label;
	private JButton btnNewButton;
	
	//Ventana
	public VentanaCopiado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cajas de texto
		textField = new JTextField();
		textField.setBounds(10, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 88, 86, 20);
		contentPane.add(textField_1);
		
		//Etiquetas
		lblCampo = new JLabel("Campo1");
		lblCampo.setBounds(10, 11, 86, 24);
		contentPane.add(lblCampo);
		
		label = new JLabel("Campo1");
		label.setBounds(10, 65, 86, 24);
		contentPane.add(label);
	
		//Boton
		btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(textField.getText());
			}
		});
		btnNewButton.setBounds(131, 33, 89, 23);
		contentPane.add(btnNewButton);
	}
}
