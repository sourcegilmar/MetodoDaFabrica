package fabrica;

import entidades.Honda;
import entidades.Moto;
import entidades.Suzuki;
import entidades.Yamaha;

public class MotoFactory {
    public static Moto getMoto(String tipoMoto) {
        if (tipoMoto =="Suzuki")
            return new Suzuki();
        else if (tipoMoto == "Yamaha")
            return new Yamaha();
        else if (tipoMoto=="Honda")
        	return new Honda();
        else 
            return null;
    }
}

