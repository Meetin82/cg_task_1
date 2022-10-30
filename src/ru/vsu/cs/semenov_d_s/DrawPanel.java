package ru.vsu.cs.semenov_d_s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private Background background;
    private SpongeBob spongeBob;
    private Text text;
    private int homeX = 800;
    private int homeY = 425;
    private Home home;
    private Bubbles bubbles;
    Timer t = new Timer(5, this);


    public DrawPanel() {
        background = new Background(0, 0, 350, 0, new Color(0xE5E292), new Color(0x3D97EE));
        spongeBob = new SpongeBob(300, 270);
        text = new Text(120, 200);
        bubbles = new Bubbles(homeX + 225, homeY - 310);
        t.start();
        home = new Home(homeX, homeY);
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        background.draw(g2D);
        spongeBob.drawSpongeBob(g2D);
        text.draw(g2D);
        bubbles.drawBubbles(g2D);
        home.draw(g2D);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bubbleStartPositionX = homeX + 225;
        int bubbleStartPositionY = homeY - 310;
            bubbles.setY(bubbles.getY() - 5);
            bubbles.setX((int) (bubbles.getX() - 5 * Math.sin(bubbles.getY())));
            repaint();
        if (bubbles.getY() == -20) {
            bubbles.setX(bubbleStartPositionX);
            bubbles.setY(bubbleStartPositionY);
        }
        repaint();
    }
}
