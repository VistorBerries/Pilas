import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {

        // Declaramos la pila como Integer
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("     Preguntas de control");

        // Imprimir valores de pila
        System.out.println("Pila vacía: " + pila);
        
        // Usando el método isEmpty devuelve un valor true o false
        System.out.println("Está vacía? " + pila.isEmpty());
        System.out.println("");
        // Usando el método push agregamos valores
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        System.out.println("");
        // Con este ciclo recorremos la pila para ver los valores
        System.out.print("Muestra los valores de pila: ");
        for (Integer pilita : pila) {
            System.out.print(pilita + " ");
        }
        System.out.println();

        System.out.println("     Preguntas de control");
        // Repetimos la consulta para comparar
        // Imprimir valores de pila
        System.out.print("Pila: ");
        for (Integer pilita : pila) {
            System.out.print(pilita + " ");
        }
        System.out.println();

        // Usando el método isEmpty para verificar si está vacía
        System.out.println("Pila está vacía? " + pila.isEmpty());
        System.out.println("");

        // Usando el método pop eliminamos el último registro que entró
        pila.pop();

        // Buscar el registro 3
        System.out.println("Está el 3? " + pila.contains(3));
        System.out.println("");
        
        // Usando el método peek mostramos el último registro
        System.out.println("El último registro es: " + pila.peek());
    }
}
