package coursework;


/** @author 22067184 Shuvashree Bharati
 * @version 1.0.0
 */

// Class using a public accessor, 'Bank_Card' is created
public class Bank_Card
{
    
    // Creating five private attributes
    public int cardID;
    public String clientName;
    public String issuerBank;
    public String bankAccount;
    public int balanceAmount;
    
    /* Creating the constructor which accepts four parameters */
    public Bank_Card(int cardID, String issuerBank, String bankAccount, int balanceAmount)
    {
        
        this.cardID=cardID;
        this.clientName=clientName;
        this.issuerBank=issuerBank;
        this.bankAccount=bankAccount;
        this.balanceAmount=balanceAmount;
        this.clientName=""; // Initializing clientName to an emptystring
        
    }
    
    // Creating corresponding accessor methods for each attribute
    public int getCardID(){
        return this.cardID;
    }
    
    public String getClientName(){
        return this.clientName;
    }
    
    public String getIssuerBank(){
        return this.issuerBank;
    }
    
    public String getBankAccount(){
        return this.bankAccount;
    }
    
    public int getBalanceAmount(){
        return this.balanceAmount;
    }
    
    // Setting new Client Name 
    public void setClientName(String clientName){
        this.clientName=clientName;
    }
    
    // Setting new Balance Amount
    public void setBalanceAmount(int balanceAmount){
        this.balanceAmount=balanceAmount;
    }
    
    // Displaying the attributes when Client Name is inserted
    public void display(){
        
        // if-else condition is used
        if(clientName == ""){
            System.out.println("Client name is required. Please try again.");
            
        }
        
        else{
        System.out.println("Card ID: " + this.cardID);
        System.out.println("Client's Name: " + this.clientName);
        System.out.println("Issuer Bank: " + this.issuerBank);
        System.out.println("Bank Account: " + this.bankAccount); 
        System.out.println("Balance Amount: " + this.balanceAmount); 
        }
        
    }
    
}
