package modelo;

public class MedioDeContacto {
	private PreferenciaDeContacto contacto;

	public MedioDeContacto(PreferenciaDeContacto contacto) {
		this.contacto = contacto;
	}

	public PreferenciaDeContacto getContacto() {
		return contacto;
	}

	public void setContacto(PreferenciaDeContacto contacto) {
		this.contacto = contacto;
	}
	
	public void notificar() {
		
	}
	
}
