import java.util.Scanner;

interface detail {

    public void nama();

    public void nim();

}

class mahasiswa implements detail {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void nama() {
        System.out.print("-> ");
        String name = scanner.nextLine();
        System.out.println("Nama anda adalah:" + name);
        System.out.println("");
    }

    @Override
    public void nim() {
        System.out.print("-> ");
        String nim = scanner.nextLine();
        System.out.println("NIM anda adalah:" + nim);
    }
}

public class prak12 {

    public static void main(String[] args) {
        mahasiswa m = new mahasiswa();
        m.nama();
        m.nim();
    }
}