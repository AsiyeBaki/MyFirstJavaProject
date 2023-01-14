package day38_throws_keyword;

public class BreaktimeException extends RuntimeException {
    public BreaktimeException(){
        super("It is break time");
    }
    public BreaktimeException(String message){
        super(message);
    }
}
