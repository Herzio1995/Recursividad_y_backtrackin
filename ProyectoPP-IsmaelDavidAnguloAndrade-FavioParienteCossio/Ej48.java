import java.util.ArrayList;
/**
 * Write a description of class Ej48 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej48
{
    private ArrayList<Integer> subcadenas;
    public Ej48(){
        subcadenas = new ArrayList<Integer>();
    }
    public int patronMasLargo(String cad, String pat){
        int numeroDePatrones= numPatronRepetido(cad,pat,0);
        int patronMasLargo = patronMasLargo(subcadenas.size() -1, subcadenas.get(subcadenas.size() -1));
        return patronMasLargo; 
    }
    private int patronMasLargo(int pos, int mayor){
        if(pos >= 0){
            if(subcadenas.get(pos) > mayor){
                mayor = patronMasLargo(pos-1,subcadenas.get(pos));
            }else{
                mayor = patronMasLargo(pos-1,mayor);
            }
        }
        return mayor;
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
                if(cad.charAt(pos + 1) != ultCPat){
                    res.setCads(cad,pos - pat.length()+1-var,pos);
                    subcadenas.add(res.getTamCad());
                }else{
                    res = agarrar(cad,ultCPat,pos+1,pat,var+1,pos);
                }
            }else{
                res = agarrar(cad,ultCPat,pos+1,pat,var+1,pos);    
            }
        }
        return res;
    }
}
