package Object.poly.DynamicBinding;

public class A {
    public int i=10;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public int sum(){
        return getI()+10;
    }
    public int sum1(){
        return i+10;
    }

}
