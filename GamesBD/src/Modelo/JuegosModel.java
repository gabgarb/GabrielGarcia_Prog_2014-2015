package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.ietf.jgss.GSSName;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JuegosModel<juegos> {

	//CONSULTA DE LISTAS DE JUEGOS
	private final static String GAMES_SEL="SELECT * FROM juegos";
	private final static String ID_COL="id";
	private final static String NAME_COL="nombre";
	private final static String GENRE_COL="genero";
	private final static String PLATAFORM_COL="plataforma";
	private final static String DESCRIPTION_COL="descripcion";
	
	//Update juego.
	private final static String GAME_UPDATE="UPDATE juegos set "+NAME_COL+"=?,"+GENRE_COL+"=?,"+PLATAFORM_COL+"=? WHERE id"+"=?";
	
	//Conexion
	private Connection conexion = null;
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;
	
	//UsuariosBD
	private ArrayList<Game> juegos = null;
	
	public JuegosModel() {
		//Obtenemos la conexion de datos.
		conexion=(Connection) ConexionDB.getConexion();
		//Inicializamos el array de usuarios.
		juegos=new ArrayList<Game>();	
	}
	
	public ArrayList getJuegos(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(GAMES_SEL);
			juegos.clear();
			//Listaremos por pantalla los datos.
			while( conjuntoResultados.next()){
				Game game=new Game(conjuntoResultados.getInt(ID_COL),
								   conjuntoResultados.getString(NAME_COL),
								   conjuntoResultados.getString(GENRE_COL),
								   conjuntoResultados.getString(PLATAFORM_COL),
								   conjuntoResultados.getString(DESCRIPTION_COL));
				juegos.add(game);
			}//fin del while
			return juegos;
		}
		catch( SQLException excepcionSql )
		{
			excepcionSql.printStackTrace();
			return juegos;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql )
			{
			excepcionSql.printStackTrace();
			return juegos;
			}
		}
			
	}

	public void updateJuego(Game game) {
		try{
			PreparedStatement pst = (PreparedStatement) this.conexion.prepareStatement(GAME_UPDATE);
			pst.setString(1, game.getNombre());
			pst.setString(2, game.getGenero());
			pst.setString(3, game.getPlataforma());
			pst.setInt(4, game.getId());
			pst.executeUpdate();
		}
		catch( SQLException excepcionSql )
		{
			excepcionSql.printStackTrace();
		}
		
	}
}
