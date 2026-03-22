package ejercicios;

public class Caja<T> {
    private String color;
    private T objeto;

    public Caja(String color, T objeto) {
        this.color = color;
        this.objeto = objeto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return objeto.toString();
    }
}