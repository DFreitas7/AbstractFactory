package abstractfactory2.linux;

import abstractfactory2.ElementoUI;
import abstractfactory2.TipoElementoUI;
import abstractfactory2.UIFactory;

public class LinuxUIFactory implements UIFactory {
    @Override
    public ElementoUI createElementoUI(TipoElementoUI tipo) {
        switch(tipo) {
            case WINDOW: return new LinuxWindow();
            case BUTTON: return new LinuxButton();
            case LABEL: return new LinuxLabel();
            default: return null;
        }
    }
}
