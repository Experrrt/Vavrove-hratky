import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;
import javax.swing.JPanel;

public class Daco extends JPanel{

    Vector ciary = new Vector();
    Vector ciara = new Vector();
    Vector ciaraL = new Vector();
    Vector vc = new Vector();
    int clicks = 0;
    char ps = 1;
    int x =0;
    int y =0;
    String[] lines = null;
    String body ="";
    String bod[] =null;
    Color ck = new Color(255,0, 0,75);
    Color ck2 = new Color(0,0, 0);
    public Daco(){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(this);
        jf.setPreferredSize(new Dimension(2560,1440));
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.addKeyListener(new KeyAdapter() {public void keyTyped(KeyEvent e) { ps=(e.getKeyChar());} });
        jf.addMouseListener(new MouseAdapter() { public void mousePressed(MouseEvent me){
            clicks++;
            x = me.getX();
            y = me.getY();
            ciara.add(x-7);
            ciara.add(y-32);
            if(clicks>1) {
                Line2D linka = new Line2D.Float((int) ciara.elementAt(2*clicks - 4), (int) ciara.elementAt(2*clicks - 3), x-7, y-32);
                ciaraL.add(ciara.elementAt(2*clicks - 4));
                ciaraL.add(ciara.elementAt(2*clicks - 3));
                ciaraL.add(x-7);
                ciaraL.add(y-32);
                ciary.add(linka);

            }
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        input(ps);
        Graphics2D grafika2 = (Graphics2D)g;
        Graphics2D grafika = (Graphics2D)g;
        grafika2.setColor(ck);
        if(ps =='r'){
            clicks =0;
            ps =1;
            ciara = new Vector();
            super.paintComponent(grafika2);
        }

        if(clicks>=1) {
            int X = MouseInfo.getPointerInfo().getLocation().x;
            int Y = MouseInfo.getPointerInfo().getLocation().y;
            Line2D lnk = new Line2D.Float(x-7, y-32, X-7, Y-32);
            super.paintComponent(grafika2);
            grafika2.draw(lnk);
            try {
                Thread.sleep(10);
            }catch (Exception e) {
                System.exit(0);
            }
        }
        grafika.setColor(ck2);
        for (int i = 0; i < vc.size(); i++) {
            grafika.draw((Shape)vc.elementAt(i));
        }
        for(int i=0;i<ciary.size();i++) {
            //grafika.setColor(ck2);
            grafika.draw((Shape) ciary.elementAt(i));
            System.out.println(ciaraL.size());
            if(ps =='g'){
               ciary.remove(ciary.size()-1); 
               ps=0;
               try{
               ciaraL.remove(ciaraL.size()-1);
               ciaraL.remove(ciaraL.size()-2);
               ciaraL.remove(ciaraL.size()-3);
               ciaraL.remove(ciaraL.size()-4);
               }catch(Exception ex){
                   
               }
               }
        }
        this.repaint();
    }
    public void save(String nazov){
        String daco ="";
        int index =0;

        for(int y =0;y<ciaraL.size()/4;y++){
                daco += "EOL";
            for (int i =0;i<4;i++){
                index +=1;
                daco +=ciaraL.elementAt(index-1);
                if( index%4!=0){
                daco +=",";
        }}}
        try (FileWriter f = new FileWriter(nazov,true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.print(daco);

        }catch (Exception ex){
            System.out.println();
        }

    }
    public void pridajCiaru(int X,int Y,int Xf,int Yf){
        Line2D linka = new Line2D.Float(X,Y,Xf,Yf);
        vc.add(linka);
    }
    public void nacitajGraf(String nazov){
        try{
            body = new String(Files.readAllBytes(Paths.get(".//"+nazov)));

        }catch(Exception ex){
            System.out.println("");
        }
        lines = body.split("EOL");

        for (int i = 1; i < lines.length; i++) {
            bod = lines[i].split(",");
            this.pridajCiaru(Integer.parseInt(bod[0]),Integer.parseInt(bod[1]),Integer.parseInt(bod[2]),Integer.parseInt(bod[3]));

        }

    }

    public void input(char pss){
        if(pss =='s'){
            ps=1;
            save("graf.dat");
        }
        if(pss =='t'){
            ps =1;
            File file = new File(".//graf.dat");
            file.delete();
            System.exit(0);
        }
        if(pss =='m'){
            ps =1;
            ck2 = new Color(255, 5,0);
        }
        if(pss =='n'){
            ps =1;
            ck2 = new Color(233, 0, 255);
        }
        if(pss =='b'){
            ps =1;
            ck2 = new Color(0, 32, 255);
        }

    }

    public static void main(String[]args){
        Daco gf = new Daco();
        gf.nacitajGraf( "graf.dat");

        }
}
