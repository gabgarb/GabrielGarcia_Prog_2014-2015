
public class Ciudad {

	//ATRIBUTOS
	String nombreCiudad;
	
	//CONSTRUCTOR
	
	
	public Ciudad(String defCiudad) {
		//Inicializaci�n
		this.nombreCiudad=defCiudad;
	}

	//METODOS
	public void setNombreCiudad(String defCiudad){
		this.nombreCiudad=defCiudad;
	}
	public String getNombreCiudad(){
		return this.nombreCiudad;
	}
}
