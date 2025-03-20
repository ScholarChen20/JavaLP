package Object.equals;

/***
 * @author  ==与equals是否相等
 * == 既可以判断基本数据类型，又可以判断应用类型
 * 如果判断基本类型，判断的是值是否相等
 * 如果是判断引用类型，判断的是地址是否相等
 */
public class equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(a == b);
        B obj = a;
        System.out.println(obj == c);

        // equals 是用来判断引用类型
        System.out.println("hello".equals("abv"));


        String hit = new String("hit");
        String str = new String("hit");
        System.out.println(hit == str);  //false 不同对象
        System.out.println(hit.equals(str));  //对象类型相同，值相同
    }
}
class B{}
class A extends B{}