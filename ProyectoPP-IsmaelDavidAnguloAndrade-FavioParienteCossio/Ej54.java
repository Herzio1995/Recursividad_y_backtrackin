import java.util.ArrayList;
/**
 * Write a description of class Uj54 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej54
{
     char[] letrasDisponibles = {'s','m','r','t','a','e','i','v','u','r','w','f','g','s','r','y','f','z','e','u','a','t','j'};
     ArrayList<Movimiento> movimientos;
     public Ej54(){
         movimientos = new ArrayList<Movimiento>(); 
     }
     public String saltar(String palabra){
         String res = saltar(palabra, 0, 0);
         return res; 
     }
     private String saltar(String palabra, int pos , int puntoPartida){
         String res;
         if(pos == palabra.length()){
              res = imprimir(0);
         }else{
             Movimiento newMov = buscarAdelante(puntoPartida,palabra.charAt(pos),puntoPartida);
             Movimiento newMov2 = buscarAtras(puntoPartida,palabra.charAt(pos),puntoPartida);
             if(newMov.getDistancia() <= newMov2.getDistancia() && newMov.getPosValida() == true){
                     movimientos.add(newMov);
                     newMov.setSentido("adelante");
                     res = saltar(palabra, pos + 1,newMov.getPosicion());
             }else if(newMov.getDistancia() > newMov2.getDistancia() && newMov2.getPosValida() == true){
                     movimientos.add(newMov2);
                     newMov2.setSentido("atras");
                     res = saltar(palabra, pos + 1,newMov2.getPosicion());
             }else{
                 res = "Imposible";
             }
         }
         return res;
     }
     private String imprimir(int pos){
        String res;
        Movimiento newMov = movimientos.get(pos);
         if(pos == movimientos.size() -1){
            res = newMov.getSaltDir();
        }else{
            res = newMov.getSaltDir()+ imprimir(pos + 1);
        }
        return res;
     }
     private Movimiento buscarAdelante(int pos, char letra, int puntoPartida){
        Movimiento newMov = new Movimiento();
        if(pos == letrasDisponibles.length){
            newMov.setPosValida(false);
            newMov.setDistancia(10000);
        }else{
            if(letrasDisponibles[pos] == letra){
                newMov.setPosicion(pos);
                newMov.setDistancia(pos,puntoPartida);
            }else{
                newMov = buscarAdelante(pos+1,letra,puntoPartida);
            }
        }
        return newMov;
     }
     private Movimiento buscarAtras(int pos, char letra, int puntoPartida){
        Movimiento newMov = new Movimiento();
        if(pos < 0){
            newMov.setPosValida(false);
            newMov.setDistancia(10000);
        }else{
            if(letrasDisponibles[pos] == letra){
                newMov.setPosicion(pos);
                newMov.setDistancia(pos,puntoPartida);
            }else{
                newMov = buscarAtras(pos-1,letra,puntoPartida);
            }
        }
        return newMov;
     }
}
