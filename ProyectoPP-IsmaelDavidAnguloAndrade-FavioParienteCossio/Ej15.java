
/**
 * Write a description of class Ej15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej15
{
    public boolean esDivisibleA11(int num){
        boolean res;
        if(esDivisibleA11(num,0)%11 == 0) res = true;
        else res = false;
        return res;
    }
    private int esDivisibleA11(int num,int pos){
        int res;
        if(num == 0){
            res = 0;
        }else{
            int n = num % 10;
            if(pos%2 == 0){
                res = n + esDivisibleA11(num/10,pos + 1);
            }else{
                res = -n + esDivisibleA11(num/10,pos + 1);
            }
        }
        return res;
    }
}
