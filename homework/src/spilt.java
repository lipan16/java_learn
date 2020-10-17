
public class spilt {
	public void spilt_test() {
		String str="The heart of the wise is in the house of mourning,but the heart of fools is in the house of mirth";
		
		String des[]=str.split(" |,");
		for(int i=0;i<des.length;i++) {
			System.out.println(des[i]);
		}
	}
}
