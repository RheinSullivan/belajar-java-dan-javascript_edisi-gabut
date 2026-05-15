
import java.awt.Font; // "Import javax.swing" mengambil alat alat tampilan Java seperti "JFrame", "JPanel", "JLabel", dan "JButton", jadi kita tidak perlu bikin alat tampilan dari nol.

import javax.swing.BorderFactory; // "Import java.awt" mengambil alat bantu tampilan dasar seperti "Font", ukuran, dan pengaturan visual, jadi tampilan bisa diatur lebih enak.
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BelajarJawa extends JFrame { // "BelajarJawa" adalah "Class" yg mewarisi "JFrame", artinya "Class" ini bisa jadi jendela aplikasi Desktop seperti jendela kalkulator atau catatan.

    private JPanel HaloPriaSolo; // "HaloPriaSolo" adalah "Variable" bertipe "JPanel", tugasnya jadi wadah kosong buat nampung tulisan baru setelah tombol diklik.

    public BelajarJawa() { // "BelajarJawa" di sini adalah "Constructor", jadi bagian ini langsung jalan saat jendela aplikasi dibuat.
        setTitle("First Time Learning JawaSkrip - Versi Java"); // "setTitle" mengatur judul jendela, mirip tulisan nama aplikasi di bagian atas jendela.
        setSize(600, 400); // "setSize" mengatur ukuran jendela, angka "600" buat lebar dan angka "400" buat tinggi dalam ukuran Pixel.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // "setDefaultCloseOperation" bikin program benar benar berhenti saat tombol silang jendela ditekan.
        setLocationRelativeTo(null); // "setLocationRelativeTo" dengan nilai "null" bikin jendela muncul di tengah layar, jadi user tidak perlu nyari jendelanya di pojokan.

        JPanel container = new JPanel(); // "container" adalah "Variable" bertipe "JPanel", fungsinya jadi wadah utama buat semua komponen tampilan.
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); // "setLayout" mengatur susunan isi "container", "BoxLayout.Y_AXIS" bikin isi tersusun dari atas ke bawah.
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // "setBorder" memberi jarak kosong di pinggir dalam, mirip kasih margin di kertas supaya tulisan tidak nempel ke tepi.

        JLabel judul = new JLabel("Belajar JawaSkrip Bareng Orang Jawa :V"); // "judul" adalah "Variable" bertipe "JLabel", tugasnya menampilkan teks judul di jendela.
        judul.setFont(new Font("Arial", Font.BOLD, 22)); // "setFont" mengatur bentuk huruf, "Arial" nama hurufnya, "Font.BOLD" bikin tebal, dan "22" ukuran hurufnya.

        JLabel deskripsi = new JLabel( // "deskripsi" adalah "Variable" bertipe "JLabel", dipakai buat teks penjelasan di bawah judul.
                "Saya belajar bahasa pemrograman JawaSkrip bareng orang Jawa asli (rheinsullivan.web.id)" // Teks ini adalah isi dari "JLabel deskripsi", jadi nanti muncul sebagai kalimat penjelasan di jendela.
        ); // Tanda ini nutup pembuatan "JLabel deskripsi".

        JButton tombol = new JButton("Tekan Saya"); // "tombol" adalah "Variable" bertipe "JButton", bentuknya tombol yg bisa diklik user.

        HaloPriaSolo = new JPanel(); // "HaloPriaSolo" dibuat sebagai "JPanel" baru, fungsinya seperti papan kosong buat ditempeli tulisan hasil klik.
        HaloPriaSolo.setLayout(new BoxLayout(HaloPriaSolo, BoxLayout.Y_AXIS)); // "setLayout" di "HaloPriaSolo" bikin hasil tulisan baru tersusun turun ke bawah satu per satu.

        tombol.addActionListener(e -> halloJawa()); // "addActionListener" adalah pendengar klik, jadi setiap "tombol" diklik maka "Method halloJawa" langsung dijalankan.

        container.add(judul); // "container.add" memasukkan "judul" ke wadah utama, jadi judul bisa tampil di jendela.
        container.add(Box.createVerticalStrut(10)); // "Box.createVerticalStrut" memberi jarak kosong ke bawah, mirip kasih spasi antar paragraf di buku.
        container.add(deskripsi); // "container.add" memasukkan "deskripsi" ke wadah utama, jadi teks penjelasan bisa tampil.
        container.add(Box.createVerticalStrut(20)); // Baris ini memberi jarak kosong lebih besar sebelum tombol, supaya tampilan tidak terlalu rapat.
        container.add(tombol); // "container.add" memasukkan "tombol" ke wadah utama, jadi tombol bisa diklik user.
        container.add(Box.createVerticalStrut(20)); // Baris ini memberi jarak kosong sebelum area hasil klik, supaya hasilnya tidak nempel ke tombol.
        container.add(HaloPriaSolo); // "container.add" memasukkan "HaloPriaSolo" ke wadah utama, jadi tulisan baru hasil klik punya tempat tampil.

        add(container); // "add" memasukkan "container" ke jendela utama "JFrame", kalau ini tidak ada maka komponen yg sudah dibuat tidak terlihat.
    } // Kurung kurawal ini nutup "Constructor BelajarJawa", jadi proses nyiapin tampilan awal selesai.

    private void halloJawa() { // "halloJawa" adalah "Method" yg jalan saat tombol diklik, "private" artinya dipakai di dalam "Class" ini saja.
        JLabel teks = new JLabel("Hallo bre, belajar JawaSkrip bareng Pria Solo :V"); // "teks" adalah "Variable" bertipe "JLabel", setiap klik tombol akan bikin "JLabel" baru berisi kalimat ini.
        HaloPriaSolo.add(teks); // "HaloPriaSolo.add" menaruh "teks" ke dalam panel hasil, mirip menempel catatan baru ke papan pengumuman.

        HaloPriaSolo.revalidate(); // "revalidate" menyuruh Java menghitung ulang susunan tampilan karena ada komponen baru yg ditambahkan.
        HaloPriaSolo.repaint(); // "repaint" menyuruh Java menggambar ulang tampilan supaya tulisan baru benar benar kelihatan di layar.
    } // Kurung kurawal ini nutup "Method halloJawa", jadi aksi setelah tombol diklik selesai.

    public static void main(String[] args) { // "main" adalah pintu masuk program Java, jadi aplikasi Desktop ini mulai dari sini.
        SwingUtilities.invokeLater(() -> { // "SwingUtilities.invokeLater" menjalankan tampilan Swing di jalur yg aman, supaya urusan tampilan tidak bentrok.
            new BelajarJawa().setVisible(true); // "new BelajarJawa" bikin jendela baru, lalu "setVisible true" membuat jendela itu muncul di layar.
        }); // Tanda ini nutup isi "SwingUtilities.invokeLater".
    } // Kurung kurawal ini nutup "Method Main".
} // Kurung kurawal ini nutup "Class BelajarJawa".

/*
 * Kesimpulan:
 * - "Swing" adalah alat bawaan Java buat bikin tampilan aplikasi Desktop.
 * - "JFrame" adalah jendela utama aplikasi, contohnya seperti jendela Notepad atau Kalkulator.
 * - "JPanel" adalah wadah di dalam jendela, contohnya seperti baki atau papan tempat menaruh komponen.
 * - "JLabel" adalah komponen buat menampilkan tulisan.
 * - "JButton" adalah komponen tombol yg bisa diklik.
 * - "ActionListener" adalah pendengar aksi, contohnya seperti bel rumah yg bereaksi saat tombol bel ditekan.
 * - "revalidate" dipakai saat isi tampilan berubah dan susunan perlu dihitung ulang.
 * - "repaint" dipakai saat tampilan perlu digambar ulang supaya perubahan kelihatan.
 * - Program ini mirip versi Java dari halaman JavaScript lu.
 * - Tombol diklik, lalu tulisan baru ditambahkan ke area bawah tombol.
 * - Contoh awamnya seperti papan pengumuman kosong, setiap kali tombol ditekan ada kertas baru ditempel di papan itu.
 */
