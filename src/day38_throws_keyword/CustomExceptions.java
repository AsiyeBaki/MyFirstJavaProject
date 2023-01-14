package day38_throws_keyword;

class CustomCheckedException extends Exception {

}
class CustomUncheckedException extends RuntimeException {

}


public class CustomExceptions {

    public static void main(String[] args)  {

        try{
            throw new CustomCheckedException();
        } catch (CustomCheckedException e){
            e.printStackTrace();
        }   // OR  // throws CustomCheckedException in the method body

     //   throw new CustomCheckedException();

        System.out.println("-----------------------");

        throw new CustomUncheckedException();
    }
}
