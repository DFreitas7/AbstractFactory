package abstractfactory1.volks;

import abstractfactory1.CarroFactory;
import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class VolksFactory implements CarroFactory {

    @Override
    public Carro createCarro(TipoCarro tipo) {
        switch(tipo){
            case HATCH: return new Gol();
            case SUV: return new Nivus();
            case PICKUP: return new Amarok();
            default: return null;
        }
    }
    
}
