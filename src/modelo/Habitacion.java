package modelo;

public class Habitacion {
	private TipoHabitacion tipoHabitacion;
	private Extras extras;
	private int numeroHabitacion;
	private int cantidadHuespedes;
	private double precioHabitacion;
	private boolean isLibre;
	
	public Habitacion(TipoHabitacion tipoHabitacion, Extras extras, int numeroHabitacion, int cantidadHuespedes, double precioHabitacion, boolean isLibre) {
		this.tipoHabitacion = tipoHabitacion;
		this.extras = extras;
		this.numeroHabitacion = numeroHabitacion;
		this.cantidadHuespedes = cantidadHuespedes;
		this.precioHabitacion = precioHabitacion;
		this.isLibre = isLibre;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
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

	public double getPrecioHabitacion() {
		return precioHabitacion;
	}

	public void setPrecioHabitacion(double precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}
	
	public boolean isLibre() {
		return isLibre;
	}

	public void setLibre(boolean isLibre) {
		this.isLibre = isLibre;
	}

	public void crearHabitacion() {
		
	}
	
	@Override
	public TipoHabitacion toString() {
	    return tipoHabitacion;
	}
	
	
}
