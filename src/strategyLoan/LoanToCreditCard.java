package strategyLoan;

import models.CreditCardUser;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoanToCreditCard implements LoanSystem{
    Scanner in = new Scanner(System.in);
    static Map<Integer, CreditCardUser> cardsHashMap= new HashMap<>();
    static CreditCardUser creditCardUser =new CreditCardUser("Aaa","Aaa","1111 1111 1111 1111","10/22",455);
    static CreditCardUser creditCardUser2 =new CreditCardUser("Aaa","Aaa","2222 2222 2222 2222","10/23",456);
    static CreditCardUser creditCardUser3 =new CreditCardUser("Aaa","Aaa","3333 3333 3333 3333","10/24",457);

    static {
        cardsHashMap.put(creditCardUser.getCvv(), creditCardUser);
        cardsHashMap.put(creditCardUser2.getCvv(), creditCardUser2);
        cardsHashMap.put(creditCardUser3.getCvv(), creditCardUser3);
    }

    @Override
    public String information() {
        System.out.println("Input first name:");
        String name = in.nextLine();
        System.out.println("Input last name");
        String lName = in.nextLine();
        System.out.println("Input date of birth:");
        String dateOfBirth = in.nextLine();
        System.out.println("ID number");
        String id = in.nextLine();
        System.out.println("Enter card number(with spaces):");
        String cardNumber = in.nextLine();
        System.out.println("Enter date:");
        String date = in.nextLine();
        System.out.println("Enter cvv:");
        Integer cvv = in.nextInt();
        CreditCardUser creditCardUser=cardsHashMap.get(cvv);
        try {
            if (creditCardUser.getCvv()==cvv && creditCardUser.getlName().equals(lName) && creditCardUser.getName().equals(name)
                    && creditCardUser.getDate().equals(date) && creditCardUser.getNumber().equals(cardNumber)) {
                return "Successful!";
            }
        } catch (Exception e) {
            return "Incorrect information!";
        }
        return "";
    }
}
