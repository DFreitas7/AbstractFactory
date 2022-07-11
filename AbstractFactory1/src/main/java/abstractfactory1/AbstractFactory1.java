package abstractfactory1;

import abstractfactory1.fiat.FiatFactory;
import abstractfactory1.volks.VolksFactory;
import java.util.Scanner;

public class AbstractFactory1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer fabrica;
            VolksFactory volksFactory = new VolksFactory();
            FiatFactory fiatFactory = new FiatFactory();
            
            do {
                System.out.println("Escolha a fabrica para visualizar os produtos: ");
                System.out.println("1 - Volkswagem\t2 - Fiat\t -1 para sair");
                fabrica = scanner.nextInt();
                
                System.out.println("Digite o codigo do produto para visualizar:");
                for (int i = 0; i < TipoCarro.values().length; i++) {
                    System.out.println(i + ": " + TipoCarro.values()[i]);
                }
                
                TipoCarro tipoCarro = TipoCarro.values()[scanner.nextInt()];
                
                switch (fabrica) {
                    case 1:
                        System.out.println(volksFactory.createCarro(tipoCarro));
                        break;
                    case 2:
                        System.out.println(fiatFactory.createCarro(tipoCarro));
                        break;
                }
                
            } while (fabrica != -1);
        }
    }
}
