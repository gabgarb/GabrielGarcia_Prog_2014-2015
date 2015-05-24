package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import java.awt.Component;

import javax.swing.Box;

import java.awt.ScrollPane;

import javax.swing.JScrollPane;

import Modelo.Game;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class VistaJuego extends JPanel {
	private JTextField textNombJu;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JList list;
	private DefaultListModel listModel;

	/**
	 * Create the panel.
	 */
	public VistaJuego() {
		setLayout(null);
		
		//JLabel que definen el filtro, nombre y genero de la parte superior.
		JLabel lblFiltro = new JLabel("Filtro");
		lblFiltro.setBounds(36, 23, 66, 21);
		add(lblFiltro);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(37, 55, 89, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("GENERO");
		lblGenero.setBounds(174, 55, 78, 14);
		add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("PLATAFORMA");
		lblPlataforma.setBounds(313, 55, 86, 14);
		add(lblPlataforma);
		
		//JTextField y 2 JComboBox que estan en la parte superior donde se introduciran o seleccionaran valores.
		textNombJu = new JTextField();
		textNombJu.setBounds(37, 80, 86, 20);
		add(textNombJu);
		textNombJu.setColumns(10);
		
		JComboBox BoxGenero = new JComboBox();
		BoxGenero.setBounds(174, 80, 86, 20);
		add(BoxGenero);
		
		JComboBox BoxPlataforma = new JComboBox();
		BoxPlataforma.setBounds(313, 80, 86, 20);
		add(BoxPlataforma);
		
		//Jlabels que estan en la parte inferior derecha que definen nombre, genero y plataforma.
		JLabel lblNombre2 = new JLabel("NOMBRE");
		lblNombre2.setBounds(233, 123, 169, 14);
		add(lblNombre2);
		
		JLabel lblGenero2 = new JLabel("GENERO");
		lblGenero2.setBounds(233, 176, 166, 14);
		add(lblGenero2);
		
		JLabel lblPlataforma2 = new JLabel("PLATAFORMA");
		lblPlataforma2.setBounds(233, 229, 166, 14);
		add(lblPlataforma2);
		
		//JtextFields que estan ubicados en la parte inferior derecha.
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(233, 145, 166, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(233, 198, 166, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(233, 254, 166, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		//JButton que tendran alguna funcion al ser pulsados la cual no esta definida.
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(233, 295, 169, 23);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(233, 329, 169, 23);
		add(btnSalvar);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
			

		public void putJuegos (ArrayList juegos) {
		Iterator<Game> it=juegos.iterator();
		listModel.removeAllElements();
		while(it.hasNext()){
			Game game=(Game)it.next();
			listModel.addElement(game.getNombre());
			}
		}
}


