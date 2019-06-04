
public class Ej92
{
    public boolean sonSociables(int[] conjunto) {
        int[] res = new int[conjunto.length];
        int[] conjuntoSuma = hallarSumas(conjunto, res, 0);  
        return sonSociables(conjunto, conjuntoSuma, 0, false);
    }
    
    private boolean sonSociables(int[] conjunto, int[] conjuntoSuma, int indice, boolean res) {
        if(indice > conjunto.length - 2) {
            if(conjuntoSuma[indice] == conjunto[0]) {
                res = true;
            } 
        } else {    
            if(conjunto[indice + 1] == conjuntoSuma[indice]) {
                res = true;
                res = sonSociables(conjunto, conjuntoSuma, indice + 1, res);
            }
        }
        return res;
    }
    
    public int[] hallarSumas(int[] conjunto, int[] res, int indice) {
        if(indice > conjunto.length - 1) {
        
        } else {
            int numero = conjunto[indice];
            res[indice] = hallarSumaDivisores(numero, numero / 2, 0);
            res = hallarSumas(conjunto, res, indice + 1);
        }
        return res;
    }
    
    public int hallarSumaDivisores(int n, int dis, int res) {
        if(dis < 1) {
        
        } else {
            if(n % dis == 0) {
                res += dis;
            } else {
            
            }
            res = hallarSumaDivisores(n, dis - 1, res);
        }
        return res;
    }
}
