package calendar;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class calendar extends JFrame implements ChangeListener,ActionListener{
	private static final long serialVersionUID = 1L;
	
	Calendar cal = Calendar.getInstance();// 获取日历对象
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
       
        int year = (Integer)jsy.getValue();//获取年
        int months = (Integer) month.getSelectedItem();//获取月
        String str=printf_cal(cal, year, months);
        jta.setText(str);
        jta.setEditable(false);
        add(jta,BorderLayout.CENTER);
        
        setTitle("calendar");//设置窗口标题
        setLayout(new FlowLayout());//把JFrame设置成流式布局
        setSize(645, 240);//设置窗口大小
        setResizable(false);//禁用放大
        setLocationRelativeTo(null);//设置窗口居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);//设置点击关闭退出jvm虚拟机
        setVisible(true);//设置窗口可见
	}

	public void stateChanged(ChangeEvent e) {
		int year = (Integer) ((JSpinner) e.getSource()).getValue();//获取年
		int mon = (Integer) month.getSelectedItem();//获取月
		String str=printf_cal(cal, year, mon);
		jta.setText(str);
	}

	public void actionPerformed(ActionEvent e) {
		int year=(Integer)jsy.getValue();
		int month = ((JComboBox<?>) e.getSource()).getSelectedIndex() + 1;//获取得到的月份
		String str=printf_cal(cal, year, month);
		jta.setText(str);
	}
	
	public String printf_cal(Calendar cal, int year, int month) {
		int days;
		month--;
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, 0);
		if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month == 2) {// 闰年
			days = 29;
		} else {
			days = chooseMonth(month + 1);
		}
		String str = "\t\t\t" + year + "年" + (month + 1) + "月日历：\n星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\n";
		// System.out.println(year + "年" + (month + 1) + "月的日历：");
		// System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for (int count = 1; count <= days; count++) {
			int day = cal.get(Calendar.DAY_OF_WEEK);// 某个月从第几天开始
			cal.add(Calendar.DAY_OF_MONTH, 1);
			if (count == 1) {
				for (int i = 0; i < day; i++) {
					str += "\t";
					// System.out.print("\t");
				}
			}
			if (day == 7) {
				str += "\n";
				// System.out.println("\n"); //星期天就换行
			}
			str += cal.get(Calendar.DAY_OF_MONTH) + "\t";
			// System.out.print( cal.get(Calendar.DAY_OF_MONTH)+ "\t"); // 多少号
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
