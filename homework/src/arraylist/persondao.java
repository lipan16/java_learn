package arraylist;

import java.util.*;

public class persondao {
	ArrayList<person> al = new ArrayList<person>();

	public void insertperson() {
		person p = new person();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((p.getName()).equals(al.get(i).getName())) {
				bl = true;
				break;
			}
		}
		if (bl)
			System.out.println("����ϵ�������");
		else {
			al.add(p);
			System.out.println("�����ϵ�˳ɹ�");
		}
	}

	public void delpersonbyid() {
		System.out.print("������Ҫɾ����ϵ�˵�����|Pid|Tel��");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				al.remove(i);
			}
		}
		if (bl)
			System.out.println("��ɾ����ϵ��");
		else
			System.out.println("��ϵ�˱����޴���ϵ��");
	}

	public void modifyperson() {
		System.out.print("������Ҫ�޸���ϵ�˵�����|Pid|Tel��");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				al.get(i).modify();
			}
		}
		if (bl)
			System.out.println("�Ѹ�����ϵ��");
		else
			System.out.println("��ϵ�˱����޴���ϵ��");
	}

	public person queryperson() {

		System.out.print("������Ҫ��ѯ��ϵ�˵�����|Pid|Tel��");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		int p = 0;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				p = i;
			}
		}
		if (bl) {
			System.out.println("�ҵ���ϵ����Ϣ��");
			return al.get(p);
		} else {
			System.out.println("��ϵ�˱����޴���ϵ��");
			return null;
		}
	}
}
