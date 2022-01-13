import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Joueur {
    private JPanel Main;
    private JLabel informationJoueurLabel;
    private JTextField textFieldNomJoueur;
    private JTextField textFieldEmail;
    private JTextField textFieldNumLicence;
    private JLabel nomJoueurLabel;
    private JLabel emailLabel;
    private JLabel numéroDeLicenceLabel;
    private JButton enregistrerButton;
    private JTable table1;
    private JButton mettreÀJourButton;
    private JButton supprimerButton;
    private JButton rechercheButton;
    private JTextField textFieldSearch;
    private JLabel telephoneLabel;
    private JTextField textFieldTelephone;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Joueur");
        frame.setContentPane(new Joueur().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Joueur() {
        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
