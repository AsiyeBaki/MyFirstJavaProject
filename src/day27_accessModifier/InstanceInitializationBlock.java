package day27_accessModifier;

public class InstanceInitializationBlock {

    public String name;
    public int age;
    public InstanceInitializationBlock(String name, int age ){
        this.name= name;
        this.age =age;
    }

    /*
    {
        name="James";
        age = 20;
    }

     */

    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Asiye",31);
        System.out.println(obj1.age);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Nuri",28);
        System.out.println(obj2.name);
    }
}
