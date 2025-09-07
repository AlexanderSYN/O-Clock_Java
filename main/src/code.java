import javax.swing.*;

import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class code extends JFrame {

    //icon
    ImageIcon icon;

    Calendar calendar;
    
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dateLabel;
    
    String time; 
    String date;
    
    code() {
        icon = new ImageIcon("image\\icon.jpg");
        this.setIconImage(icon.getImage());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("O'Clock");
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(400, 200);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat = new SimpleDateFormat("MM dd yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 70));
        
        timeLabel.setForeground(Color.WHITE);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        dateLabel.setForeground(Color.WHITE);
        
        this.add(timeLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException IE) {
                IE.printStackTrace();
            }
        }
    }

}
