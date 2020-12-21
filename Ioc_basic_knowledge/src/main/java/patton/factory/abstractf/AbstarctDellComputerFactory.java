package patton.factory.abstractf;

import patton.factory.entity.DellKeyboard;
import patton.factory.entity.DellMouse;
import patton.factory.entity.Keyboard;
import patton.factory.entity.Mouse;

public class AbstarctDellComputerFactory implements ComputerFactory{

    public Mouse createMouse() {
        return new DellMouse();
    }

    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
