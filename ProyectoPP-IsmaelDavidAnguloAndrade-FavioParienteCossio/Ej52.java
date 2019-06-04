import java.util.ArrayList;

public class Ej52
{
    public ArrayList<Integer> resolvedor(int x) {
        ArrayList<Integer> res = new ArrayList<>();
        return resolvedor(x, res);
    }

    private ArrayList<Integer> resolvedor(int x, ArrayList<Integer> res) {
        if(x == 1) {
            
        } else {
            res.add(x);
            if(x % 2 == 0) {
                x = x / 2;
            } else {
                x = x * 3 + 1;
            }
            res = resolvedor(x, res);
        }
        return res;
    }
}
