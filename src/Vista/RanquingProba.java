package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sullivan on 04/05/2017.
 */
public class RanquingProba extends  JPanel {
    private JButton jbConfig;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JList list3;
    private JList list4;
    private JList list5;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private void initComponents() {
        jbConfig = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        list3 = new JList();
        list4 = new JList();
        list5 = new JList();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark

    this.setBorder (new javax.swing.border.CompoundBorder (
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0,0,0),
                        "JFormDesigner Evaluation",javax.swing.border.TitledBorder.CENTER,
    javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialog",java.awt.Font.BOLD,12),
    java.awt.Color.red),

    this.getBorder()));

    this.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange (java.beans.PropertyChangeEvent e){
            if ("border".equals(e.getPropertyName())) throw new RuntimeException();
        }
    }
        );


    setLayout(new GridBagLayout());
        ((GridBagLayout)

    getLayout()).columnWidths =new int[]

    {
        67, 96, 101, 95, 59, 0
    }

    ;
        ((GridBagLayout)

    getLayout()).rowHeights =new int[]

    {
        0, 0, 93, 0, 0, 0
    }

    ;
        ((GridBagLayout)

    getLayout()).columnWeights =new double[]

    {
        0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4
    }

    ;
        ((GridBagLayout)

    getLayout()).rowWeights =new double[]

    {
        0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4
    }

    ;

    //---- button1 ----
        jbConfig.setText("text");

    add(jbConfig, new GridBagConstraints(0, 0,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- button2 ----
        button2.setText("Tancar");

    add(button2, new GridBagConstraints(4, 0,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,0), 0,0));

    //---- label1 ----
        label1.setText("Ranquing 2X");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

    add(label1, new GridBagConstraints(1, 1,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- label2 ----
        label2.setText("Raquing 4X");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

    add(label2, new GridBagConstraints(2, 1,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- label3 ----
        label3.setText("Ranquing Campionat");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

    add(label3, new GridBagConstraints(3, 1,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    add(list3, new GridBagConstraints(1, 2,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    add(list4, new GridBagConstraints(2, 2,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    add(list5, new GridBagConstraints(3, 2,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- button3 ----
        button3.setText("2X");

    add(button3, new GridBagConstraints(1, 3,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- button4 ----
        button4.setText("4X");

    add(button4, new GridBagConstraints(2, 3,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));

    //---- button5 ----
        button5.setText("Campionat");

    add(button5, new GridBagConstraints(3, 3,1,1,0.0,0.0,
        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0,20,17), 0,0));
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
