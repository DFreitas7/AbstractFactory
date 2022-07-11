package abstractfactory1.fiat;

import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class Pulse extends Carro {
    public Pulse() {
        this.nome = "Pulse";
        this.tipo = TipoCarro.SUV;
    }
}
