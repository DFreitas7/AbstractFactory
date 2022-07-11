
package abstractfactory2.windows;

import abstractfactory2.ElementoUI;
import abstractfactory2.TipoElementoUI;
import abstractfactory2.UIFactory;

public class WindowsUIFactory implements UIFactory {
    @Override
    public ElementoUI createElementoUI(TipoElementoUI tipo) {
        switch(tipo) {
            case WINDOW: return new WindowsWindow();
            case BUTTON: return new WindowsButton();
            case LABEL: return new WindowsLabel();
            default: return null;
        }
    }
}
