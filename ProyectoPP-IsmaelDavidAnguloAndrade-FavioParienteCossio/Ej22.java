
public class Ej22
{
    public String piramide1(int n){
        String res;
        if(n == 0){
            res ="";
        }else{
            res = piramide1(n-1) + (((int)Math.pow(10,n-1))*n + piramide(n-1)) + "\n" ;
        }
        return res;
    }
    private int piramide(int n){
        int res;
        if(n == 0){
            res = 0;
        }else{
            res = piramide(n-1) + ((int)Math.pow(10,n-1)*n);
        }
        return res;
    }
}
