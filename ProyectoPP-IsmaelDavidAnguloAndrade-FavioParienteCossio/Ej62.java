
public class Ej62
{
    public int resolvedor(int n) {
        String numero = n + "";
        String respuesta = resolvedor(numero, "", 0); 
        int res = Integer.parseInt(respuesta);
        return res;
    }
    
    private String resolvedor(String n, String res, int indice) {
        if(indice > n.length() - 1) {
        
        } else {
            res = agregador(res, n.charAt(indice), 0); 
            res = resolvedor(n, res, indice + 1);
        }
        return res;
    }
    
    private String agregador(String res, char actual, int indice) {
        if(indice > res.length() - 1) {
            res += actual;
        } else {
            if(res.charAt(indice) == actual) {
               
            } else {
                res = agregador(res, actual, indice + 1);
            }
        }
        return res;
    }
}
