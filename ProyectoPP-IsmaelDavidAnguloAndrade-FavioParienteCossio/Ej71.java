
public class Ej71
{
    public String reducido(String cad){
        String res;
        res = reducido(cad,0);
        return res;
    }
    private String reducido(String cad, int pos){
        String res;
        if(cad.length() - 1 <= pos){
            res = "";
        }else{
            if(cad.charAt(pos) == cad.charAt(pos + 1)){
                String letra = cad.charAt(pos) + "";
                res = letra + letra + reducido(cad,pos + 2);
            }else{
                res = reducido(cad,pos + 1);
            }
        }
        return res;
    } 
}
