package Week5.Task1;

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void work() {
        if(this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
