import java.util.Comparator;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class NameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}
public class Two {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        NameComparator nameComparator = new NameComparator();
        System.out.println(nameComparator.compare(person1, person2));  
    }
}
