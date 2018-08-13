package util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteFloat {

	public static void main(String[] args) {
		
		/*float dd = 40F;
		float bb = 3F;
		float divide = dd/bb;
		String ee = null;
		ee.valueOf(divide);
		System.out.println(ee);
		
		BigDecimal big = new BigDecimal(divide);
		big = big.setScale(2, BigDecimal.ROUND_DOWN);
		
		System.out.println("squi" + big);
		
		
        BigDecimal divisor = new BigDecimal(3);
        BigDecimal sub = new BigDecimal(40);
        BigDecimal cauculado = sub.divide(divisor,  BigDecimal.ROUND_UP);

        System.out.println(cauculado);
		
		int a = 100;
		int b = 3;
		System.out.println(a/b);
*/		
		
		OperacoesComBigDecimal o = new OperacoesComBigDecimal();
		System.out.println(o.dividir("4", "100"));
		
		
	}
}
