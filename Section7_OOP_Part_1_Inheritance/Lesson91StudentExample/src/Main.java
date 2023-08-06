public class Main extends Object {

    public static void main(String[] args) {

        Student me = new Student("Fredo",22);
        System.out.println(me);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}
    class Student {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

//        @Override
//        public String toString() {
//            return super.toString();
//        }

        @Override
        public String toString() {
//            System.out.println("In Student\'s toString ");
            return name + " is " + age;
        }
    }

    class PrimarySchoolStudent extends Student {

        private String parentName;

        PrimarySchoolStudent(String name, int age, String parentName) {
            super(name, age);
            this.parentName = parentName;
        }

    }

