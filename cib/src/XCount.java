import java.util.*;

public class XCount{
    static private String[] ss = {"A", "B", "C"};

    static List<String> list      = Arrays.asList(ss);
    static int          list_size = ss.length;

    public static int get(String s) throws Exception{
        char[] cc   = s.toCharArray();
        int    size = s.length();
        int    sum  = 0;
        for(int i = 0; i < size; i++){
            int c = (int) cc[i];
            if(c > 47 && c < 58){
                c = c - 48;
            }else{
                int    count = 10;
                String str   = cc[i] + "";
                int    mv    = list.indexOf(str);
                if(mv >= 0){
                    c = count + mv;
                }else throw new Exception("no allowed input");
            }
            sum += Math.pow(10, size - i - 1) * c;
            System.out.println(i + ":" + c);
        }
        return sum;
    }

    public static String set(int count, int size) throws Exception{
        String value         = "";
        char[] cc            = new char[size];
        int    counter_width = 10 + list_size;
        if(count < 0) throw new Exception("XCount Error: set input < 0 Error!");
        if(count > Math.pow(counter_width, size) - 1) throw new Exception("XCount Error: set input > maxvalue Error!");

        //        double mid_value = num;
        //        for (int i = 0; i < size; i++) {
        //            double cv = Math.floor(mid_value / Math.pow(counter_width, (size - i - 1)));
        //
        //            if (cv < 0)
        //                cc[i] = '0';
        //            else {
        //                if (cv < 10)
        //                    cc[i] = (char) (48 + cv);
        //                else if (cv < 36)
        //                    cc[i] = (char) (65 + cv - 10);
        //                else if (cv < 62)
        //                    cc[i] = (char) (97 + cv - 36);
        //            }
        //            mid_value = mid_value % Math.pow(counter_width, (size - i - 1));
        //        }
        //        value = String.valueOf(cc);

        return value;
    }

    public static void main(String[] args) throws Exception{
        String s = "A0000";
        if(args.length > 0){
            s = args[0].toString();
        }
        System.out.println(get(s));
    }

}


//00000
//00001
//00002
//
//99999
//
//A0000
//A9999
//
//B0000
//B9999
//
//C0000
//C9998
//C9999
//
//CA000
//CA001
//CA999
//CB000
//CC999
//CCA00
//
//CCCCC
//
//C9998
//CC999
//
//0A
//10

