public class Ej87 {
    public boolean esCurioso(int n){
        boolean res;
        res = n == factorialSuma(n);
        return res;
    }
    
    private int factorialSuma(int num){
        int res = 0;
        if(num < 10) {
            res = factorial(num, 0);
        } else {
            res = factorial(num % 10, 0) + factorialSuma(num / 10);
        }
        return res;
    }
    
    private int factorial(int n, int res){
        if(n == 1) {
            res = 1;
        } else {
            res = n * factorial(n - 1, res);
        }
        return res;
    }
}