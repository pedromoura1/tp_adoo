package modelo;

import java.util.Date;

public class Reloj {
	private Date fechaReserva;

	public Reloj(Date fechaReserva) {
		super();
		this.fechaReserva = fechaReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	
}
