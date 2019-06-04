
/**
 * Write a description of class Ej66 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej66
{
    public int cantLineas(int nivel){
        int res;
        if(nivel == 1){
            res = 6;
        }else{
            res = cantLineas(nivel - 1) +(17* (nivel-1))+(6 + (nivel-1));
        }
        return res;
    }
}
