package ec.edu.epn.git.calculadora;

public class Calculadora {
    private int respuesta;

    public int suma (int a, int b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public int division (int a, int b){
        return a/b;
    }
    public void timeout (int time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getRespuesta(){
        return respuesta;
    }

    public void setRespuesta(int respuesta){
        this.respuesta = respuesta;
    }



}
