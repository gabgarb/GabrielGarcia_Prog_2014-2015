package Controlador;

import java.awt.CardLayout;
import java.util.ArrayList;

import Modelo.ConexionDB;
import Modelo.User;
import Modelo.UsuarioModelo;
import Vista.VistaApp;
import Vista.VistaPrincipal;


public class MainController {
	
	//Instancia unica
	private static MainController instance = null;
	//Atributos de la base de datos.
	//Establecemos la conexion con la base de datos.
	ConexionDB gamesDB;
	
	//Ventana Principal
	private VistaApp vPrincipalApp;
	
	//Autenticador
	private Autenticar auth;
	private User usuarioRegistrado=null;
	
	private MainController() {
		//Creamos la conexion con la base de datos
		gamesDB=ConexionDB.getInstance("localhost","usuarios","root","panasonic");
		if(gamesDB.connectDB()==true) {
			System.out.println("CONECTADOS CONEXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		//Creamos el objeto de autenticacion
		auth=new Autenticar();
		this.showPrincipal();
	}
	
	//Implementar SingleTon
	public static MainController getInstance() {
		if(instance == null) {
			instance = new MainController();
		}
		return instance;
	}
	
	//Lanzar la vista Principal
	public void showPrincipal() {
		//Consultamos los usuarios
		UsuarioModelo uModelo=new UsuarioModelo();
		ArrayList<String> usuario=uModelo.getUsuarios();
		//Lanzamos la ventana principal
		vPrincipalApp = new VistaApp();
		//cargamso datos de usuarios
		vPrincipalApp.showInicial(usuario);
		//Hacemos visible la pantalla inicial
		vPrincipalApp.setVisible(true);
	}

	//Lanzar usuarios
	public void showUsuario() {

	}
	
	//Lanzar Inicio
	public void showInicio() {
		vPrincipalApp.showInicial(null);
	}
	
	//Comprobar usuarios
	public void checkUser(String usuario,char[] pass){
		//Aquí comprobaríamos el usuario
		usuarioRegistrado=new User();
		vPrincipalApp.showVPrincipal();
	}
	
}
