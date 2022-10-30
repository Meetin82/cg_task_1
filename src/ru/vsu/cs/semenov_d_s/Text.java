package ru.vsu.cs.semenov_d_s;

import java.awt.*;

public class Text {
    private int x, y;

    public Text(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        g.drawString("Губка Боб", x, y);
    }
}
