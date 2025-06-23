public class Factorial{
    public static void main(String[] args) {
        int n = 23;
        long res = 1;
        for(int i=n; i>1;i--){
            res*=i;
        }
        System.out.println(res);
    }
}