public class twelveBottle {
	private static int bottles[] = null;
        static {
		bottles = new int[12];
		for(int i=0; i<12; i++)
			bottles[i] = 10;

		int specialNo = (int)(Math.random()*100)%12;
		double radom = Math.random();
		while(radom == 0.5) 
			radom = Math.random();
		int specialWeight = 10 + ((radom-0.5)>0?1:-1);
		//�������һֻƿ�ӵ�����Ϊ11����9
		bottles[specialNo] = specialWeight;
System.out.println("�����ƿ����"+specialNo+",����Ϊ"+bottles[specialNo]);
	}
	
	public static void main(String[] args) {
		
		
		weighting("��һ�γ���: \t���:0,1,2,3\t�ұ�:4,5,6,7");
		if(bottles[0]+bottles[1]+bottles[2]+bottles[3]>
			bottles[4]+bottles[5]+bottles[6]+bottles[7]) { 
				weighting("���������أ�\t���ۣ������ƿ�������ֻ���档");
				
				weighting("�ڶ��γ���: \t���:0,1,5\t�ұ�:4,2,8");
				if(bottles[0]+bottles[1]+bottles[5] 
					> bottles[4]+bottles[2]+bottles[8]) {
						weighting("���������أ�\t���ۣ�0��ƿ��1��ƿ��һ���أ�����4��ƿ�ᡣ");
						
						weighting("�����γ���: \t���:0\t�ұ�:1");
						if(bottles[0] == bottles[1])
							weighting("�����һ���أ�\t���ۣ������ƿ����4�ţ�\n����������");
						else if(bottles[0] > bottles[1])
							weighting("���������أ�\t���ۣ������ƿ����0�ţ�\n����������");
						else
							weighting("������ұ��أ�\t���ۣ������ƿ����1�ţ�\n����������");
								
				}
				else if(bottles[0]+bottles[1]+bottles[5] 
					< bottles[4]+bottles[2]+bottles[8]){ 
						weighting("���������أ�\t���ۣ�5��ƿ��,��2��ƿ�ء�");
						
						weighting("�����γ���: \t���:2\t�ұ�:1");
						if(bottles[2] == bottles[1])
							weighting("�����һ���أ�\t���ۣ������ƿ����5�ţ�\n����������");
						else
							weighting("�������һ���أ�\t���ۣ������ƿ����2�ţ�\n����������");
				}
				else {
					weighting("�����һ���أ�\t���ۣ�6��ƿ��7��ƿ��һ���ᣬ����3��ƿ�ء�");
					
					weighting("�����γ���: \t���:6\t�ұ�:7");
					if(bottles[6] == bottles[7])
						weighting("�����һ���أ�\t���ۣ������ƿ����3�ţ�\n����������");
					else if(bottles[6] > bottles[7])
						weighting("���������أ�\t���ۣ������ƿ����7�ţ�\n����������");
					else
						weighting("������ұ��أ�\t���ۣ������ƿ����6�ţ�\n����������");						
				}
		}							 
	 
	 else if(bottles[0]+bottles[1]+bottles[2]+bottles[3] <
			bottles[4]+bottles[5]+bottles[6]+bottles[7]) { 
				weighting("������ұ��أ�\t���ۣ������ƿ�������ֻ���档");
				
				weighting("�ڶ��γ���: \t���:0,1,5\t�ұ�:4,2,8");
				if(bottles[0]+bottles[1]+bottles[5] 
					< bottles[4]+bottles[2]+bottles[8]) {
						weighting("������ұ��أ�\t���ۣ�0��ƿ��1��ƿ��һ���ᣬ����4��ƿ�ء�");
						
						weighting("�����γ���: \t���:0\t�ұ�:1");
						if(bottles[0] == bottles[1])
							weighting("�����һ���أ�\t���ۣ������ƿ����4�ţ�\n����������");
						else if(bottles[0] > bottles[1])
							weighting("���������أ�\t���ۣ������ƿ����1�ţ�\n����������");
						else
							weighting("������ұ��أ�\t���ۣ������ƿ����0�ţ�\n����������");
								
				}
				else if(bottles[0]+bottles[1]+bottles[5] 
					> bottles[4]+bottles[2]+bottles[8]) {
						weighting("���������أ�\t���ۣ�2��ƿ��,��5��ƿ�ء�");
						
						weighting("�����γ���: \t���:2\t�ұ�:1");
						if(bottles[2] == bottles[1])
							weighting("�����һ���أ�\t���ۣ������ƿ����5�ţ�\n����������");
						else
							weighting("�������һ���أ�\t���ۣ������ƿ����2�ţ�\n����������");
				}
				else {
					weighting("�����һ���أ�\t���ۣ�6��ƿ��7��ƿ��һ���أ�����3��ƿ�ᡣ");
					
					weighting("�����γ���: \t���:6\t�ұ�:7");
					if(bottles[6] == bottles[7])
						weighting("�����һ���أ�\t���ۣ������ƿ����3�ţ�\n����������");
					else if(bottles[6] > bottles[7])
						weighting("���������أ�\t���ۣ������ƿ����6�ţ�\n����������");
					else
						weighting("������ұ��أ�\t���ۣ������ƿ����7�ţ�\n����������");						
				}
	 }
		else {
			weighting("�����һ���أ�\t���ۣ������ƿ����8,9,10,11֮�е�һֻ��");
				
			weighting("�ڶ��γ���: \t���:8\t�ұ�:9");
			if(bottles[8] == bottles[9]) {
				weighting("�����һ���أ�\t���ۣ������ƿ����10,11֮�е�һֻ��");	
				
				weighting("�����γ���: \t���:8\t�ұ�:10");
				if(bottles[8] == bottles[10]) 
					weighting("�����һ���أ�\t���ۣ������ƿ����11�ţ�\n����������");
				else 
					weighting("�������һ����\t���ۣ������ƿ����10�ţ�\n����������");
					
			} 
			else {
				weighting("�������һ���أ�\t���ۣ������ƿ����8,9֮�е�һֻ��");
				
				weighting("�����γ���: \t���:8\t�ұ�:10");
				if(bottles[8] == bottles[10]) 
					weighting("�����һ���أ�\t���ۣ������ƿ����9�ţ�\n����������");
				else
					weighting("�������һ���أ�\t���ۣ������ƿ����8�ţ�\n����������");
			}	
	
		}
	}
	private static void weighting(String s){
		System.out.println(s);
	}

}