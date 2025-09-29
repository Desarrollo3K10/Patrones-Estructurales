package Bridge;

public class Sms implements CanalEnvio{
    @Override
    public void Enviar(String texto) {
        System.out.println("SMS: " + texto);
    }
}
