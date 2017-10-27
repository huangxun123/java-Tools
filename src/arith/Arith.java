package arith;

import java.math.BigDecimal;

/**
 * @author hx
 * 
 */
public class Arith {
	private Arith() {
	}

	/**
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @return 返回和
	 */
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	/**
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @return 返回差
	 */
	public static double substract(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	/**
	 * @param v1
	 *            被乘数
	 * @param v2
	 *            乘数
	 * @return 返回积
	 */
	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	/**
	 * 默认保留小数点后10位
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 返回商
	 */
	public static double div(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, 10).doubleValue();
	}

	/**
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            小数点后保留的位数
	 * @return 返回商
	 */
	public static double div(double v1, double v2, int scale) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * @param v
	 * @param scale
	 * @return 返回四舍五入后的值
	 */
	public static double round(double v, int scale) {
		BigDecimal b = new BigDecimal(Double.toString(v));
		return b.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
