import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class JFrameee{
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame Title goes here"); // set the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation to exit the program
        frame.setResizable(false); // មិនអាចអោយយើងពង្រីកនិងបង្រួមបានទេ
        frame.setSize(420,420); // set x-dimentions and y-dimentions
        frame.setVisible(true); // make frame visible


        ImageIcon image = new ImageIcon("logo.png"); // Create image Icon
        frame.setIconImage(image.getImage()); // change image icon on frame
        frame.getContentPane().setBackground(Color.GRAY); // change bacground color on frame
    }
}