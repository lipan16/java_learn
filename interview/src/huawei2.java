import java.util.*;

public class huawei2{
    static int min = Integer.MAX_VALUE;
    static String str = "30-20*5+5/10";

    public void mifeng(){
        int[] xy = {200, 0, 200, 10, 200, 50, 200, 30, 200, 25};
        Queue<Integer> queue = new LinkedList<>();
        help(0, xy, queue);
        System.out.println(min);
    }

    public static void help(int i, int[] xy, Queue<Integer> queue){
        if(i >= xy.length - 2){
            int x = 0, y = 0;
            double tempSum = 0;
            queue.add(xy[i]);
            queue.add(xy[i + 1]);
            while(!queue.isEmpty()){
                int xx = queue.poll();
                int yy = queue.poll();
                System.out.print("(" + xx + "," + yy + "),");

                tempSum += Math.sqrt((xx - x) * (xx - x) + (yy - y) * (yy - y));
                x = xx;
                y = yy;
            }
            tempSum += Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
            System.out.println("sum=" + (int) tempSum);
            if((int) tempSum < min){
                min = (int) tempSum;
                return;
            }
        }else{
            for(int j = i; j < xy.length; j += 2){
                swap(i, j, xy);
                swap(i + 1, j + 1, xy);
                Queue copyQueue = new LinkedList();
                copyQueue.addAll(queue);
                copyQueue.add(xy[i]);
                copyQueue.add(xy[i + 1]);
                help(i + 2, xy, copyQueue);
                swap(i, j, xy);
                swap(i + 1, j + 1, xy);
            }
        }
    }

    public static void swap(int i, int j, int[] xy){
        int temp = xy[i];
        xy[i] = xy[j];
        xy[j] = temp;
    }

    public void AC100(){
        String str = "a:3,b:5,c:2@a:1,b:2";
        Map<Character, Integer> map = new TreeMap<>();
        Map<Character, Integer> user = new TreeMap<>();

        String[] temp = str.split("@");
        for(String item : temp[0].split(",")){
            map.put(item.charAt(0), Integer.parseInt(String.valueOf(item.charAt(2))));
        }
        for(String item : temp[1].split(",")){
            user.put(item.charAt(0), Integer.parseInt(String.valueOf(item.charAt(2))));
        }

        for(Map.Entry<Character, Integer> item : map.entrySet()){
            if(user.containsKey(item.getKey())){
                int n = item.getValue() - user.get(item.getKey());
                if(n >= 0){
                    map.replace(item.getKey(), n);
                }else{
                    map.remove(item.getKey());
                }
            }
        }
        int n = 0;
        for(Map.Entry<Character, Integer> item : map.entrySet()){
            if(item.getValue() != 0){
                if(n != map.size() - 1){
                    System.out.print(item.getKey() + ":" + item.getValue() + ",");
                }else{
                    System.out.print(item.getKey() + ":" + item.getValue());
                }
            }
            n++;
        }
    }

    public void AC101(){
        String s = "aaabbbbbbcccccc";//366
        char[] ch = new char[]{s.charAt(0), s.charAt(0)};
        int[] num = new int[]{1, 1};
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ch[0]){
                num[0]++;
            }else{
                ch[0] = s.charAt(i);
                num[0] = 1;
            }
            if(num[0] > num[1] || (num[0] == num[1] && ch[0] < ch[1])){
                ch[1] = ch[0];
                num[1] = num[0];
            }
        }

        for(int i = 0; i < num[1]; i++){
            System.out.print(ch[1]);
        }
    }

    private static int getMN(int m, int n){
        if(n == 1)
            return m;
        else if(m == 1)
            return 1;
        else
            return getMN(m - 1, n) + getMN(m, n - 1);

    }

    private void f(){
        Stack<Integer> nums = new Stack<>();
        Stack<String> op = new Stack<>();
        String[] temp = str.split("\\(|\\)|-|\\+|/|\\*");
        for(String s : temp){
            if(!s.equals("")){
                nums.push(Integer.parseInt(s));
                System.out.println(s);
            }
        }

        String[] tmp = str.split("[0-9]+");
        for(String s : tmp){
            if(!s.equals("")){
                op.push(s);
                System.out.println(s);
            }
        }

        Stack<Integer> sum = new Stack<>();
        Stack<String> sym = new Stack<>();
        sum.push(nums.pop());
        while(!op.isEmpty()){
            String symble = op.pop();
            if(symble.equals("*")){
                sum.push(nums.pop() * sum.pop());
            }else if(symble.equals("/")){
                sum.push(nums.pop() / sum.pop());
            }else{
                sym.push(symble);
                sum.push(nums.pop());
            }
        }
        while(!sym.isEmpty()){
            int num = sum.pop();
            String symble = sym.pop();
            if(symble.equals("+")){
                sum.push(num + sum.pop());
            }else if(symble.equals("-")){
                sum.push(num - sum.pop());
            }
        }
        System.out.println(sum.pop());
    }


    private void jishupaixu(){
        int[] num = {12, 450, 9001, 5231, 8231, 7231};

        for(int j = 1; j <= 3; j++){//仅排三次

            List<LinkedList<Integer>> linkedLists = new ArrayList<>();
            for(int i = 0; i < 10; i++){
                linkedLists.add(new LinkedList<>());
            }

            for(int i = 0; i < num.length; i++){
                int k = num[i] / (int) Math.pow(10, j - 1) % 10;
                System.out.println(k);
                linkedLists.get(k).add(num[i]);
            }

            for(int i = 0; i < num.length; i++){
                for(int k = 0; k < 10; k++){
                    LinkedList<Integer> temp = linkedLists.get(k);
                    if(temp != null)
                        for(Integer a : temp){
                            num[i] = a;
                            i++;
                        }
                }
            }
            linkedLists.clear();

            for(int z : num){
                System.out.println(z);
            }
        }
    }
}
