public class Burner{ 

public enum Temperature {
BLAZING, HOT, WARM, COLD}

private Temperature myTemperature;
private Setting mySetting;
private int timer; 
public static final int TIME_DURATION = 2;

public Temperature getMyTemperature() {
    return myTemperature;
}

public Burner() { //constructor
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
    timer = TIME_DURATION; // reset the timer to 2 min
}

public void updateTemperature() {
    if (timer > 0) {
        timer--;                                   // one minute passed, decrement the timer

        if (timer == 0) {                        
            Temperature target;                    

            switch (mySetting) {
                case OFF:
                    target = Temperature.COLD;
                    break;
                case LOW:
                    target = Temperature.WARM;
                    break;
                case MEDIUM:
                    target = Temperature.HOT;
                    break;
                case HIGH:
                    target = Temperature.BLAZING;
                    break;
                default:
                    target = myTemperature;        
                    break;
            }

            if (myTemperature.ordinal() > target.ordinal()) {//ordinal returns the position of the enumn constant. kinda like index.
                myTemperature = Temperature.values()[myTemperature.ordinal() - 1];
            } else if (myTemperature.ordinal() < target.ordinal()) {
                myTemperature = Temperature.values()[myTemperature.ordinal() + 1];
            }

            if (myTemperature != target) {
                timer = TIME_DURATION;
            }
        }
    }
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