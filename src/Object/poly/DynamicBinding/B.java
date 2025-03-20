package Object.poly.DynamicBinding;

public class B extends A{
    public int i=20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public int sum(){
        return i+20;
    }
//    public int sum1(){
//        return i+10;
//    }


}
