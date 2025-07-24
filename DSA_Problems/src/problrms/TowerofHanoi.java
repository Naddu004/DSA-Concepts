package problrms;

public class TowerofHanoi {
    public static void main(String[] args) {
        towerOfHanoi(5, 1, 3, 2);
    }
    public static void towerOfHanoi(int n, int from, int to, int aux){
        if(n == 1){
            System.out.println("Move disk " + n + " from rod " + from + " to rod " + to + ".");
            return;
        }
        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to + ".");
        towerOfHanoi(n-1, aux, to, from);
        return;
    }
}