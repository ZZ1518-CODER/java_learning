package patton.factory;

import patton.factory.abstractf.AbstarctDellComputerFactory;
import patton.factory.abstractf.AbstractHpComputerFactory;
import patton.factory.abstractf.ComputerFactory;
import patton.factory.entity.Keyboard;
import patton.factory.entity.Mouse;
import patton.factory.method.BMCMouseFactory;
import patton.factory.method.DellMouseFactory;
import patton.factory.method.HpMouseFactory;
import patton.factory.method.MouseFactory;
import patton.factory.util.EnterpriseEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println("简单工程模式");
        Mouse mouse = patton.factory.simple.MouseFactory.createMouse(EnterpriseEnum.getByCode("dell"));
        Mouse mouse1 = patton.factory.simple.MouseFactory.createMouse(EnterpriseEnum.getByCode("hp"));
        mouse.click();
        mouse1.click();
        System.out.println("工厂方法模式");
        MouseFactory hpMouseFactory = new HpMouseFactory();
        MouseFactory dellMouseFactory = new DellMouseFactory();
        MouseFactory BMCMouseFactory = new BMCMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();
        Mouse dellMouse = dellMouseFactory.createMouse();
        Mouse BMCMouse = BMCMouseFactory.createMouse();
        hpMouse.click();
        dellMouse.click();
        BMCMouse.click();
        System.out.println("抽象工厂模式");
        ComputerFactory dellComputerFactory = new AbstarctDellComputerFactory();
        ComputerFactory hpComputerFactory = new AbstractHpComputerFactory();
        Mouse absDellMouse = dellComputerFactory.createMouse();
        Keyboard absDellKeyboard = dellComputerFactory.createKeyboard();
        Mouse absHpMouse = hpComputerFactory.createMouse();
        Keyboard absHpKeyboard = hpComputerFactory.createKeyboard();
        absDellMouse.click();
        absDellKeyboard.press();
        absHpMouse.click();
        absHpKeyboard.press();
    }
}
