
public class Ej120
{
    public int resolver(int n) {
        String secuencia = conseguirSecuencia(n, "", 1);
        return resolver(secuencia, n, 0, 1);
    }
    
    private int resolver(String secuencia, int n, int res, int indice) {
        if(indice > n) {
            
        } else {    
            if(indice <= 9) {
                String num = conseguirSecuencia(indice, "", 1);
                if(divisibleTres(num, false)) {
                    res ++;
                }
                res = resolver(secuencia, n, res, indice + 1);
            } else {
                String num = conseguirSecuencia(indice, "", 1);
                if(divisibleTres(num, false)) {
                    res ++;
                }
                res = resolver(secuencia, n, res, indice + 2);
            }
        }
        return res;
    }
    
    private String conseguirSecuencia(int n, String res, int indice) {
        if(indice > n) {
        
        } else {
            res += indice;
            res = conseguirSecuencia(n, res, indice + 1);
        }
        return res;
    }
    
    private boolean divisibleTres(String numero, boolean res) {
        long num = Long.parseLong(numero);
        if(num % 3 == 0)
            res = true;
        else 
            res = false;
        return res;
    }
}
