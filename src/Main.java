
import java.util.Scanner;

/**
 * BootCamp SENA Agosto 2020
 *
 * @author Carlos Moreno
 * @author Veronica Ortiz
 * @author Danniela Riaño
 */
public class Main {

    public static void main(String[] args) {
        cls();
        Scanner input = new Scanner(System.in);

        /**
         * Definición de tamaños de motor/insumos
         */
        System.out.println("*** Definiendo tamaño de la matriz de Motores/Insumos ***\n");

        // Numeral 1:
        System.out.print("Ingrese la cantidad de motores que fabricará: ");
        int m = input.nextInt();

        //Numeral 2:
        System.out.print("Ingrese la cantidad de insumos para fabricar motores: ");
        int n = input.nextInt();

        /**
         * Declaramos las matrices dadas para el caso
         */
        int matrizMotoresInsumos[][] = new int[m][n];
        double costoInsumos[] = new double[n];
        int pedidosMesMotores[] = new int[m];
        int existenciaInsumos[] = new int[n];

        cls();

        System.out.print("¿Desea que el sistema llene automáticamente los arreglos? "
                + "\n\t1. Si."
                + "\n\t2. No."
                + "\nOpción: ");

        int opcion = input.nextInt();
        boolean continuar = true;

        do {
            switch (opcion) {
                case 1:
                    System.out.println("\nLlenando matrices...");
                    for (int i = 0; i < m; i++) {
                        pedidosMesMotores[i] = (int) (Math.random() * 100);
                        for (int j = 0; j < n; j++) {
                            matrizMotoresInsumos[i][j] = (int) (Math.random() * 100);
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        costoInsumos[i] = Math.random() * 1;
                        existenciaInsumos[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("\nMatrices  y arreglos llenados!");
                    continuar = false;
                    break;
                case 2:
                    // Numeral C: Llenando la matriz manualmente
                    System.out.println("Ingrese los datos de la matriz motor/insumos:"
                            + "\nM: Motor | I#: Insumos numero X");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("M " + (i + 1) + " - I " + (j + 1) + ": ");
                            matrizMotoresInsumos[i][j] = input.nextInt();
                        }
                    }

                    // Numeral D y F: Llenando los arreglos de existencias y costos
                    System.out.println("Ingrese las existencias de los insumos y su costo:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Insumo # " + (i + 1) + ": ");
                        existenciaInsumos[i] = input.nextInt();
                        System.out.print("Costo insumo # " + (i + 1) + ": ");
                        costoInsumos[i] = input.nextDouble();
                    }

                    // Numeral E: Llenando el arreglo de motores por mes
                    System.out.println("Ingrese los pedidos por mes de cada motor:");
                    for (int i = 0; i < m; i++) {
                        System.out.print("Motor # " + (i + 1) + ": ");
                        pedidosMesMotores[i] = input.nextInt();
                    }

                    System.out.println("Matrices  y arreglos llenados!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        } while (continuar);

        /**
         * Imprimiendo matrices y arreglos
         */
        System.out.println("\n*************************************************\n");
        System.out.println("Imprimiendo Matriz Motores Insumos");
        imprimirMatriz(matrizMotoresInsumos);
        pausa();

        System.out.println("\n*************************************************\n");
        System.out.println("Imprimiendo Costo de Insumos");
        imprimirArregloDouble(costoInsumos, "Costo de Insumos");
        pausa();

        System.out.println("\n*************************************************\n");
        System.out.println("Imprimiendo Pedidos Mensuales");
        imprimirArregloInt(pedidosMesMotores, "Pedidos Mensuales");
        pausa();

        System.out.println("\n*************************************************\n");
        System.out.println("Imprimiendo Existencias de Insumos");
        imprimirArregloInt(existenciaInsumos, "Existencias de Insumos");
        pausa();

        /**
         * Numeral G: Obtener e imprimir un arreglo de m elementos, con el costo
         * de producción de cada motor. Suponga que el costo de producción de un
         * motor consiste en sumar el producto de insumos necesarios por el
         * costo unitario de cada insumo.
         */
        System.out.println("*************************************************\n");
        costoProduccionMotor(matrizMotoresInsumos, costoInsumos);
        pausa();

        /**
         * Numeral H: Obtener e imprimir un arreglo de n elementos, con la
         * cantidad de unidades de cada insumo, necesaria para cumplir con los
         * pedidos del mes.
         */
        System.out.println("*************************************************\n");
        int[] arrInsumos = insumosNecesariosPedidosMes(matrizMotoresInsumos, pedidosMesMotores);
        pausa();

        /**
         * Numeral I: Obtener e imprimir un arreglo de n elementos, cuyos datos
         * indiquen cuál es el costo total por concepto de cada insumo para
         * cumplir con los pedidos del mes.
         */
        System.out.println("*************************************************\n");
        double[] arrCostoInsumos = costoInsumosPedidosMes(arrInsumos, costoInsumos);
        pausa();

        /**
         * Numeral J: Obtenga e imprima el costo total (tomando en cuenta todos
         * los insumos) para cumplir con la producción del mes.
         */
        System.out.println("*************************************************\n");
        costoTotalInsumosMes(arrCostoInsumos);
        pausa();

        /**
         * Numeral K: Obtenga e imprima un arreglo de n elementos, con la
         * diferencia de los insumos necesarios para la producción mensual menos
         * los insumos existentes en la planta, con el fin de poder surtir
         * dichos insumos a tiempo.
         */
        System.out.println("*************************************************\n");
        diferenciaInsumosNecesariosExistencia(arrInsumos, existenciaInsumos);
        pausa();
        input.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        String[] ejeVertical = {"M","O","T","O","R","E","S"};
        String ejeHorizontal = "INSUMOS\n\n";
        System.out.println("\t" + ejeHorizontal);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length == 5) {
                System.out.print(ejeVertical[i]+"\t");
            } else if(matriz.length == 6 && i < 5) {
                System.out.print(ejeVertical[i]+"\t");
            } else if(matriz.length >= 7 & i < 7) {
                System.out.print(ejeVertical[i]+"\t");
            } else {
                System.out.print("\t");
            }

            if (matriz.length == 5 || matriz.length >= 7) {
                
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void imprimirArregloInt(int[] arreglo, String titulo) {
        System.out.println(titulo + "\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Elemento # " + (i+1) + ": " +arreglo[i] + "\n");
        }
    }

    public static void imprimirArregloDouble(double[] arreglo, String titulo) {
        System.out.println(titulo + "\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Elemento # " + (i+1) + ": " +arreglo[i] + "\n");
        }
    }

    public static void costoProduccionMotor(int[][] matrizMotoresInsumos, double[] costoInsumos) {
        System.out.println("Calculando el costo de los motores registrados:");
        double costoMotor;
        for (int i = 0; i < matrizMotoresInsumos.length; i++) {
            costoMotor = 0;
            for (int j = 0; j < matrizMotoresInsumos[i].length; j++) {
                costoMotor = costoMotor + (costoInsumos[j] * matrizMotoresInsumos[i][j]);
            }
            System.out.println("El costo del motor # " + (i + 1) + " es: " + costoMotor);
        }

        System.out.println("Saliendo del método...");
    }

    public static int[] insumosNecesariosPedidosMes(int[][] matrizMotoresInsumos, int[] pedidosMesMotores) {
        int[] arrInsumos = new int[matrizMotoresInsumos[0].length];
        System.out.println("Calculando la cantidad necesaria de insumos para los pedidos del mes:");
        for (int i = 0; i < matrizMotoresInsumos.length; i++) {
            for (int j = 0; j < matrizMotoresInsumos[i].length; j++) {
                arrInsumos[j] = arrInsumos[j] + (matrizMotoresInsumos[i][j] * pedidosMesMotores[i]);
            }
        }

        for (int i = 0; i < arrInsumos.length; i++) {
            System.out.println("Insumo # " + (i + 1) + ": " + arrInsumos[i]);
        }
        System.out.println("Saliendo del método...");
        return arrInsumos;
    }

    public static double[] costoInsumosPedidosMes(int[] arrInsumos, double[] costoInsumos) {
        double[] arrCostoInsumos = new double[arrInsumos.length];
        System.out.println("Calculando el costo total por insumos para los pedidos del mes:");
        
        for (int i = 0; i < arrCostoInsumos.length; i++) {
            arrCostoInsumos[i] = (double)arrInsumos[i] * costoInsumos[i];
            System.out.println("Costo total Insumo # " + (i + 1) + ": " + arrCostoInsumos[i]);
        }
        System.out.println("Saliendo del método...");
        return arrCostoInsumos;
    }

    public static double costoTotalInsumosMes(double[] costoInsumos) {
        double totalPedidosMes = 0;
        for (double costo : costoInsumos) {
            totalPedidosMes = totalPedidosMes + costo;
        }

        System.out.println("El total de costo de todos los insumos para los pedidos del mes es:"
                + "\n" + totalPedidosMes);
        System.out.println("Saliendo del método...");
        return totalPedidosMes;
    }
    
    public static void diferenciaInsumosNecesariosExistencia(int[] arrInsumos, int[] existenciaInsumos) {
        int[] arrDiferencias = new int[arrInsumos.length];
        System.out.println("Calculando el material faltante para el pedido del mes:");
        for (int i = 0; i < arrDiferencias.length; i++) {
            arrDiferencias[i] = arrInsumos[i] - existenciaInsumos[i];
            System.out.println("Insumo# "+(i+1) + ": " + arrDiferencias[i]);
        }
        System.out.println("Saliendo del método...");
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pausa() {
        System.out.println("\nPresione una tecla para continuar...");
        new Scanner(System.in).nextLine();
    }
}
