
public class Ej115
{
    private int[][] tablero = new int[8][8];
    public Ej115(){
    }
    public int movimientosCaballo(int x, int y){
        int res = movimientos(x-1,y-1)-1;
        return res;
    }
    private int movimientos(int fila, int col){
        int res;
        if(!esValido(fila,col)){
            res = 0;
        }else{
            if(tablero[fila][col] == 2){
                res = 0;
            }else{
                res = 1;
                tablero[fila][col] = 2;
                res = res + movimientos(fila-1,col-2);
                res = res + movimientos(fila-1,col+2);
                res = res + movimientos(fila+1,col-2);
                res = res + movimientos(fila+1,col+2);
                res = res + movimientos(fila-2,col-1);
                res = res + movimientos(fila-2,col+1);
                res = res + movimientos(fila+2,col-1);
                res = res + movimientos(fila+2,col+1);
                
            }
            
        }
        return res;
    }
    private boolean esValido(int fila, int col){
        boolean res;
        if(fila >= 0 && fila < tablero.length && col >= 0 && col < tablero.length){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
}
