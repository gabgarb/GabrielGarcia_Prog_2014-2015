package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VistaPrincipal extends JPanel {
	private JTextField textContraseña;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		setLayout(null);
		
		//Boton que nos llevara a juegos
		JButton botonJuegos = new JButton("JUEGOS >");
		botonJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		botonJuegos.setBounds(224, 32, 179, 23);
		add(botonJuegos);
		
		//Boton que nos llevara a perfil
		JButton botonPerfil = new JButton("PERFIL >");
		botonPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonPerfil.setBounds(224, 76, 179, 23);
		add(botonPerfil);
		
		//JLabel que define el JComboBox donde estara el nombre de usuario.
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(26, 175, 100, 23);
		add(lblUsuario);
		
		//JComboBox donde estaran los nombre de usuario
		JComboBox boxUsuario = new JComboBox();
		boxUsuario.setBounds(26, 209, 121, 20);
		add(boxUsuario);
		
		//JLabel que define el JTextField donde ira la contraseña
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContraseña.setBounds(26, 240, 100, 23);
		add(lblContraseña);
		
		//JTextFiel donde se introducira la contraseña
		textContraseña = new JTextField();
		textContraseña.setBounds(26, 274, 121, 20);
		add(textContraseña);
		textContraseña.setColumns(10);
		
		//JButton que cargara el usuario
		JButton botonLogin = new JButton("LogIn");
		botonLogin.setEnabled(false);
		botonLogin.setBounds(26, 318, 121, 23);
		add(botonLogin);
		
		//JButton que nos registrara como nuevo usuario
		JButton botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setEnabled(false);
		botonRegistrarse.setBounds(26, 352, 121, 23);
		add(botonRegistrarse);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gabriel\\Desktop\\icono.png"));
		lblNewLabel.setBounds(39, 32, 139, 128);
		add(lblNewLabel);
		
		
		

	}
}
