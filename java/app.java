import javax.swing.*;
import java.awt.*;

public class BelajarJawaSkripJava extends JFrame {

    private JPanel divHaloPriaSolo;

    public BelajarJawaSkripJava() {
        setTitle("First Time Learning JawaSkrip - Versi Java");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel judul = new JLabel("Belajar JawaSkrip Bareng Orang Jawa :V");
        judul.setFont(new Font("Arial", Font.BOLD, 22));

        JLabel deskripsi = new JLabel(
                "Saya belajar bahasa pemrograman JawaSkrip bareng orang Jawa asli (rheinsullivan.web.id)"
        );

        JButton tombol = new JButton("Tekan Saya");

        divHaloPriaSolo = new JPanel();
        divHaloPriaSolo.setLayout(new BoxLayout(divHaloPriaSolo, BoxLayout.Y_AXIS));

        tombol.addActionListener(e -> halloJawa());

        container.add(judul);
        container.add(Box.createVerticalStrut(10));
        container.add(deskripsi);
        container.add(Box.createVerticalStrut(20));
        container.add(tombol);
        container.add(Box.createVerticalStrut(20));
        container.add(divHaloPriaSolo);

        add(container);
    }

    private void halloJawa() {
        JLabel teks = new JLabel("Hallo bre, belajar JawaSkrip bareng Pria Solo :V");
        divHaloPriaSolo.add(teks);

        divHaloPriaSolo.revalidate();
        divHaloPriaSolo.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BelajarJawaSkripJava().setVisible(true);
        });
    }
}