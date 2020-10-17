import java.util.Scanner;

public class huawei3{
    // 最大的全1正方形
    // 以矩阵中每一个点作为正方形右下角点来处理，
    // 而以该点为右下角点的最大边长最多比以它的左方、上方和左上方为右下角的正方形边长多1，
    // 所以这时只能取另外三个正方形中最小的正方形边长+1。
    // 用d[i][j]表示以i，j坐标为右下角的正方形最大边。
    // 则有状态转移方程：dp[i][j] = min(dp[i-1][j-1], min(dp[i-1][j], dp[i][j-1])) + 1
    public static int maxSquare(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int M = matrix.length, N = matrix[0].length, res = 0;
        int[][] d = new int[M][N];
        for(int i = 0; i < M; i++){
            if(matrix[i][0] == 1){
                d[i][0] = 1;
                res = 1;
            }
        }
        for(int i = 0; i < N; i++){
            if(matrix[0][i] == 1){
                d[0][i] = 1;
                res = 1;
            }
        }
        for(int i = 1; i < M; i++){
            for(int j = 1; j < N; j++){
                if(matrix[i][j] == 1){
                    d[i][j] = Math.min(Math.min(d[i - 1][j - 1], d[i - 1][j]), d[i][j - 1]) + 1;
                }
                res = Math.max(res, d[i][j]);
            }
        }
        return res;
    }


    public static void Square(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] d = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                d[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d.length; j++){
                int temp = isjuxing(d, i, j);
                max = Math.max(temp, max);
            }
        }
        System.out.println(max * max);
    }

    public static int isjuxing(int[][] d, int i, int j){
        int max = Integer.MIN_VALUE;
        for(int a = 0; a <= Math.min(d.length - i, d.length - j); a++){
            boolean b = true;
            for(int n = i; n < i + a; n++){
                for(int m = j; m < j + a; m++){
                    if(d[n][m] == 0)
                        b = false;
                }
            }
            if(b){
                max = Math.max(max, a);
            }
        }
        return max;
    }


    public static int re(int[] nums, int value){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == value){
                count++;
            }
        }
        return nums.length - count;
    }

    public static int getKeyCount(String str, String key){
        int count = 0, index = 0;
        while((index = str.indexOf(key, index)) != -1){
            index += key.length();
            count++;
        }
        return count;
    }

}
