package ex04;

public class DeskLamp {

    private boolean isOn ;

    public void turnOn() {isOn = true;}
    public void turnOff() {isOn = false;}

    @Override
    public String toString() {
        return "현재 상태는 :" + (isOn==true ?"켜짐":"꺼짐");
    }
}
