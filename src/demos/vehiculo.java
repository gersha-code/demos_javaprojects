package demos;
import java.util.Random;
import java.util.Scanner;

class main {
    // Colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String NARANJA = "\u001B[38;5;208m";

    private static Scanner scanner = new Scanner(System.in);

    private static char seleccion = ' ';

    /*
     * Escobar Meza
     * Cervantes Rico
     * Fernandez Landeros
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        agencia vehichulos = new agencia(10);
        while (seleccion != '5') {
            System.out.println(
                    "1. Consultar vehiculos rentados\n2. Consultar ingresos generados\n3. Rentar vehiculo\n4. Devolver vehiculo\n5. Terminar programa");
            System.out.println("Introduce una opcion: ");
            seleccion = scanner.next().charAt(0);
            switch (seleccion) {
                case '1':
                    for (int index = 0; index < vehichulos.getGarage().length; index++) {
                        if (vehichulos.getGarage()[index].getArrendatario() == null) {
                            System.out.println("[Costo: $" + vehichulos.getGarage()[index].getCostoDiario() + "] "+VERDE + "[DISPONIBLE] " + RESET+ vehichulos.getGarage()[index].getClass().getSimpleName().toUpperCase()
                                    + " | " + vehichulos.getGarage()[index]);

                        } else {
                            System.out.println("[Costo: $" + vehichulos.getGarage()[index].getCostoDiario() + "] " + NARANJA +"[RENTADO] " + RESET + vehichulos.getGarage()[index].getClass().getSimpleName().toUpperCase()+ " | " + vehichulos.getGarage()[index]);
                        }
                    }
                    break;
                case '2':
                    System.out.println("DINERO EN LA CAJA:" + NARANJA  +"[$" + vehichulos.getIngresos() + "]" + RESET);
                    break;
                case '3':
                    for (int index = 0; index < vehichulos.getGarage().length; index++) {
                        if (vehichulos.getGarage()[index].getArrendatario() == null) {
                            System.out.println("DISPONIBLE: " + vehichulos.getGarage()[index]);
                        }
                    }
                    System.out.println("INGRESA VEHICULO A RENTAR: ");
                    scanner.nextLine();
                    String comparar = scanner.nextLine();
                    for (int i = 0; i < vehichulos.getGarage().length; i++) {
                        if (vehichulos.getGarage()[i].getPlaca().equalsIgnoreCase(comparar) && vehichulos.getGarage()[i].getArrendatario() == null) {
                            vehichulos.ingresosTotales += vehichulos.getGarage()[i].rentar();
                            break;
                        } else {
                            if (i == vehichulos.getGarage().length) {
                                System.out.println("Vehiculo no encontrado o no esta rentado");
                            }
                        }

                     
                    }
                    break;          
                case '4':            
                    devolverVehiculo(vehichulos);
                    break;
                case '5':
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println(ROJO + "Opcion no valida." + RESET);
                    break;
            }
        }

    }

    public static void devolverVehiculo(agencia vehichulos) {
        System.out.println("Ingrese la placa del vehiculo que desea regresar");
        String placa = scanner.next();
        
        for (int j = 0; j < vehichulos.getGarage().length; j++) {
            if (vehichulos.getGarage()[j].getPlaca().equalsIgnoreCase(placa) && vehichulos.getGarage()[j].getArrendatario()!=null) {
                vehichulos.getGarage()[j].setArrendatario(null);
                System.out.println("Vehiculo devuelto con exito");
                vehichulos.setIngresosTotales(vehichulos.getGarage()[j].devolver());
                break;
            }
            if( j == vehichulos.getGarage().length && vehichulos.getGarage()[j].getArrendatario()==null){
                System.out.println("Ese vehiculo no está rentado o no existe.");
            }
           
        }
    }

}
abstract class vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String arrendatario;
    private int costoDiario;
    public static Random random = new Random();

    public vehiculo(int valor1, int valor2){
        this.placa = randomPlaca();
        this.marca = randomMarca();
        this.modelo = randomModelo();
        this.arrendatario = null;
        this.costoDiario = random.nextInt(valor1, valor2);
    }

    abstract double rentar();
    abstract int devolver();

    @Override
    public String toString(){
        return this.placa + " | " +this.marca + " | " + this.modelo + " | " + this.arrendatario;
    }

    private String randomPlaca() {
        Random random = new Random();
        String placa = "";
        for (int index = 0; index < 3; index++) {
            char letra = (char) (random.nextInt('A', 'Z'));
            placa += letra;
        }
        placa += "-";

        for (int i = 0; i < 3; i++) {
            int numero = random.nextInt(9);
            placa += numero;
        }
        placa += "-";
        for (int index = 0; index < 3; index++) {
            char letra = (char) (random.nextInt('A', 'Z'));
            placa += letra;
        }
        return placa;
    }

    private String randomMarca() {
        String[] marcas = { "BMW", "FERRARI", "TOYOTA", "FORD", "RENAULT", "VOLVO", "HYUNDAI", "SEAT", "BUGATTI","LAMBORGHINI", "MERCEDES", "PORSCHE", "MASERATI", "TESLA", "JAGUAR" };
        return marcas[random.nextInt(0, marcas.length)];
    }
    private String randomModelo() {
        String[] modelos = { "SERIE 3", "SERIE X5", " COROLLA", "SUPRA" + "MUSTANG", "XC760", "IBIZA", "S90", "DIVO" };
        return modelos[random.nextInt(0, modelos.length)];
    }


    public String getArrendatario(){
        return this.arrendatario;
    }
    public int getCostoDiario(){
        return this.costoDiario;
    }

    public void setArrendatario(String arrendatario){
        this.arrendatario = arrendatario;
    }
    public String getPlaca(){
        return this.placa;
    }
    
}

class auto extends vehiculo {
    // Colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String NARANJA = "\u001B[38;5;208m";

    private int kilometraje;
    private String color;
    static Scanner scanner = new Scanner(System.in);

    public auto() {
        super(900, 2000);
        this.kilometraje = random.nextInt(1000);
        this.color = randomColor();

    }

    @Override
    public double rentar() {
        System.out.println("Arrendatario: ");
        String arrendatario = scanner.nextLine();
        setArrendatario(arrendatario);

        boolean validez = false;
        String desicion;
        int dias = 0;

        while (!validez) {
            System.out.println("Días que será rentado el auto:");
            desicion = scanner.nextLine();

            if (desicion.matches("^[1-9][0-9]*$")) { // Asegura que sea un número positivo
                dias = Integer.parseInt(desicion);
                validez = true;
            } else {
                System.out.println("Cantidad no válida. Introduzca un número entero positivo.");
            }
        }

        double importe = dias * getCostoDiario();
        System.out.println(VERDE + "Auto rentado con éxito" + RESET);
        return importe;
    }

    @Override
    public int devolver() {
        System.out.println(NARANJA + "$500 de mantenimiento" + RESET);
        return -500;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.color + " | " + this.kilometraje + "km";
    }

    private String randomColor() {
        String colores[] = { "ROJO", "AZUL", "VERDE", "VIOLETA", "BLANCO" };
        return colores[random.nextInt(colores.length)];
    }

}

class autobus extends vehiculo {
        // Colores de texto
        public static final String RESET = "\u001B[0m";
        public static final String ROJO = "\u001B[31m";
        public static final String VERDE = "\u001B[32m";
        public static final String AMARILLO = "\u001B[33m";
        public static final String AZUL = "\u001B[34m";
        public static final String NARANJA = "\u001B[38;5;208m";
    
    private int cantidadPasajeros;
    Scanner scanner = new Scanner(System.in);

    public autobus() {
        super(2500, 4500);
        this.cantidadPasajeros = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Pasajeros:  " + this.cantidadPasajeros;
    }

    @Override
    public double rentar() {
        int importe = 0;
        System.out.println("Arrendatario: ");

        String arrendatario = scanner.nextLine();
        setArrendatario(arrendatario);
        boolean validez = false;
        String desicion, desicion2;
        int dias = 0;
        while (validez == false) {
            System.out.println("Cantidad de pasajeros: ");
            desicion = scanner.nextLine();
            System.out.println("Dias que será rentado el autobus");
            desicion2 = scanner.nextLine();
            if (desicion.matches("[0-9]+") && desicion2.matches("[0-9]+")) {
                this.cantidadPasajeros = Integer.valueOf(desicion);
                dias = Integer.valueOf(desicion2);
                validez = true;
            } else {
                System.out.println(ROJO + "Cantidad no válida." + RESET);
            }
        }

        if (this.cantidadPasajeros > 30) {
            importe = dias * getCostoDiario() + (50 * (this.cantidadPasajeros - 30));
            System.out.println(VERDE + "Autobús rentado con exito (costo extra)" + RESET);
            return importe;
        } else {
            importe = dias * getCostoDiario();
            System.out.println(VERDE + "Autobús rentado con exito" + RESET);
            return importe;
        }
    }

    @Override
    public int devolver() {
        if (this.cantidadPasajeros > 30) {
            System.out.println("Costo de mantenimiento: $750 y $" + (20 * (this.cantidadPasajeros - 30))
                    + " fueron devueltos a los pasajeros.");
            this.cantidadPasajeros = 0;
            return -750 - (20 * (this.cantidadPasajeros - 30));
        }
        this.cantidadPasajeros = 0;
        System.out.println("Costo de mantenimiento: $750");
        return -750;
    }
}

class bicicleta extends vehiculo {
    // Colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String NARANJA = "\u001B[38;5;208m";

    Scanner scanner = new Scanner(System.in);

    public bicicleta() {
        super(350, 700);
    }

    @Override
    public double rentar() {
        System.out.println("Arrendatario: ");
        String arrendatario = scanner.nextLine();
        setArrendatario(arrendatario);
        boolean validez = false;
        String desicion;
        int dias = 0;
        while (validez == false) {
            System.out.println("Dias que será rentado la bicicleta");
            desicion = scanner.nextLine();
            if (desicion.matches("[0-9]+")) {
                dias = Integer.valueOf(desicion);
                validez = true;
            } else {
                System.out.println("Cantidad no válida.");
            }
        }
        double importe = dias * getCostoDiario();
        System.out.println(VERDE + "Bicicleta rentada con exito" + RESET);
        return importe;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int devolver() {
        System.out.println("Se descontaron $60 de mantenimiento.");
        return -60;
    }
}


class agencia {

    private Random random = new Random();
    public double ingresosTotales;
    private vehiculo garage[];

    public agencia(int cantidadVehiculos) {
        this.ingresosTotales = 0;
        this.garage = new vehiculo[cantidadVehiculos];
        fabricaVehiculos();
    }

    public vehiculo[] getGarage() {
        return garage;
    }

    public double getIngresos() {
        return this.ingresosTotales;
    }

    private void fabricaVehiculos() {
        for (int i = 0; i < garage.length; i++) {
            switch (random.nextInt(1, 4)) {
                case 1:
                    auto autoObjeto = new auto();
                    garage[i] = autoObjeto;
                    break;
                case 2:
                    autobus autobusObjeto = new autobus();
                    garage[i] = autobusObjeto;
                    break;
                case 3:
                    bicicleta bicicletaObjeto = new bicicleta();
                    garage[i] = bicicletaObjeto;
                    break;
                default:
                    break;

            }
        }
    }

    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales += ingresosTotales;
    }
}



