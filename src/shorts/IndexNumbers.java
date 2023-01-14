package shorts;

public class IndexNumbers {
    public static void main(String[] args) {


        int i = 10;
        while (i <=10) {
            System.out.println("I love java");
            i++;
            System.out.println("good to hear that");
            i--; // infinite loop. always 10 and keep printing
        }




/*
//quiz question , result = 3
        int wd = 0;
        String[] days = {"Sun", "Mon", "Wed", "Sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }
        System.out.println(wd);

 */
    }
}
