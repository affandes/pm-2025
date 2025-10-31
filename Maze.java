import java.util.List;
import java.util.Stack;

public class Maze {
    public static void main(String[] args) {
        char[][] maze = {
            {'S', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'E', '#'},
        };

        Posisi saatIni = new Posisi(0, 1);
        Posisi start = new Posisi(0, 0);
        Posisi finish = new Posisi(8, 5);

        List<Posisi> visitedPath;
        Stack<Posisi> solusi = new Stack<>();

        System.out.println("Posisi saatIni: " + saatIni);
        System.out.println("Posisi start: " + start);
        System.out.println("Posisi finish: " + finish);

    }

    public static List<Posisi> nextSteps(Posisi saatYangDicari) {
        return null;
    }
}
