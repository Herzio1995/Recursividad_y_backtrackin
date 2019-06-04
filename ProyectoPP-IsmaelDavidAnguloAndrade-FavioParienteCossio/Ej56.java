
public class Ej56
{
    public boolean resolver(int n) {
        return resolver(n, 0, false);
    }
    
    private boolean resolver(int n, int diferencia, boolean res) {
        if(n <= 9) {
            if(n == 0 || n == 7) {
                res = true;
            } else {
                res = false;
            }
        } else {    
            int derecha = n % 10;
            int izquierda = n / 10;
            diferencia = izquierda - (derecha * 2);
            res = resolver(diferencia, 0, res);
        }
        return res;
    }
    
    private boolean esDivisible(int n, boolean res) {
        if(n % 7 == 0) 
            res = true;
        else 
            res = false;
        return res;
    }
}
