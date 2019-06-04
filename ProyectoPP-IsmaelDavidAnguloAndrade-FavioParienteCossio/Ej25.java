
public class Ej25
{
    public String resolvedor(String word) {
        return resolvedor(word, "", word.length() - 1);
    }
    
    private String resolvedor(String palabra, String res, int indice) {
        if(indice < 1) {
            res += palabra.charAt(indice);
        } else {
            if(palabra.charAt(indice) != palabra.charAt(indice - 1)) {
                res += palabra.charAt(indice);
            } else {
                
            }
            res = resolvedor(palabra, res, indice - 1);
        }
        return res;
    }
}