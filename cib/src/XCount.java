public class XCount{
    private static String BASE = "0123456789ABC";

    public static void main(String[] args) throws Exception{
        String s = "A0000";
        if(args.length > 0){
            s = args[0];
        }
        System.out.println(set(100010, 5));
        System.out.println(get(s));
    }

    public static int get(String s) throws Exception{
        char[] chs  = s.toCharArray();
        int    size = s.length();
        int    sum  = 0;
        for(int i = 0; i < size; i++){
            int a = BASE.indexOf(chs[i]);
            if(a == -1){
                throw new Exception("The input is not in the range");
            }
            sum += Math.pow(10, size - i - 1) * a;
        }
        return sum;
    }

    public static String set(int count, int size) throws Exception{
        int max = 0;
        for(int i = 0; i < size; i++){ // 计算size位数时的最大值
            max += Math.pow(10, i) * (BASE.length() - 1);
        }
        if(count < 0 || count > max){
            throw new Exception("Input is too small or too large");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = size; i > 0; i--){
            int a = (int) (count / Math.pow(10, i - 1));
            if(a >= BASE.length()){
                a = BASE.length() - 1;
            }
            sb.append(BASE.charAt(a));
            count = count - (int) (Math.pow(10, i - 1)) * a;
        }
        return sb.toString();
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
//CCA00
//CCCCC
// 高位高进制 低位低进制 一眼看出大小
