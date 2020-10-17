package hashset;

import java.util.*;

public class hashset_test {
	public void hash_test() {
		HashSet<String> hs=new HashSet<>();
		hs.add("编译原理课程设计");
		hs.add("算法设计与分析");
		hs.add("JavaEE编程思想");
		hs.add("物联网及安全");
		hs.add("软件工程");
		hs.add("编译原理");
		hs.add("接口与通讯");
		hs.add("接口与通讯实验");

		Iterator<String> it=hs.iterator();//通过迭代器遍历hashset
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
