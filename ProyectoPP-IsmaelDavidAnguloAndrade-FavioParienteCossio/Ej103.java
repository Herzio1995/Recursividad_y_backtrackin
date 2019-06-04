
/**
 * Write a description of class Ej103 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej103
{
    public double flor(int nivel){
        double res;
        if(nivel == 1){
            res = 10.28;
        }else{
            res = lado(nivel)*2*(2 + 3.1415) + flor(nivel - 1);
        }
        return res;
    }
    private double lado(int nivel){
        double res;
        if(nivel == 1){
            res = 1.0;
        }else{
            res = lado(nivel-1)*1.5;
        }
        return res;
    }
}
