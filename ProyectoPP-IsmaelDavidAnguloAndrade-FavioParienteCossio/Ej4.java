
import java.util.ArrayList;

public class Ej4
{
    public ArrayList<Integer> resolvedor(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        res = resolvedor(n, 2, array);
        return res;
    }
    
    private ArrayList<Integer> resolvedor(int n, int aux, ArrayList<Integer> array) {
        if(n == 1) {
            
        } else {
            if(n % aux == 0) {
                array.add(aux);
                array = resolvedor(n / aux, aux, array);
            } else {
                array = resolvedor(n, aux + 1, array);
            }
        }
        return array; 
    }
}

