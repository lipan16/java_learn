package calendar;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class calendar extends JFrame implements ChangeListener,ActionListener{
	private static final long serialVersionUID = 1L;
	
	Calendar cal = Calendar.getInstance();// ��ȡ��������
	int year = cal.get(Calendar.YEAR);
	int mindex=cal.get(Calendar.MONTH);
	
	SpinnerNumberModel snm1 = new SpinnerNumberModel(year, 0, 9999, 1);
	JSpinner jsy = new JSpinner(snm1);
	
	Integer[] months= {1,2,3,4,5,6,7,8,9,10,11,12};
    JComboBox<Integer> month = new JComboBox<Integer>(months);
    
	JTextArea jta=new JTextArea(6,44);

	public calendar() {
		add(jsy);
		jsy.addChangeListener(this);

        add(month);
        month.setSelectedIndex(mindex);
        month.addActionListener(this);
       
        int year = (Integer)jsy.getValue();//��ȡ��
        int months = (Integer) month.getSelectedItem();//��ȡ��
        String str=printf_cal(cal, year, months);
        jta.setText(str);
        jta.setEditable(false);
        add(jta,BorderLayout.CENTER);
        
        setTitle("calendar");//���ô��ڱ���
        setLayout(new FlowLayout());//��JFrame���ó���ʽ����
        setSize(645, 240);//���ô��ڴ�С
        setResizable(false);//���÷Ŵ�
        setLocationRelativeTo(null);//���ô��ھ���
        setDefaultCloseOperation(EXIT_ON_CLOSE);//���õ���ر��˳�jvm�����
        setVisible(true);//���ô��ڿɼ�
	}

	public void stateChanged(ChangeEvent e) {
		int year = (Integer) ((JSpinner) e.getSource()).getValue();//��ȡ��
		int mon = (Integer) month.getSelectedItem();//��ȡ��
		String str=printf_cal(cal, year, mon);
		jta.setText(str);
	}

	public void actionPerformed(ActionEvent e) {
		int year=(Integer)jsy.getValue();
		int month = ((JComboBox<?>) e.getSource()).getSelectedIndex() + 1;//��ȡ�õ����·�
		String str=printf_cal(cal, year, month);
		jta.setText(str);
	}
	
	public String printf_cal(Calendar cal, int year, int month) {
		int days;
		month--;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, 0);
		if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month == 2) {// ����
			days = 29;
		} else {
			days = chooseMonth(month + 1);
		}
		String str = "\t\t\t" + year + "��" + (month + 1) + "��������\n������\t����һ\t���ڶ�\t������\t������\t������\t������\n";
		// System.out.println(year + "��" + (month + 1) + "�µ�������");
		// System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for (int count = 1; count <= days; count++) {
			int day = cal.get(Calendar.DAY_OF_WEEK);// ĳ���´ӵڼ��쿪ʼ
			cal.add(Calendar.DAY_OF_MONTH, 1);
			if (count == 1) {
				for (int i = 0; i < day; i++) {
					str += "\t";
					// System.out.print("\t");
				}
			}
			if (day == 7) {
				str += "\n";
				// System.out.println("\n"); //������ͻ���
			}
			str += cal.get(Calendar.DAY_OF_MONTH) + "\t";
			// System.out.print( cal.get(Calendar.DAY_OF_MONTH)+ "\t"); // ���ٺ�
		}
		return str;
	}
	
	public static int chooseMonth(int m) {
		int days = 0;
		switch (m) {
		case 2:
			days = 28; break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;break;
		default:
			days = 0;
		}
		return days;
	}

}
