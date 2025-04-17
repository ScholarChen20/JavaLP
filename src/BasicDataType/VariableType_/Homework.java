package BasicDataType.VariableType_;


import java.util.ArrayList;
import java.util.List;

/**
 * @version 0.1
 * @author ScholarChen20
 */
public class Homework {
    public static void main(String[] args) {
        /*
        使用List实现对象book的价格进行冒泡排序，并输出
         */
        List aa = new ArrayList();
        aa.add(new Book("红罗马",123.2));
        aa.add(new Book("西游记",23.2));
        aa.add(new Book("水浒传",43.1));

        System.out.println("排序后");
        sort(aa);
        for (Object object :aa) {
            System.out.println(object);
        }


    }
    public static void sort(List aa){
        for (int i = 0; i < aa.size()-1; i++) {
            for (int j = 0; j < aa.size()-1-i; j++) {
                Book book1 = (Book) aa.get(j);
                Book book2 = (Book) aa.get(j+1);
                if (book1.getPrice()>book2.getPrice()) {
                    aa.set(j, book2);
                    aa.set(j+1, book1);

                }
            }
        }
    }
}
class Book{
    String name;
    double price;
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}