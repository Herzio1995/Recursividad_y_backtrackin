import java.util.ArrayList;

public class Ej104
{
    public ArrayList<String> resolver(String texto, int lon) {
        String sinComas = texto.replaceAll(",", " ");
        String sinPuntoyComa = sinComas.replaceAll(";", " ");
        String[] reducido = sinPuntoyComa.split(" ");
        ArrayList<String> vacio = new ArrayList<>();
        return resolver(reducido, lon, 0, vacio);
    }
    
    private ArrayList<String> resolver(String[] palabras, int lon, int indice, ArrayList<String> res) {
        if(indice > palabras.length - 1) {
        
        } else {
            if((palabras[indice]).length() > lon) {
                res.add(palabras[indice]);
            }
            res = resolver(palabras, lon, indice + 1, res);
        }
        return res;
    }
}
