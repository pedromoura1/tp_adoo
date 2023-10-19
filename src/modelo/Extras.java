package modelo;

import java.util.List;

public class Extras {
	private String nombre;
	private List<Habitacion> habitacion;
	
	public Extras(String nombre, List<Habitacion> habitacion) {
		this.nombre = nombre;
		this.habitacion = habitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Habitacion> getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(List<Habitacion> habitacion) {
		this.habitacion = habitacion;
	}
	
	
	
}
