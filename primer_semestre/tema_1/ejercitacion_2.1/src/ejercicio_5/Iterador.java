package ejercicio_5;

public class Iterador {
    //atributo:
    int valor;

    //contrcutores:
    public Iterador(){
        this.valor = valor;
    }

    public Iterador(int valor){
        this.valor = valor;
    }

    //metodos:
    public void incrementar(){
        valor++;
    }


    public void decrementar(){
        if (valor > 0){
            valor--;
        }
    }


    public int getValor(){
        return valor;
    }

}
