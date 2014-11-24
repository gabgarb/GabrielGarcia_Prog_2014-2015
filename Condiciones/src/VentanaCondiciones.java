import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaCondiciones extends JFrame{
	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textMsg;

	public VentanaCondiciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(10, 38, 171, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduce Numero Positivo");
		lblNewLabel.setBounds(10, 11, 171, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(10, 84, 171, 14);
		contentPane.add(lblMensaje);
		
		textMsg = new JTextField();
		textMsg.setEditable(false);
		textMsg.setBounds(10, 109, 171, 20);
		contentPane.add(textMsg);
		textMsg.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txtCaja="";
				int numCaja=0;
				
				txtCaja=textNum.getText();
				numCaja=Integer.parseInt(txtCaja);
				
				System.out.println(numCaja);
				
				//CONDICION
				if(numCaja>=0){
					//Si es verdadera la condicion
					textMsg.setText("OK");
				}else{
					//Si no es verdadera la condicion
					textMsg.setText("No es un numero positivo");
				}
			}
		});
		btnNewButton.setBounds(218, 37, 111, 23);
		contentPane.add(btnNewButton);
	}
}
