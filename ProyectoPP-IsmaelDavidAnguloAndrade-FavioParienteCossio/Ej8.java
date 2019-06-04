public class Ej8
{
    int[] secuencia1 = {21,13,4,6,7,23,15,1,87};
    public int sumarElementos(){
        int suma;
        suma = sumarElementos(0);
        return suma;
    }
    private int sumarElementos(int pos){
        int suma;
        if(pos == this.secuencia1.length -1 ){
            suma = this.secuencia1[pos];
        }else{
            suma = this.secuencia1[pos] + sumarElementos(pos+1);
        }
        return suma;
    }
    public int minimoElemento(){
        int min;
        min = minimoElemento(secuencia1[0],0);
        return min;
    }
    private int minimoElemento(int min, int pos){
        if(pos != secuencia1.length){
           if(secuencia1[pos] < min){
                min = minimoElemento(secuencia1[pos],pos+1);
            }else{
                min = minimoElemento(min,pos+1);
            }
        }
        return min;
    }
    public int[] ordenar(){
        int[] secuenciaOrdenada = ordenar(this.secuencia1,0);
        return secuenciaOrdenada;
    }
    private int[] ordenar(int[] secuenciaOrdenada, int pos){
        if(pos == secuenciaOrdenada.length - 2){
            secuenciaOrdenada = arrastrarMinimo(secuenciaOrdenada,pos,secuenciaOrdenada.length - 1);
        }else{
            secuenciaOrdenada = arrastrarMinimo(secuenciaOrdenada,pos,secuenciaOrdenada.length - 1);
            secuenciaOrdenada = ordenar(secuenciaOrdenada, pos + 1);
        }
        return secuenciaOrdenada;
    }
    
    private int[] arrastrarMinimo(int[] sec, int inicio, int comparar){
        if(inicio != comparar){
            int x = sec[comparar];    
            int y = sec[comparar - 1];
            if(x < y){
                sec[comparar] = y;
                sec[comparar - 1] = x;
                sec = arrastrarMinimo(sec, inicio,comparar -1);
            }else{
                sec = arrastrarMinimo(sec, inicio,comparar -1);
            }
        }
        return sec;
    }
    
    public String buscar(int x){
        String res;
        if( buscar(x,0) == -1){
            res = "No se encontro ningun elemento " + x; 
        }else{
            res = "El elemento " + x + " esta en la posicion " + buscar(x,0);
        }
        return res;
    }
    private int buscar(int num,int pos){
        int res;
        if(pos == secuencia1.length){
            res = -1;    
        }else{
            if(secuencia1[pos] == num){
                res = pos;
            }else{
                res = buscar(num, pos + 1);
            }
        }
        return res;
    }
    
}
