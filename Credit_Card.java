package coursework;


/** @author 22067184 Shuvashree Bharati
 * @version 1.0.0
 */

// Class using a public accessor, 'Credit_Card' is created
// Credit_Card is the child class of Bank_Card
public class Credit_Card extends Bank_Card
{
    
    // Creating six private attributes
    
    public int cvcNumber;
    public double creditLimit;
    public double interestRate;
    public String expirationDate;
    public int gracePeriod;
    public boolean isGranted;
    
    /* Creating the constructor which accepts eight parameters*/
    public Credit_Card(int cardID, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        
        super(cardID, issuerBank, bankAccount,balanceAmount); // Making a call to the superclass constructor
        super.setClientName(clientName);  // Making a call again to the superclass constructor for the Client Name
        this.cvcNumber=cvcNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted = false;  // Setting isGranted to false
        
    }
    
    
    // Creating corresponding accessor methods for each attributes
    public int getCVCNumber(){
        return this.cvcNumber;
    }
    
    public double getInterestRate(){
        return this.interestRate;
    }
    
    public String getExpirationDate(){
        return this.expirationDate;
    }
    
    public double getCreditLimit(){
        return this.creditLimit;
    }
    
    public double getGracePeriod(){
        return this.gracePeriod;
    }
    
    public boolean getIsGranted(){
        return this.isGranted;
    }
    
    // Creating a method to set the credit limit
    protected void setCreditLimit(int creditLimit, int gracePeriod){
        
        // if-else condition is used
        if(this.creditLimit <= 2.5 * this.getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            isGranted = true;
        }
        
        else{
            System.out.println("The limit has been exceeded. Credit cannot be granted.");
        }
        
    }
    
    // A method is created to cancel the credit card
    protected void cancelCreditCard(){
        
        
        this.gracePeriod = 0;
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.isGranted = false;
            
        
    }
    
    // @Override is used to re-display the attributes from the super class
    @Override
    public void display()
    
    {
        super.display();
        System.out.println("CVC number: " + this.cvcNumber);
        System.out.println("Interest Rate: " + this.interestRate);
        System.out.println("Expiration Date: " + this.expirationDate);
        
        // if-else condition is used
        
        if(isGranted == true){
        
        System.out.println("Credit Limit: " + this.creditLimit);
        System.out.println("Grace Period: " + this.gracePeriod);
        System.out.println("Credit Card is granted: " + this.isGranted);
        
        }
        
        else{
            
        System.out.println("Credit Card is granted: " + this.isGranted);
        
        }
        
    }
    
}
