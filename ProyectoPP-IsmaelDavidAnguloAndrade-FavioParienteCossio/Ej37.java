import java.util.ArrayList;

public class Ej37
{
    public void resolvedor37(String[] campana) {
        System.out.println("Campana: ");
        imprimidorCampana(campana, 0);
        System.out.println("Campana modificada: ");
        introducidor(campana, campana[0].length() - 1);
    }
    
    private void introducidor(String[] campana, int indice) {
        if(indice == 0) {
            System.out.println(imprimir(campana, campana.length - 1, indice, 0, ""));
        } else {
            System.out.println(imprimir(campana, campana.length - 1, indice, 0, ""));
            introducidor(campana, indice - 1);
        }
    }
    
    private String imprimir(String[] campana, int tamanio, int indice, int indiceArray, String fila) {
        if(indiceArray == tamanio) {
           fila += campana[indiceArray].charAt(indice); 
        } else {
           fila += campana[indiceArray].charAt(indice);
           fila = imprimir(campana, tamanio, indice, indiceArray + 1, fila);
        }
        return fila;
    }
    
    private void imprimidorCampana(String[] campana, int indice) {
        if(indice > campana.length - 1) {
        
        } else {
            System.out.println(campana[indice]);
            imprimidorCampana(campana, indice + 1);
        }
    }
}
