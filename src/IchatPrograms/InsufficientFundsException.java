package IchatPrograms;

import java.awt.AlphaComposite;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}