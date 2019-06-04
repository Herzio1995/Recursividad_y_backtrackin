import java.util.ArrayList;

public class Ej35
{
    int[][] pascal;
    public Ej35(int nivel){
        pascal = new int[nivel + 2][nivel + 2];
        pascal[1][1] = 1;
    } 
    public ArrayList<Integer> trianguloPascal(){
        ArrayList<Integer> res;
        llenarPascal(1,2);
        res = ultimaLinea(pascal.length-1,0);
        return res;
    }
    private void llenarPascal(int f, int c){
        if(f < pascal.length){
            if(c < pascal.length){
                pascal[f][c] = pascal[f][c-1] + pascal[f-1][c]; 
                llenarPascal(f,c+1);
            }else{
                llenarPascal(f+1,1);
            }                
        }
    }
    private ArrayList<Integer> ultimaLinea(int f, int c){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if( f == 0 ){
            res.add(pascal[f][c]); 
        }else{
            res.add(pascal[f][c]); 
            res.addAll(ultimaLinea(f -1,c + 1));
        }
        return res;
    }
}
