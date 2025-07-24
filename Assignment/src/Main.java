public class Main {
    public static void main(String[] args) {
        int n = 5;
        int [][] celeb = new int[n][n];
        int zeroCnt, oneCount = 0, rowIx = -1;
        initCeleb(celeb);
        for(int i = 0; i < n; i++){
            zeroCnt = 0;
            for(int j = 0; j < n; j++){
                if(celeb[i][j] == 0){
                    zeroCnt++;
                }
                else{
                    break;
                }
            }
            if(zeroCnt == n){
                rowIx = i;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(celeb[i][rowIx] == 1){
                oneCount++;
            }
        }
        if(oneCount == n-1){
            System.out.println("V" + rowIx + " is Celebrity.");
        }
    }
    static void initCeleb(int [][] celeb){
        celeb[0][0] = 0;
        celeb[0][1] = 1;
        celeb[0][2] = 1;
        celeb[0][3] = 1;
        celeb[0][4] = 0;
        celeb[1][0] = 0;
        celeb[1][1] = 0;
        celeb[1][2] = 0;
        celeb[1][3] = 0;
        celeb[1][4] = 0;
        celeb[2][0] = 1;
        celeb[2][1] = 1;
        celeb[2][2] = 0;
        celeb[2][3] = 1;
        celeb[2][4] = 1;
        celeb[3][0] = 1;
        celeb[3][1] = 1;
        celeb[3][2] = 0;
        celeb[3][3] = 0;
        celeb[3][4] = 0;
        celeb[4][0] = 0;
        celeb[4][1] = 1;
        celeb[4][2] = 1;
        celeb[4][3] = 0;
        celeb[4][4] = 0;




    }
}