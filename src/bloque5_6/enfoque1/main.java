package bloque5_6.enfoque1;

public class main {
    public static void main(String[] args) {
        validarUsuario usuario = new validarUsuario();
        try{
            usuario.validarUsuario("", 12);
        }catch(nombreInvalido e ) {
            System.out.println("Excepcion capturada" + e.getMessage() + "\n");
        } catch (edadInvalida e) {
            System.out.println("Exepcion capturada" + e.getMessage());
        }
        System.out.println("Programa finalizado");
    }
}
