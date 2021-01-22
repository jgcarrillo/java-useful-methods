import java.util.Scanner;

public class UsefulMethods {
    public static int sumaImpares(int n) {
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) suma += i;
        }

        return suma;
    }

    public static void mostrarMensaje(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println("Método ejecutándose");
        }
    }

    public static int maximo(int x, int y) {
        int mayor;

        mayor = (x > y) ? x : y;

        return mayor;
    }

    public static float maximo(float x, float y) {
        float mayor;

        mayor = (x > y) ? x : y;

        return mayor;
    }

    public static int minimo(int x, int y) {
        int menor;

        menor = (x < y) ? x : y;

        return menor;
    }

    public static void betweenNandM(int x, int y) {
        for(int i = y; i >= x; i--) {
            System.out.println(i);
        }
    }

    public static int doble(int x) {
        return x * 2;
    }

    public static double longitudAreaCirculo(char tipo, int radio) {
        double areaOLongitud;

        if(tipo == 'a') areaOLongitud = Math.PI * Math.pow(radio, 2);
        else areaOLongitud = 2 * Math.PI * radio;

        return areaOLongitud;
    }

    public static boolean esPar(int x) {
        boolean parOImpar;

        if(x % 2 == 0) parOImpar = true;
        else parOImpar = false;

        return parOImpar;
    }

    public static boolean esMayuscula(char letra) {
        boolean resultado;

        if(letra >= 'A' && letra <= 'Z') resultado = true;
        else resultado = false;

        return resultado;
    }

    public static boolean esLetra(char c) {
        boolean esUnaLetra = false;

        if((c >= 'a' && c <= 'z') || c >= 'A' && c <= 'Z') esUnaLetra = true;

        return esUnaLetra;
    }

    public static char pasarAMinuscula(char c) {
        char letra;

        if(c >= 'A' && c <= 'Z') {
            letra = Character.toLowerCase(c);
        } else {
            letra = c;
        }

        return letra;
    }

    public static boolean esDigito(char caracterDigit) {
        boolean digito = false;

        if(Character.isDigit(caracterDigit)) digito = true;

        return digito;
    }

    public static double distanciaEuclidea(int x1, int x2, int y1, int y2) {
        double resultado = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        return resultado;
    }

    public static int factorial(int numero){
        int factorial = 1;
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }

        return factorial;
    }

    public static void tabla(int numero){
        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " es igual a " + (numero*i));
        }
    }

    public static void divisor(int numero){
        System.out.println("Divisores de " + numero);
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println(i);
            }
        }
    }

    public static int contadorDivisores(int numero){
        int cont = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) cont++;
        }

        return cont;
    }

    public static int sumaDivisores(int numero){
        int suma = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) suma += i;
        }

        return suma;
    }

    public static boolean primo(int numero){
        boolean esPrimo = true;
        for(int i = 2; i <= numero/2; i++){
            if(numero % i == 0){
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }

    public static int entero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        int n = 0;

        boolean esEntero = false;
        while(!esEntero){
            try{
                System.out.println(mensaje);
                cadena = entrada.nextLine();
                n = Integer.parseInt(cadena);

                esEntero = true;
            }catch(NumberFormatException e){
                System.out.println("ERROR, no es un número");
            }

        }

        return n;
    }

    public static float realFloat(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        float numero = 0;

        boolean esReal = false;
        while(esReal == false)
        {
            try{
                System.out.print(mensaje);
                cadena=teclado.nextLine();
                numero = Float.parseFloat(cadena);
                esReal = true;
            }catch(NumberFormatException e)
            {
                System.out.println("Error, no es un número real...");
            }
        }

        return numero;
    }

    public static double realDoble(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        double numero = 0;

        boolean esDouble = false;
        while(esDouble == false)
        {
            try{
                System.out.print(mensaje);
                cadena = teclado.nextLine();
                numero = Double.parseDouble(cadena);
                esDouble = true;
            }catch(NumberFormatException e)
            {
                System.out.println("Error, no es un número entero...");
            }
        }

        return numero;
    }

    public static String cadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.print(mensaje);
        cadena = teclado.nextLine();

        return cadena;
    }

    public static char letra(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.print(mensaje);
        cadena = teclado.nextLine();
        char letra = cadena.charAt(0);

        return letra;
    }

    public static void mostrarVectorInt(int vector[]){
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        System.out.println("");
    }

    public static boolean bisiesto(int year){
        boolean esBisiesto = false;

        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) esBisiesto = true;

        return esBisiesto;
    }

    public static boolean fechaCorrecta(int dia, int mes, int year){
        int diasMeses[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean fechaCorrecta = false;
        if(year >= 1900 && year <= 2999){
            if(mes >= 1 && mes <= 12){
                if(UsefulMethods.bisiesto(mes)) diasMeses[2] = 29;

                if(dia >= 1 && dia <= diasMeses[mes]){
                    fechaCorrecta = true;
                }
            }
        }

        return fechaCorrecta;
    }

    public static int[] introducirEnterosVector(int elementos){
        int vector[] = new int[elementos];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < vector.length; i++){
            System.out.println("Introduce el elemento -> " + (i + 1) + ":");
            vector[i] = entrada.nextInt();
        }

        return vector;
    }

    public static void mostrarVectoresEnteros(int vector[]){
        for(int elemento : vector){
            System.out.print(elemento + "\t");
        }
    }

    public static void rellenarEnteros(int v[], int numero){
        for(int i = 0; i < v.length; i++){
            v[i] = numero;
        }
    }

    public static void rellenarEnteros(int v[], int primero, int ultimo, int numero){
        for(int i = primero; i < ultimo; i++){
            v[i] = numero;
        }
    }
}