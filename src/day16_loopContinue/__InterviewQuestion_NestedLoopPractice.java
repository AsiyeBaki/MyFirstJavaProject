package day16_loopContinue;

public class __InterviewQuestion_NestedLoopPractice {
    public static void main(String[] args) {

        // interview task

        String str = "aaabbccccddeeeeff";
        // whichever characters appears only twice, print out those letters
        String result = "";  // "bdf"
        // so we need to find out the way to frequency of every character

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);  // each character of string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if ((count == 2) && !result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);


    }
}
