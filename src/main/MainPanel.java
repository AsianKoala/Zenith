package main;

import game.activity.Activity;
import game.components.Component;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {


    private Activity activity = new Activity();

    public MainPanel() {
        activity.init(this);

    }


    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1920, 1080);

        Component.createGraphics(g);

        activity.run();

        UtilMethods.sleep(10);
        repaint();
    }
}
