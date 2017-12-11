package Happy_Number_Project;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.List;

public class BigNumber{
	public static final String[] typesinString = {"1", "37", "58", "89", "145", "42", "20", "4", "16"};
	public static List<String> TYPES = Arrays.asList(typesinString);
	private BigInteger number;
	private String type;
	private BigInteger parent;
	public BigNumber (final String a) {
		this.number = new BigInteger(a);
		BigInteger sum = BigInteger.valueOf(0);
		String numberInString = number.toString();
		for (int i = 0; i < numberInString.length(); i++) {
			sum = sum.add(BigInteger.valueOf(Integer.valueOf(numberInString.substring(i, i+1))
					*Integer.valueOf(numberInString.substring(i, i+1))));
		}
		this.parent = sum;
		if (number.equals(BigInteger.valueOf(1))) {
			type = "1";
		} else if (number.equals(BigInteger.valueOf(145))) {
			type = "145";
		} else if (number.equals(BigInteger.valueOf(58))) {
			this.type = "58";
		} else if (number.equals(BigInteger.valueOf(89))) {
			this.type = "89";
		} else if (number.equals(BigInteger.valueOf(37))) {
			this.type = "37";
		} else if (number.equals(BigInteger.valueOf(16))) {
			this.type = "16";
		} else if (number.equals(BigInteger.valueOf(4))) {
			this.type = "4";
		} else if (number.equals(BigInteger.valueOf(20))) {
			this.type = "20";
		} else if (number.equals(BigInteger.valueOf(42))) {
			this.type = "42";
		} else {
			this.type = new BigNumber(parent).type;
	}
	}
	public BigNumber (BigInteger b) {
		String a = b.toString();
		this.number = new BigInteger(a);
		BigInteger sum = BigInteger.valueOf(0);
		String numberInString = number.toString();
		for (int i = 0; i < numberInString.length(); i++) {
			sum = sum.add(BigInteger.valueOf(Integer.valueOf(numberInString.substring(i, i+1))
					*Integer.valueOf(numberInString.substring(i, i+1))));
		}
		this.parent = sum;
		if (number.equals(BigInteger.valueOf(1))) {
			type = "1";
		} else if (number.equals(BigInteger.valueOf(145))) {
			type = "145";
		} else if (number.equals(BigInteger.valueOf(58))) {
			this.type = "58";
		} else if (number.equals(BigInteger.valueOf(89))) {
			this.type = "89";
		} else if (number.equals(BigInteger.valueOf(37))) {
			this.type = "37";
		} else if (number.equals(BigInteger.valueOf(16))) {
			this.type = "16";
		} else if (number.equals(BigInteger.valueOf(4))) {
			this.type = "4";
		} else if (number.equals(BigInteger.valueOf(20))) {
			this.type = "20";
		} else if (number.equals(BigInteger.valueOf(42))) {
			this.type = "42";
		} else {
			this.type = new BigNumber(parent).type;
	}
	}
	public BigNumber getParent() {
		return new BigNumber(parent);
	}
	public String getType() {
		return type;
	}
	public BigNumber next() {
		BigNumber output = new BigNumber(number.add(BigInteger.valueOf(1)));
		return output;
	}
	public BigNumber previous() {
		BigNumber output = new BigNumber(number.subtract(BigInteger.valueOf(1)).toString());
		return output;
	}
	public BigNumber nextHappyNumber () {
		if (next().type.equals("1")) {
			return this.next();
		}
		return this.next().nextHappyNumber();
	}
	public BigNumber next58 () {
		if (next().type.equals("58")) {
			return this.next();
		}
		return this.next().next58();
	}
	public BigNumber next89 () {
		if (next().type.equals("89")) {
			return this.next();
		}
		return this.next().next89();
	}
	public BigNumber next145 () {
		if (next().type.equals("145")) {
			return this.next();
		}
		return this.next().next145();
	}
	public BigNumber next42 () {
		if (next().type.equals("42")) {
			return this.next();
		}
		return this.next().next42();
	}
	public BigNumber next20 () {
		if (next().type.equals("20")) {
			return this.next();
		}
		return this.next().next20();
	}
	public BigNumber next4 () {
		if (next().type.equals("4")) {
			return this.next();
		}
		return this.next().next4();
	}
	public BigNumber next16 () {
		if (next().type.equals("16")) {
			return this.next();
		}
		return this.next().next16();
	}
	public BigNumber next37 () {
		if (next().type.equals("37")) {
			return this.next();
		}
		return this.next().next37();
	}
	public BigNumber nextSameType () {
		BigNumber temp = new BigNumber(number.add(new BigInteger("1")));
		while (!next().type.equals(temp.type)) {
			temp = temp.next();
		}
		return temp;
	}
	public BigInteger numberofHappy () {
		if (number.equals(new BigInteger("1'"))) {
			return new BigInteger("1");
		}
		if (this.type.equals("1")) {
			return (previous().numberofHappy()).add(new BigInteger("1"));
		}
		return previous().numberofHappy();
	}
	public BigInteger numberofType89 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("89")) {
			if (number.equals(new BigInteger("1"))) {
				return new BigInteger("0");
			}
			return (previous().numberofType89()).add(new BigInteger("1"));
		}
		return previous().numberofType89();
	}
	public BigInteger numberofType58 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("58")) {
		return (previous().numberofType58()).add(new BigInteger("1"));
	}
    	return previous().numberofType58();
	}
	public BigInteger numberofType145 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("145")) {
		return (previous().numberofType145()).add(new BigInteger("1"));
	}
    	return previous().numberofType145();
	}
	public BigInteger numberofType42 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("42")) {
		return (previous().numberofType42()).add(new BigInteger("1"));
	}
    	return previous().numberofType42();
	}
	public BigInteger numberofType16 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("16")) {
		return (previous().numberofType16()).add(new BigInteger("1"));
	}
    	return previous().numberofType16();
	}
	public BigInteger numberofType4 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("4")) {
		return (previous().numberofType4()).add(new BigInteger("1"));
	}
    	return previous().numberofType4();
	}
	public BigInteger numberofType20 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("20")) {
		return (previous().numberofType20()).add(new BigInteger("1"));
	}
    	return previous().numberofType20();
	}
	public BigInteger numberofType37 () {
		if (number.equals(new BigInteger("1"))) {
			return new BigInteger("0");
		}
		if (this.type.equals("37")) {
		return (previous().numberofType37()).add(new BigInteger("1"));
	}
    	return previous().numberofType37();
	}
	public BigDecimal densityOfHappy () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofHappy());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf37 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(numberofType37());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf145 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType145());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf20 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType20());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal densityOf4 () {
   	    BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType4());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
	}
	public BigDecimal densityOf16 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType16());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf42 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType42());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf58 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType58());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;		
	}
	public BigDecimal densityOf89 () {
		BigDecimal a = new BigDecimal(number);
		BigDecimal b = new BigDecimal(this.numberofType89());
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
	}
	public static BigInteger searchString(BigInteger upperBound, String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (TYPES.indexOf(a[i]) == -1) {
				return new BigInteger("-2");
			}
		 for (BigInteger k = new BigInteger("1"); k.compareTo(upperBound) == -1; k = k.add(new BigInteger("1"))) {
			 Boolean flag = true;
			 for (int j =0; j < a.length && flag == true; j++) {
				 if ((new BigNumber(k.add(new BigInteger(Integer.toString(j))))).type != a[j]) {
					 flag = false;
				 }
			 }
			 if (flag) {
				 return k;
			 }
		 }
		}
		return new BigInteger("-1");

	}
}
