public class Node {
    public int data;
    public int indeksAsal; // kalo tidak asa asalnya = -1

    @Override
    public String toString() {
        return "(" + data + ", " + indeksAsal + ")";
    }
}
