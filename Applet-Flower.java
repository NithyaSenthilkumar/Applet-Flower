import java.awt.*;
import java.applet.*;
public class FFlower extends Applet
{
public void paint(Graphics g)
{
Color c=new Color(184,134,11);
Color c1=new Color(46,139,87);
Color c2=new Color(100,149,237);
setBackground(c2);
g.setColor(Color.red);
g.fillArc(50,40,200,200,0,180);
g.setColor(Color.orange);
g.fillArc(55,45,190,190,0,180);
g.setColor(Color.yellow);
g.fillArc(60,50,180,180,0,180);
g.setColor(Color.green);
g.fillArc(65,55,170,170,0,180);
g.setColor(Color.cyan);
g.fillArc(70,60,160,160,0,180);
g.setColor(Color.blue);
g.fillArc(75,65,150,150,0,180);
g.setColor(Color.magenta);
g.fillArc(80,70,140,140,0,180);
g.setColor(c2);
g.fillArc(85,75,130,130,0,180);
g.setColor(Color.white);
g.fillOval(30,30,40,40);
g.fillOval(60,30,40,40);
g.fillOval(80,30,40,40);
g.fillOval(40,10,40,40);
g.fillOval(70,10,40,40);

g.setColor(Color.YELLOW);
g.fillOval(240,30,50,50);
g.setColor(Color.white);
g.fillOval(260,50,30,30);
g.fillOval(280,50,30,30);
g.fillOval(300,50,30,30);
g.fillOval(270,40,30,30);
g.fillOval(290,40,30,30);

g.setColor(Color.orange);
g.fillOval(100,100,60,60);
g.setColor(Color.RED);
g.fillOval(115,113,30,30);
g.setColor(Color.orange);
g.fillOval(80,80,40,40);
g.fillOval(120,70,40,40);
g.fillOval(150,100,40,40);
g.fillOval(140,140,40,40);
g.fillOval(100,150,40,40);
g.fillOval(70,120,40,40);
g.setColor(c);
g.fillArc(120,180,40,200,0,90);
g.setColor(c1);
g.fillArc(120,200,80,80,0,75);
g.fillArc(99,200,80,80,100,75);
g.setColor(Color.LIGHT_GRAY);
g.fillOval(100,250,120,40);
g.setColor(Color.GRAY);
g.fillArc(110,230,100,100,180,180);
g.setColor(Color.GREEN);
g.fillRect(0,320,400,400);
g.setColor(c);
g.fillOval(0,300,50,20);
g.fillOval(60,300,50,20);
g.fillRect(380, 168, 20, 150); 
g.setColor(c1);
g.fillOval(350,120,120,120);
    
}
}
//<applet code="FFlower" width=400 height=400></applet>