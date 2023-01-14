package shorts;

public class emailTask {
    public static void main(String[] args) {
        /*
        1. Assume that email address is constructed by person's last name and followed
by an underscore and first name.

input: tyson_mike@gmail.com


Output: mike_tyson@gmail.com

Print first name, last name, and domain.

First and Last name should be printed with proper
format - uppercase first letter and remaining lowercase.
         */


        String email = "tyson_mike@gmail.com";

        String lastName = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf('_'));
        System.out.println(lastName);

        String firstName = email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2).toUpperCase()
                + email.substring(email.indexOf('_') + 2, email.indexOf('@'));
        System.out.println(firstName);

        String domain = email.substring(email.indexOf('@'));
        System.out.println(domain);

        System.out.println(firstName + "_" + lastName + domain);


    }
}
