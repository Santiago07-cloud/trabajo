public class NumerosPrimos {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Esta es la lista de números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nEstos son los números primos:");
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }


    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false; 
        }
        for (int i = 2; i <= numero / 2; i++) {  
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
