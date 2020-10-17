import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("lipan");
		logger.info("112121");
		String str1 = "\\W";
		System.out.println("%%".matches(str1));
		String str2 = "dcd";
		System.out.println(str1.compareTo(str2));
		System.out.println(12.9 % 5.0);
		List<String> list = findPhone("iPhone number 13993176565");

		for (String s : list) {
			System.out.println(s);
		}


		BigDecimal bigDecimal = new BigDecimal("0.1");//精确计算
		BigDecimal bigDecimal1 = new BigDecimal("0.2");
		System.out.println(bigDecimal.add(bigDecimal1));

		BigDecimal bigDecimal2 = BigDecimal.valueOf(0.1);//精确计算
		BigDecimal bigDecimal3 = BigDecimal.valueOf(0.2);
		System.out.println(bigDecimal2.add(bigDecimal3));

		System.out.println(Year(209));

	}

	public static List<String> findPhone(String s) {
		List<String> list = new ArrayList<>();
		Pattern p = Pattern.compile("1[3578]\\d{9}");//手机号的正则表达式
		Matcher m = p.matcher(s);
		while (m.find()) {//在s中查找满足正则表达式规则的串，找到返回true找不到返回false
			String temp = m.group();//把一起找到的东西获取出来(必须先找再获取)
			list.add(temp);
			//System.out.println(temp);
		}
		return list;
	}

	public static boolean Year(int year) {//判断是否为闰年
		Calendar c = Calendar.getInstance();
		c.set(year, Calendar.MARCH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}
}
