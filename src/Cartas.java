public class Cartas {
    private String Valor; // calor de la carta (As, 2, 3, 4...)
    private String Simbolo; // Corazones, Espadas, Trebol, Diamantes

    // Metodo Constructor
    // Metodo Utilizado al instancia un objeto a la clase cartas
    public Cartas(String Valor, String Simbolo) {
        this.Valor = Valor;
        this.Simbolo = Simbolo;
    }
    // Obtiene el valor de la carta
    public String getValor() {
        return Valor;
    }
    // Obtiene el simbolo de la carta
    public String getSimbolo() {
        return Simbolo;
    }
    public int getValorNumerico(){
        switch (Valor){
            case "As": // Valor numerico Devuelto para el As
                return 11;
            case"J": // Valor numerico Devuelto para J, Q, K
            case"Q":
            case"K":
                return 10;
            default: // Valor numerico para las cartas que tienen numeros
                return Integer.parseInt(Valor);
        }
    }
    @Override
    public String toString(){
        return Valor + " de " + Simbolo;
    }
}