
/**
 * Write a description of class Ej51 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ej50{
    String[] c;
    public String cadena(String cad){
        String res;
        char[] aux = cad.toCharArray();
        c = new String[aux.length];
        llenar(aux,c,0);
        res = cadena(c,0,false);
        return res;
    }
    
    private String cadena(String[] cad,int i,boolean bandera){
        String res = "";
        if(i==cad.length-1){
            if(cad[i].equals("H")){
                if(bandera==true) res = res +"|";
                res = res +"-";
            }else{
                if(bandera==true) res = res+"|";
                res = res+ "_";
            }
        }else{
            if(cad[i].equals("H")){
                if(bandera==true) res = res+"|";
                res = res+"-";
                bandera = (cad[i+1].equals("L"))?true:false;
            }else if(cad[i].equals("L")){
                if(bandera==true) res = res+"|";
                res = res+"_";
                bandera = (cad[i+1].equals("H"))?true:false;
            }
            if(i<cad.length-1){
                res+=cadena(cad,i+1,bandera); 
            }else if(i==cad.length-1){
                    if(cad[i].equals("H")){
                        if(bandera==true)  res = res+"|";
                        res = res+"-";
                        bandera = (cad[i+1].equals("L"))?true:false;
                    }else{
                        if(bandera==true)  res = res+"|";
                        res = res+"_";
                        bandera = (cad[i+1].equals("H"))?true:false;
                    }
                }
            }
        return res;
    }
    private void llenar(char aux[], String[] c, int pos){
        if(pos<aux.length){
            c[pos] = ""+aux[pos];
            llenar(aux,c,pos+1);
        }
    }
}
    