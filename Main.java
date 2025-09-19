import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nama1 = "Affan";
        int a = 10;
        LocalDate tanggalLahir1 = LocalDate.of(2004, 12, 10);

        String nama2 = "Rudi";
        LocalDate tanggalLahir2 = LocalDate.of(2004, 12, 15);

        

        System.out.println("Nama          : " + nama1);
        System.out.println("Tanggal Lahir : " + tanggalLahir1);
        System.out.println("Tahun Lahir : " + tanggalLahir1.plusDays(100));
        System.out.println();

        System.out.println("Nama          : " + nama2);
        System.out.println("Tanggal Lahir : " + tanggalLahir2);
        System.out.println("Tahun Lahir : " + tanggalLahir2.getYear());
        System.out.println();
        
    }
}