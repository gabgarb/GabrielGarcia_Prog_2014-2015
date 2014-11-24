import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class VentanaExcepciones extends JFrame {

	private JPanel contentPane;
	private JTextField CajaA;
	private JTextField CajaB;
	private JTextField CajaC;
	private JTextField txtOp;

	/**
	 * Create the frame.
	 */
	public VentanaExcepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja donde se introduce un valor para la multiplicacion.
		CajaA = new JTextField();
		CajaA.setBounds(10, 39, 86, 20);
		contentPane.add(CajaA);
		CajaA.setColumns(10);
		
		//Caja donde se introduce un valor para la multiplicacion,
		CajaB = new JTextField();
		CajaB.setBounds(10, 89, 86, 20);
		contentPane.add(CajaB);
		CajaB.setColumns(10);
		
		//Caja que saca el valor de la multiplicacion.
		CajaC = new JTextField();
		CajaC.setBounds(240, 63, 86, 20);
		contentPane.add(CajaC);
		CajaC.setColumns(10);
		
		//Boton que realiza la multiplicacion.
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int A=0;
				int B=0;
				int C=0;
				
				try{
					A=Integer.parseInt(CajaA.getText());
					B=Integer.parseInt(CajaB.getText());
				
					C=A*B;
					CajaC.setText(String.valueOf(C));
					
					//Fenomenal.
					txtOp.setText("TODO DE PM");
				}catch(Exception e){
					txtOp.setText("Algo ha ido mal");
				}
				
			}
		});
		btnX.setBounds(123, 62, 89, 23);
		contentPane.add(btnX);
		
		txtOp = new JTextField();
		txtOp.setBounds(10, 168, 86, 20);
		contentPane.add(txtOp);
		txtOp.setColumns(10);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(10, 138, 86, 19);
		contentPane.add(lblMensaje);
	}
}
