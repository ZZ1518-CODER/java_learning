package patton.factory.entity;

public class BMCMouse extends DellMouse {
    @Override
    public void click() {
        System.out.println("I am a BMC mouse, son of dell, now click");
    }
}
