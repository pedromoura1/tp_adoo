package modelo;

import java.time.LocalDate;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
	private String mail;
	private PreferenciaDeContacto contacto;
	
	public Cliente(String nombre, String apellido, int dni, int telefono, String mail, PreferenciaDeContacto contacto) {
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
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
	
	
	public Reserva crearNuevaReserva(LocalDate fechaReserva, LocalDate fechaCheckIn, LocalDate fechaCheckOut, Huesped huesped, MedioDePago medioPago, TipoHabitacion tipoHabitacion) {
	    List<Habitacion> habitacionesDisponibles = Hotel.buscarHabitacionesDisponibles(tipoHabitacion);

	    if (!habitacionesDisponibles.isEmpty()) {
	        Reserva nuevaReserva = new Reserva(fechaReserva, fechaCheckIn, fechaCheckOut, this, huesped, medioPago, tipoHabitacion);
	        nuevaReserva.setEstado(Estado.Pendiente);

	        // Asignar habitaciones disponibles a la reserva
	        nuevaReserva.setListaHabitacion(habitacionesDisponibles);

	        // Marcar las habitaciones como ocupadas
	        for (Habitacion habitacion : habitacionesDisponibles) {
	            habitacion.setLibre(false);
	        }

	        return nuevaReserva;
	    } else {
	        System.out.println("No hay habitaciones disponibles de tipo " + tipoHabitacion);
	        return null; // Opcional: retornar null si no hay habitaciones disponibles
	    }
	}
	public void actualizar() {
		
	}
	
	
}
