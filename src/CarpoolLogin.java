import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CarpoolLogin {

    public JFrame logFrame;
    public JFrame mainFrame;
    public JPanel logPanel;
    public JPanel mainPanel;
    public JLabel titleLabel;
    public JLabel name;
    public JLabel partySize;
    public JTextField nameIn;
    public JTextField sizeIn;
    public JButton enter;
    public JTextArea mainText;


    public CarpoolLogin() {


        logFrame = new JFrame();
        logFrame.setSize(500,500);
        logFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logPanel = new JPanel();
        logPanel.setBackground(new Color(225, 209,159));
        mainPanel = new JPanel();
        logFrame.add(logPanel);
        logPanel.setLayout(null);
        mainFrame = new JFrame();
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPanel.setBackground(new Color(225, 209,159));
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel);


        titleLabel = new JLabel("Carpool", SwingConstants.CENTER);
        titleLabel.setBounds(125, 15, 250, 250);
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 50));
        logPanel.add(titleLabel);

        name = new JLabel("Name: ");
        name.setBounds(50, 200, 150, 100);
        name.setFont(new Font("Serif", Font.PLAIN, 30));
        logPanel.add(name);

        partySize = new JLabel("Party Size: ");
        partySize.setBounds(50, 280, 150, 100);
        partySize.setFont(new Font("Serif", Font.PLAIN, 30));
        logPanel.add(partySize);

        nameIn = new JTextField(20);
        nameIn.setBounds(135, 238, 225, 30);
        logPanel.add(nameIn);

        sizeIn = new JTextField(15);
        sizeIn.setBounds(190, 319, 170, 30);
        logPanel.add(sizeIn);

        enter = new JButton("Enter");
        enter.setBounds(210, 400, 75, 25);
        logPanel.add(enter);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                logFrame.setVisible(false);
                mainFrame.setVisible(true);
                mainPanel.setLayout(new FlowLayout());


                mainFrame.add(mainPanel);
                JTextArea mainText = new JTextArea(5, 20);
                JScrollPane scrollPane = new JScrollPane(mainText);
                mainText.setBounds(100, 50, 300, 150);
                for(int i = 0; i < Objects.allRides.size(); i++){
                    mainText.append(Objects.allRides.get(i).toString() + "n/");
                }
                mainPanel.add(mainText);







            }
        });

        logFrame.setVisible(true);
        mainFrame.setVisible(false);
    }
}
