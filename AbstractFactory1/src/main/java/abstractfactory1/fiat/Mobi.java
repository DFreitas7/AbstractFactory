
package abstractfactory1.fiat;

import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;


public class Mobi extends Carro {
    public Mobi() {
        this.nome = "Mobi";
        this.tipo = TipoCarro.HATCH;
    }
}
