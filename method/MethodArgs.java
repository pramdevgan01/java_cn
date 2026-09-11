class MethodArgs {

    // 1 input 1 args 2 input 2 arga and so on
    public static void printDetails(String name, String dob, long accountNumber){
        System.out.println("Name: "+ name);
        System.out.println("DOB: " + dob);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        System.out.println("Hello from main");
        // Calling or invoking method
        // 
        printDetails("Param", "13/07/2001", 746321831864894l);
        printDetails("Ram", "16/03/1999", 7435858909326213l);
        
    }
}
