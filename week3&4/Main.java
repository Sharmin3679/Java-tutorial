public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", "P001");
        Person p2 = new Student("Bob", "S001");
        Person p3 = new Lecturer("Charlie", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}