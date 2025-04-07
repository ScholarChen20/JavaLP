package map.set;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Homework2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Date date = new Date(2002-02-21);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        set.add(new employees("john",12,date));
        set.add(new employees("jane",13,date));
        set.add(new employees("john",14,date));//没加入成功
        System.out.println(set);



    }
}
class employees{
    String name;
    int age;
    Date birthday;

    public employees(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        employees employees = (employees) object;
        return Objects.equals(name, employees.name) && Objects.equals(birthday, employees.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}