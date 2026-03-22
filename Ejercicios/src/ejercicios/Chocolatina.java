package ejercicios;

public class Chocolatina {
    private String marca;

    public Chocolatina(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Chocolatina{marca='" + marca + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Chocolatina)) return false;

        Chocolatina otra = (Chocolatina) obj;
        return this.marca.equals(otra.marca);
    }
}