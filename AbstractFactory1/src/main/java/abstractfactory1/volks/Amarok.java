
package abstractfactory1.volks;

import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class Amarok extends Carro {
    public Amarok() {
        this.nome = "Amarok";
        this.tipo = TipoCarro.PICKUP;
    }
}
