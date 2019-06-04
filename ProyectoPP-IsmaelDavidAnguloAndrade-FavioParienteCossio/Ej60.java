
/**
 * Write a description of class Ej60 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej60
{
    private String PrimeraMitad;
    private String SegundaMitad;
    public Ej60(){
        this.PrimeraMitad = "";
        this.SegundaMitad = "";
    }
    public boolean esSiames(int num){
        boolean res;
        partir(num +"",0);
        if(this.PrimeraMitad.equals(this.SegundaMitad)){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    private void partir (String num, int pos){
        if(pos != num.length()){
            if(pos < num.length()/2){
                this.PrimeraMitad = PrimeraMitad + num.charAt(pos);
            }else{
                this.SegundaMitad = SegundaMitad + num.charAt(pos);
            }
            partir(num,pos+1);
        }
    }
}
