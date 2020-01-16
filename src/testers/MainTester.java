package testers;

import game.activity.Activity;
import game.components.Component;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class MainTester {
    public static void main(String[] args) {
        UtilMethods.runFrame(new MainTesterPanel());
    }
}


class MainTesterPanel extends JPanel {

    private Activity mainActivity = new Activity();

    MainTesterPanel() {
        mainActivity.init(this);
    }


    @Override
    public void paintComponent(Graphics g) {
        Component.createGraphics(g);
        mainActivity.run();

        UtilMethods.sleep(10);
        repaint();
    }
}
