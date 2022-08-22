package Accessmodifier;

public class student {
    private String name = "john";
    private String classes = "C02";

    public student() {
    }

    public student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
       student student = new student();
        System.out.println(student);
    }
}
