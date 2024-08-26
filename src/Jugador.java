    import java.util.List;
    import java.util.ArrayList;
    import java.util.Random;

    public class Jugador {
    private String nombre;
    private float saldo;
    public int punteo;
    private List<Cartas> Cartas;
    private Cartas cartaActual;

    public Jugador(String nombre, float saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.punteo = 0;
        this.Cartas = new ArrayList<>();
        this.cartaActual = null;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Cartas> getCartas() {
        return Cartas;
    }
    public float getSaldo() {
        return saldo;
    }
    public int getPunteo() {
        return punteo;
    }
    public Cartas getCartaActual() {
        return cartaActual;
    }
    public void sumarPunto (){
        this.punteo ++;
    }
    public void borarCartas(){
        Cartas.clear();
    }
    public void agregarCarta(Cartas carta){
        Cartas.add(carta);
    }
    public Cartas jugarCarta(){
        Random random = new Random();
        int indiceCarta = random.nextInt(Cartas.size()); // Seleccionamos una carta al azar
        cartaActual = Cartas.remove(indiceCarta);
        return cartaActual;
    }
    }
