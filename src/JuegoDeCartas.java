import java.util.Scanner;

public class JuegoDeCartas {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Ingresar el numero de jugadores
    System.out.println("Ingrse el numero de jugadores");
    int numJugadores = sc.nextInt();
    //Ingresar el numero de partidas
    System.out.println("Ingrese el numero de partidas o rondas");
    int numPartidas = sc.nextInt();
    Juego juego = new Juego(numJugadores, numPartidas);
    juego.jugar();
    }
}
