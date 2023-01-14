package day18_MemoryManagement_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount object1 = new BankAccount();
        object1.setInfo("Asiye Baki", 123456);
        System.out.println(object1);

        object1.deposit(4500);
        object1.checkBalance();
        object1.withdraw(500);
        object1.checkBalance();
        object1.withdraw(6000);



        BankAccount object2 = new BankAccount();
        object2.setInfo("Sebastian", 234567);

        BankAccount object3 = new BankAccount();
        object3.setInfo("Umran", 345678);

        System.out.println("------------------------------------");
        BankAccount account1 = new BankAccount();
        account1.setInfo("Tugba", 6543267);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Slater", 987654);

        account1.deposit(5000);
        account2.deposit(10000);
        System.out.println(account1);
        System.out.println(account2);
    }
}
