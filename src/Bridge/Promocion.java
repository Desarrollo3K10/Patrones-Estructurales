package Bridge;

public class Promocion extends Notificacion{

    public Promocion(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void enviar(String texto) {
        canalEnvio.Enviar("PROMOCION: " + texto);
    }
}
