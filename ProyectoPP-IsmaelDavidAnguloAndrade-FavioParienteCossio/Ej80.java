
/**
 * Write a description of class Pajarita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej80
{
    private Nido[][] region;
    private int m,n;
    public Nido buscarNido(int x, int y){
        Nido nido;
        if(x == m){
            nido = new Nido(-1,-1,0);
        }else{
            if(y == n){
                nido = buscarNido(x+1,0);
            }else{
                if(region[x][y].vacio()){
                    nido = new Nido(x,y,buscarMax(x,y));
                    nido = max(nido, buscarNido(x,y+1));
                }else{
                    nido=buscarNido(x,y+1);
                }
            }
        }
        return nido;
    }
    private int buscarMax(int x, int y){
        int numero;
        if(!valida(x,y)){ numero = 0;}
        else if(region[x][y].marcada()){ numero = 0;}
        else if(region[x][y].vacio() && region[x][y].viveA()){ numero = 0;}
        else{
            region[x][y].marcar();
            numero = buscarMax(x-1,y)+buscarMax(x,y+1)+buscarMax(x+1,y)+buscarMax(x,y-1)+region[x][y].getHab();
            region[x][y].desmarcar();
        }
        return numero;
    }
    private Nido max(Nido n1, Nido n2){
        Nido nido;
        if(n1.getHab()< n2.getHab())
            nido = n2;
        return n1;
    }
    private boolean valida(int x, int y){
        boolean res = false;
        if(x >= 0 && x < region.length){
            if(y >= 0 && y < region.length){
                res = true;
            }
        }
        return res;
    }
}
