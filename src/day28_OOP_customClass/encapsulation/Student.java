package day28_OOP_customClass.encapsulation;

public class Student {

    private String name;
    private int age;


    public String getName() {
        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigits = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigits = true;
                break;
            }
        }
        if (hasDigits) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }


    public int getAge() { // READ ONLY
        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) { // WRITE/MODIFY ONLY
        if (age < 1 || age > 100) { // if age is invalid
            System.err.println("Invalid age: " + age);
            // return; // exiting the method
            System.exit(1); // entire program gets executed
        }
        this.age = age;
    }







}
