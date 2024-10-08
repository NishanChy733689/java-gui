// Java program using label (swing)
// to display the message “GFG WEBSite Click”
import java.io.*;
import javax.swing.*;

// Main class
class GUI {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        // Creating instance of JButton
        JButton button = new JButton("Hi, click me");

        // x-axis, y-axis, width, height
        button.setBounds(150, 200, 220, 50);

        // adding button in JFrame
        frame.add(button);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);
        // making the frame visible
        frame.setVisible(true);
        System.out.println("The programme is done");
    }
}
