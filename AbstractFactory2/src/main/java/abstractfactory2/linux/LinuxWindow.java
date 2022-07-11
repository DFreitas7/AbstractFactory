package abstractfactory2.linux;

import abstractfactory2.ElementoUI;
import abstractfactory2.TipoElementoUI;

public class LinuxWindow extends ElementoUI {
    public LinuxWindow() {
        this.nome = "LinuxWindow";
        this.tipo = TipoElementoUI.WINDOW;
    }
    
}
