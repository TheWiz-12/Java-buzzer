import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Buzzer  implements KeyListener 
{
    Container c;
    JTextField tf;
    JTextArea ta;
    int co;
    public void work()throws Exception
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(10,10,1500,1500);

        c=frame.getContentPane();
        c.setLayout(null);

        Font f=new Font("ARIEL",Font.BOLD,80);

        //tf=new JTextField();
        //tf.setBounds(40,50,40,40);
        //tf.setFont(f);
        //tf.addKeyListener(this);

        ta=new JTextArea(" ");
        ta.setBounds(180,50,1000,1000);
        ta.setFont(f);
        ta.setEnabled(false);
        co=1;
        //c.add(tf);
        c.add(ta);
        frame.addKeyListener(this);
        c.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {
        co++;
        char c=e.getKeyChar();
        if(true)
        {
            if(c=='1')
            {
                ta.setText("B.H.S");
            }
            else if(c=='2')
            {
                ta.setText("S.J.C");
                //Audio.sjc();
            }
            else if(c=='3')
            {
                ta.setText("G.H.S");
            }
            else if(c=='4')
            {
                ta.setText("Y.M.C.A");
            }
            else if(c=='5')
            {
                ta.setText("I.P.E.M");
            }
            else if(c=='6')
            {
                ta.setText("A.B.C.D");
            }
        }
        else
        {
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
        Buzzer ob=new Buzzer();
        ob.work();
    }
}