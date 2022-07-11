package abstractfactory1.volks;

import abstractfactory1.Carro;
import abstractfactory1.TipoCarro;

public class Gol extends Carro {
     public Gol() {
         this.nome = "Gol";
         this.tipo = TipoCarro.HATCH;
     }
}
