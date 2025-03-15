package ProgramacionOrientadaOBjetos.SistemadegestiondeEmpleados;

public class Empleado {
    private String nombre;
    private double salario_base;

    /*
     * Metodo constructor con variables inicializadas e instanciadas en memoria para su operacion en esta clase.
     */
    public Empleado(String nombre, double salario_base){
        this.nombre = nombre;
        this.salario_base = salario_base;
    }

    public double calcular_salario(){
        return salario_base;
    }

    public void mostrar_info(){
        System.out.println("Nombre: " + this.nombre + "\nSalario base: " + this.salario_base);
    }
    


}
