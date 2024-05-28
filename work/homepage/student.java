public class student {
    private String name;
    private int studentNo;
    private String contact;
    private String telephone;

    public void applyCourse() {
        System.out.println(name + " applied for a course.");
    }

    public void registerCourse() {
        System.out.println(name + " registered for a course.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Student No: " + studentNo);
        System.out.println("Contact: " + contact);
        System.out.println("Telephone: " + telephone);
    }

    public static void main(String[] args) {
        // Creating Full-Time student
        Student fullTimeStudent = new Student();
        // Creating Part-Time student
        Student partTimeStudent = new Student();
        // Applying and registering courses
        fullTimeStudent.applyCourse();
        fullTimeStudent.registerCourse();
        partTimeStudent.applyCourse();
        partTimeStudent.registerCourse();

        System.out.println("\nFull-Time Student Details:");
        fullTimeStudent.displayDetails();

        System.out.println("\nPart-Time Student Details:");
        partTimeStudent.displayDetails();
    }
}