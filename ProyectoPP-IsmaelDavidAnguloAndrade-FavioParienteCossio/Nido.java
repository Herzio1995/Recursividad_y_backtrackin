
public class Nido
{
    private int x,y, nroHab;
    private char color;
    private boolean rastro;
    public Nido(int x, int y, int nro){
        this.x = x;
        this.y = y;
        this.nroHab = nro;
        color = '*';
        rastro = false;
    }
    public Nido(int x, int y, int nro,char color){
        this.x = x;
        this.y = y;
        this.nroHab = nro;
        this.color = color;
        rastro = false;
    }
    public boolean vacio(){
        return color == '*';
    }
    public boolean marcada(){
        return rastro;
    }
    public boolean viveA(){
        return color == 'A';
    }
    public void marcar(){
        rastro = true;
    }
    public void desmarcar(){
        rastro = false;
    }
    public int getHab(){
        return nroHab;
    }
}
