import java.util.*;
class Account{
	//data members
	private int ano;
	private String title;
	private double balance;

	//constructor
	public Account(){
		this(1000,"",0);
	}

	//constructor
	public Account(int a,String t,double b){
		ano=a;
		title=t;
		balance=b;
	}

	public int getAno(){
		return ano;
	}

	
	public double getBalance(){
		return balance;
	}


	public String  getTitle(){
		return title;
	}


	public void setTitle(String t){
		title=t;
	}

	//method to deposit
	public void deposit(double amt){
		balance+=amt;
		System.out.println("Balance after deposit is "+ balance);
	}
	public void calinterset()
	{
	    System.out.println("interset calculation in base Account class");
	}
}
	
class SavingsAccount extends Account{

	public void calinterset()
	{
	    System.out.println("interset calculation in sub class savingsAccount class");
	}
}
class CurrentAccount extends Account{

	public void calinterset()
	{
	    System.out.println("interset calculation in sub class CurrentAccount class");
	}
}

class RecurrentAccount extends Account{

	public void calinterset()
	{
	    System.out.println("interset calculation in sub class RecuurentAccount class");
	}
}
class Interestcalculation
{
    public void retriveinterest(List<? extends Account> l1)
    {
        for(Account a : l1)
        {
            a.calinterset();
        }
    }
}
public class UpperBoundedWildcards{
    public static void main(String args[])
    {
        // here creating the object for Interestcalculation class
        Interestcalculation IC=new Interestcalculation();
        //creating a list of savingsaccount type
        List<SavingsAccount> sa=new ArrayList<>();
        //creating the different objects for the savingsaccount class
        SavingsAccount s1=new SavingsAccount();
        SavingsAccount s2=new SavingsAccount();
        SavingsAccount s3=new SavingsAccount();
        //adding the savingsaccount objects into the sa list
        sa.add(s1);
        sa.add(s2);
        sa.add(s3);
        //calling the retriveinterest method by passing list of savingsaccount objects
        IC.retriveinterest(sa);
        System.out.println();
        
        List<CurrentAccount> ca=new ArrayList<>();
        CurrentAccount c1=new CurrentAccount();
        CurrentAccount c2=new CurrentAccount();
        CurrentAccount c3=new CurrentAccount();
        ca.add(c1);
        ca.add(c2);
        ca.add(c3);
        IC.retriveinterest(ca);
        System.out.println();
        
        List<RecurrentAccount> ra=new ArrayList<>();
        RecurrentAccount r1=new RecurrentAccount();
        RecurrentAccount r2=new RecurrentAccount();
        RecurrentAccount r3=new RecurrentAccount();
        ra.add(r1);
        ra.add(r2);
        ra.add(r3);
        IC.retriveinterest(ra);
    
        
    }
}
