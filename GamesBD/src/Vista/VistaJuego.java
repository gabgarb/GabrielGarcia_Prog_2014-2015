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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controlador.MainController;
import Modelo.Game;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaJuego extends JPanel {
	private JTextField textNombJu;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JList list;
	private JList JList;
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
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(233, 145, 166, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(233, 198, 166, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(233, 254, 166, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		//JButton que tendran alguna funcion al ser pulsados la cual no esta definida.
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
			}
		});
		btnEditar.setBounds(233, 295, 169, 23);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game game=(Game) listModel.getElementAt(list.getSelectedIndex());
				Game update=new Game(game.getId(),textField.getText(),textField_1.getText(),textField_2.getText(),game.getDescripcion());
				MainController.getInstance().updateJuegos(update);
			}
		});
		btnSalvar.setBounds(233, 329, 169, 23);
		add(btnSalvar);
		
		Panel panelJlist = new Panel();
		panelJlist.setBounds(36, 145, 169, 207);
		panelJlist.setLayout(null);
		add(panelJlist);
		
		
		JList = new JList();
		JList.setBounds(0, 0, 169, 207);
		panelJlist.add(JList);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
			//Mostraremos los datos en los campos.
			list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listselectionEvent) {
				//Cojemos el juego seleccionado.
				if((list!=null)&&(listModel!=null)){
				if(list.getSelectedIndex()>=0){	
				Game game=(Game)listModel.getElementAt(list.getSelectedIndex());
				//Colocamos los campos
				textField.setText(game.getNombre());
				textField_1.setText(game.getGenero());
				textField_2.setText(game.getPlataforma());
				}
			}
		}
	});
}

		public void putJuegos (ArrayList juegos) {
		Iterator<Game> it=juegos.iterator();
		listModel.removeAllElements();
		while(it.hasNext()){
			Game game=(Game)it.next();
			listModel.addElement(game);
			}
		}
	}


