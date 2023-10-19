package modelo;

import java.util.Date;
import java.util.List;

public class Reserva {
	private Date fechaReserva;
	private Date fechaCheckIn;
	private Date fechaCheckOut;
	private Cliente clienteRegistrado;
	private Huesped huesped;
	private MedioDePago medioPago;
	private Estado estado;
	private List<Habitacion> listaHabitacion;
	
	public Reserva(Date fechaReserva, Date fechaCheckIn, Date fechaCheckOut, Cliente clienteRegistrado, Huesped huesped, MedioDePago medioPago, Estado estado, List<Habitacion> listaHabitacion) {
		this.fechaReserva = fechaReserva;
		this.fechaCheckIn = fechaCheckIn;
		this.fechaCheckOut = fechaCheckOut;
		this.clienteRegistrado = clienteRegistrado;
		this.huesped = huesped;
		this.medioPago = medioPago;
		this.estado = estado;
		this.listaHabitacion = listaHabitacion;
	}
	
	public Date getFechaReserva() {
		return fechaReserva;
	}
	
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	
	public Date getFechaCheckIn() {
		return fechaCheckIn;
	}
	
	public void setFechaCheckIn(Date fechaCheckIn) {
		this.fechaCheckIn = fechaCheckIn;
	}
	
	public Date getFechaCheckOut() {
		return fechaCheckOut;
	}
	
	public void setFechaCheckOut(Date fechaCheckOut) {
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
