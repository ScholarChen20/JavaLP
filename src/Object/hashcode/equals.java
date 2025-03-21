package Object.hashcode;

/**
 * euqals 方法重写时对应的hashcode方法也要跟着重写，
 * 否则会违反hashcode方法的协议规定，确保对象在基于散列的集合如hashMap、HashSet中能够正常工作
 */
public class equals {
    public static void main(String[] args) {
        Person haha = new Person("haha", 10);
        Person haha2 = new Person("haha", 10);
        System.out.println(haha.equals(haha2));
        System.out.println(haha.hashCode() == haha2.hashCode());
    }
}

/**
 * 如果只重写了 equals 而没有重写 hashCode，那么即使 equals 方法认为两个对象相等，
 * 但由于它们的 hashCode 值不同，散列数据结构会将它们视为不同的元素。这会导致散列数据结构中存在重复的元素，违反了集合的唯一性原则
 */
class Person{
    public String name;
    public int age;
    public Person(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

}

