public class Puzzle {
    public static void main(String[] args) {

        PuzzleTile x = new PuzzleTile(new int[][]{{4,5,6},{1,2,3},{9,8,7}});

        System.out.println(x);
        System.out.println("Blank X = " + x.blankX());
        System.out.println("Blank Y = " + x.blankY());

        PuzzleTile y = x.moveUp();
        System.out.println(y);
        System.out.println("Blank X = " + y.blankX());
        System.out.println("Blank Y = " + y.blankY());

        PuzzleTile z = y.moveUp();
        System.out.println(z);
        System.out.println("Blank X = " + z.blankX());
        System.out.println("Blank Y = " + z.blankY());

        PuzzleTile a = z.moveUp();
        System.out.println(a);
        if (a == null) {
            System.out.println("Udah mentok bos");
        }
        //System.out.println("Blank X = " + a.blankX());
        //System.out.println("Blank Y = " + a.blankY());



        System.out.println(x);

    }

}
