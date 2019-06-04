
public class Ej88
{
    
    public void resolver()
    {
        String[] nombres = {"luis","orian","tom","darla"};
        String a = "orian";
        String b ="darla";
        String[] res = new String[nombres.length];
        boolean[] flags = new boolean[nombres.length];        
        resolver(nombres, res, a, b, 0, flags, 0);
    }
    
    private void resolver(String[] nombres, String[] res, String a, String b,
                           int pos, boolean[] flags, int i)
    {
        if(pos == nombres.length){
            imprimir(res);
        }
        else{
            if( i < nombres.length)
            {
                if(flags[i] == false){
                    String palabra = nombres[i];
                    flags[i] = true;
                    res[pos] = palabra;
                    
                    if(!juntos(a,b,res,pos)){
                        resolver(nombres, res, a, b, pos + 1, flags, 0);
                    }
                        
                    flags[i] = false;
                    res[pos] = "";
                }           
                resolver(nombres, res, a, b, pos, flags, i + 1);
            }
           
        }
    } 
   
    private boolean juntos(String a, String b, String[] res, int actual){
      boolean ans = false;
      if(actual > 0){
          if(res[actual].equals(a) || res[actual].equals(b)){
              if( res[actual - 1].equals(b) || res[actual - 1].equals(a))
                ans=true;
          }
      }
      return ans;
    }
    
    public void imprimir(String[] res)
    {
        for(String w: res)
            System.out.print(w+" ");
        System.out.println();
    }
}
