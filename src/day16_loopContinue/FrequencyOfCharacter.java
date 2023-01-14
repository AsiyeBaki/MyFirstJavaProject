package day16_loopContinue;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "cccccccccccccccccaabbbcccc";
        char ch = 'c';

        int count = 0;

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
            count++;
        }
        System.out.println(count);


    }
}

/*
 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'
		     output:
		     	5
 */