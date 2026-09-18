public class Burner{ 

enum Temperature {
BLAZING, HOT, WARM, COLD}

private Temperature myTemperature;
private Setting mySetting;
private int timer; 
public static final int TIME_DURATION = 2;

public Temperature getMyTemperature() {
    return myTemperature;
}

public Burner() {
    myTemperature = Temperature.COLD;
    mySetting = Setting.OFF;
    timer = 0; 

}


public void plusButton(){
    switch (mySetting) {
        case OFF:
            mySetting = Setting.LOW;
            break;
        case LOW:
            mySetting = Setting.MEDIUM;
            break;
        case MEDIUM:
            mySetting = Setting.HIGH;
            break;
        case HIGH:
            break;
        default:
            System.out.println("ERROR");
            break;
    }
    timer = TIME_DURATION; //reset the timer to 2 seconds

}

public void minusButton()
{
    switch (mySetting) {
        case OFF:
            mySetting = Setting.OFF;
            break;
        case LOW:
            mySetting = Setting.OFF;
            break;
        case MEDIUM:
            mySetting = Setting.LOW;
            break;
        case HIGH:
            mySetting = Setting.MEDIUM;
            break;
        default:
            System.out.println("ERROR");
            break;
    }
    timer = TIME_DURATION; // reset the timer to 2 seconds
}

public void updateTemperature(){
    if (timer > 0) { //sits out and decrement the timer until it reaches 0
          timer --;

              if (timer == 0) {
                switch (mySetting) {
                    case OFF:
                        myTemperature = Temperature.COLD;
                        break;
                    case LOW:
                        myTemperature = Temperature.WARM;
                        break;
                    case MEDIUM:
                        myTemperature = Temperature.HOT;
                        break;
                    case HIGH:
                        myTemperature = Temperature.BLAZING;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
    }

    
}
//does nothing  when the timer is greater than 0, the temperature remains the same until the timer reaches 0
}

public void display() {
    String temp;

    switch (myTemperature) {
        case COLD:
            temp = ".....cooool";
            System.out.println("[" + mySetting + "]" + temp);
            break;
        case WARM:
            temp = ".....warm";
            System.out.println("[" + mySetting + "]" + temp);
            break;
        case HOT:
            temp = ".....CAREFUL";
            System.out.println("[" + mySetting + "]" + temp);
            break;
        case BLAZING:
            temp = ".....VERY HOT! DON'T TOUCH";
            System.out.println("[" + mySetting + "]" + temp);
            break;
        default:
            System.out.println("[ERROR] Invalid temperature");
            break;
    }
}


} //end Burner class