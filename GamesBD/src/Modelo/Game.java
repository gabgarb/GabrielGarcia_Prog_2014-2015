package Modelo;

public class Game {
	
	//Atributos
	int id=0;
	private String nombre="";
	private String genero="";
	private String plataforma="";
	private String descripcion="";

	public Game(int id, String nombre, String genero, String plataforma,
			String descripcion) {
		this.id=id;
		this.nombre=nombre;
		this.plataforma=plataforma;
		this.descripcion=descripcion;

	}
	public String getNombre(){
		return this.nombre;
	}
	public String getGenero(){
		return this.genero;
	}
	public String getPlataforma(){
		return this.plataforma;
	}
	public String getDescripcion(){
		return this.descripcion;
	}

}
