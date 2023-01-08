import java.util.StringJoiner;

public class ProductOfNumbers {
	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(args[0]);
		Integer num2 = Integer.valueOf(args[1]);
		StringJoiner sj = new StringJoiner(" ");
		Integer p = num1*num2;
		sj.add("Product of");
		sj.add(num1.toString());
		sj.add(" * ");
		sj.add(num2.toString());
		sj.add("is : ");
		sj.add(p.toString());
		System.out.println(sj.toString());
	}
}
