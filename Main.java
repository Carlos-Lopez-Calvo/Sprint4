import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numalumno;
        var alumno = new String[6];
        int puntos = 0;
        boolean noentero = true;

        Scanner alumnonum = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce un número entero entre 1 y 499: ");
            if (alumnonum.hasNextInt()) {
                numalumno = alumnonum.nextInt();

                if (numalumno >= 1 && numalumno <= 499) {
                    System.out.println("Número válido: " + numalumno);
                    break; // Sale del bucle si el número es válido
                } else {
                    System.out.println("El número debe estar entre 1 y 499.");
                }
            } else {
                System.out.println("Por favor, introduce un número entero.");
                alumnonum.next(); // Limpiar el buffer del scanner
            }
        }


        Scanner hermano = new Scanner(System.in);
        System.out.println("Tiene un hermano matriculad?: Si o No");
        alumno[0] = hermano.nextLine();
        Scanner poblacion = new Scanner(System.in);
        System.out.println("Esta en la misma poblacion? Si o No");
        alumno[1] = poblacion.nextLine();
        Scanner padres = new Scanner(System.in);
        System.out.println("Tus padres trabajan en la misma poblacion? Si o No");
        alumno[2] = padres.nextLine();
        Scanner discapacidad = new Scanner(System.in);
        System.out.println("Tienes una discapacidad mayor al 33% o una enfermedad cronica? Si o No");
        alumno[3] = discapacidad.nextLine();
        Scanner familia = new Scanner(System.in);
        System.out.println("Es familia numerosa o monoparental? Si o No");
        alumno[4] = familia.nextLine();
        Scanner escolarizado = new Scanner(System.in);
        System.out.println("Algun miembro de su familia ha estado escolarizado en este centro? Si o No");
        alumno[5] = escolarizado.nextLine();

        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].equalsIgnoreCase("Si")) {
                switch (i) {
                    case 0:
                        puntos += 40;
                        break;
                    case 1:
                        puntos += 30;
                        break;
                    case 2:
                        puntos += 20;
                        break;
                    case 3:
                        puntos += 10;
                        break;
                    case 4:
                        puntos += 15;
                        break;
                    case 5:
                        puntos += 5;
                        break;
                }
            }
        }
        System.out.println("Numero de regsitro: " + numalumno + " Tu puntuacion es: " + puntos);
    }
}