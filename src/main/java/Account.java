package main.java;

public class Account {

    private String cardNumber;
    private double amount;
    private String pinCode;
    private boolean isBlocked;

    public Account(String cardNumber, double amount, String pinCode, boolean isBlocked) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.pinCode = pinCode;
        this.isBlocked = isBlocked;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getPinCode() {
        return pinCode;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                ", isBlocked=" + isBlocked +
                '}';
    }

}
