package Bridge;//Esta clase es la clase que tiene la abstraccion. Es parte del puente

public abstract class Notificacion {
    protected CanalEnvio canalEnvio; //Armamos la composicion

    public Notificacion(CanalEnvio canalEnvio){
        this.canalEnvio = canalEnvio;
    }

    public abstract void enviar(String texto);



}
