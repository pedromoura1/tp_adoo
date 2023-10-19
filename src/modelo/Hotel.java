package modelo;

public class Hotel {
	private String direccion;
	private int Telefono;
	private String nombre;
	
	public Hotel(String direccion, int telefono, String nombre) {
		this.direccion = direccion;
		Telefono = telefono;
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
