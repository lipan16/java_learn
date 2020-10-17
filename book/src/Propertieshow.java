public class Propertieshow{
  public static void main(String[] args){
    String[] names={"java.home","java.version","os.arch","os.name","os.version","user.dir","user.home","user.name"};
    for(int i=0;i<names.length;i++){
      System.out.println("The key "+names[i]+"'s values="+System.getProperty(names[i]));}
  }
}