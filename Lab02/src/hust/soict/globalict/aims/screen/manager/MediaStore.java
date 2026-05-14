package hust.soict.globalict.aims.screen.manager;

import java.awt.*;
import javax.swing.*;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import java.awt.event.*;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) { 
        this.media = media; 
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 

        JLabel title = new JLabel(media.getTitle()); 
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15)); 
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $"); 
        cost.setAlignmentX(CENTER_ALIGNMENT); 

        JPanel container = new JPanel(); 
        container.setLayout(new FlowLayout(FlowLayout.CENTER)); 

        // Nếu món đồ có thể Play (DVD, CD) thì mới hiện nút Play 
        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            
            // Bắt sự kiện khi bấm nút Play
            playButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog();
                    dialog.setTitle("Media Player");
                    dialog.setSize(300, 150);
                    dialog.setLocationRelativeTo(null); // Hiện ở giữa màn hình
                    
                    JLabel label = new JLabel("Playing: " + media.getTitle());
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    label.setFont(new Font("Arial", Font.BOLD, 16));
                    
                    dialog.add(label);
                    dialog.setVisible(true);
                }
            });
            
            container.add(playButton);
        }

        this.add(Box.createVerticalGlue()); 
        this.add(title); 
        this.add(cost); 
        this.add(Box.createVerticalGlue());
        this.add(container); 

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}