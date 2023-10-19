package modelo;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	private int telefono;
	private String mail;
	private PreferenciaDeContacto contacto;
	
	public Cliente(String nombre, String apellido, String dni, int telefono, String mail, PreferenciaDeContacto contacto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public PreferenciaDeContacto getContacto() {
		return contacto;
	}

	public void setContacto(PreferenciaDeContacto contacto) {
		this.contacto = contacto;
	}
	
	public void actualizar() {
		
	}
}
