package problrms;

public class Fun {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(5 ));
    }
    public static int sumOfDivisors(int n) {
        return fun(n, 1);
    }
    public static int fun(int n, int i){
        if(n < i){
            return 0;
        }
        int sum = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0){
                sum += j;
            }
        }
        sum += fun(n, i+1);
        return sum;
    }
}
