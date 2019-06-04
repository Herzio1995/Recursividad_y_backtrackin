
/**
 * Write a description of class Ej99 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej99
{
    public String parmoniosa(int nivel){
        String res;
        char c  = 92;
        if(nivel == 1){
            res = "**"+ c +"/**";
        }else{
            if(nivel % 2 == 0){
                res = "++"+ c + parmoniosa(nivel - 1) + "/++";
            }else{
                res = "**"+ c + parmoniosa(nivel - 1) + "/**"; 
            }
        }
        return res;
    }
}
