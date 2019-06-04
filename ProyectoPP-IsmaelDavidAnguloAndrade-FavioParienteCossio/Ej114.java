
/**
 * Write a description of class Ej112 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej114
{
    public Ej114(){
    }
    public int estrellasEstrelladas(int nivel){
        int res;
        if(nivel == 1){
            res = 10;
        }else{
            res = (estrellasEstrelladas(nivel - 1) * 4) + 15;
        }
        return res;
    }
}
