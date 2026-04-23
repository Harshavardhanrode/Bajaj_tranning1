package org.training.example.employeeManagment;

public class PaySlip {
    private String month;
    private String amount;

    @Override
    public String toString() {
        return "PaySlip{" +
                "month='" + month + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public PaySlip(String month, String amount) {
        this.month = month;
        this.amount = amount;
    }

    public PaySlip() {
        this.month = "";
        this.amount = "";
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
