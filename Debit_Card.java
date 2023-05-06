package coursework;


/** @author 22067184 Shuvashree Bharati
 * @version 1.0.0
 */

// Class using a public accessor, 'Debit_Card' is created
// Debit_Card is the child class of Bank_Card
public class Debit_Card extends Bank_Card
{
    
    // Creating four private attributes
    
    public int pinNumber;
    public int withdrawalAmount;
    public String dateOfWithdrawal;
    public boolean hasWithdrawn;
    
    /* Creating the constructor which accepts six parameters*/
    
    public Debit_Card(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
       super(cardID, issuerBank, bankAccount,balanceAmount); // Making a call to the superclass constructor
       super.setClientName(clientName); // Making a call to the superclass again for the Client Name
       this.pinNumber = pinNumber;
       this.hasWithdrawn = false;  // Assigning the condition for hasWithdrawn
    }
    
    // Creating corresponding accessor methods for each attribute
    public int getPinNumber(){
        return this.pinNumber;
    }
    
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    
    public String getDateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn(){
        return this.hasWithdrawn;
    }
    
    // Creating a mutator method for Withdrawal Amount
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    
    // method named 'Withdraw' is made to deduct money directly from the client's account
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber, double balanceAmount){
        this.withdrawalAmount = withdrawalAmount;
        this.dateOfWithdrawal = dateOfWithdrawal;
        this.pinNumber = pinNumber;
        
        // if condition is used
        if(this.pinNumber == pinNumber && super.getBalanceAmount()>=withdrawalAmount){
            this.hasWithdrawn = true;
            super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount) ;
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
        }
        else{
            System.out.println("Error. Please try again.");
            System.out.println("Balance Amount = " + super.getBalanceAmount());
        }
    }
    
    // Same display method from the super class is used
    @Override
    public void display(){
        
        // if-else condition is used
        if(this.hasWithdrawn==true){
        super.display();
        
        System.out.println("Pin Number: " + this.pinNumber);
        System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
        System.out.println("Date of Withdrawal: " + this.dateOfWithdrawal);
        }
        
        else{
            hasWithdrawn=false;
            System.out.println("Balance Amount: " + super.getBalanceAmount());
        }
        
    }
    
}
