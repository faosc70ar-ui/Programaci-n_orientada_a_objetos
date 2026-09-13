package ejercicio_8;

public class Main {
    public static void main(String[] args) {

            var estudiante1 = new Estudiante("lucas");
            estudiante1.agregarNota(7.6);
            estudiante1.agregarNota(6.6);
            estudiante1.agregarNota(9.6);

            System.out.println(String.format("alumno: %s", estudiante1.getNombre()));
            System.out.println(String.format("promedio: %.2f", estudiante1.calcularPromedio()));
            System.out.println(String.format("aprobado: %s", estudiante1.haAprobado()));

        }
}

