package section8_2;

public class MobileCheckDeposit {
	
	private int depositAmount;
    private int checkNumber;
    private String routingNumber;
    private String accountNumber;
        
    public MobileCheckDeposit() {
        // some logic that creates connection to the mobile banking interface
    }

    public void setDepositAmount(int depositAmount) {
        // some logic that checks the limits in the bank account for mobile deposits
        // if the current depositAmount is lower than the limit, then check will go through
        // otherwise, the user will be notified and the balance won't be updated
        this.depositAmount = depositAmount;
    }

    public void setCheckNumber(int checkNumber) {
        // some logic that connects to the check issuer bank to verify the check number
        // if the check number is not used before, the deposit will be processed
        // otherwise, the system will not set the checkNumber and processing will fail
        this.checkNumber = checkNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        // some logic that connects to the other bank via the routingNumber
        // if the connection is successful, the deposit will be processed
        // otherwise, the system will not process the deposit
        this.routingNumber = routingNumber;
    }

    public void setAccountNumber(String accountNumber) {
        // some logic that connects to the mentioned accountNumber
        // if the accountNumber exists and has sufficient funds, the deposit will be processed
        // otherwise, the system will not process the deposit
        this.accountNumber = accountNumber;
    }

}
