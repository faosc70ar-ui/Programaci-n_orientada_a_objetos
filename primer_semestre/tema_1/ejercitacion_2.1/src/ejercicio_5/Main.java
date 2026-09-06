package ejercicio_5;

public class Main {
    public static void main(String[] args) {
        var contador =  new Iterador();

        System.out.println(contador.getValor());

        contador.decrementar();
        System.out.println(contador.getValor());

        contador.incrementar();
        System.out.println(contador.getValor());


        var contador2 = new Iterador(34);

        System.out.println(contador2.getValor());

        contador2.decrementar();
        contador2.decrementar();
        System.out.println(contador2.getValor());

        contador2.incrementar();
        System.out.println(contador2.getValor());
    }

}
