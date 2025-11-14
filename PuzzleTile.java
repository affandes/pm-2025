public class PuzzleTile {
    public int[][] data;

    public PuzzleTile() {
        data = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }


    public PuzzleTile(int[][] init) {
        data = init;
    }

    public int blankX() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] == 9) {
                    return j;
                }
            }
        }
        return -1;
    }

    public int blankY() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] == 9) {
                    return i;
                }
            }
        }
        return -1;
    }

    public PuzzleTile moveUp() {

        int posX = blankX(); // 2
        int posY = blankY(); // 2

        if (posY <= 0) {
            return null;
        }


        int[][] databaru = new int[3][3];
        for (int i = 0; i < databaru.length; i++) {
            for (int j = 0; j < databaru[i].length; j++) {
                databaru[i][j] = data[i][j];
            }
        }

        int temp = databaru [posY-1][posX];
        databaru [posY-1][posX] = databaru [posY][posX];
        databaru [posY][posX] = temp;
        return new PuzzleTile(databaru);
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
