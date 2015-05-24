package Controlador;

import java.awt.CardLayout;
import java.util.ArrayList;

import Modelo.ConexionDB;
import Modelo.Game;
import Modelo.JuegosModel;
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
		gamesDB=ConexionDB.getInstance("localhost","juegos","root","panasonic");
		//Creamos la ventana principal
		vPrincipalApp = new VistaApp();
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
		
		//cargamso datos de usuarios
		vPrincipalApp.showInicial(usuario);
		//Hacemos visible la pantalla inicial
		vPrincipalApp.setVisible(true);
		vPrincipalApp.showVPrincipal();
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
	
	JuegosModel juegos = null;

	public void showVJuego() {
		if(this.auth.estaLogado()){
		if(juegos==null) juegos=new JuegosModel();
		vPrincipalApp.showVJuego(juegos.getJuegos());
		}else{
			
		}
	}

	public void logar() {
		this.auth.comprobarUser();
		this.showVJuego();
	}
	
	//Actualizar juegos.
	public void updateJuegos(Game game) {
		juegos.updateJuego(game);
		this.showVJuego();
	}

}
