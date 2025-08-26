package Practice;

public class student {
    String name;
    int age;

    // Constructor
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        student s1 = new student("Nidhi", 22);
        s1.displayInfo();
    }
}
