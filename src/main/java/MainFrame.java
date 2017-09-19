import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MainFrame extends JFrame{

    public static void main(String[] args) {

       new MainFrame();

    }
    MainFrame(){
        Random color = new Random(500);
        setLayout(new FlowLayout());
        setTitle("AltynbeK&Ko");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        getContentPane().setBackground(Color.getHSBColor(color.nextFloat(), color.nextFloat(), color.nextFloat()));
        setLocationRelativeTo(null);
        setVisible(true);
        Button b = new Button("jmi menya");
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random color = new Random(500);
                Random size = new Random(350);
                   //Random location = new Random(500);
                while(true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                    }
                    setSize(size.nextInt(), size.nextInt());
                    getContentPane().setBackground(Color.getHSBColor(color.nextFloat(), color.nextFloat(), color.nextFloat()));
                    //setLocation(location.nextInt(),location.nextInt());
                }
            }
        });
    }


}
