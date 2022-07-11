package abstractfactory1.fiat;

import abstractfactory1.CarroFactory;
import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class FiatFactory implements CarroFactory {
    @Override
    public Carro createCarro(TipoCarro tipo) {
        switch(tipo) {
            case HATCH: return new Mobi();
            case SUV: return new Pulse();
            case PICKUP: return new Toro();
            default: return null;
        }
    }
}
