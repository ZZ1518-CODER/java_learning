package patton.factory.abstractf;

import patton.factory.entity.Keyboard;
import patton.factory.entity.Mouse;

public interface ComputerFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
