
/**
 * Write a description of class Ej43 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej43
{
    public Ej43(){
    }
    public int numPatronRepetido(String cad, String pat){
        int res = numPatronRepetido(cad,pat,0);
        return res;
    }
    private int numPatronRepetido(String cad, String pat, int pos){
        int res;
        if(pos > cad.length() - pat.length() + 1){
            res = 0;
        }else{
            char pCad = cad.charAt(pos);
            char pPat = pat.charAt(0);
            Par nuevo;
            if(pCad == pPat){
                nuevo = agarrar(cad,pat.charAt(pat.length()-1),pos + pat.length() - 1,pat, 0,pos);
                if(nuevo.getCadRed().equals(pat)){
                    res = 1 + numPatronRepetido(cad,pat,pos + nuevo.tamañoCad()-1);
                }else{
                    res = numPatronRepetido(cad,pat,pos + 1);
                }
            }else{
                res = numPatronRepetido(cad,pat,pos + 1);
            }
        } 
        return res;
    }
    private Par agarrar(String cad, char ultCPat,int pos,String pat, int var, int posActPrim){
        Par res = new Par();
        if(posActPrim <= cad.length() - pat.length()+1){
            if(cad.charAt(pos) == ultCPat){
                res.setCads(cad,pos - pat.length()+1-var,pos);
            }else{
                res = agarrar(cad,ultCPat,pos+1,pat,var+1,pos);    
            }
        }
        return res;
    }
}
