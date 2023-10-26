package Week4Lecture;

import java.util.Date;

class CreditCard {
    private int cardNumber;
    private Date issueDate;
    private double balance;
    private String cvc;
    private CardType cardType;
    private CardIssue cardIssue;

    public CreditCard(int cardNumber, Date issueDate, double balance, String cvc, CardType cardType, CardIssue cardIssue) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.balance = balance;
        this.cvc = cvc;
        this.cardType = cardType;
        this.cardIssue = cardIssue;
    }
    public CreditCard(double balance)
    {
        this.balance = balance;
        this.cardNumber = 123;


    }
    public CardIssue getCardIssue() {
        return cardIssue;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getCvc() {
        return cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public double getBalance() {
        return balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }


}
