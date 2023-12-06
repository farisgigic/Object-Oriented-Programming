package Week6.HashMaps;
import java.util.HashMap;
public class PromissoryNote {
    private HashMap<String, Double> loan = new HashMap<>();
    PromissoryNote() {

    }

    public HashMap<String, Double> getLoan() {
        return loan;
    }

    public void setLoan(HashMap<String, Double> loan) {
        this.loan = loan;
    }

    public void setLoan(String name, double value) {
        loan.put(name, value);
    }

    public double howMuchInDebt(String name) {
        if(loan.containsKey(name)) {
            return loan.get(name);
        }
        return 0;
    }
}

