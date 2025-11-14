public class PuzzleTile {
    public int[][] data;

    public PuzzleTile() {
        data = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }


    public PuzzleTile(int[][] init) {
        data = init;
    }

    public static int[][] moveUp() {
        
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                output = output + data[i][j] + " ";
            }
            output = output + "\n";
        }
        return output;
    }
}
