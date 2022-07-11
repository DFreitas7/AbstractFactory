package abstractfactory2;

import abstractfactory2.linux.LinuxUIFactory;
import abstractfactory2.windows.WindowsUIFactory;
import java.util.Scanner;

public class AbstractFactory2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer fabrica;
            LinuxUIFactory linuxFactory = new LinuxUIFactory();
            WindowsUIFactory windowsFactory = new WindowsUIFactory();
            
            do {
                System.out.println("Escolha a fabrica para visualizar os produtos: ");
                System.out.println("1 - Linux\t2 - Windows\t -1 para sair");
                fabrica = scanner.nextInt();
                
                System.out.println("Digite o codigo do produto para visualizar:");
                for (int i = 0; i < TipoElementoUI.values().length; i++) {
                    System.out.println(i + ": " + TipoElementoUI.values()[i]);
                }
                
                TipoElementoUI tipoElemento = TipoElementoUI.values()[scanner.nextInt()];
                
                switch (fabrica) {
                    case 1:
                        System.out.println(linuxFactory.createElementoUI(tipoElemento));
                        break;
                    case 2:
                        System.out.println(windowsFactory.createElementoUI(tipoElemento));
                        break;
                }
                
            } while (fabrica != -1);
        }
    }
}
