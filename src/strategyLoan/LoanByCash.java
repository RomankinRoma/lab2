package strategyLoan;

import java.util.Scanner;

public class LoanByCash implements LoanSystem {
    Scanner in = new Scanner(System.in);
    @Override
    public String information() {
        System.out.println("Input first name:");
        String name=in.nextLine();
        System.out.println("Input last name");
        String lName=in.nextLine();
        System.out.println("Input date of birth:");
        String dateOfBirth=in.nextLine();
        System.out.println("ID number");
        String id=in.nextLine();
        return "Successful";
    }
}
