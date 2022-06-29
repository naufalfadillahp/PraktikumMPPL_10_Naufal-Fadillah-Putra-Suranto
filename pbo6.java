import javax.swing.JOptionPane;

public class selfinfo {
    String kondisi = "";

    public static void main(String[] args) {
        String nama, ttl, born, living;

        String kondisi = "";
        String kondisi2 = "";
        nama = JOptionPane.showInputDialog("Masukkan nama : ");
        int count = nama.length();

        ttl = JOptionPane.showInputDialog("Masukkan tanggal lahir : ");
        int ttl1 = Integer.parseInt(ttl.substring(0, 2));
        int ttl2 = Integer.parseInt(ttl.substring(3, 5));
        int ttl3 = Integer.parseInt(ttl.substring(6, 10));

        int year = 2022;
        int age = year - ttl3;

        born = JOptionPane.showInputDialog("Masukkan tempat lahir : ");
        if (born.charAt(0) >= 65 && nama.charAt(0) <= 90) {
            kondisi = "True";
        } else {
            kondisi = "False";
        }

        living = JOptionPane.showInputDialog("Masukkan tempat tinggal Sekarang:");
        if (living.charAt(0) >= 65 && nama.charAt(0) <= 90) {
            kondisi = "True";
        } else {
            kondisi = "False";
        }
        if (born.equals(living)) {
            kondisi2 = "True";
        } else {
            kondisi2 = "False";
        }
        JOptionPane.showMessageDialog(null,
                "Nama Terdiri dari " + count + "karakter" + "\n" + "Kota Kelahiran " + born + "\n" + "Kota Sekarang"
                        + living + "\n" + "Penulisan Kota Asal dan Sekarang = " + kondisi + "\n"
                        + "Status Kota Asal dan Sekarang = " + kondisi2 + "\n" + "\n" + "\n" + "Tanggal Lahir = " + ttl1
                        + "\n" + "Bulan Lahir =" + ttl2 + "\n" + "Tahun Lahir = " + ttl3 + "\n" + "Umur = " + age);
    }
}