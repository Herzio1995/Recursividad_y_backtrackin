public class Ej2
{
    public boolean resolvedor(int n) {
        boolean res;
        if(contarDivisores(n, n - 1, 1) == 2) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
    
    private int contarDivisores(int n, int aux, int divisores) {
        if(aux <= 0) {
            return divisores;
        } else {
            if(n % aux == 0) {
                divisores++;
            } else {
            
            }
            return contarDivisores(n, aux - 1, divisores);
        }
    }
}