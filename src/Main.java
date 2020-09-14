import strategyLoan.LoanByCash;
import strategyLoan.LoanToCreditCard;
import strategyPayment.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PaymentContext context= new PaymentContext();
        LoanContex  loanContex=new LoanContex();
        int chose=1;
        while(chose!=0){
            System.out.println("1.Take a loan");
            System.out.println("2.Online purchase");
            System.out.println("0.Exit");
            chose=in.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Choose:\n1.Get loan by cash\n2.Get loan to card");
                    chose=in.nextInt();
                    if (chose==1){
                        System.out.println("Enter amount of money:");
                        Integer money=in.nextInt();
                        loanContex.setLoanSystem(new LoanByCash());
                        System.out.println(loanContex.get());
                    }else if(chose==2){
                        System.out.println("Enter amount of money:");
                        Integer money=in.nextInt();
                        loanContex.setLoanSystem(new LoanToCreditCard());
                        System.out.println(loanContex.get());
                    }else {
                        System.out.println("Incorrect chose!");
                    }
                    break;
                case 2:
                    System.out.println("Choose payment system:\n1.PayPal\n2.Credit card\n3.Cash");
                    chose=in.nextInt();
                   if (chose==1){
                            System.out.println("Enter amount of money:");
                            Integer amount=in.nextInt();
                            context.setPaymentSystem(new PayPal());
                            System.out.println(context.payment(amount));
                    }else if (chose==2){
                       System.out.println("Enter amount of money:");
                       Integer amount=in.nextInt();
                       context.setPaymentSystem(new CreditCard());
                       System.out.println(context.payment(amount));
                   }else if (chose==3){
                    System.out.println("Enter amount of money:");
                    Integer amount=in.nextInt();
                    context.setPaymentSystem(new Cash());
                    System.out.println(context.payment(amount));
                    }else{
                       System.out.println("Incorrect input!");
                   }

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Incorrect input!");
                    break;
       }}
    }
}
