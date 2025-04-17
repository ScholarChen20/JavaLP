package Collection.Iteation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class iteration {
    public static void main(String[] args) {
        String s = "hello";
        for(String str : s.split("")) {
            System.out.println(str);
        }

        Collection coll = new ArrayList();
        coll.add("adas");
        coll.add(123123);
        coll.add(true);


//        Iterator iterator = coll.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        ArrayList aa = new ArrayList();
        aa.add(new Book("红罗马","cwq",123.2));
        aa.add(new Book("西游记","cwq",23.2));

        Iterator iterator = aa.iterator();
        //快捷键 itit
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        // ctrl + j 显示所有快捷键
    }
}
class Book{
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}