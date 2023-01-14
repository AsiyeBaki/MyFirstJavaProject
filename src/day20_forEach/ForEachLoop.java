package day20_forEach;

public class ForEachLoop {

    /*
            ====For Each Loop / inherited loop / iterated for loop

    To be able to use For Each Loop, there MUST be a data structure.  Array, Collection, MapClasses
    Does not have index numbers
    Used to access each successive(ardisik) value of a data structure
    Iteration order and number of iterations are fixed

     Syntax of For Each Loop

     for(dataType variableName : dataStructure) {
            // Statement
        }
                Data type must match with the successive values of the data structure
     */

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------");

        for (int each : numbers) { // quantity of element is repeat times for each loop,
            // whatever is data structure's element number snot less not more
            // the best use to use for each loop when we try to reach elements of data structure
            System.out.println(each);
        } // it will give you each element, there is nothing to do with index numbers

        System.out.println("--------------");











    }
}
