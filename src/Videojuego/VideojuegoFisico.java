import java.util.Objects;

public class VideojuegoFisico extends Videojuego {

    private double envioJuego;

    VideojuegoFisico(String nombreJuego, boolean tipoJuego, double precioJuego, String tipoConsola){
        super(nombreJuego, tipoJuego, precioJuego, tipoConsola);
        this.envioJuego = envioJuego;
    }

    @Override
    public double calcularPrecioFinal(){
        return precioJuego + envioJuego;
    }
}
