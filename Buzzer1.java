import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Buzzer1 extends JFrame implements KeyListener 
{
    JLabel label;

    boolean canPress;
    public Buzzer1()
    {
        setVisible(true);
        //frame.setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        Font f=new Font("ARIEL",Font.BOLD,250);
        
        label=new JLabel("..........");
        label.setBounds(100,100,1200,500);
        label.setFont(f);
        canPress=true;
        add(label);
        addKeyListener(this);
        //frame.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {

        char c=e.getKeyChar();
        if(c>='0' && c<='7')
        {
            if(canPress)
            {
                if(c=='0')
                {
                    label.setText("B.H.S");
                    Audio.bhs();
                }
                else if(c=='1')
                {
                    label.setText("S.J.C");
                    Audio.sjc();
                }
                else if(c=='2')
                {
                    label.setText("G.H.S");
                    Audio.ghs();
                }
                else if(c=='3')
                {
                    label.setText("Y.M.C.A");
                    Audio.ymca();
                }
                else if(c=='5')
                {
                    label.setText("D.P.P.S");
                    Audio.dpps();
                }
                else if(c=='7')
                {
                    label.setText("M.P.V.M");
                    Audio.mpvm();
                }
                canPress=false;
            }
        }
        else
        {
            label.setText("..........");
            canPress=true;
        }
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public static void main(String args[])throws Exception
    {
        Buzzer1 ob=new Buzzer1();
    }
}