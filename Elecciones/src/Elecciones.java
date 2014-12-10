import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Elecciones extends JFrame {

	private JPanel contentPane;
	private JTextField textEleccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elecciones frame = new Elecciones();
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
	public Elecciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Desplegable de Monedas.
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 34, 174, 26);
		contentPane.add(comboBox);
		
		//Añadimos elementos.
		String monedas[]=new String[5];
		
		monedas[0]="Libras";
		monedas[1]="Dolares";
		monedas[2]="Euros";
		monedas[3]="Marco";
		monedas[4]="Yen";
		
		comboBox.addItem(monedas[0]);
		comboBox.addItem(monedas[1]);
		comboBox.addItem(monedas[2]);
		comboBox.addItem(monedas[3]);
		comboBox.addItem(monedas[4]);
		
		//Evento seleccion de item.
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)comboBox.getSelectedItem())
				{
				case "Dolares":
					textEleccion.setText("Hemos seleccionado la moneda de EEUU");
					break;
				case "Libras":
					textEleccion.setText("Hemos seleccionado la moneda de UK");
					break;
				case "Euros":
					textEleccion.setText("Hemos seleccionado la moneda de España");
					break;
				default:
					textEleccion.setText("Hemos seleccionado una moneda antigua");
					break;
				}
			}
		});
		
		//Otros elementos.
		textEleccion = new JTextField();
		textEleccion.setBounds(10, 117, 251, 20);
		contentPane.add(textEleccion);
		textEleccion.setColumns(10);
		
		JLabel lblEleccion = new JLabel("Eleccion");
		lblEleccion.setBounds(10, 86, 86, 20);
		contentPane.add(lblEleccion);
	}
}
