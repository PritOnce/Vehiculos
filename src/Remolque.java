public class Remolque {
    private int pesoRemolque;

    public Remolque() {
    }

    public Remolque(int pesoRemolque) {
        this.pesoRemolque = pesoRemolque;
    }

    @Override
    public String toString() {
        return "Remolque{" +
                "pesoRemolque=" + pesoRemolque +
                '}';
    }
}
