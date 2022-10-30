package ru.vsu.cs.semenov_d_s;

import java.awt.*;

public class Background {

    private int x1, x2, y1, y2;
    private Color c1, c2;

    public Background(int x1, int x2, int y1, int y2, Color c1, Color c2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c1 = c1;
        this.c2 = c2;
    }

    public void draw(Graphics2D g) {
        g.setColor(c1);
        g.fillRect(x1, y1, 1920, 1080);
        g.setColor(c2);
        g.fillRect(x2, y2, 1920, 350);
        g.setColor(new Color(0x494949));
        g.fillRect(x2, y1 + 120, 1920, 1080);
    }

}

