package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

	public class UsuarioModelo {
		//Atributos de la Base de Datos
		ConexionDB gamesDB;
		Statement instruccion = null;
		ResultSet conjuntoResultados = null;
		
		//Consulta SQL
		private static String USUARIOS_SEL="SELECT * FROM usuarios";
		private static String USUARIO_COL="usuario";
		
				
		public UsuarioModelo(){
		//Creamos la conexion con la Base de Datos
			gamesDB=ConexionDB.getInstance();
		}
		
		//Devolvemos los usuarios
		public ArrayList<String> getUsuarios(){
			ArrayList<String> usuarios=new ArrayList<String>();
			try{
				//Preparamos la peticion
				instruccion = gamesDB.getConexion().createStatement();
				conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
				
				usuarios.clear();
				
				//Listaremos por pantalla los datos
				while(conjuntoResultados.next()){
					usuarios.add(conjuntoResultados.getString("usuario"));
				}//fin del while
			}
			catch(SQLException excepcionSql){
				excepcionSql.printStackTrace();
			}
			finally{
				try{
					conjuntoResultados.close();
					instruccion.close();
				}
				catch(SQLException excepcionSql){
					excepcionSql.printStackTrace();
				}
			}
			return usuarios;
			
		}
		
}
