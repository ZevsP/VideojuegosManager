public interface InterfaceVideojuego {
    void iniciarVideojuego(String tipoConsola, String tipoJuego, String nombreJuego, double precioJuego);
    void finalizarVideojuego();
    void installarVideojuego(Videojuego videojuego) throws VideojuegoNoCompatibleException;
    void playVideojuego(Videojuego videojuego);

};



}
