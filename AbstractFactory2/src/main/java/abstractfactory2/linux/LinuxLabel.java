package abstractfactory2.linux;

import abstractfactory2.ElementoUI;
import abstractfactory2.TipoElementoUI;

public class LinuxLabel extends ElementoUI {
    public LinuxLabel() {
        this.nome = "LinuxLabel";
        this.tipo = TipoElementoUI.LABEL;
    }
}
