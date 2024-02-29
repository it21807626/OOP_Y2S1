package pay.payment;

public class Payment {

	private int idpaymnet;
	private String acNumber;
	private String nameOnCard;
	private String creditCardNumber;
	private String cExMonth;
	private String cExYear;
	private String cvc;
	private String amount;
	private int ppid;
	
	public Payment(int idpaymnet, String acNumber, String nameOnCard, String creditCardNumber, String cExMonth, String cExYear,
			String cvc, String amount,int ppid) {
		super();
		this.idpaymnet = idpaymnet;
		this.acNumber = acNumber;
		this.nameOnCard = nameOnCard;
		this.creditCardNumber = creditCardNumber;
		this.cExMonth = cExMonth;
		this.cExYear = cExYear;
		this.cvc = cvc;
		this.amount = amount;
		this.ppid = ppid;
		
	}

	public int getIdpaymnet() {
		return idpaymnet;
	}

	public String getAcNumber() {
		return acNumber;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getcExMonth() {
		return cExMonth;
	}

	public String getcExYear() {
		return cExYear;
	}

	public String getCvc() {
		return cvc;
	}

	public String getAmount() {
		return amount;
	}
	public int getPpid() {
		return ppid;
	}
}
