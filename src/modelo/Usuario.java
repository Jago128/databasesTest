package modelo;

public class Usuario {
	private String nombre;
	private String contraseña;
	
	public Usuario() {
		this.nombre="";
		this.contraseña="";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}
}
