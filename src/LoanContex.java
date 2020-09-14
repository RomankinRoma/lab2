import strategyLoan.LoanSystem;

public class LoanContex {
    private LoanSystem loanSystem;

    public LoanContex() {
    }

    public String get(){
        return loanSystem.information();
    }

    public LoanSystem getLoanSystem() {
        return loanSystem;
    }

    public void setLoanSystem(LoanSystem loanSystem) {
        this.loanSystem = loanSystem;
    }
}
