public class Outer {
	private static int i = 1;
	private int j = 10;
	public static void outer_f1() {
	}

	public void outer_f2() {
	}

// ��̬�ڲ��������public,protected,private����
// ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
static class Inner {
	static int inner_i = 100;
	int inner_j = 200;
	static void inner_f1() {
	//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա(������̬�����;�̬����)
	System.out.println("Outer.i=" + i);
	outer_f1();
	}

	void inner_f2() {
	// ��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա(�����Ǿ�̬�����ͷǾ�̬����)
	// System.out.println("Outer.i"+j);
	// outer_f2();
	}
}

	public void outer_f3() {
		// �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
		System.out.println(Inner.inner_i);
		Inner.inner_f1();
		// �ⲿ������ڲ���ķǾ�̬��Ա:ʵ�����ڲ��༴��
		Inner inner = new Inner();
		inner.inner_f2();
	}

	public static void main(String[] args) {
		new Outer().outer_f3();
	}
}
