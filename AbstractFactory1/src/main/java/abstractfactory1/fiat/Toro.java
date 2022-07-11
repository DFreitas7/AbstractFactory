
package abstractfactory1.fiat;

import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class Toro extends Carro {
    public Toro() {
        this.nome = "Toro";
        this.tipo = TipoCarro.PICKUP;
    }
}