package Vista;

import javax.swing.*;
import java.awt.*;


/**
 * Created by sullivan on 08/05/2017.
 */
public class FiPartida extends JPanel {

    private JLabel label1;
    private JLabel label2;
    private JLabel label6;
    private JLabel label3;
    private JLabel label7;
    private JLabel label4;
    private JLabel label8;
    private String missatge;
    private int posicio = 0;
    private int puntuacio = 0;
    private int puntsTotals = 0;

    public FiPartida(boolean resultat) {

        if (resultat) {
            missatge = "Tu guanyas!";
        } else {
            missatge = "Tu perds!";
        }

        initComponents();
    }

    private void initComponents() {

        label1 = new JLabel();
        label2 = new JLabel();
        label6 = new JLabel();
        label3 = new JLabel();
        label7 = new JLabel();
        label4 = new JLabel();
        label8 = new JLabel();

        //======== this ========

        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {181, 183, 132, 245, 196, 198, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {147, 0, 0, 0, 0, 131, 76, 160, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText(missatge);
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        label1.setFont(new Font("Akrobat ExtraBold", Font.PLAIN, 48));
        label1.setForeground(new Color(153, 153, 255));
        add(label1, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label2 ----
        label2.setText("Posicio:");
        label2.setFont(new Font("Akrobat", Font.PLAIN, 22));
        add(label2, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label6 ----
        label6.setText("posicio");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        add(label6, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label3 ----
        label3.setText("Puntuacio partida:");
        label3.setFont(new Font("Akrobat", Font.PLAIN, 22));
        add(label3, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label7 ----
        label7.setText("puntuacio");
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        add(label7, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label4 ----
        label4.setText("Puntuacio total:");
        label4.setFont(new Font("Akrobat", Font.PLAIN, 22));
        add(label4, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));

        //---- label8 ----
        label8.setText("puntsTotals");
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        add(label8, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 41, 60), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

}