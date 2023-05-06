/*Shuvashree Bharati
 * AI1
 */

package coursework;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Bank_GUI implements ActionListener
{

    JFrame frame;
    JPanel panel;

    JLabel lblChoice;
    JButton btnDebit;
    JButton btnCredit;

    JFrame frame1;
    JPanel panel1;
    JLabel lblTitle1;
    JLabel lblBank;
    JLabel lblCardID;
    JTextField txtCardID;
    JLabel lblClientName;
    JTextField txtClientName;
    JLabel lblIssuerBank;
    JTextField txtIssuerBank;
    JLabel lblBankAccount;
    JTextField txtBankAccount;
    JLabel lblBalanceAmount;
    JTextField txtBalanceAmount;
    JLabel lblDebit;
    JLabel lblPinNumber;
    JTextField txtPinNumber;
    JLabel lblWithdrawalAmount;
    JTextField txtWithdrawalAmount;
    JLabel lblDateOfWithdrawal;
    JComboBox comboWithdrawalDateYear;
    JComboBox comboWithdrawalDateMonth;
    JComboBox comboWithdrawalDateDate;
    JButton btnAddDebit;
    JButton btnWithdrawDebit;
    JButton btnBack_Debit;
    JButton btnDisplay_Debit;
    JButton btnClear_Debit;

    JFrame frame2;
    JPanel panel2;
    JLabel lblTitle2;
    JLabel lblBank2;
    JLabel lblCardID2;
    JTextField txtCardID2;
    JLabel lblClientName2;
    JTextField txtClientName2;
    JLabel lblIssuerBank2;
    JTextField txtIssuerBank2;
    JLabel lblBankAccount2;
    JTextField txtBankAccount2;
    JLabel lblBalanceAmount2;
    JTextField txtBalanceAmount2;
    JLabel lblCredit;
    JLabel lblCvcNumber;
    JTextField txtCvcNumber;
    JLabel lblCreditLimit;
    JTextField txtCreditLimit;
    JLabel lblInterestRate;
    JTextField txtInterestRate;
    JLabel lblExpirationDate;
    JComboBox comboExpirationDateYear;
    JComboBox comboExpirationDateMonth;
    JComboBox comboExpirationDateDate;
    JLabel lblGracePeriod;
    JTextField txtGracePeriod;
    JButton btnAddCredit;
    JButton btnSetCreditLimit;
    JButton btnCancelCredit;
    JButton btnBack_Credit;
    JButton btnDisplay_Credit;
    JButton btnClear_Credit;

    JFrame frame3;
    JPanel panel3;
    JLabel lblTitle3;
    JLabel lblPinNumber3;
    JTextField txtPinNumber3;
    JLabel lblBalanceAmount3;
    JTextField txtBalanceAmount3;
    JLabel lblDateOfWithdrawal3;
    JComboBox comboWithdrawalDateYear3;
    JComboBox comboWithdrawalDateMonth3;
    JComboBox comboWithdrawalDateDate3;
    JLabel lblWithdrawalAmount3;
    JTextField txtWithdrawalAmount3;
    JButton btnBack_Withdraw;
    JButton btnWithdraw_final;

    ArrayList<Bank_Card> objArrayList;

    public Bank_GUI(){
        objArrayList = new ArrayList<Bank_Card>();

        frame = new JFrame("Bank Form");
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        lblChoice = new JLabel("Please choose one from the given options: ");
        lblChoice.setBounds(55, 70, 491, 36);
        panel.add(lblChoice);

        lblChoice.setFont(new Font("Arial", Font.PLAIN, 26));

        btnDebit = new JButton("Debit Card");
        btnDebit.setBounds(210, 169, 181, 57);
        btnDebit.addActionListener(this);
        panel.add(btnDebit);

        btnCredit = new JButton("Credit Card");
        btnCredit.setBounds(210, 289, 181, 57);
        btnCredit.addActionListener(this);
        panel.add(btnCredit);

        frame.setVisible(true);
        frame.setSize(600, 600);
        panel.setBackground(new Color(224, 191, 184));
    }

    
    public static void main(String[]args) {
        new Bank_GUI();
    }

    public void Debit_Frame(){
        frame1 = new JFrame("Debit Form");
        panel1 = new JPanel();
        panel1.setLayout(null);
        frame1.add(panel1);
        frame1.setVisible(true);
        
        frame1.setSize(600, 600);
        
        frame.setVisible(false);
        
        lblTitle1 = new JLabel("Java Bank Pvt. Ltd.");
        lblTitle1.setBounds(182, 8, 224, 36);
        panel1.add(lblTitle1);
        
        lblTitle1.setFont(new Font("Arial", Font.PLAIN, 26));
        
        lblCardID = new JLabel("Card ID");
        lblCardID.setBounds(22, 108, 60, 30);
        panel1.add(lblCardID);
        
        txtCardID = new JTextField();
        txtCardID.setBounds(138, 104, 100, 30);
        panel1.add(txtCardID);
        
        lblClientName = new JLabel("Client Name");
        lblClientName.setBounds(22, 164, 80, 30);
        panel1.add(lblClientName);
        
        txtClientName = new JTextField();
        txtClientName.setBounds(138, 162, 100, 30);
        panel1.add(txtClientName);
        
        lblIssuerBank = new JLabel("Issuer Bank");
        lblIssuerBank.setBounds(22, 220, 80, 30);
        panel1.add(lblIssuerBank);
        
        txtIssuerBank = new JTextField();
        txtIssuerBank.setBounds(138, 220, 100, 30);
        panel1.add(txtIssuerBank);
        
        lblBankAccount = new JLabel("Bank Account");
        lblBankAccount.setBounds(22, 281, 90, 30);
        panel1.add(lblBankAccount);
        
        txtBankAccount = new JTextField();
        txtBankAccount.setBounds(138, 278, 100, 30);
        panel1.add(txtBankAccount);
        
        lblBalanceAmount = new JLabel("Balance Amount");
        lblBalanceAmount.setBounds(22, 336, 150, 30);
        panel1.add(lblBalanceAmount);
        
        txtBalanceAmount = new JTextField();
        txtBalanceAmount.setBounds(138, 336, 100, 30);
        panel1.add(txtBalanceAmount);
        
        lblDebit = new JLabel("Debit Card");
        lblDebit.setBounds(228, 48, 133, 36);
        panel1.add(lblDebit);
        
        lblDebit.setFont(new Font("Arial", Font.PLAIN, 20));
        
        lblPinNumber = new JLabel("PIN Number");
        lblPinNumber.setBounds(280, 118, 90, 30);
        panel1.add(lblPinNumber);
        
        txtPinNumber = new JTextField();
        txtPinNumber.setBounds(415, 118, 100, 30);
        panel1.add(txtPinNumber);
        
        lblWithdrawalAmount = new JLabel("Withdrawal Amount");
        lblWithdrawalAmount.setBounds(280, 177, 150, 30);
        panel1.add(lblWithdrawalAmount);
        
        txtWithdrawalAmount = new JTextField();
        txtWithdrawalAmount.setBounds(415, 177, 100, 30);
        panel1.add(txtWithdrawalAmount);
    
        lblDateOfWithdrawal = new JLabel("Date Of Withdrawal");
        lblDateOfWithdrawal.setBounds(280, 240, 150, 30);
        panel1.add(lblDateOfWithdrawal);
        
        String WithdrawalDateYear[] = {"", "2022", "2023"};
        String WithdrawalDateMonth[] = {"", "01", "02", "03", "04"};
        String WithdrawalDateDate[] = {"", "01", "02", "03"};
        comboWithdrawalDateYear = new JComboBox(WithdrawalDateYear);
        comboWithdrawalDateYear.setBounds(415, 240, 90, 30);
        comboWithdrawalDateMonth = new JComboBox(WithdrawalDateMonth);
        comboWithdrawalDateMonth.setBounds(485, 240, 70, 30);
        comboWithdrawalDateDate = new JComboBox(WithdrawalDateDate);
        comboWithdrawalDateDate.setBounds(535, 240, 70, 30);
        panel1.add(comboWithdrawalDateYear);
        panel1.add(comboWithdrawalDateMonth);
        panel1.add(comboWithdrawalDateDate);
        
        btnAddDebit = new JButton("Add a Debit Card");
        btnAddDebit.setBounds(408, 308, 136, 32);
        btnAddDebit.addActionListener(this);
        panel1.add(btnAddDebit);
        
        btnDisplay_Debit = new JButton("Display");
        btnDisplay_Debit.setBounds(227, 528, 120, 32);
        panel1.add(btnDisplay_Debit);
        
        btnClear_Debit = new JButton("Clear");
        btnClear_Debit.setBounds(455, 528, 120, 32);
        panel1.add(btnClear_Debit);
        
        frame1.setVisible(true);
        frame1.setSize(600, 600);
        frame.setVisible(false);
        
        btnWithdrawDebit = new JButton("Withdraw from Debit Card");
        btnWithdrawDebit.setBounds(330, 409, 214, 32);
        btnWithdrawDebit.addActionListener(this);
        panel1.add(btnWithdrawDebit);
        
        
        btnBack_Debit = new JButton("Back");
        btnBack_Debit.setBounds(32, 528, 120, 32);
        btnBack_Debit.addActionListener(this);
        panel1.add(btnBack_Debit);
        
        
                
        btnDisplay_Debit = new JButton("Display");
        btnDisplay_Debit.setBounds(227, 528, 120, 32);
        panel1.add(btnDisplay_Debit);
        
        btnClear_Debit = new JButton("Clear");
        btnClear_Debit.setBounds(455, 528, 120, 32);
        panel1.add(btnClear_Debit);
        
        frame1.setVisible(true);
        frame1.setSize(600, 600);
        frame.setVisible(false);
        panel1.setBackground(new Color(224, 191, 184));
    }
    
    public void Credit_Frame(){
        frame2 = new JFrame("Credit Form");
        panel2 = new JPanel();
        panel2.setLayout(null);
        frame2.add(panel2);
        
        lblTitle2 = new JLabel("Java Bank Pvt. Ltd.");
        lblTitle2.setBounds(182, 8, 224, 36);
        panel2.add(lblTitle2);
        
        lblTitle2.setFont(new Font("Arial", Font.PLAIN, 26));
        
        lblCardID2 = new JLabel("Card ID");
        lblCardID2.setBounds(22, 97, 60, 30);
        panel2.add(lblCardID2);
        
        txtCardID2 = new JTextField();
        txtCardID2.setBounds(130, 98, 100, 30);
        panel2.add(txtCardID2);
        
        lblClientName2 = new JLabel("Client Name");
        lblClientName2.setBounds(22, 144, 80, 30);
        panel2.add(lblClientName2);
        
        txtClientName2 = new JTextField();
        txtClientName2.setBounds(130, 144, 100, 30);
        panel2.add(txtClientName2);
        
        lblIssuerBank2 = new JLabel("Issuer Bank");
        lblIssuerBank2.setBounds(22, 191, 80, 30);
        panel2.add(lblIssuerBank2);
        
        txtIssuerBank2 = new JTextField();
        txtIssuerBank2.setBounds(130, 191, 100, 30);
        panel2.add(txtIssuerBank2);
        
        lblBankAccount2 = new JLabel("Bank Account");
        lblBankAccount2.setBounds(22, 238, 90, 30);
        panel2.add(lblBankAccount2);
        
        txtBankAccount2 = new JTextField();
        txtBankAccount2.setBounds(130, 238, 100, 30);
        panel2.add(txtBankAccount2);
        
        lblBalanceAmount2 = new JLabel("Balance Amount");
        lblBalanceAmount2.setBounds(22, 285, 150, 30);
        panel2.add(lblBalanceAmount2);
        
        txtBalanceAmount2 = new JTextField();
        txtBalanceAmount2.setBounds(130, 285, 100, 30);
        panel2.add(txtBalanceAmount2);
        
        lblCredit = new JLabel("Credit Card");
        lblCredit.setBounds(228, 48, 133, 36);
        panel2.add(lblCredit);
        
        lblCredit.setFont(new Font("Arial", Font.PLAIN, 20));
        
        lblCvcNumber = new JLabel("CVC Number");
        lblCvcNumber.setBounds(301, 94, 90, 30);
        panel2.add(lblCvcNumber);
        
        txtCvcNumber = new JTextField();
        txtCvcNumber.setBounds(403, 94, 100, 30);
        panel2.add(txtCvcNumber);
        
        lblCreditLimit = new JLabel("Credit Limit");
        lblCreditLimit.setBounds(301, 142, 90, 30);
        panel2.add(lblCreditLimit);
        
        txtCreditLimit = new JTextField();
        txtCreditLimit.setBounds(403, 142, 100, 30);
        panel2.add(txtCreditLimit);
        
        lblInterestRate = new JLabel("Interest Rate");
        lblInterestRate.setBounds(301, 190, 90, 30);
        panel2.add(lblInterestRate);
        
        txtInterestRate = new JTextField();
        txtInterestRate.setBounds(403, 190, 100, 30);
        panel2.add(txtInterestRate);
        
        lblExpirationDate = new JLabel("Expiration Date");
        lblExpirationDate.setBounds(301, 238, 100, 30);
        panel2.add(lblExpirationDate);
        
        String ExpirationDateYear[] = {"", "2022", "2023"};
        String ExpirationDateMonth[] = {"", "01", "02", "03", "04"};
        String ExpirationDateDate[] = {"", "01", "02", "03"};
        comboExpirationDateYear = new JComboBox(ExpirationDateYear);
        comboExpirationDateYear.setBounds(403, 238, 90, 30);
        comboExpirationDateMonth = new JComboBox(ExpirationDateMonth);
        comboExpirationDateMonth.setBounds(483, 238, 70, 30);
        comboExpirationDateDate = new JComboBox(ExpirationDateDate);
        comboExpirationDateDate.setBounds(533, 238, 70, 30);
        panel2.add(comboExpirationDateYear);
        panel2.add(comboExpirationDateMonth);
        panel2.add(comboExpirationDateDate);
        
        lblGracePeriod = new JLabel("Grace Period");
        lblGracePeriod.setBounds(301, 286, 90, 30);
        panel2.add(lblGracePeriod);
        
        txtGracePeriod = new JTextField();
        txtGracePeriod.setBounds(403, 286, 100, 30);
        panel2.add(txtGracePeriod); 
        
        btnAddCredit = new JButton("Add a Credit Card");
        btnAddCredit.setBounds(232, 334, 136, 32);
        btnAddCredit.addActionListener(this);
        panel2.add(btnAddCredit);
        
        btnSetCreditLimit = new JButton("Set the Credit Limit");
        btnSetCreditLimit.setBounds(227, 384, 146, 32);
        panel2.add(btnSetCreditLimit);
        
        btnCancelCredit = new JButton("Cancel Credit Card");
        btnCancelCredit.setBounds(227, 444, 146, 32);
        panel2.add(btnCancelCredit);
        
        btnBack_Credit = new JButton("Back");
        btnBack_Credit.setBounds(32, 528, 120, 32);
        btnBack_Credit.addActionListener(this);
        panel2.add(btnBack_Credit);
        
        btnDisplay_Credit = new JButton("Display");
        btnDisplay_Credit.setBounds(227, 528, 120, 32);
        panel2.add(btnDisplay_Credit);
        
        JButton btnClear_Credit = new JButton("Clear");
        btnClear_Credit.setBounds(455, 528, 120, 32);
        panel2.add(btnClear_Credit);
        
        frame2.setVisible(true);
        
        frame2.setSize(600, 600);
        
        frame.setVisible(false);
        
        panel2.setBackground(new Color(224, 191, 184));
        
        //btnAddCredit.addActionListener(this); 
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnDebit){
            Debit_Frame();
        }

        if(e.getSource() == btnAddDebit) {
            String cardIDText = txtCardID.getText();
            String balanceAmountText = txtBalanceAmount.getText();
            String bankAccount = txtBankAccount.getText();
            String issuerBank = txtIssuerBank.getText();
            String clientName = txtClientName.getText();
            String pinNumberText = txtPinNumber.getText();

            if(cardIDText.isEmpty() || balanceAmountText.isEmpty() || bankAccount.isEmpty() || issuerBank.isEmpty() || clientName.isEmpty() || pinNumberText.isEmpty()) {
                JOptionPane.showMessageDialog(panel1, "Entry is missing. Please fill all the spaces");
                return;
            }

            int cardID;
            int balanceAmount;
            int pinNumber;
            try {
                cardID = Integer.parseInt(cardIDText);
                balanceAmount = Integer.parseInt(balanceAmountText);
                pinNumber = Integer.parseInt(pinNumberText);
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel1, "Invalid Input.");
                return;
            }

            if(!clientName.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel1, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(!issuerBank.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel1, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
             if(!bankAccount.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel1, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Debit_Card obj_Debit = new Debit_Card(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber);
            objArrayList.add(obj_Debit);
            JOptionPane.showMessageDialog(panel1, "Successfully added to Debit.");
        }

            

        /*System.out.println("cardID: " + cardID);
        System.out.println("balanceAmount: " + balanceAmount);
        System.out.println("bankAccount: " + bankAccount);
        System.out.println("issuerBank: " + issuerBank);
        System.out.println("clientName: " + clientName);
        System.out.println("pinNumber: " + pinNumber);*/

    
        if(e.getSource() == btnBack_Debit){
            frame.setVisible(true);
            frame1.setVisible(false);
        }
    
        if(e.getSource() == btnWithdrawDebit){
            frame3 = new JFrame("Debit Form");
            panel3 = new JPanel();
            panel3.setLayout(null);
            frame3.add(panel3);
    
            lblTitle3 = new JLabel("Withdraw from Debit Card?");
            lblTitle3.setBounds(143, 48, 314, 36);
            panel3.add(lblTitle1);
    
            lblTitle3.setFont(new Font("Arial", Font.PLAIN, 26));
    
            lblPinNumber3 = new JLabel("PIN Number");
            lblPinNumber3.setBounds(22, 132, 120, 30);
            panel3.add(lblPinNumber3);
    
            txtPinNumber3 = new JTextField();
            txtPinNumber3.setBounds(168, 132, 150, 30);
            panel3.add(txtPinNumber3);
    
            int pinNumber = Integer.parseInt(txtPinNumber.getText());
    
            try{
                pinNumber = Integer.parseInt(txtPinNumber.getText());
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid PIN Number.");
            }
    
            lblBalanceAmount3= new JLabel("Balance Amount");
            lblBalanceAmount3.setBounds(22, 216, 120, 30);
            panel3.add(lblBalanceAmount3);
    
            txtBalanceAmount3 = new JTextField();
            txtBalanceAmount3.setBounds(168, 212, 150, 30);
            panel3.add(txtBalanceAmount3);
    
            int balanceAmount = Integer.parseInt(txtPinNumber.getText());
    
            try{
                balanceAmount = Integer.parseInt(txtPinNumber.getText());
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid Balance Amount.");
            }
    
            lblDateOfWithdrawal3 = new JLabel("Date Of Withdrawal");
            lblDateOfWithdrawal.setBounds(22, 292, 150, 30);
            panel3.add(lblDateOfWithdrawal);
    
            String WithdrawalDateYear3[] = {"", "2022", "2023"};
            String WithdrawalDateMonth3[] = {"", "01", "02", "03", "04"};
            String WithdrawalDateDate3[] = {"", "01", "02", "03"};
            comboWithdrawalDateYear3 = new JComboBox(WithdrawalDateYear3);
            comboWithdrawalDateYear3.setBounds(168, 292, 90, 30);
            comboWithdrawalDateMonth3 = new JComboBox(WithdrawalDateMonth3);
            comboWithdrawalDateMonth3.setBounds(248, 292, 70, 30);
            comboWithdrawalDateDate3 = new JComboBox(WithdrawalDateDate3);
            comboWithdrawalDateDate3.setBounds(305, 292, 70, 30);
            panel3.add(comboWithdrawalDateYear3);
            panel3.add(comboWithdrawalDateMonth3);
            panel3.add(comboWithdrawalDateDate3);
    
            lblWithdrawalAmount3 = new JLabel("Withdrawal Amount");
            lblWithdrawalAmount3.setBounds(22, 365, 150, 30);
            panel3.add(lblWithdrawalAmount3);
    
            txtWithdrawalAmount3 = new JTextField();
            txtWithdrawalAmount3.setBounds(168, 365, 150, 30);
            panel3.add(txtWithdrawalAmount3);
    
            int withdrawalAmount = Integer.parseInt(txtPinNumber.getText());
    
            try{
                withdrawalAmount = Integer.parseInt(txtPinNumber.getText());
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid Withdrawal Amount.");
            }
    
            btnBack_Withdraw = new JButton("Back");
            btnBack_Withdraw.setBounds(22, 528, 120, 30);
            btnBack_Withdraw.addActionListener(this);
            panel3.add(btnBack_Withdraw);
    
            btnWithdraw_final = new JButton("Withdraw");
            btnWithdraw_final.setBounds(227, 528, 120, 32);
            btnWithdraw_final.addActionListener(this);
            panel3.add(btnWithdraw_final);
    
            frame3.setVisible(true);
            frame3.setSize(600, 600);
            frame1.setVisible(false);
            panel3.setBackground(new Color(224, 191, 184));
        }
    
        if(e.getSource() == btnBack_Withdraw){
            frame1.setVisible(true);
            frame3.setVisible(false);
        }
    
        if(e.getSource() == btnCredit){
            Credit_Frame();
        }
    
        if(e.getSource() == btnAddCredit){
            
            String cardIDText = txtCardID.getText();
            String balanceAmountText = txtBalanceAmount.getText();
            String cvcNumberText = (txtCvcNumber.getText());
            String interestRateText = txtInterestRate.getText();
            String bankAccount = txtBankAccount.getText();
            String issuerBank = txtIssuerBank.getText();
            String clientName = txtClientName.getText();
            
            String year = (String) comboExpirationDateYear.getSelectedItem();
            String month = (String) comboExpirationDateMonth.getSelectedItem();
            String date = (String) comboExpirationDateDate.getSelectedItem();
            String cExpirationDate = year + "-" + month + "-" + date;
                    
            if(cardIDText.isEmpty() || balanceAmountText.isEmpty() || bankAccount.isEmpty() || issuerBank.isEmpty() || clientName.isEmpty() || 
            cvcNumberText.isEmpty()|| interestRateText.isEmpty()|| year.isEmpty()||month.isEmpty()|| date.isEmpty()) {
                JOptionPane.showMessageDialog(frame2, "Entry is missing. Please fill all the spaces.");
            }

            
            int cardID;
            int balanceAmount;
            int cvcNumber;
            double interestRate;
    
            
            
            try{
                cardID = Integer.parseInt(cardIDText);
                balanceAmount = Integer.parseInt(balanceAmountText);
                cvcNumber = Integer.parseInt(cvcNumberText);
                interestRate = Double.parseDouble(interestRateText);
                
           
            if(!clientName.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel2, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(!issuerBank.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel2, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
             if(!bankAccount.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(panel2, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Credit_Card obj_Credit = new Credit_Card(cardID, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, cExpirationDate);                            
            objArrayList.add(obj_Credit);
            JOptionPane.showMessageDialog(frame2, "Successfully added to Credit.");
            
         }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel2, "Invalid Input.");
                return;
                   
            }
            
        }
        
        
        
    
        if(e.getSource() == btnBack_Credit){
            frame.setVisible(true);
            frame2.setVisible(false);
        }
    
        
    }
    
    
    
    
}

