
public class Ej13
{
    public int sumElementos(int[] array) {
        return sumElementos(array, array.length - 1, 0);
    }
    
    private int sumElementos(int[] array, int indice, int respuesta) {
        if(indice < 0) {
        
        } else {
            if(contarDivisores(array[indice], array[indice] - 1, 1) == 2) {
                respuesta += array[indice];
                respuesta = sumElementos(array ,indice - 1, respuesta);
            } else {
                respuesta = sumElementos(array ,indice - 1, respuesta);
            }
        }
        return respuesta;
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