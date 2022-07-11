package abstractfactory2.windows;

import abstractfactory2.ElementoUI;
import abstractfactory2.TipoElementoUI;

public class WindowsLabel extends ElementoUI {
    public WindowsLabel() {
        this.nome = "WindowsLabel";
        this.tipo = TipoElementoUI.LABEL;
    }
}
