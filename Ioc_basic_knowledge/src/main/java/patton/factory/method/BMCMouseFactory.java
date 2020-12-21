package patton.factory.method;

import patton.factory.entity.BMCMouse;
import patton.factory.entity.Mouse;

public class BMCMouseFactory extends DellMouseFactory {
    @Override
    public Mouse createMouse() {
        return new BMCMouse();
    }
}
