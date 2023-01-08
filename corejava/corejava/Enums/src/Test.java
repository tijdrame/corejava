
public class Test {

	public static void main(String[] args) {
		
		PaymentType pt = PaymentType.CREDITCARD;
		//System.out.println(pt);
		//liste des enum
		PaymentType[] paymentTypes = PaymentType.values();
		for (PaymentType paymentType : paymentTypes) {
			System.out.println(paymentType);//DEBITCARD, CREDITCARD ou CASH
			System.out.println(paymentType.ordinal());//rang (0, 1 ou 2)
			System.out.println(paymentType.getFee());//fee(5, 0 ou 10)
		}
		
	}

}
