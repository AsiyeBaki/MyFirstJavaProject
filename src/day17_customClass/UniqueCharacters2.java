package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {

// best approach to find the unique  /////////////////////////////////////////////////
        String str = "asiye baki asiye baki asiye baki ";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str. charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { //checks how many times the ch has appeared in str
                if (str.charAt(i) == ch) { // if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }

            if (frequency == 1){  // if the frequency equal to 1, then it is unique
                unique += ch;  // because we are looking for the unique character we put 1,
                // if we are looking the one repeats 3 times, we could put 3
            }
        }
        System.out.println(unique);





    }
}
