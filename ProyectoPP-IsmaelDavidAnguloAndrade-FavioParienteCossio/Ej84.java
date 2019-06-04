
/**
 * Write a description of class Ej84 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej84
{
    private String jugueton = "jugueton";
    public Ej84(){
    }
    public boolean esJugueton(String palabra){
        boolean res;
        res = esJugueton(palabra,0);
        return res;
    }
    private boolean esJugueton( String palabra, int pos){
        boolean res;
        if(pos == jugueton.length()){
            res = true;
        }else{
            if(existeCaracter(palabra,jugueton.charAt(pos),0)){
                res = esJugueton(palabra,pos+1);
            }else{
                res = false;
            }
        }
        return res;
    }
    
    private boolean existeCaracter(String palabra,char letra, int pos){
        boolean res;
        if(palabra.length() == pos){
            res = false;
        }else{
            if(palabra.charAt(pos)== letra){
                res = true;;
            }else{
                res = existeCaracter(palabra,letra,pos+1);
            }
        }
        return res;
    }
}
