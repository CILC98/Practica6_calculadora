package ec.edu.epn.git.calculadora;

public class EjecucionCalculadora {
    public static void main(String[] args){
        System.out.println("==Ejecucion de calculadora ==");

        Calculadora c = new Calculadora();
        int suma = c.suma(4,7);
        System.out.println("c.suma(4,7) = "+ suma);

        int resta = c.resta(5,8);
        System.out.println("c.resta(5,8) ="+ resta);
    }
}
