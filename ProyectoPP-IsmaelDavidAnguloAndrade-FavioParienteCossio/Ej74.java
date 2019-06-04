import java.util.ArrayList;
public class Ej74
{
    private int conjClausura; 
    public Ej74(){
    }
    public void resolver(int conjClausura)
    {
        this.conjClausura = conjClausura;
        int[] conjunto = {3,5,6,2,8,10,23,9};
        ArrayList<Integer> res = new ArrayList<Integer>(); 
        ArrayList<Integer> pos = new ArrayList<Integer>(); 
        boolean[] flags=new boolean[conjunto.length];   
        boolean[] flagsDePrimeros=new boolean[conjunto.length];
        resolver(flagsDePrimeros,conjunto,res,0,flags,0,conjClausura,pos);
    }
    private void resolver(boolean [] flagsDePrimeros,int[] conjunto,ArrayList<Integer> res,int cont,boolean[] flags,int i,int conjClausura,
                                       ArrayList<Integer> pos )
    {
        if(cont < conjunto.length){
            if(cont == conjClausura){
                if(pos.get(0) <  pos.get(1))
                    imprimir(res,0);
            }else{                
                if( i < conjunto.length){ 
                    if(flags[i] == false){             
                        //marca
                        int num = conjunto[i];
                        //ya esta marcado
                        flags[i]=true; 
                        res.add(num);
                        pos.add(i);
                        //explotar   
                        resolver(flagsDePrimeros,conjunto,res,cont+1,flags,0,conjClausura,pos);
                        //desmarcar
                        pos.remove(pos.size()-1);
                        flags[i]=false;
                        res.remove(res.size()-1);
                    }                    
                    resolver(flagsDePrimeros,conjunto,res,cont,flags,i+1,conjClausura,pos);
                }
            }
        }
    } 
    private boolean noRecorrido(int pos, boolean [] flagsDePrimeros){
        return flagsDePrimeros[pos]; 
    }
    public void imprimir(ArrayList<Integer> res, int pos)
    {
        if(pos < res.size()){
            System.out.print(res.get(pos)+" ");
            imprimir(res,pos+1);
        }else{
            System.out.println();
        }
    }
}
