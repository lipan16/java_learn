package hashset;

import java.util.*;

public class hashset_test {
	public void hash_test() {
		HashSet<String> hs=new HashSet<>();
		hs.add("����ԭ��γ����");
		hs.add("�㷨��������");
		hs.add("JavaEE���˼��");
		hs.add("����������ȫ");
		hs.add("�������");
		hs.add("����ԭ��");
		hs.add("�ӿ���ͨѶ");
		hs.add("�ӿ���ͨѶʵ��");

		Iterator<String> it=hs.iterator();//ͨ������������hashset
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
