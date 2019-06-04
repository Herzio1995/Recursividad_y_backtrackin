
/**
 * Write a description of class Ej3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej3
{
   public int contarDigitos(int num){
   int res;
   if(num == 0){
       res = 0;
    }else{
        res = 1 + contarDigitos(num/10);
    }
   return res;
    }
}
