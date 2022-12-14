package PurchaseRegister.DataModels;

import java.io.*;
import java.math.*;

/**
 * This class represent data element of annual statistical data transfer towards frontend.
 * @see #StatAnnualTransfer(Long, BigDecimal, Long, BigDecimal)
 * @see #getYear()
 * @see #getTotal()
 * @see #getCount()
 * @see #getAverage()
 * @author Laszlo Grimm
 */
public class StatAnnualTransfer implements Serializable {
	private final Long year;
	private final BigDecimal total;
	private final Long count;
	private final BigDecimal average;

	public StatAnnualTransfer(Long year, BigDecimal total, Long count, BigDecimal average) {
		this.year = year;
		this.total = total;
		this.count = count;
		this.average = average;
	}

	public Long getYear() {
		return year;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public Long getCount() {
		return count;
	}

	public BigDecimal getAverage() {
		return average;
	}
}
