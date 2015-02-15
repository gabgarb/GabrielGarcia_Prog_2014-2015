import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class ConversorMonedas extends JFrame {

	//Elementos graficos.
	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField resConversion;
	private JTextField salidaMensaje;
	private JComboBox boxMonedas;
	private JButton btnConversion;
	
	//Datos generales.
	DatosGenerales DG=new DatosGenerales();
	
	//Seleccion Moneda.
	private float valorMonedaSel=0f;
	
	
	public ConversorMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//JLabels que definen objetos o cosas.
		JLabel textoExplicativo = new JLabel("INTRODUCIR UN VALOR EN EUROS ENTRE 0\u20AC I 500\u20AC");
		textoExplicativo.setForeground(Color.RED);
		textoExplicativo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textoExplicativo.setBounds(10, 23, 350, 21);
		contentPane.add(textoExplicativo);
		
		JLabel labelEuros = new JLabel("EUROS");
		labelEuros.setBounds(10, 66, 86, 14);
		contentPane.add(labelEuros);
		
		JLabel labelMensaje = new JLabel("Mensaje de Control");
		labelMensaje.setForeground(Color.RED);
		labelMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMensaje.setBounds(10, 196, 139, 21);
		contentPane.add(labelMensaje);
		
		//JTextFields donde se introducen o se sacan valores.
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 91, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		resConversion = new JTextField();
		resConversion.setBounds(10, 158, 86, 20);
		contentPane.add(resConversion);
		resConversion.setColumns(10);
		
		salidaMensaje = new JTextField();
		salidaMensaje.setEditable(false);
		salidaMensaje.setBounds(10, 228, 327, 20);
		contentPane.add(salidaMensaje);
		salidaMensaje.setColumns(10);
		
		//JComboBox donde se selecciona la moneda a la que se quiere convertir.
		boxMonedas = new JComboBox();
		boxMonedas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				salidaMensaje.setText("SELECCIONADA LA MONEDA "+boxMonedas.getSelectedItem());
				switch((String)boxMonedas.getSelectedItem()){
				case DatosGenerales.MONEDA_DOL:
					valorMonedaSel=DG.getValorConversionMoneda()[0];
					break;
				case DatosGenerales.MONEDA_EUR:
					valorMonedaSel=DG.getValorConversionMoneda()[1];
					break;
				case DatosGenerales.MONEDA_LIB:
					valorMonedaSel=DG.getValorConversionMoneda()[2];
					break;
				case DatosGenerales.MONEDA_YEN:
					valorMonedaSel=DG.getValorConversionMoneda()[3];
					break;
				}
			}
		});
		boxMonedas.setBounds(10, 127, 86, 20);
		contentPane.add(boxMonedas);
		
		
		//Rellenado del JComboBox.
		for(int i=0;i<DG.getMoneda().length;i++)
		{
			boxMonedas.addItem((String)DG.getMoneda()[i]);
		}
		
		//JButton que realiza la conversion.
		btnConversion = new JButton("CONVERSION");
		btnConversion.setBounds(127, 157, 133, 23);
		contentPane.add(btnConversion);
		
		//Accion del boton.
		btnConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					float euros;
					euros=Float.parseFloat(valorEuros.getText());
					if(euros<0){
						salidaMensaje.setText("LOS EUROS DEBEN ESTAR ENTRE 0€ Y 500€");
					}else if(euros>500){
						salidaMensaje.setText("LOS EUROS DEBEN ESTAR ENTRE 0€ Y 500€");
					}else{
						salidaMensaje.setText("CONVERSION CORRECTA");
					
						resConversion.setText(String.valueOf(euros*valorMonedaSel));
						}
					}catch(Exception e1){
						salidaMensaje.setText("SE HA PRODUCIDO UN ERROR EN LA CONVERSION");
						}
			}
		});
	}
}
