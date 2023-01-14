package day27_accessModifier;

public class InstanceBlock {
    {
        System.out.println("Instance Block");
    }
    public InstanceBlock() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        new InstanceBlock();
    }
}
// Instance block get executed first before constructor get executed


