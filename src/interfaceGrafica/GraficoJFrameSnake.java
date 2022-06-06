package interfaceGrafica;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Random;

public class GraficoJFrameSnake {
    public static class PrimeiroFrame extends JFrame implements KeyListener {
        private JLabel texto;
        private JLabel cronometro;
        private JLabel alimento;
        private Atualiza tempo;
        public PrimeiroFrame(String titulo) {
            super(titulo);
            this.setLayout(null);
            cronometro = new JLabel("Cronômetro = 00");
            this.add(cronometro);
            cronometro.setBounds(650, 10, 150, 40);

            alimento = new JLabel("");
            Icon iconeAlimento = new ImageIcon(getClass().getResource('quadrado'));
            alimento.setIcon(iconeAlimento);

            Random valor = new Random();
            this.add(alimento);
            alimento.setBounds(valor.nextInt(750), valor.nextInt(750),valor.nextInt(10), valor.nextInt(10));

            try {
                Icon icone = new ImageIcon(getClass().getResource("corrida-nike.gif"));
                texto = new JLabel("");
                texto.setIcon(icone);
                this.add(texto);
                texto.setBounds(15, 15, 250,250);


            }catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
                JOptionPane.showConfirmDialog(null, "Não foi possível crregar a imagem!");
            }
            //Icon icone = new ImageIcon(getClass().getResource("corrida-nike.gif"));
            //texto = new JLabel("");
            //texto.setIcon(icone);
            //this.add(texto);
            //texto.setBounds(15, 15, 250,250);

            this.addKeyListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(1000,650);
            this.setVisible(true);

        }

        @Override//identifica digitar no teclado
        public void keyTyped(KeyEvent e) {

        }

        @Override//identifica ao pressionar uma tecla
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == e.VK_RIGHT) {
                texto.setBounds(texto.getBounds().x+10, texto.getBounds().y,texto.getBounds().width, texto.getBounds().height);
            }
            if (e.getKeyCode() == e.VK_LEFT){
                texto.setBounds(texto.getBounds().x-10, texto.getBounds().y,texto.getBounds().width, texto.getBounds().height);
            }
            if (e.getKeyCode() == e.VK_UP){
                texto.setBounds(texto.getBounds().x, texto.getBounds().y-10,texto.getBounds().width, texto.getBounds().height);
            }
            if (e.getKeyCode() == e.VK_DOWN){
                texto.setBounds(texto.getBounds().x, texto.getBounds().y+10,texto.getBounds().width, texto.getBounds().height);
            }
            if (e.getKeyCode() == e.VK_T){
                tempo = new Atualiza();
                tempo.start();
            }

        }

        @Override//ao soltar o botão
        public void keyReleased(KeyEvent e) {

        }

        private class Atualiza extends Thread {
            public void run() {
                //int tempo = 0;
                Random valor = new Random();
                while (true) {
                    if(texto.getBounds().x == alimento.getBounds() && texto.getBounds()
                    alimento.setBounds(valor.nextInt(750), valor.nextInt(750), );)

                }
            }
        }
    }
}


//private class Atualiza extends Thread {
//    public void run() {
//        //int tempo = 0;
//        Random valor = new Random();
//        while (true) {
//            if(texto.getBounds().x == alimento.getBounds() && texto.getBounds()
//            alimento.setBounds(valor.nextInt(750), valor.nextInt(750), );)
//                    cronometro.setText("Tempo: " + tempo + "s");
//                    System.out.println("Tempo em segundos: " + tempo + "s");
//                    if(tempo == 30) {
//                        JOptionPane.showMessageDialog(null, "Tempo acabou!");
//                        break;
//                    }
//                    try {
//                        this.sleep(1000);
//                        tempo++;
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//        }
//    }
//}