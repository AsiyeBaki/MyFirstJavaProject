package day31_MethodOverriding.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;
// parent classes constructor will set first 6 parameters, and lion's constructor will set the last one
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        this.isAfricanLion = isAfricanLion;
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        // super.eat(); // this line appear when you use intelliJ's shortcut to override the method,
        // if you do not change it, it will print  eat() method in Parent class,
        // if you do wish it to be print different for child class you need to provide your info
        System.out.println("Lion "+getName()+" is eating deer");
    }

    public void roar(){  // not overridden method
        System.out.println("Lion " + getName()+" is roaring");
    }

    @Override
    public String toString() { // Overridden toString method
       //  return super.toString();  // it appears with intelliJ's shortcut
       return super.toString().replace("}","") +
               ", isAfricanLion='" + isAfricanLion + '\'' +
               '}';
    }
}
