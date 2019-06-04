import java.util.ArrayList;

public class Ej113
{
    public ArrayList<Integer> polidivisibles(int k) {
        ArrayList<Integer> vacia = new ArrayList<>();
        return polidivisibles(k, (int)Math.pow(10, k - 1) + 8, vacia);
    }
    
    private ArrayList<Integer> polidivisibles(int k, int primero, ArrayList<Integer> res) {
        if(primero > Math.pow(10, k) - 1) {
        
        } else {
            int[] vacio = new int[k];
            int[] numeros = numeros(primero, vacio, 0, k - 1); 
            if(esPolidivisible(numeros, 0 , false)) {
                res.add(primero);
            } 
            res = polidivisibles(k, primero + 1, res);
        }
        return res;
    }
    
    private boolean esPolidivisible(int[] numeros, int i, boolean res) {
        if(i > numeros.length - 1) {
        
        } else {
            int numero = numeros[i];
            if(numero % (i + 1) == 0) {
                res = true;
                res = esPolidivisible(numeros, i + 1, res);
            } else {
                res = false;
            }
        }
        return res;
    }
      
    private int contarDigitos(int numero, int digitos) {
        if(numero <= 9) {
            digitos = 1;
        } else {
            digitos = 1 + contarDigitos(numero / 10, digitos);  
        }
        return digitos;
    }
    
    public int[] numeros(int numero, int[] res, int i, int k) {
        if(i > contarDigitos(numero, 0) - 1) {
            
        } else {
            int reducido = numero / (int)Math.pow(10, k);
            res[i] = reducido;
            res = numeros(numero, res, i + 1, k - 1);
        }
        return res;
    }
}
