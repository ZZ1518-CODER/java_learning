package patton.factory.method;

import patton.factory.entity.HpMouse;
import patton.factory.entity.Mouse;

public class HpMouseFactory implements MouseFactory {

    public Mouse createMouse() {
        return new HpMouse();
    }
}
