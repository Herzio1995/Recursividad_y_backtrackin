public class Ej73
{
    public int resolvedor(int n) {
        return crearSerie(n, 2, 0);
    }
    
    private int crearSerie(int n, int i, int res) {
        if((contarDigitos(i , 1) == n)) {
            if(esPrimo(i)) {
                res = i;
            } else {
                res = crearSerie(n, i + 1, res);
            }
        } else {
            res = crearSerie(n, i + 1, res);
        }
        return res;
    }
    
    private boolean esPrimo(int n) {
        int divisores = contarDivisores(n, n - 1, 1);
        if(divisores == 2) {
            return true;
        } else {
            return false;
        }
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
    
    public int contarDigitos(int n, int digitos) {
        if(n < 1) {
        
        } else {
            n /= 10;
            digitos += 1;
            digitos = contarDigitos(n, digitos);
        }
        return digitos;
    }
}

