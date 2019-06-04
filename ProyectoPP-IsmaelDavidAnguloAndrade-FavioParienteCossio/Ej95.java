

public class Ej95
{
    public int resolver(int nivel) {
        int respuesta = 0;
        if(nivel == 1) {
            respuesta = 1;
        } else {
            respuesta = (resolver(nivel - 1) * 4) + 1;
        }
        return respuesta;
    }
}
