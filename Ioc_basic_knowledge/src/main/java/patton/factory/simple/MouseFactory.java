package patton.factory.simple;

import patton.factory.entity.DellMouse;
import patton.factory.entity.HpMouse;
import patton.factory.entity.Mouse;
import patton.factory.util.EnterpriseEnum;
public class MouseFactory {
    public static Mouse createMouse(EnterpriseEnum enterpriseEnum) {
        switch (enterpriseEnum) {
            case HP:
                return new HpMouse();
            case DELL:
                return new DellMouse();
            default:
                return null;
        }
    }

}
