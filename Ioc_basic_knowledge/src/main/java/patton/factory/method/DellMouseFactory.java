package patton.factory.method;

import patton.factory.entity.DellMouse;
import patton.factory.entity.Mouse;

public class DellMouseFactory implements MouseFactory{

    public Mouse createMouse() {
        return new DellMouse();
    }
}
