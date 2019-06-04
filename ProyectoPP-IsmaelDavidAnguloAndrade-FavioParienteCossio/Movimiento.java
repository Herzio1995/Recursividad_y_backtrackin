
/**
 * Write a description of class Movimiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movimiento
{
    private boolean posValida;
    private int puntoOrigen;
    private int distancia;
    private String sentido;
    private int posicion;
    public Movimiento(){
        posValida = false;
        puntoOrigen = 0;
    }
    public boolean getPosValida(){
        return this.posValida;  
    }
    public void setPosValida(boolean esValida){
        this.posValida = esValida;  
    }
    public int getPuntoOrigen(){
        return this.puntoOrigen;  
    }
    public String getSaltDir(){
        return "("+(this.distancia)+","+(this.sentido)+")";
    }
    public void setPosicion(int newPos){
        this.posicion = newPos;
    }
    public int getPosicion(){
        return this.posicion;
    }
    public int getDistancia(){
        return this.distancia;
    }
    public void setSentido(String newSent){
        this.sentido = newSent;
    }
    public void setDistancia(int posAct,int puntoPartida){
        this.posValida = true;
        if(puntoPartida > posAct){
            this.distancia = setDist(posAct,puntoPartida);
        }else{
            this.distancia = setDist(puntoPartida,posAct);
        }
    }
    private int setDist(int desde,int hasta){
        int res;
        if(desde >= hasta){
            res = 0;
        }else{
            res = setDist(desde + 1,hasta) + 1;
        }
        return res;
    }
    public void setDistancia(int dist){
        this.distancia = dist;
    }
}
