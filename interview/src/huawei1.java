import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class huawei1 {
	public void huawei() {
		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
		int n = 4;
		String str[] = new String[n];
		Map<String, String> map = new HashMap<>();
		String[] d = {"xxx=1yf/${ttt}/${yyy}/test", "ttt=${yyy}", "yyy=seeyou", "aa=/aaa/${xxx}/bbb/${yyy}/ccc"};
		for (int i = 0; i < n; i++) {
			str[i] = d[i];
			String[] s1 = d[i].split("=");
			map.put(s1[0], s1[1]);
		}
		for (int i = 0; i < n; i++) {
			str[i] = f(str[i], map);
			String[] temp = str[i].split("=");
			map.replace(temp[0], temp[1]);
		}

		System.out.println(str[n - 1].substring(str[n - 1].indexOf("=") + 1));
	}

	/**
	 *
	 * @param s
	 * @param map
	 * @return
	 */
	private static String f(String s, Map<String, String> map) {
		String t = new String();
		if (!s.contains("${")) {
			t = s;
			System.out.println("1" + t);
		} else {
			String[] temp = s.split("\\$\\{");
			for (String s1 : temp) {
				System.out.println("2" + s1);
				if (!s1.contains("}")) {
					t += s1;
				} else {
					String[] s2 = s1.split("}");
					if (map.containsKey(s2[0])) {
						t += map.get(s2[0]);
						if (s2.length == 2) {
							t += s2[1];
						}
					}

				}
			}
		}
		if (t.contains("${")) {
			t = f(t, map);
		}
		return t;
	}
}
