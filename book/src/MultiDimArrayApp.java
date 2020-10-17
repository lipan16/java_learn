public class MultiDimArrayApp{
public static void main(String[] args){
final int MAX_STUDENTS=50,MAX_SUBJECTS=3;
int [][] marks=new int[MAX_STUDENTS][MAX_SUBJECTS];
for(int i=0;i<MAX_STUDENTS;i++){
for(int j=0;j<MAX_SUBJECTS;j++){
marks[i][j]=(int)(Math.random()*100);}
}
System.out.print("Student \t");
for(int j=0;j<MAX_SUBJECTS;j++){
System.out.print("Subject"+j+"\t");}
System.out.println();
for(int i=0;i<MAX_STUDENTS;i++){
System.out.print("Student"+(i+1)+"\t");
for(int j=0;j<MAX_SUBJECTS;j++){
System.out.print("\t"+marks[i][j]+"\t");}
System.out.println();
}}}
