package ejercicio_5;

public class Main {
    public static void main(String[] args) {
        var contador1 =  new Iterador();

        System.out.println(contador1.getValor());

        contador1.decrementar();
        System.out.println(contador1.getValor());

        contador1.incrementar();
        System.out.println(contador1.getValor());


        var contador2 = new Iterador(34);

        System.out.println(contador2.getValor());

        contador2.decrementar();
        contador2.decrementar();
        System.out.println(contador2.getValor());

        contador2.incrementar();
        System.out.println(contador2.getValor());
    }

}
