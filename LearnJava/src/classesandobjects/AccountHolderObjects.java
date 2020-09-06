package classesandobjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;		
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom Eligable for CC : " + tom.eligibleForCreditCard);
		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=31;
		henry.accountBalance=20000;		
		henry.testEligibilityForCreditCard();
		System.out.println("Is Henry Eligable for CC : " + henry.eligibleForCreditCard);
		
		sarah.firstName="Henry";
		sarah.lastName="Hill";
		sarah.age=31;
		sarah.accountBalance=20000;		
		sarah.testEligibilityForCreditCard();
		System.out.println("Is Sarah Eligable for CC : " + sarah.eligibleForCreditCard);
		
		
	}

}
