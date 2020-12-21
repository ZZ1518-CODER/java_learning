package patton.factory.abstractf;

import patton.factory.entity.HpKeyboard;
import patton.factory.entity.HpMouse;
import patton.factory.entity.Keyboard;
import patton.factory.entity.Mouse;

public class AbstractHpComputerFactory implements ComputerFactory{
    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
