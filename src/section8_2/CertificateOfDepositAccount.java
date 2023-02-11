package section8_2;

public class CertificateOfDepositAccount {
	
	private int depositAmount;
    private String depositDate;
    private int depositDuration;
    private double interestRate;
    private String expirationDate;
    private int currentBalance;

    public CertificateOfDepositAccount(int depositAmount, 
                                       String depositDate, int depositDuration, double interestRate) {
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
        this.depositDuration = depositDuration;
        this.interestRate = interestRate;
                
        // calculate and set the expiration date based on depositDate + depositDuration
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public int getDepositDuration() {
        return depositDuration;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getCurrentBalance() {
        // find how long has passed from the depositDate until today's date
        // based on the time passed and the interestRate, calculate earned interest
        // add the earned interest on to the depositAmount and return as currentBalance
        return currentBalance;
    }

}
