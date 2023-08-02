public class Main {
    public static void main(String[] args) {
        String id;
        String studentName;
        String dateOfBirth;
        String classList;

        id          = "12345678";
        studentName = "Stephen Hulme";
        dateOfBirth = "April 5, 1900";
        classList   = "Don't you wish";

        Student student = new Student(id, studentName, dateOfBirth, classList);

        System.out.println("Student ID is: " + student.getId());
        System.out.println("Student Name is: " + student.getName());
        System.out.println("Student's Class List is: " +student.getClassList());
        System.out.println("Student's date of birth is: " + student.getDateOfBirth());
    }
}
