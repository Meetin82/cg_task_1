package ru.vsu.cs.semenov_d_s;

import java.awt.*;

public class Bubbles {
    private int x, y;

    public Bubbles(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void drawBubbles(Graphics2D g) {
        g.drawOval(x, y, 30, 30);

    }
}
