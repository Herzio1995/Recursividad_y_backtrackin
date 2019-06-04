
public class Ej47
{
    public String resolvedor(int nivel) {
        return resolvedor(nivel, "");
    }
    
    private String resolvedor(int nivel, String res) {
        if(nivel == 1) {
            res = "(-.-)";
        } else {
            res = "(-." + resolvedor(nivel - 1, res) + ".-)";
        }
        return res;
    }
}
