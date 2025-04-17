package Enum;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
enum ColorInfo{
    RED, GREEN, BLUE;
    private ColorInfo() {
        System.out.println("constructor called for Color"+this.toString());
    }
    public void printColor(){
        System.out.println("printColor called for Color"+this.toString());
    }
}
public class EnumMenber {
    public static void main(String[] args) {
        ColorInfo color = ColorInfo.RED;
        System.out.println(color);
        color.printColor();
    }

}
