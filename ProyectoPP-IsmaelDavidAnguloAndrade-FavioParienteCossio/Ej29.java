public class Ej29
{
    public boolean resolvedor(int n) {
        return resolvedor(n, true);
    }
    
    private boolean resolvedor(int n, boolean res) {
        if(n < 1) {
            res = true;
        } else {
            if(!resolvedor(n - 1, res)) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
}