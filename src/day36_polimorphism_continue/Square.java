package day36_polimorphism_continue;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) { // this is how we override equals method
        if (!(obj instanceof Square)){
            System.err.println("Invalid object. Object must be square");
            System.exit(1);
        }

        if (side == ((Square) obj).side){
            return true;
        }
        return false;
    }

    // .equals()

}
