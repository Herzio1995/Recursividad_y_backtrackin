
public class Ej75{
    public int esAsc(int numero, int base){
         return esAsc(numero, base, (int)(Math.pow(base,0)), 0, 0);  
    }
      
    private int esAsc(int numero, int base, int numAbuscar, int pot, int res) {
         int potBusc = (int)(Math.log10(numero));
         if(numero > 0)
             if(buscar(numero, numAbuscar, potBusc, false)){
                 res = 1;
                 numero = eliminar(numero, numAbuscar, potBusc); 
                 pot += 1;
                 numAbuscar = (int)(Math.pow(base, pot));
                 res+=esAsc(numero, base, numAbuscar, pot, 0); 
                 if(esAsc(numero, base, numAbuscar, pot,0) == -1){
                     res = -1;
                 }
             }else {
                 res = -1;  
             }
         return res;
    }
    
    private boolean buscar(int numero, int x, int pot, boolean res) {
         int aux = (int)(numero/Math.pow(10,pot));
         if(aux <= numero){
             if(aux == x){
                 if(eliminar(numero, x, (int)(Math.log10(numero))) == 0 && (tam(numero) != tam(x)))
                 res = false; 
                 else
                 res = true;
              } else
              res = buscar(numero, x, pot - 1, res); 
         }
         return res;
    }
      
    private int eliminar(int numero,int x,int pot) {
         int aux = (int)(numero / Math.pow(10, pot));
         if(aux <= numero)
              if(aux == x){
                  int a = (x * (int)(Math.pow(10, pot)));
                  numero -= a;
              } else
              numero = eliminar(numero, x, pot - 1); 
         return numero;
    }
      
    private int tam(int n) {
         return ((int)(Math.log10(n))) + 1;  
    }
}