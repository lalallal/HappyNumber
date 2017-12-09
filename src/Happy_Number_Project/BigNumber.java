package Happy_Number_Project;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumber{
	public BigInteger number;
	public BigNumber (String a) {
		this.number = new BigInteger(a);
	}
	public BigNumber (BigInteger a ) {
		this.number = a;
	}
	public BigNumber Parent (BigNumber input) {
		if (input.number.equals(BigInteger.valueOf(1))) {
			return new BigNumber("1");
		} else if (input.number.equals(BigInteger.valueOf(145))) {
			return new BigNumber("145");
		} else if (input.number.equals(BigInteger.valueOf(58))) {
			return new BigNumber("58");
		} else if (input.number.equals(BigInteger.valueOf(89))) {
			return new BigNumber("89");
		} else if (input.number.equals(BigInteger.valueOf(37))) {
			return new BigNumber("37");
		} else if (input.number.equals(BigInteger.valueOf(16))) {
			return new BigNumber("16");
		} else if (input.number.equals(BigInteger.valueOf(4))) {
			return new BigNumber("4");
		} else if (input.number.equals(BigInteger.valueOf(20))) {
			return new BigNumber("20");
		} else if (input.number.equals(BigInteger.valueOf(42))) {
			return new BigNumber("42");
		} else {
			BigInteger sum = BigInteger.valueOf(0);
		String numberInString = input.number.toString();
		for (int i = 0; i < numberInString.length(); i++) {
			sum = sum.add(BigInteger.valueOf(Integer.valueOf(numberInString.substring(i, i+1))*Integer.valueOf(numberInString.substring(i, i+1))));
		}
		BigNumber output = new BigNumber(sum);
		return Parent(output);
	}
	}
	public String Type (BigNumber input) {
		return Parent(input).toString();
	}
	public BigNumber Next (BigNumber input) {
		BigInteger a = input.number;
		BigNumber output = new BigNumber(a.add(BigInteger.valueOf(1)));
		return output;
	}
	public BigNumber Previous (BigNumber input) {
		BigInteger a = input.number;
		BigNumber output = new BigNumber(a.subtract(BigInteger.valueOf(1)).toString());
		return output;
	}
	public BigNumber NextHappyNumber (BigNumber input) {
		if (Type(Next(input)).equals("1")) {
			return Next(input);
		}
		return NextHappyNumber(Next(input));
	}
	public BigNumber Next58 (BigNumber input) {
		if (Type(Next(input)).equals("58")) {
			return Next(input);
		}
		return Next58(Next(input));
	}
	public BigNumber Next89 (BigNumber input) {
		if (Type(Next(input)).equals("89")) {
			return Next(input);
		}
		return Next89(Next(input));
	}
	public BigNumber Next145 (BigNumber input) {
		if (Type(Next(input)).equals("145")) {
			return Next(input);
		}
		return Next145(Next(input));
	}
	public BigNumber Next42 (BigNumber input) {
		if (Type(Next(input)).equals("42")) {
			return Next(input);
		}
		return Next42(Next(input));
	}
	public BigNumber Next20 (BigNumber input) {
		if (Type(Next(input)).equals("20")) {
			return Next(input);
		}
		return Next20(Next(input));
	}
	public BigNumber Next4 (BigNumber input) {
		if (Type(Next(input)).equals("4")) {
			return Next(input);
		}
		return Next4(Next(input));
	}
	public BigNumber Next16 (BigNumber input) {
		if (Type(Next(input)).equals("16")) {
			return Next(input);
		}
		return Next16(Next(input));
	}
	public BigNumber Next37 (BigNumber input) {
		if (Type(Next(input)).equals("37")) {
			return Next(input);
		}
		return Next37(Next(input));
	}
	public String NextSameType (BigNumber input) {
		BigNumber temp = new BigNumber(input.number);
		while (!Type(Next(input)).equals(Type(temp))) {
			input = Next(input);
		}
		return Next(input).number.toString();
	}
	public BigNumber NumberofHappy (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(1));
		}
		if (Type(input).equals("1")) {
			return NumberofHappy(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofHappy(Previous(input));
		
	}
	public BigNumber NumberofType89 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("89")) {
			return NumberofType89(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType89(Previous(input));
		
	}
	public BigNumber NumberofType58 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("58")) {
			return NumberofType58(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType58(Previous(input));
		
	}
	public BigNumber NumberofType145 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("145")) {
			return NumberofType145(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType145(Previous(input));
		
	}
	public BigNumber NumberofType42 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("42")) {
			return NumberofType42(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType42(Previous(input));
		
	}
	public BigNumber NumberofType16 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("16")) {
			return NumberofType16(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType16(Previous(input));
		
	}
	public BigNumber NumberofType4 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("4")) {
			return NumberofType4(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType4(Previous(input));
		
	}
	public BigNumber NumberofType20 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("20")) {
			return NumberofType20(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType20(Previous(input));
		
	}
	public BigNumber NumberofType37 (BigNumber input) {
		if (input.number.toString().equals("1")) {
			return new BigNumber(BigInteger.valueOf(0));
		}
		if (Type(input).equals("37")) {
			return NumberofType37(new BigNumber(Previous(input).number.add(BigInteger.valueOf(1))));
		}
		return NumberofType37(Previous(input));
		
	}
	public BigDecimal DensityOfHappy (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofHappy(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf37 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType37(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf145 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType145(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf20 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType20(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf4 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType4(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf16 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType16(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf42 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType42(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf58 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType58(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
	public BigDecimal DensityOf89 (BigNumber input) {
		BigDecimal a = new BigDecimal(input.number);
		BigDecimal b = new BigDecimal(NumberofType89(input).number);
		BigDecimal c = b.divide(a, 4, BigDecimal.ROUND_HALF_UP);
		return c;
		
	}
}
