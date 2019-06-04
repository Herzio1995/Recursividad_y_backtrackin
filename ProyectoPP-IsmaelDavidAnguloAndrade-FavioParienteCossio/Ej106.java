public class Ej106
{
    public int resolvedor(int nivel) {
        return resolvedor106(nivel,1); 
    }
    
    private int resolvedor106(int nivel, int aumento) {
        int respuesta;
        if(nivel == 1) {
            respuesta = 6;
        } else {
            respuesta = 6 + aumento + resolvedor106(nivel - 1, aumento + 2);
        }
        return respuesta;
    }
}