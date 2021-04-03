package fabrica;

import entidades.Honda;
import entidades.Moto;
import entidades.Suzuki;
import entidades.Yamaha;

public class MotoFactory {
	public static Moto getMoto(String tipoMoto) {		
		if (tipoMoto.equalsIgnoreCase("Suzuki")) {
			return new Suzuki();			
		} else if (tipoMoto.equalsIgnoreCase("Yamaha")) {
			return new Yamaha();
		} else if (tipoMoto.equalsIgnoreCase("Honda")) {
			return new Honda();
		} else
			return null;
	}
}
