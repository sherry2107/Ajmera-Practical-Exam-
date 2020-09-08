/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author LENOVO1
 */
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
  import java.util.*;
public class Bank {

    /**
     * @param args the command line arguments
     */
        Savings s = new Savings();
        Current c= new Current();
        
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // TODO code application logic here
        
       /* Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/banks","root","password");
        String query = "Insert into tran values(?,?,?)";
        
        PreparedStatement stmt = con.prepareStatement(query); */
       Bank b = new Bank(); 
       b.implement();
        
        
    }
    
    void implement(){
        
       Scanner sc = new Scanner(System.in); 
       int ichoice;
        
        System.out.println("Press 1 for operating on Savings Account");
        System.out.println("Press 2 for operating on Current Account");
        System.out.println("Press 3 to exit");
        ichoice = sc.nextInt();
        if(ichoice == 1){
            
            System.out.println("Press 1 to credit amount");
            System.out.println("Press 2 to debit amount");
            System.out.println("Press 3 to check balance");
            int ioperation = sc.nextInt();
            
            if(ioperation == 1){
                s.credit(sc);
            }
            else if(ioperation == 2){
                s.debit(sc);
            }
            else if(ioperation == 3){
                s.checkBalance();
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
        else if(ichoice == 2){
            
            System.out.println("Press 1 to credit amount");
            System.out.println("Press 2 to debit amount");
            System.out.println("Press 3 to check balance");
            
            int ioperation = sc.nextInt();
            
            if(ioperation == 1){
                c.credit(sc);
            }
            else if(ioperation == 2){
                c.debit(sc);
            }
            
            else if(ioperation == 3){
                c.checkBalance();
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
        else if(ichoice == 3){
            return ;
        }
        else{
            System.out.println("Invalid choice!");
        }
    }
    
    
}

class Account{
    
    private double dbalance;
    double damount;

    double getBalance(){
        return this.dbalance;
    }
    
    void setBalance(double damount){
        this.dbalance = damount;
    }
    
    void credit(Scanner sc){
        System.out.println("Enter amount you wish to credit:- ");
        damount = sc.nextDouble();
        if(damount % 500 == 0){
            double dbalance = this.getBalance() + damount; 
            this.setBalance(dbalance);  
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        System.out.println(dbalance);
        Bank b = new Bank();
        b.implement();
	
}


    void debit(Scanner sc){
        System.out.println("Enter amount you wish to debit:- ");
        damount = sc.nextDouble();
        
        if(damount % 500 == 0){
            double dbalance = this.getBalance() - damount;
            this.setBalance(dbalance); 
            System.out.println(dbalance);
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        
	Bank b = new Bank();
        b.implement();
    }
    
    void checkBalance(){
        double d = this.getBalance();
       System.out.println("Your balance is:- "+d);
       Bank b = new Bank();
        b.implement();
    }
}

class Savings extends Account{
   
    String type = "savings";
    private double dbalance;
    
    Savings(){
        dbalance = 10000;
    }
    
    double getBalance(){
        return dbalance;
    }
    
    void setBalance(double damount){
        dbalance = damount;
        System.out.println("in setbalance" +getBalance());
    }
    
    void credit(Scanner sc){
        System.out.println("Enter amount you wish to credit:- ");
        damount = sc.nextDouble();
        if(damount % 500 == 0){
            double dbalance = this.getBalance() + damount; 
            this.setBalance(dbalance);  
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        System.out.println(dbalance);
        Bank b = new Bank();
        b.implement();
	
}


    void debit(Scanner sc){
        System.out.println("Enter amount you wish to debit:- ");
        damount = sc.nextDouble();
        
        if(damount % 500 == 0){
            if(this.getBalance() > damount){
            double dbalance = this.getBalance() - damount;
            this.setBalance(dbalance); 
            System.out.println(dbalance);
            }
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        
	Bank b = new Bank();
        b.implement();
    }
    
    void checkBalance(){
        double d = this.getBalance();
       System.out.println("Your balance is:- "+d);
       Bank b = new Bank();
       b.implement();
    }

}

class Current extends Account{
    String type = "current";
    private double dbalance;
    
    Current(){
        dbalance = 10000;
    }
    
    double getBalance(){
        return this.dbalance;
    }
    
    void setBalance(double damount){
        dbalance = damount;
        System.out.println(getBalance());
    }
    
    void credit(Scanner sc){
        System.out.println("Enter amount you wish to credit:- ");
        damount = sc.nextDouble();
        if(damount % 500 == 0){
            double dbalance = this.getBalance() + damount; 
            this.setBalance(dbalance);  
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        System.out.println(dbalance);
        Bank b = new Bank();
        b.implement();
	
}


    void debit(Scanner sc){
        System.out.println("Enter amount you wish to debit:- ");
        damount = sc.nextDouble();
        
        if(damount % 500 == 0){
            double dbalance = this.getBalance() - damount;
            this.setBalance(dbalance); 
            System.out.println(dbalance);
        }
        else{
            System.out.println("Invalid amount! Please enter in multiple of 500");
        }
        
	Bank b = new Bank();
        b.implement();
    }
    
    void checkBalance(){
        double d = this.getBalance();
       System.out.println("Your balance is:- "+d);
       Bank b = new Bank();
        b.implement();
    }

}
