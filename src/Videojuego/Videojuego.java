import java.util.*;


public abstract class Videojuego {
    String tipoConsola;
    String nombreJuego;
    String tipoJuego;
    double precioJuego;

    public Videojuego (){
        this.nombreJuego = "Unknow";
        this.precioJuego = 0;
        this.tipoConsola = "Unknow";
        this.tipoJuego = "Unknow";
    }

    public Videojuego (String nombreJuego, boolean tipoJuego, double precioJuego, String tipoConsola){
        this.nombreJuego = nombreJuego;
        this.tipoJuego = tipoJuego;
        this.precioJuego = precioJuego;
        this.tipoConsola = tipoConsola;
    }

    public String getTipoConsola() {
        return tipoConsola;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public double getPrecioJuego() {
        return precioJuego;
    }

    public void setTipoJuego(boolean tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return tipoJuego == that.tipoJuego && Double.compare(precioJuego, that.precioJuego) == 0 && Objects.equals(tipoConsola, that.tipoConsola) && Objects.equals(nombreJuego, that.nombreJuego);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoConsola, nombreJuego, tipoJuego, precioJuego);

    }

    public abstract double calcularPrecioFinal();

}

