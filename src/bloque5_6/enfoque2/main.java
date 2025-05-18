package bloque5_6.enfoque2;

public class main {
    public static void main(String[] args) {
        validarUsuario usuario = new validarUsuario();
        try {
            usuario.validarUsuario("", 12, "sdssds.com");
        } catch (UsuarioException e) {
            System.out.println("Exepcion capturada" + e.getMessage());
        }
    }

}
