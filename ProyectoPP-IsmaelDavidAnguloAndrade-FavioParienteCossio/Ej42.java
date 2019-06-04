
public class Ej42
{
    public int resolvedor(String cad, String patron) {
        int i = 0;
        int i2 = patron.length();
        return resolvedor(cad, patron, i, i2, 0);
    }
    
    private int resolvedor(String cad, String patron, int i, int i2, int contador) {
        if(i > (cad.length() - patron.length()) - 1) {
            
        } else {
            String reducida = cad.substring(i, i2);
            if(reducida.equals(patron)) {
                contador++;
                contador = resolvedor(cad, patron, i + 1, i2 + 1, contador);
            } else {
                contador = resolvedor(cad, patron, i + 1, i2 + 1, contador);
            }
        }
        return contador;
    }
}
