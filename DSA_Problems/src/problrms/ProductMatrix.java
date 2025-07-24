package problrms;

public class ProductMatrix {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2};
        int n = arr.length;
        int[][] product = new int[n][n];
        getProducts1(arr, product, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    public  static void getProducts1(int[] arr, int[][] products, int n){
        for(int i = 0; i < n; i++){
            int pro = 1;
            for(int j = i; j < n; j++){
                pro = pro * arr[j];
                products[i][j] = pro;
            }
        }
    }
    public static void getProducts2(int[] arr, int[][] products, int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int pro = 1;
                for(int k = i; k <= j; k++){
                    pro = pro * arr[k];
                }
                products[i][j] = pro;
            }
        }
    }
}
