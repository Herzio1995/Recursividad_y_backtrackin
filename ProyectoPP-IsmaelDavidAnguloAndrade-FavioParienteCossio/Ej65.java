
public class Ej65
{
    public void resolvedor(int n) {
        String s = getString(n, (n * (n - 1) - 1), 0, "");
        int suma = getSuma(n, (n * (n - 1) - 1), 0);
        System.out.println("Si N" + n + " el cubo se resuelve con: " + s + "= " + suma);
    }
    
    private int getSuma(int n, int numero, int contador) {
        if(contador > n - 1) {
            numero += 1;
        } else {
            numero = numero + 2 + getSuma(n, numero, contador + 1);
        }
        return numero;
    }
    
    private String getString(int n, int numero, int contador, String res) {
        if(contador > n) {
        
        } else if(contador == n) {
            res = res.substring(0, res.length() - 2);
            res = getString(n, numero, contador + 1, res);
        } else {
            numero += 2;
            res += numero + " + ";
            res = getString(n, numero, contador + 1, res);
        }
        return res;
    }   
}
