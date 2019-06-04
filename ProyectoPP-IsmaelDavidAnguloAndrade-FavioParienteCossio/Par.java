
/**
 * Write a description of class Par here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Par
{
    private String cadRed;
    private String cad;
    public Par(){
        cadRed = "";
        cad = "";
    }
    public String getCadRed(){
        return this.cadRed;
    }
    public String getCad(){
        return this.cad;
    }
    public int getTamCad(){
        return this.cad.length();
    }
    public void setCads(String cad,int desde,int hasta){
        setCad(cad,desde,hasta);
        this.cadRed = cadRed + cad.charAt(desde);
        setCadRed(cad,hasta -1, desde +1);
        this.cadRed = cadRed + cad.charAt(hasta) +"";
    }
    public void setCad(String cad,int desde,int hasta){
        if(desde == hasta){
            this.cad = this.cad + cad.charAt(desde);
        }else{
            this.cad = this.cad + cad.charAt(desde);
            setCad(cad,desde +1,hasta);
        }
    }
    public void setCadRed(String cad, int hasta,int desde){
        if(desde == hasta){
            this.cadRed = this.cadRed + cad.charAt(desde);
        }else{
            if(cad.charAt(desde) == cad.charAt(desde + 1)){
                setCadRed(cad,hasta,desde+1);
            }else{
                this.cadRed = this.cadRed + cad.charAt(desde);
                setCadRed(cad,hasta,desde+1);
            }
        }
    }
    public int tamañoCad(){
        return this.cad.length(); 
    }
}
