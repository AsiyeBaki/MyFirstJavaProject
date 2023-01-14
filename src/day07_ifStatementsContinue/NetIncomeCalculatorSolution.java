package day07_ifStatementsContinue;

public class NetIncomeCalculatorSolution {
    public static void main(String[] args) {

        int salary = 80000;
        double taxRate = 23456789;
        boolean isMarried = true;

        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary < 130000 && salary >= 100000) {
            taxRate = 0.30;
        }
        if (salary < 100000 && salary >= 80000) {
            taxRate = 0.25;
        }
        if (salary < 80000) {
            taxRate = 0.20;
        }
        if (isMarried){
            taxRate -= 0.05;  // tax is reduced by %5
        }

        double totalTax = taxRate * salary;
        double netIncome = salary * (1 - taxRate); // or double NetIncome = salary - total tax;

        System.out.println(totalTax);
        System.out.println(netIncome);
        System.out.println(taxRate);

    }
}
