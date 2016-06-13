
import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Base64Kullanimi 
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("C:/Users/wissen/Desktop/burak.png");
        byte[] data = new byte[(int)f.length()];
        FileInputStream fis = new FileInputStream(f);
        fis.read(data);
        
        String res = Base64.getEncoder().encodeToString(data);
        System.out.println(res);
        
        JFrame frm = new JFrame();
        JLayeredPane pane = new JLayeredPane();
        JLabel lbl = new JLabel();
        lbl.setBounds(0,0,128, 128);
        pane.add(lbl);
        
        // Base64 Decode
        byte[] imgData = Base64.getDecoder().decode(res);
        lbl.setIcon(new ImageIcon(imgData));
        
        frm.add(pane);
        frm.setSize(300,300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        // http://pastie.org/10803267
        
    }
}
