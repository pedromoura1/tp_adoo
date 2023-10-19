package modelo;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
	private LocalDate fechaReserva;
	private LocalDate fechaCheckIn;
	private LocalDate fechaCheckOut;
	private Cliente clienteRegistrado;
	private Huesped huesped;
	private MedioDePago medioPago;
	private Estado estado;
	private List<Habitacion> listaHabitacion;
	private TipoHabitacion tipoHabitacion;
	
	public Reserva(LocalDate fechaReserva, LocalDate fechaCheckIn, LocalDate fechaCheckOut, Cliente clienteRegistrado, Huesped huesped, MedioDePago medioPago, TipoHabitacion tipoHabitacion) {
		this.fechaCheckIn = fechaCheckIn;
		this.fechaCheckOut = fechaCheckOut;
		this.clienteRegistrado = clienteRegistrado;
		this.huesped = huesped;
		this.medioPago = medioPago;
		this.tipoHabitacion = tipoHabitacion;
	}
	
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	
	public LocalDate getFechaCheckIn() {
		return fechaCheckIn;
	}
	
	public void setFechaCheckIn(LocalDate fechaCheckIn) {
		this.fechaCheckIn = fechaCheckIn;
	}
	
	public LocalDate getFechaCheckOut() {
		return fechaCheckOut;
	}
	
	public void setFechaCheckOut(LocalDate fechaCheckOut) {
		this.fechaCheckOut = fechaCheckOut;
	}
	
	public Cliente getClienteRegistrado() {
		return clienteRegistrado;
	}
	
	public void setClienteRegistrado(Cliente clienteRegistrado) {
		this.clienteRegistrado = clienteRegistrado;
	}
	
	public Huesped getHuesped() {
		return huesped;
	}
	
	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	
	public MedioDePago getMedioPago() {
		return medioPago;
	}
	
	public void setMedioPago(MedioDePago medioPago) {
		this.medioPago = medioPago;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public List<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}
	
	public void setListaHabitacion(List<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}
	
	public void notificarReserva() {
		
	}
	
	public void agregarHabitacion() {
		
	}
	
}
