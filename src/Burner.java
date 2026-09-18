public class Burner{ 

enum Temperature {
BLAZING, HOT, WARM, COLD}

private Temperature MyTemperature;
private Setting MySetting;
private int Timer; 
public static final int TIME_DURATION = 2;

public Temperature get() {
    return MyTemperature;
}

public Burner() {
    MyTemperature = Temperature.COLD;
    MySetting = Setting.OFF;
    Timer = TIME_DURATION; 

}


public void plusButton(){
    switch (MySetting) {
        case OFF:
            MySetting = Setting.LOW;
            break;
        case LOW:
            MySetting = Setting.MEDIUM;
            break;
        case MEDIUM:
            MySetting = Setting.HIGH;
            break;
        case HIGH:
            MySetting = Setting.HIGH;
            break;
        default:
            System.out.println("ERROR");
            break;
    }
}

public void minusButton()
{
    switch (MySetting) {
        case OFF:
            MySetting = Setting.OFF;
            break;
        case LOW:
            MySetting = Setting.OFF;
            break;
        case MEDIUM:
            MySetting = Setting.LOW;
            break;
        case HIGH:
            MySetting = Setting.MEDIUM;
            break;
        default:
            System.out.println("ERROR");
            break;
    }

}

public void updateTemperature(){

}


public void display() {
    switch (MyTemperature) {
        case COLD:
            System.out.println("[---].....cooool");
            break;
        case WARM:
            System.out.println("[--+].....warm");
            break;
        case HOT:
            System.out.println("[-++].....CAREFUL");
            break;
        case BLAZING:
            System.out.println("[+++].....VERY HOT! DON'T TOUCH");
            break;
        default:
            System.out.println("[???].....SOMETHING IS WRONG CHECK BREAKER(CODE)");
            break;
    }
}


} //end Burner class