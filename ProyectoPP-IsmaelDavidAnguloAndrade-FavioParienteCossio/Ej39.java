
public class Ej39
{
    public String resolvedor(String palabra) {
        return resolvedor(palabra, palabra.charAt(0) + "1",0,1);
    }
    
    private String resolvedor(String palabra, String reducido, int indice, int contador) {
        if(indice == palabra.length() - 1) {
            
        } else {
            if(palabra.charAt(indice) == palabra.charAt(indice + 1)) {
                contador++;
                reducido = reducido.substring(0,reducido.length() - 1)+contador;
                reducido = resolvedor(palabra, reducido, indice + 1,contador);
            } else {
                contador = 1;
                reducido += palabra.charAt(indice + 1);
                reducido += contador;
                reducido = resolvedor(palabra, reducido, indice + 1,contador);
            }
        }
        return reducido;
    }
}
