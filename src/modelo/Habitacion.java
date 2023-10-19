package modelo;

public class Habitacion {
	private String tipoHabitacion;
	private Extras extras;
	private int numeroHabitacion;
	private int cantidadHuespedes;
	private float precioHabitacion;
	
	public Habitacion(String tipoHabitacion, Extras extras, int numeroHabitacion, int cantidadHuespedes, float precioHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
		this.extras = extras;
		this.numeroHabitacion = numeroHabitacion;
		this.cantidadHuespedes = cantidadHuespedes;
		this.precioHabitacion = precioHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Extras getExtras() {
		return extras;
	}

	public void setExtras(Extras extras) {
		this.extras = extras;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getCantidadHuespedes() {
		return cantidadHuespedes;
	}

	public void setCantidadHuespedes(int cantidadHuespedes) {
		this.cantidadHuespedes = cantidadHuespedes;
	}

	public float getPrecioHabitacion() {
		return precioHabitacion;
	}

	public void setPrecioHabitacion(float precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}
	
	public void crearHabitacion() {
		
	}
	
	
}
