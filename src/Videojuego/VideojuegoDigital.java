import java.util.Objects;

public class VideojuegoDigital extends Videojuego {
    private double descuentoJuego;

    VideojuegoDigital(String nombreJuego, boolean tipoJuego, double precioJuego, String tipoConsola) {
        super(nombreJuego, tipoJuego, precioJuego, tipoConsola);
        this.descuentoJuego = descuentoJuego;
    }

    VideojuegoDigital(double descuentoJuego) {

    }

    public double getDescuentoJuego() {
        return descuentoJuego;
    }

    public void setDescuentoJuego(double descuentoJuego) {
        this.descuentoJuego = descuentoJuego;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VideojuegoDigital that = (VideojuegoDigital) o;
        return Double.compare(descuentoJuego, that.descuentoJuego) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descuentoJuego);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioJuego * descuentoJuego;
    }


}
