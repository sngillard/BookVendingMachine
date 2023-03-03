package application;

import java.math.BigDecimal;

public class MoneyHandler {

    BigDecimal balance = new BigDecimal("0");

    public boolean addMoney(BigDecimal moneyAdded) {
        boolean is1 = (moneyAdded.compareTo(new BigDecimal("1")) == 0);
        boolean is5 = (moneyAdded.compareTo(new BigDecimal("5")) == 0);
        boolean is10 = (moneyAdded.compareTo(new BigDecimal("10")) == 0);
        boolean is20 = (moneyAdded.compareTo(new BigDecimal("20")) == 0);
        if(is1 || is5 || is10 || is20) {
            balance = balance.add(moneyAdded);

            return true;
        } return false;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal updatedBalance) {
        this.balance = updatedBalance;
    }

    public void returnChange() {
        BigDecimal wholeFiveDollar = new BigDecimal("5.00");
        BigDecimal wholeOneDollar = new BigDecimal("1.00");
        BigDecimal wholeQuarter = new BigDecimal("0.25");
        BigDecimal wholeDime = new BigDecimal("0.10");
        BigDecimal wholeNickel = new BigDecimal("0.05");
        BigDecimal wholePenny = new BigDecimal("0.01");

        int fiveDollarBillCounter = 0;
        int oneDollarBillCounter = 0;
        int quarterCounter = 0;
        int dimeCounter = 0;
        int nickelCounter = 0;
        int pennyCounter = 0;

        fiveDollarBillCounter = this.balance.divide(wholeFiveDollar).intValue();
        this.balance = this.balance.remainder(wholeFiveDollar);

        oneDollarBillCounter = this.balance.divide(wholeOneDollar).intValue();
        this.balance = this.balance.remainder(wholeOneDollar);

        quarterCounter = this.balance.divide(wholeQuarter).intValue();
        this.balance = this.balance.remainder(wholeQuarter);

        dimeCounter = this.balance.divide(wholeDime).intValue();
        this.balance = this.balance.remainder(wholeDime);

        nickelCounter = this.balance.divide(wholeNickel).intValue();
        this.balance = this.balance.remainder(wholeNickel);

        pennyCounter = this.balance.divide(wholePenny).intValue();
        this.balance = this.balance.remainder(wholePenny);

        System.out.println("Your change is: " + (fiveDollarBillCounter + oneDollarBillCounter) + "dollars and " + (quarterCounter + dimeCounter + nickelCounter + pennyCounter) + "centers");
    }
}
