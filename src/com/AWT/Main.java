package com.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame(); // моя форма
        jFrame.add(new MyComponent()); // мои компоненты

    }

    static  class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 =(Graphics2D)g; // графика

            //------------------------------------------------------------------------Transparency----------------------------------------
            Line2D line2D = new Line2D.Double(0,50,400,50);
            g2.setColor(Color.GREEN);
            g2.draw(line2D);

            Rectangle2D rectangle1 = new Rectangle2D.Double(0,0,100,100); // прямоугольник
            Color color1 = new Color(0,0, 0);
            g2.setColor(color1);
            g2.fill(rectangle1); // прорисовка

            Rectangle2D rectangle2 = new Rectangle2D.Double(100,0,100,100); // прямоугольник
            Color color2 = new Color(0,0, 0, 155);
            g2.setColor(color2);
            g2.fill(rectangle2); // прорисовка

            Rectangle2D rectangle3 = new Rectangle2D.Double(200,0,100,100); // прямоугольник
            Color color3 = new Color(0,0, 0, 50);
            g2.setColor(color3);
            g2.fill(rectangle3); // прорисовка

            Rectangle2D rectangle4 = new Rectangle2D.Double(300,0,100,100); // прямоугольник
            Color color4 = new Color(0,0, 0, 0);
            g2.setColor(color4);
            g2.fill(rectangle4); // прорисовка

            //------------------------------------------------------------------------AlphaComposite
            Rectangle2D rectangle5 = new Rectangle2D.Double(0,100,100,100); // прямоугольник
            Color color5 = new Color(0,255, 0);
            g2.setColor(color5);
            g2.fill(rectangle5); // прорисовка

            Rectangle2D rectangle6 = new Rectangle2D.Double(50,100,100,100); // прямоугольник
            Color color6 = new Color(0,0, 255, 155);
            g2.setColor(color6);
            g2.setComposite(AlphaComposite.SrcOver);
            g2.fill(rectangle6); // прорисовка
        }
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame(); // создать
        jFrame.setVisible(true); // видимость
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // закрытие
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize(); // выясняем центр экрана
        int widthFrame = 450, heightFrame = 350;
        jFrame.setBounds(dimension.width/2-widthFrame, dimension.height/2-heightFrame, widthFrame, heightFrame);
        return jFrame;
    }
}
