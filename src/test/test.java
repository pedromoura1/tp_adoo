package test;
import modelo.*;

import java.time.LocalDate;
import java.util.List;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente fer = new Cliente("fer", "Orrego", 45263321, 54232123, "fer@gmail.com", PreferenciaDeContacto.WhatsApp);

        Hotel miHotel = new Hotel("123 Calle Principal", 123456789, "Mi Hotel");

        // Crear tres habitaciones de ejemplo y agregarlas al hotel
        Habitacion habitacion1 = new Habitacion(TipoHabitacion.Suit, null, 101, 1, 100.43, false);
        Habitacion habitacion2 = new Habitacion(TipoHabitacion.Habitacion, null, 102, 2, 150.4, false);
        Habitacion habitacion3 = new Habitacion(TipoHabitacion.Habitacion, null, 103, 2, 150.5, false);

        // Agregar las habitaciones al hotel
        miHotel.crearHabitacion(habitacion1);
        miHotel.crearHabitacion(habitacion2);
        miHotel.crearHabitacion(habitacion3);
        
		
		Reserva reserva1  = fer.crearNuevaReserva(LocalDate.of(2023, 10, 22), LocalDate.of(2023, 12, 22), LocalDate.of(2023, 12, 28), null,  MedioDePago.MercadoPago, TipoHabitacion.Habitacion);
		
		List<Habitacion> resultado = reserva1.getListaHabitacion();
		
		System.out.println(resultado);
	}

}
