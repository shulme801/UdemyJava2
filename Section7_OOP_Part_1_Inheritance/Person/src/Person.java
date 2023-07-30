public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {

        int currentAge = getAge();
        return (currentAge > 12) && (currentAge < 20);
    }

    public String getFullName() {
        String first = getFirstName();
        String last = getLastName();


        if (last.isEmpty()) {
            return first;
        }
        if (first.isEmpty()) {
            return last;
        }

        return first + " " +last;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }




}
