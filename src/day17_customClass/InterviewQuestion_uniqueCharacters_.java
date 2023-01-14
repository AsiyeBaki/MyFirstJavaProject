package day17_customClass;

public class InterviewQuestion_uniqueCharacters_ {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";  // expected result is bd

// this is not the best approach to solve this. second way to use it nested loop.
// check unique characters2 class  !!!!!!!!!!!!!!!!!!!!!

        for (int i = 0; i < str.length(); i++) {  // index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        System.out.println(unique);




    }
}
