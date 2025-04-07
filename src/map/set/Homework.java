package map.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Homework {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        /*
        若对象的名字和年龄相同，则认为是相同的对象。不能加入到hashSet中
         */
        hashSet.add(new employee("join",12));
        hashSet.add(new employee("smith",13));
        hashSet.add(new employee("join",12));//加入不成功
        System.out.println(hashSet);
    }
}
class employee{
    String name;
    int age;

    public employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        employee employee = (employee) object;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}