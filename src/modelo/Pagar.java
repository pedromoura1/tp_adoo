package modelo;

public class Pagar {
	private MedioDePago medioPago;
	private float monto;
	
	public Pagar(MedioDePago medioPago, float monto) {
		this.medioPago = medioPago;
		this.monto = monto;
	}

	public MedioDePago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioDePago medioPago) {
		this.medioPago = medioPago;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}
	
}
