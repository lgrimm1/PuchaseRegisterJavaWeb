package PurchaseRegister.DataModels;

/**
 * This class represents a statistical element.
 * @author Laszlo Grimm
 */
public class Stat {

	private final double total;
	private final int count;

	public Stat(double newTotal, int newCount) {
		total = newTotal;
		count = newCount;
	}

	public double getTotal() {
		return total;
	}

	public int getCount() {
		return count;
	}

	public double getAverage() {
		return total / count;
	}

	public Stat deepCopy() {
		return new Stat(total, count);
	}
}
