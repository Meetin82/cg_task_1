package ru.vsu.cs.semenov_d_s;

import java.awt.*;
import java.util.Random;

public class SpongeBob {
    private int x, y;

    public SpongeBob(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawSpongeBob(Graphics2D g) {
        drawBody(g);
        drawEyes(g);
        drawLegs(g);
        drawClothes(g);
        drawArms(g);
        drawMouth(g);
        drawArms(g);
        drawNose(g);
    }
    private void drawBody(Graphics2D g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y, 130, 170);
        g.setColor(Color.black);
        g.drawRect(x, y, 130, 170);
        Random randomX = new Random();
        Random randomY = new Random();
        Color color = new Color(0xE4424244, true);
//        for (int i = 0; i < 5; i++) {
//            g.setColor(color);
//            g.fillOval(randomX.nextInt(100) + x, randomY.nextInt(140) + y, 20, 20);
//        }
    }
    private void drawEyes(Graphics2D g) {
        g.setColor(Color.white);
        g.fillOval(x + 15, y + 30, 35, 35);
        g.setColor(Color.black);
        g.drawOval(x + 15, y + 30, 35, 35);
        g.setColor(Color.blue);
        g.fillOval(x + 22, y + 37, 20, 20);
        g.setColor(Color.black);
        g.drawOval(x + 22, y + 37, 20, 20);
        g.setColor(Color.black);
        g.fillOval(x + 25, y + 40, 14, 14);

        g.setColor(Color.white);
        g.fillOval(x + 85, y + 30, 35, 35);
        g.setColor(Color.black);
        g.drawOval(x + 85, y + 30, 35, 35);
        g.setColor(Color.blue);
        g.fillOval(x + 92, y + 37, 20, 20);
        g.setColor(Color.black);
        g.drawOval(x + 92, y + 37, 20, 20);
        g.setColor(Color.black);
        g.fillOval(x + 95, y + 40, 14, 14);
    }

    private void drawLegs(Graphics2D g) {
        g.setColor(Color.yellow);
        g.fillRect(x + 25, y + 170, 10, 50);
        g.fillRect(x + 95, y + 170, 10, 50);
        g.setColor(Color.black);
        g.drawRect(x + 25, y + 170, 10, 50);
        g.drawRect(x + 95, y + 170, 10, 50);
        g.setColor(Color.black);
        g.fillOval(x, y + 215, 40, 20);
        g.setColor(Color.black);
        g.fillOval(x + 90, y + 215, 40, 20);
    }

    private void drawClothes(Graphics2D g) {
            Color color = new Color(0x6D2C00);
            g.setColor(color);
            g.fillRect(x, y + 120, 130, 50);
            g.setColor(Color.black);
            g.drawRect(x, y + 120, 130, 50);
    }

    private void drawArms(Graphics2D g) {
        g.setColor(Color.yellow);
        g.fillOval(x - 5, y + 80, 15,90);
        g.setColor(Color.black);
        g.drawOval(x - 5, y + 80, 15,90);

        g.setColor(Color.yellow);
        g.fillOval(x + 125, y + 80, 15,90);
        g.setColor(Color.black);
        g.drawOval(x + 125, y + 80, 15,90);
    }

    private void drawMouth(Graphics2D g) {
        g.setColor(Color.black);
        g.fillOval(x + 40, y + 88, 50, 30);
        Color color = new Color(0xFF0000);
        g.setColor(color);
        g.fillOval(x + 50, y + 100, 30, 15);
    }

    private void drawNose(Graphics2D g) {
        Color color = new Color(0xE8E800);
        g.setColor(color);
        g.fillOval(x + 15, y + 68, 60,15);
        g.setColor(Color.black);
        g.drawOval(x + 15, y + 68, 60,15);
    }
}
