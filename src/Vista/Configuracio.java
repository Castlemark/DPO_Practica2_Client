package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by sullivan on 20/04/2017.
 */
public class Configuracio extends JPanel {
    private JPanel jpConfiguracio;
    private JPanel jpAtras;
    private JLabel jlTitle;
    private JLabel jlPort;
    private JPanel jpPort;
    private JTextField jtPort;
    private JTextField jtIP;
    private JLabel jlIP;
    private JPanel jpIP;
    private JButton jbIniciar;
    private JPanel jpIniciar;

    public Configuracio () {

        this.setSize (350,350);

        jpConfiguracio = new JPanel();
        jpAtras = new JPanel(new BorderLayout());
        jpPort = new JPanel(new BorderLayout());
        jpIP = new JPanel(new BorderLayout());

        jlTitle = new JLabel("            Configuració");
        jlPort = new JLabel("Port         ");
        jtPort = new JTextField();
        jlIP = new JLabel("IP Servidor      ");
        jtIP = new JTextField();
        jbIniciar = new JButton("Iniciar");

        jpConfiguracio.setLayout(new GridLayout(4,1));
        jpAtras.add (jlTitle, BorderLayout.CENTER);
        jpIP.add(jlIP, BorderLayout.LINE_START);
        jpIP.add(jtIP, BorderLayout.CENTER);
        jpPort.add (jlPort, BorderLayout.LINE_START);
        jpPort.add (jtPort, BorderLayout.CENTER);

        jpConfiguracio.add(jpAtras, BorderLayout.CENTER);
        jpConfiguracio.add(jpIP);
        jpConfiguracio.add(jpPort);
        jpConfiguracio.add(jbIniciar, BorderLayout.LINE_END);

        this.add(jpConfiguracio,BorderLayout.PAGE_START);
    }

    public void registerController(ActionListener c){
        System.out.println("hey");

        jbIniciar.addActionListener(c);

        jbIniciar.setActionCommand("INICIAR");

    }

    public String getIp(){
        return jtIP.getText();
    }

    public String getPort(){
        return jtPort.getText();
    }



}
