import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField textEuros;
	private JTextField textConversion;
	private JTextField textMensaje;

	//Variables
	float valorEuros;
	String valorDolares="0.75";
	String valorLibras="1.5";
	String valorYen="2.1";
	float valorConversion;
	
	public VentanaConversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JLabel que nos indica las condiciones de la descripcion.
		JLabel lblDescripcion = new JLabel("Introducir un valor de EUROS entre 0 y 500");
		lblDescripcion.setBounds(10, 11, 243, 25);
		contentPane.add(lblDescripcion);
		
		//JLabel que nos define el JTextFiel textEuros.
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 47, 46, 14);
		contentPane.add(lblEuros);
		
		//JLabel que nos define el JTextField de textMensaje.
		JLabel lblMensajeDeControl = new JLabel("Mensaje de Control");
		lblMensajeDeControl.setBounds(10, 181, 116, 25);
		contentPane.add(lblMensajeDeControl);
		
		//JTextField donde se introduce el valor en euros.
		textEuros = new JTextField();
		textEuros.setBounds(10, 72, 86, 20);
		contentPane.add(textEuros);
		textEuros.setColumns(10);
		
		//JTextFieldque saca el valor de la conversion.
		textConversion = new JTextField();
		textConversion.setBounds(10, 144, 86, 20);
		contentPane.add(textConversion);
		textConversion.setColumns(10);
		
		//JTextField que saca el mensaje de error.
		textMensaje = new JTextField();
		textMensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		textMensaje.setForeground(Color.RED);
		textMensaje.setEditable(false);
		textMensaje.setBounds(10, 213, 324, 25);
		contentPane.add(textMensaje);
		textMensaje.setColumns(10);
		
		//JComboBox dondese selecionala moneda de conversion.
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 108, 86, 20);
		contentPane.add(comboBox);
		
		
		//Añadimos los elementos.
		String monedas[]=new String[3];
		
		monedas[0]="Dolares";
		monedas[1]="Libras";
		monedas[2]="Yen";
		
		comboBox.addItem(monedas[0]);
		comboBox.addItem(monedas[1]);
		comboBox.addItem(monedas[2]);

		//Evento seleccion de item.
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)comboBox.getSelectedItem())
				{
				case "Dolares":
					textMensaje.setText("Seleccionada la moneda DOLARES");
					valorConversion=Float.parseFloat(valorDolares);
					break;
					
				case "Libras":
					textMensaje.setText("Seleccionada la moneda LIBRAS");
					valorConversion=Float.parseFloat(valorLibras);
					break;
				
				case "Yen":
					textMensaje.setText("Seleccionada la moneda YEN");
					valorConversion=Float.parseFloat(valorYen);
					break;
				}
			}
		});
		
		//Boton que realiza la conversion.
		JButton btnConversion = new JButton("CONVERTIR");
		btnConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
				
					valorEuros=Float.parseFloat(textEuros.getText());
				
					if((valorEuros<500)&&(valorEuros>0)){
					
						textConversion.setText(String.valueOf(valorEuros*valorConversion));
						textMensaje.setText("Cantidad Valida");
						
					}else{
						
						textMensaje.setText("Los euros deben de estar entre 0 y 500€");
						
					}
				}catch(Exception e){
					
				}
			}
		});
		btnConversion.setBounds(133, 107, 106, 23);
		contentPane.add(btnConversion);
	}
}
