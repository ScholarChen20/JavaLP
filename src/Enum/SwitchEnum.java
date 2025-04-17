package Enum;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
enum Colorfor {
    RED, GREEN, BLUE
}
public class SwitchEnum {
    public static void main(String[] args) {
        Colorfor myVar = Colorfor.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
