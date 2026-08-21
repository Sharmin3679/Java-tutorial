public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", "P01");
        Person p2 = new Student("Bob", "S01");
        Person p3 = new Lecturer("Dr. Smith", "L01");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}