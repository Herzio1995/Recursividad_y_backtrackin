
/**
 * Write a description of class Ej23 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej28
{
    public boolean esPrefijo(String cad1, String cad2){
        boolean res;
        if(cad2.equals(sacarPrefijo(cad1,cad2.length() - 1))) res = true;
        else res = false;
        return res;
    }
    private String sacarPrefijo(String cad1,int pos){
        String res;
        if(pos == 0){
            res = cad1.charAt(pos) + "";
        }else{
            res = sacarPrefijo(cad1,pos-1) + cad1.charAt(pos);
        }
        return res;
    }
    
    public boolean esSufijo(String cad1, String cad2){
        boolean res;
        if(cad2.equals(sacarSufijo(cad1,cad1.length()-cad2.length()))) res = true;
        else res = false;
        return res;
    }
    private String sacarSufijo(String cad1,int pos){
        String res;
        if(pos == cad1.length()-1){
            res = cad1.charAt(pos) + "";
        }else{
            res =  cad1.charAt(pos) + sacarSufijo(cad1,pos+1) ;
        }
        return res;
    }
}
