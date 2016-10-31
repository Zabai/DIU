
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel{
    public Double sailAngle = 0.0, wheelAngle = 0.0;
    public boolean sailFocus = false, wheelFocus = false;
    
    
    // Puede que como no sea publico dé problemas
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Rectangle rect = this.getBounds();
        Graphics2D g2 = (Graphics2D)g;
        
        // Grosor del pincel y casco del barco
        g2.setStroke(new BasicStroke(3.0f));
        g2.drawOval(100, 100, 100, 200);
        
        // Dibujar vela
        int x1,x2,y1,y2;
        x1 = 150;
        y1 = 150;
        x2 = x1 + (int) (100.0*Math.sin(sailAngle));
        y2 = y1 + (int) (100.0*Math.cos(sailAngle));
        
        if(sailFocus){
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        }else{
            g2.drawLine(x1, y1, x2, y2);
        }
        
        // Dibujar timón
        x1 = 150;
        y1 = 300;
        x2 = x1 + (int) (50.0*Math.sin(wheelAngle));
        y2 = y1 + (int) (50.0*Math.cos(wheelAngle));
        
        if(wheelFocus){
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        }else{
            g2.drawLine(x1, y1, x2, y2);
        }
    }
}
