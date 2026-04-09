public abstract class Figura {
    private String color;
    private String nombre;

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}