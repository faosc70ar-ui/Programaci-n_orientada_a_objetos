package ejercicio_6;

public class Libro {
    //atributos:
    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;

    //contructor;
    public Libro(String titulo, String autor, int paginasTotales){
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
    }

    //metodos:

    public void leer(int paginas){
        if(paginaActual + paginas <= paginasTotales){
            paginaActual += paginas;
        }else{
            paginaActual = paginasTotales;
            System.out.println("su lectura ya finalizo");
        }
    }

    public void mostrarProgreso(){

        System.out.println(String.format("libro: %s", titulo));
        System.out.println(String.format("autor: %s", autor));
        System.out.println(String.format("pagina actual: %d/%d", paginaActual, paginasTotales));
        System.out.println(String.format("progreso de lectura del libro: %.2f", (double)paginaActual / paginasTotales * 100));

    }




}
