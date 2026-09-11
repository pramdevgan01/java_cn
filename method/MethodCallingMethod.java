package method;

public class MethodCallingMethod {

    public static void printDetails(String name, String dob, long accountNumber){
        System.out.println("Name: "+ name);
        System.out.println("DOB: " + dob);
        System.out.println("Account Number: " + accountNumber);
        // System.out.println("Balance: " + balance);
        System.out.println("Balance: " + calcultaeBalance(8181458.141, 6816911.1489, 724.142));

    }

    public static double calcultaeBalance(double currentBal, double credit, double debit){
        return currentBal+credit-debit;
    }

    public static void main(String[] args) {

        // double balance = calcultaeBalance(82734523.242, 8361913.901, 4678219.241);
        printDetails("Param", "13/07/2001", 746321831864894l);
        // printDetails("Ram", "16/03/1999", 7435858909326213l);
        
    }
}
