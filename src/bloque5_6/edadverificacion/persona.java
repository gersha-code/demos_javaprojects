package bloque5_6.edadverificacion;

public class persona {
    
    public void verificarEdad(int edad) throws verificarEdad{
        if (edad < 18) {
            throw new verificarEdad("La edad debe ser mayor o igual a 18");
        }
        System.out.println("Edad valida");
    }

    public static void main(String[] args) {
        persona pers = new persona();
        try {
            pers.verificarEdad(24);
        } catch (verificarEdad e) {
            System.out.println("Exepcion atrapada");
        }
    }
}
