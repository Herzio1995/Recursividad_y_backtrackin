
public class Ej32
{
    public String eliminarOcurrencias(String num){
        String res;
        res = eliminarOcurrencias(num, num.length()-1);
        return res;
    }
    private String eliminarOcurrencias(String num, int pos){
        String res;
        if(pos == 0){
            res = num;
        }else{
            char x = num.charAt(pos);
            num = eliminar(num,x,pos-1);
            res =  eliminarOcurrencias(num, num.length()-1) +x;
        }
        return res;
    }
    private String eliminar(String num,char x, int pos){
        String res;
        if(pos < 0){
            res = "";
        }else{
            if(x == num.charAt(pos)){
                res = eliminar(num,x,pos-1);
            }else{
                res = eliminar(num,x,pos-1) + num.charAt(pos) +"";
            }
        }
        return res;
    }
}
