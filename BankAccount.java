package pack1;

public class BankAccount {
          String IBAN;
          String aT;
          double aB = 500;
          
        void deposit(double amount) {
        	aB=aB+amount;
        }
        void withDraw(double amount) {
            aB=aB-amount;
        }
        double cB() {
        	return aB;
        }


  //CONSTRUCTOR
BankAccount(String act , String acn ,double acb ){

	this(act,acn);
    aB=acb+500;
}

BankAccount(String t , String n){
    aT=t;
	IBAN=n;
}
BankAccount(){}
}