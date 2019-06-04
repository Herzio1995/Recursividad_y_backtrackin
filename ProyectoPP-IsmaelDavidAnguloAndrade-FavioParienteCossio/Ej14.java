public class Ej14
{
    public boolean saberSiDigitos(int n) {
        return saberSiDigitos(n, true);
    }
    
    private boolean saberSiDigitos(int n, boolean res) {
        if(n < 1) {
        
        } else {
            if((n % 10) % 2 == 0) {
                res = true;
                res = saberSiDigitos(n / 10, res);
            } else {
                res = false;
            }
        }
        return res;
    }
}