package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPrincipal {
    private static JFrame jFrame;
    private JPanel jPanel;
    private JButton btnClicar;

    public GuiPrincipal() {
        btnClicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiFuncionou guiFuncionou = new GuiFuncionou();
                JFrame jFrame = new JFrame ("Segunda Tela");
                jFrame.setContentPane(guiFuncionou.getjPanelanel());
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        GuiPrincipal guiPrincipal = new GuiPrincipal();
        JFrame JFrame = jFrame = new JFrame("Tela Principal");
        jFrame.setContentPane(guiPrincipal.jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
