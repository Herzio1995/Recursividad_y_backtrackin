
/**
 * Write a description of class Ej16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej16
{
    public String explotar(int n,int b){
        String res;
        if(n <= b){
            res = n + "";
        }else{
            res = explotar(n/b,b);
            res = res +" , "+ explotar(n-(n/b),b);
        }
        return res;
    }
}
