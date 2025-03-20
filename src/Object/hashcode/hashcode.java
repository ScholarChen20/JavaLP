package Object.hashcode;

public class hashcode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aaa2 = aa;

        System.out.println(aa.hashCode());  //1163157884 1956725890 1163157884
        System.out.println(aa1.hashCode());
        System.out.println(aaa2.hashCode());
    }
}
class AA{

}