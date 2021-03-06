package letter;

/**
 * The cost of a letter should always be positive or zero. This exception should
 * be raised when the cost is negative.
 *
 */
public class IncorrectCostException extends Exception {

	public IncorrectCostException(String message) {
		super(message);
	}

	public IncorrectCostException() {
		super("The cost of a letter can't be negative.");
	}

	/**
	 * The cost of a letter should always be positive. If not, this exception
	 * will be thrown.
	 */
	private static final long serialVersionUID = 1L;// Should understand what
													// does it do.

}
