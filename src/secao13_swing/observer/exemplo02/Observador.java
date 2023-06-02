package secao13_swing.observer.exemplo02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());

        // seta localização em relacao à outro componente, quando é null, centraliza com
        // o meio da tela
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar!");
        botao.addActionListener(e -> System.out.println("Evento disparado."));

        janela.add(botao);

        janela.setVisible(true);

    }

}
