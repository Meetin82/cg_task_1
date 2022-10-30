package ru.vsu.cs.semenov_d_s;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Home {

    private int x, y;

    public Home(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        drawLeaves(g);
        drawFlue(g);
        drawPineAppleBody(g);
        drawArcsOnPineApple(g);
        drawDoor(g);
        drawWindows(g);
        drawSidewalk(g);

    }

    private void drawPineAppleBody(Graphics2D g) {
        GeneralPath path = new GeneralPath();
        path.moveTo(x, y);
        path.curveTo(x, y, x - 100, y - 125, x + 30, y - 295);
        path.lineTo(x + 170,y - 295);
        path.curveTo(x + 170,  y - 295, x + 300, y - 125, x + 200, y);
        path.lineTo(x, y);


        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(6f));
        g.draw(path);
        Color colorPineApple = new Color(0xFF8F00);
        g.setColor(colorPineApple);
        g.fill(path);
    }
    private void drawArcsOnPineApple(Graphics2D g) {
        GeneralPath path = new GeneralPath();
        path.moveTo(x, y);
        path.curveTo(x, y - 125, x + 100, y - 125, x + 170, y - 295);
        path.moveTo(x + 50, y);
        path.curveTo(x + 50, y - 125, x + 150, y - 125, x + 180, y - 277);
        path.moveTo(x + 100, y);
        path.curveTo(x + 100, y - 125, x + 220, y - 125, x + 200, y - 245);
        path.moveTo(x + 150, y);
        path.curveTo(x + 150, y - 125, x + 240, y - 75, x + 215, y - 217);
        path.moveTo(x + 200, y);
        path.curveTo(x + 200, y - 125, x + 230, y - 25, x + 235, y - 145);
        path.moveTo(x - 37, y - 145);
        path.curveTo(x - 37, y - 125, x + 100, y - 175, x + 150, y - 295);

        path.moveTo(x + 200, y);
        path.curveTo(x + 200, y - 125, x, y - 125, x + 30, y - 295);
        path.moveTo(x + 150, y);
        path.curveTo(x + 150, y - 125, x - 40, y - 125, x + 17, y - 277);
        path.moveTo(x + 100, y);
        path.curveTo(x + 100, y - 125, x - 44, y - 125, x - 5, y - 245);
        path.moveTo(x + 50, y);
        path.curveTo(x + 50, y - 125, x - 64, 350, x - 18, y - 217);
        path.moveTo(x, y);
        path.curveTo(x, y - 125, x - 24, y - 15, x - 37, y - 145);
        path.moveTo(x + 235, y - 145);
        path.curveTo(x + 235, y - 125, x + 150, y - 175, x + 50, y - 295);


        g.setColor(new Color(0x000000));
        g.setStroke(new BasicStroke(2f));
        g.draw(path);
    }
    private void drawDoor(Graphics2D g) {
        GeneralPath path = new GeneralPath();
        path.moveTo(x + 63, y);
        path.curveTo(x + 63, y, x + 63, y - 117, x + 106, y - 117);
        path.curveTo(x + 106, y - 117, x + 149, y - 117, x + 149, y);
        path.lineTo(x + 63, y);

        g.setColor(Color.black);
        g.setStroke(new BasicStroke(3f));
        g.draw(path);
        g.setColor(new Color(0x89CEF6));
        g.fill(path);

        g.setColor(Color.BLACK);
        g.drawOval(x + 96, y - 65, 20, 50);
        g.drawOval(x + 80, y - 50, 50, 20);
    }
    private void drawWindows(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.drawOval(x,y - 200, 60, 60);
        g.setColor(new Color(0x307194));
        g.fillOval(x,y - 200, 60, 60);
        g.setColor(Color.BLACK);
        g.drawOval(x + 10,y - 190, 40, 40);
        g.setColor(new Color(0x6CC9FF));
        g.fillOval(x + 10,y - 190, 40, 40);

        g.setColor(Color.BLACK);
        g.drawOval(x + 155,y - 100, 60, 60);
        g.setColor(new Color(0x307194));
        g.fillOval(x + 155,y - 100, 60, 60);
        g.setColor(Color.BLACK);
        g.drawOval(x + 165,y - 90, 40, 40);
        g.setColor(new Color(0x6CC9FF));
        g.fillOval(x + 165,y - 90, 40, 40);
    }

    private void drawLeaves(Graphics2D g) {
        GeneralPath path = new GeneralPath();

        path.moveTo(x + 35, y - 295);
        path.curveTo(x + 35, y - 295, x, y - 385, x + 25, y - 385);
        path.curveTo(x + 25, y - 385, x + 30, y - 385, x + 40, y - 335);
        path.curveTo(x + 40, y - 335, x + 30, y - 395, x + 60, y - 415);
        path.curveTo(x + 60, y - 415, x + 70, y - 395, x + 80, y - 335);

        path.curveTo(x + 90, y - 335, x+ 70, y - 395, x + 100, y - 415);
        path.curveTo(x + 100, y - 335, x + 130, y - 385, x + 110, y - 335);
        path.curveTo(x + 110, y - 335, x + 130, y - 405, x + 140, y - 405);
        path.curveTo(x + 140, y - 405, x + 180, y - 375, x + 160, y - 295);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(3f));
        g.draw(path);
        g.setColor(new Color(0x12FF00));
        g.fill(path);
    }

    private void drawFlue(Graphics2D g) {
        GeneralPath path = new GeneralPath();
        path.moveTo(x + 100, y - 245);
        path.lineTo(x + 250, y - 245);
        path.lineTo(x + 250, y - 285);
        path.lineTo(x + 230, y - 285);
        path.lineTo(x + 230, y - 265);
        path.lineTo(x + 175, y - 265);
        g.setColor(Color.BLACK);
        g.draw(path);
        g.setColor(new Color(0x62D0F6));
        g.fill(path);
    }

    private void drawSidewalk(Graphics2D g) {
        g.setColor(new Color(0x494949));
        g.fillRect(x + 60, y + 2, 92, 500);
    }
}
