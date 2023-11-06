package Week5.Task1;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
