public class Posisi {
    public int row;
    public int col;

    public Posisi(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
