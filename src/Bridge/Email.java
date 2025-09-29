package Bridge;

public class Email implements CanalEnvio{
    @Override
    public void Enviar(String texto) {
        System.out.println("Email: " + texto);
    }
}
