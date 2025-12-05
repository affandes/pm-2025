import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GraphNode {
    public static void main(String[] args) {
        
        String[] nodes = new String[]{
            "Pekanbaru", // 0
            "Medan",     // 1
            "Padang",    // 2
            "Aceh",      // 3
            "Bukittinggi",  // 4
            "Pelalawan",    // 5
            "Bangkinang"    // 6
        };
        int[][] edges = new int[][]{
            {0,1,1,0,0,0,0},
            {1,0,1,1,0,0,0},
            {1,1,0,0,1,0,0},
            {0,1,0,0,1,0,0},
            {0,0,1,1,0,1,0},
            {0,0,0,0,1,0,1},
            {0,0,0,0,0,1,0}
        };

        List<Node> hasil = cariJalur(0, 6, edges, nodes);
        System.out.println(hasil);
        
    }

    public static List<Node> cariJalur(int dariIndexKe, int sampaiIndexKe, int[][]edges, String[] nodes) {

        // Apakah dariIndexKe adalah sampaiIndexKe??
        if (dariIndexKe == sampaiIndexKe) {
            return null;
        }

        // Buat daftar antrian dan daftar yang sudah dikunjungi
        List<Node> daftarAntrian = new ArrayList<>();
        List<Node> daftarVisited = new ArrayList<>();

        // Masukkan indeks awal ke dalam antrian
        Node nodeAsal = new Node();
        nodeAsal.data = dariIndexKe;
        nodeAsal.indeksAsal = -1;
        daftarAntrian.add(nodeAsal);

        Node indexYangSedangDiperiksa = daftarAntrian.get(0);

        while (!daftarAntrian.isEmpty() && indexYangSedangDiperiksa.data != sampaiIndexKe) {

            // Hapus yang sudah diperika
            Node indeksVisited = daftarAntrian.remove(0);
            daftarVisited.add(indeksVisited);

            // Cek kota yang berelasi
            List<Integer> kotaBerelasi = kotaYangBerelasiDengan(indexYangSedangDiperiksa.data, edges, nodes);
            System.out.println(indexYangSedangDiperiksa + " = " + kotaBerelasi + " V= " + daftarVisited);

            // Tambahkan antrian
            for (Node node : daftarVisited) {
                kotaBerelasi.remove(new Integer(node.data));
            }
            for (Node node : daftarAntrian) {
                kotaBerelasi.remove(new Integer(node.data));
            }

            for (Integer indeks : kotaBerelasi) {
                Node baru = new Node();
                baru.data = indeks.intValue();
                baru.indeksAsal = indexYangSedangDiperiksa.data;
                daftarAntrian.add(baru);
            }

            indexYangSedangDiperiksa = daftarAntrian.get(0);
            
        }

        List<Node> hasilnya = new ArrayList<>();
        Node backTrack = indexYangSedangDiperiksa;

        while (backTrack.indeksAsal >= 0) {
            hasilnya.add(backTrack);
            for (Node node : daftarVisited) {
                if (node.data == backTrack.indeksAsal) {
                    backTrack = node;
                }
            }
        }

        // Add yang terakhir
        hasilnya.add(backTrack);
        
        return hasilnya;

    }

    public static List<Integer> kotaYangBerelasiDengan(int idx, int[][]edges, String[] listKota) {

        

        if (idx == -1) {
            System.out.println(" Kota tidak ditemukan");
            return null;
        }

        List<Integer> results = new ArrayList<>();

        // Print Node apa saja yang berelasi dengan Pekanbaru
        for (int i = 0; i < edges.length; i++){
            if (edges [idx][i] == 1 ){
                results.add(i);
            }
        }

        return results;
    }

}