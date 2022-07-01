package group0;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Monopoly {

    private final int COUNT = 40;
    private int playerCount;
    private JFrame frame;
    private int frameHeight;
    private ArrayList<Player> players;
    private ArrayList<JLabel> playerIndicators;
    private ArrayList<JLabel> balanceLabels;
    private ArrayList<JLabel> playerNames;
    private final Tile[] board;
    private Board boardd;
    private Tile selectedProp;
    private JLabel topLeftLabel;
    private JLabel left1Label;
    private JLabel left2Label;
    private JLabel left3Label;
    private JLabel left4Label;
    private JLabel left5Label;
    private JLabel left6Label;
    private JLabel left7Label;
    private JLabel left8Label;
    private JLabel left9Label;
    private JLabel bottomLeftLabel;
    private JLabel top1Label;
    private JLabel top2Label;
    private JLabel top3Label;
    private JLabel top4Label;
    private JLabel top5Label;
    private JLabel top6Label;
    private JLabel top7Label;
    private JLabel top8Label;
    private JLabel top9Label;
    private JLabel topRightLabel;
    private JLabel right1Label;
    private JLabel right2Label;
    private JLabel right3Label;
    private JLabel right4Label;
    private JLabel right5Label;
    private JLabel right6Label;
    private JLabel right7Label;
    private JLabel right8Label;
    private JLabel right9Label;
    private JLabel bottomRightLabel;
    private JLabel bottom1Label;
    private JLabel bottom2Label;
    private JLabel bottom3Label;
    private JLabel bottom4Label;
    private JLabel bottom5Label;
    private JLabel bottom6Label;
    private JLabel bottom7Label;
    private JLabel bottom8Label;
    private JLabel bottom9Label;
    private JLabel deed;
    private int randomDice1;
    private int randomDice2;
    private final Random random;
    private JButton rollTheDice;
    private JLabel dice1;
    private JLabel dice2;
    private JLabel community;
    private JLabel chance;
    private JLabel communityText;
    private JLabel chanceText;
    private JLabel player1;
    private JLabel player2;
    private JLabel player3;
    private JLabel player4;
    private JLabel player5;
    private JLabel player6;
    private JLabel player7;
    private JLabel player8;
    private int playerIndex;
    private JButton addPlayer1;
    private JButton addPlayer2;
    private JButton addPlayer3;
    private JButton addPlayer4;
    private JButton addPlayer5;
    private JButton addPlayer6;
    private JButton addPlayer7;
    private JButton addPlayer8;
    private JButton startGame;
    private JButton finishTurn;
    private JTextField player1name;
    private JTextField player2name;
    private JTextField player3name;
    private JTextField player4name;
    private JTextField player5name;
    private JTextField player6name;
    private JTextField player7name;
    private JTextField player8name;
    private JButton addPlayer1Name;
    private JButton addPlayer2Name;
    private JButton addPlayer3Name;
    private JButton addPlayer4Name;
    private JButton addPlayer5Name;
    private JButton addPlayer6Name;
    private JButton addPlayer7Name;
    private JButton addPlayer8Name;
    private JLabel player1nameLabel;
    private JLabel player2nameLabel;
    private JLabel player3nameLabel;
    private JLabel player4nameLabel;
    private JLabel player5nameLabel;
    private JLabel player6nameLabel;
    private JLabel player7nameLabel;
    private JLabel player8nameLabel;
    private JLabel player1balance;
    private JLabel player2balance;
    private JLabel player3balance;
    private JLabel player4balance;
    private JLabel player5balance;
    private JLabel player6balance;
    private JLabel player7balance;
    private JLabel player8balance;
    private JButton useGetOutOfJailCard;
    private JButton pay50toGetOutOfJail;
    private JButton buyProperty;
    private JButton dontBuyProperty;
    private JButton payRent;
    private JLabel ownedProperty;
    private JComboBox<String> propertyComboBox;
    private JComboBox<String> buyer;
    private JButton sell;
    private JButton sellToBuyer;
    private JTextArea logText;
    private String log;
    private JScrollPane gameLog;
    private JButton exitButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Monopoly window = new Monopoly();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Monopoly() {
        players = new ArrayList<>();
        playerIndicators = new ArrayList<>();
        balanceLabels = new ArrayList<>();
        random = new Random();
        boardd = new Board();
        board = boardd.getBoard();
        playerNames = new ArrayList<>();
        playerCount = 0;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        FlowLayout flow = new FlowLayout();
        flow.setHgap(0);
        flow.setVgap(0);
        frame = new JFrame("Monopoly - BITS Edition");
        frame.getContentPane().setBackground(new Color(227, 202, 153));
        frame.setBackground(new Color(227, 202, 153));
        frame.setExtendedState(JFrame.NORMAL);
        frame.setSize(1366,768);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frameHeight = frame.getHeight() - 40;
        int frameWidth = frame.getWidth();

        JLayeredPane topLeft = new JLayeredPane();
        frame.getContentPane().add(topLeft);
        topLeft.setBounds(0, 0, (int) (frameHeight / 6.5),(int) (frameHeight / 6.5));
        settopLeftClean();
        topLeft.setLayout(flow);
        topLeft.add(topLeftLabel);

        JLayeredPane left1 = new JLayeredPane();
        frame.getContentPane().add(left1);
        left1.setBounds(0, (int) (frameHeight / 6.5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft1Clean();
        left1.setLayout(flow);
        left1.add(left1Label);

        JLayeredPane left2 = new JLayeredPane();
        frame.getContentPane().add(left2);
        left2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft2Clean();
        left2.setLayout(flow);
        left2.add(left2Label);

        JLayeredPane left3 = new JLayeredPane();
        frame.getContentPane().add(left3);
        left3.setBounds(0, (int) (frameHeight / 6.5 * 2),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft3Clean();
        left3.setLayout(flow);
        left3.add(left3Label);

        JLayeredPane left4 = new JLayeredPane();
        frame.getContentPane().add(left4);
        left4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft4Clean();
        left4.setLayout(flow);
        left4.add(left4Label);

        JLayeredPane left5 = new JLayeredPane();
        frame.getContentPane().add(left5);
        left5.setBounds(0, (int) (frameHeight / 6.5 * 3),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft5Clean();
        left5.setLayout(flow);
        left5.add(left5Label);

        JLayeredPane left6 = new JLayeredPane();
        frame.getContentPane().add(left6);
        left6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft6Clean();
        left6.setLayout(flow);
        left6.add(left6Label);

        JLayeredPane left7 = new JLayeredPane();
        frame.getContentPane().add(left7);
        left7.setBounds(0, (int) (frameHeight / 6.5 * 4),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft7Clean();
        left7.setLayout(flow);
        left7.add(left7Label);

        JLayeredPane left8 = new JLayeredPane();
        frame.getContentPane().add(left8);
        left8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft8Clean();
        left8.setLayout(flow);
        left8.add(left8Label);

        JLayeredPane left9 = new JLayeredPane();
        frame.getContentPane().add(left9);
        left9.setBounds(0, (int) (frameHeight / 6.5 * 5),(int) (frameHeight / 6.5), frameHeight / 13);
        setleft9Clean();
        left9.setLayout(flow);
        left9.add(left9Label);

        JLayeredPane bottomLeft = new JLayeredPane();
        frame.getContentPane().add(bottomLeft);
        bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
        setbottomLeftClean();
        bottomLeft.setLayout(flow);
        bottomLeft.add(bottomLeftLabel);

        JLayeredPane top1 = new JLayeredPane();
        frame.getContentPane().add(top1);
        top1.setBounds((int) (frameHeight / 6.5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop1Clean();
        top1.setLayout(flow);
        top1.add(top1Label);

        JLayeredPane top2 = new JLayeredPane();
        frame.getContentPane().add(top2);
        top2.setBounds((int) (frameHeight / 6.5 * 1.5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop2Clean();
        top2.setLayout(flow);
        top2.add(top2Label);

        JLayeredPane top3 = new JLayeredPane();
        frame.getContentPane().add(top3);
        top3.setBounds((int) (frameHeight / 6.5 * 2), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop3Clean();
        top3.setLayout(flow);
        top3.add(top3Label);

        JLayeredPane top4 = new JLayeredPane();
        frame.getContentPane().add(top4);
        top4.setBounds((int) (frameHeight / 6.5 * 2.5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop4Clean();
        top4.setLayout(flow);
        top4.add(top4Label);

        JLayeredPane top5 = new JLayeredPane();
        frame.getContentPane().add(top5);
        top5.setBounds((int) (frameHeight / 6.5 * 3), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop5Clean();
        top5.setLayout(flow);
        top5.add(top5Label);

        JLayeredPane top6 = new JLayeredPane();
        frame.getContentPane().add(top6);
        top6.setBounds((int) (frameHeight / 6.5 * 3.5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop6Clean();
        top6.setLayout(flow);
        top6.add(top6Label);

        JLayeredPane top7 = new JLayeredPane();
        frame.getContentPane().add(top7);
        top7.setBounds((int) (frameHeight / 6.5 * 4), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop7Clean();
        top7.setLayout(flow);
        top7.add(top7Label);

        JLayeredPane top8 = new JLayeredPane();
        frame.getContentPane().add(top8);
        top8.setBounds((int) (frameHeight / 6.5 * 4.5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop8Clean();
        top8.setLayout(flow);
        top8.add(top8Label);

        JLayeredPane top9 = new JLayeredPane();
        frame.getContentPane().add(top9);
        top9.setBounds((int) (frameHeight / 6.5 * 5), 0, frameHeight / 13,(int) (frameHeight / 6.5));
        settop9Clean();
        top9.setLayout(flow);
        top9.add(top9Label);

        JLayeredPane topRight = new JLayeredPane();
        frame.getContentPane().add(topRight);
        topRight.setBounds((int) (frameHeight / 6.5 * 5.5), 0,(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
        settopRightClean();
        topRight.setLayout(flow);
        topRight.add(topRightLabel);

        JLayeredPane right1 = new JLayeredPane();
        frame.getContentPane().add(right1);
        right1.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright1Clean();
        right1.setLayout(flow);
        right1.add(right1Label);

        JLayeredPane right2 = new JLayeredPane();
        frame.getContentPane().add(right2);
        right2.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 1.5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright2Clean();
        right2.setLayout(flow);
        right2.add(right2Label);

        JLayeredPane right3 = new JLayeredPane();
        frame.getContentPane().add(right3);
        right3.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5), frameHeight / 13);
        setright3Clean();
        right3.setLayout(flow);
        right3.add(right3Label);

        JLayeredPane right4 = new JLayeredPane();
        frame.getContentPane().add(right4);
        right4.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 2.5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright4Clean();
        right4.setLayout(flow);
        right4.add(right4Label);

        JLayeredPane right5 = new JLayeredPane();
        frame.getContentPane().add(right5);
        right5.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 3), (int) (frameHeight / 6.5), frameHeight / 13);
        setright5Clean();
        right5.setLayout(flow);
        right5.add(right5Label);

        JLayeredPane right6 = new JLayeredPane();
        frame.getContentPane().add(right6);
        right6.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 3.5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright6Clean();
        right6.setLayout(flow);
        right6.add(right6Label);

        JLayeredPane right7 = new JLayeredPane();
        frame.getContentPane().add(right7);
        right7.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 6.5), frameHeight / 13);
        setright7Clean();
        right7.setLayout(flow);
        right7.add(right7Label);

        JLayeredPane right8 = new JLayeredPane();
        frame.getContentPane().add(right8);
        right8.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 4.5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright8Clean();
        right8.setLayout(flow);
        right8.add(right8Label);

        JLayeredPane right9 = new JLayeredPane();
        frame.getContentPane().add(right9);
        right9.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5), frameHeight / 13);
        setright9Clean();
        right9.setLayout(flow);
        right9.add(right9Label);

        JLayeredPane bottomRight = new JLayeredPane();
        frame.getContentPane().add(bottomRight);
        bottomRight.setBounds((int) (frameHeight / 6.5 * 5.5),(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 6.5),(int) (frameHeight / 6.5));
        setbottomRightClean();
        bottomRight.setLayout(flow);
        bottomRight.add(bottomRightLabel);

        JLayeredPane bottom1 = new JLayeredPane();
        frame.getContentPane().add(bottom1);
        bottom1.setBounds((int) (frameHeight / 6.5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom1Clean();
        bottom1.setLayout(flow);
        bottom1.add(bottom1Label);

        JLayeredPane bottom2 = new JLayeredPane();
        frame.getContentPane().add(bottom2);
        bottom2.setBounds((int) (frameHeight / 6.5 * 1.5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom2Clean();
        bottom2.setLayout(flow);
        bottom2.add(bottom2Label);

        JLayeredPane bottom3 = new JLayeredPane();
        frame.getContentPane().add(bottom3);
        bottom3.setBounds((int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom3Clean();
        bottom3.setLayout(flow);
        bottom3.add(bottom3Label);

        JLayeredPane bottom4 = new JLayeredPane();
        frame.getContentPane().add(bottom4);
        bottom4.setBounds((int) (frameHeight / 6.5 * 2.5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom4Clean();
        bottom4.setLayout(flow);
        bottom4.add(bottom4Label);

        JLayeredPane bottom5 = new JLayeredPane();
        frame.getContentPane().add(bottom5);
        bottom5.setBounds((int) (frameHeight / 6.5 * 3), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom5Clean();
        bottom5.setLayout(flow);
        bottom5.add(bottom5Label);

        JLayeredPane bottom6 = new JLayeredPane();
        frame.getContentPane().add(bottom6);
        bottom6.setBounds((int) (frameHeight / 6.5 * 3.5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom6Clean();
        bottom6.setLayout(flow);
        bottom6.add(bottom6Label);

        JLayeredPane bottom7 = new JLayeredPane();
        frame.getContentPane().add(bottom7);
        bottom7.setBounds((int) (frameHeight / 6.5 * 4), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom7Clean();
        bottom7.setLayout(flow);
        bottom7.add(bottom7Label);

        JLayeredPane bottom8 = new JLayeredPane();
        frame.getContentPane().add(bottom8);
        bottom8.setBounds((int) (frameHeight / 6.5 * 4.5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom8Clean();
        bottom8.setLayout(flow);
        bottom8.add(bottom8Label);

        JLayeredPane bottom9 = new JLayeredPane();
        frame.getContentPane().add(bottom9);
        bottom9.setBounds((int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5 * 5.5), frameHeight / 13,(int) (frameHeight / 6.5));
        setbottom9Clean();
        bottom9.setLayout(flow);
        bottom9.add(bottom9Label);

        deed= new JLabel();
        deed.setBounds((int) (frameHeight / 6.5 * 1.95),(int) (frameHeight / 6.5 * 1.6), (int) (frameHeight * 0.4),(int) (frameHeight * 0.5));
        deed.setVisible(true);

        community = new JLabel();
        ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/chest.jpg");
        community.setBounds((int) (frameHeight / 6.5 * 1.125),
                (int) (frameHeight / 6.5 * 1.125), (int) (frameHeight / 3.33),
                (int) (frameHeight / 5));
        community.setIcon(img);
        community.setVisible(true);

        chance = new JLabel();
        ImageIcon img1=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/chance.jpg");
        chance.setBounds((int) (frameHeight / 6.5 * 3.5),
                (int) (frameHeight / 6.5 * 4), (int) (frameHeight / 3.33),
                (int) (frameHeight / 5));
        chance.setIcon(img1);
        chance.setVisible(true);

        communityText = new JLabel("",JLabel.CENTER);
        communityText.setBounds((int) (frameHeight / 6.5 * 1.125),
                (int) (frameHeight / 6.5 * 1.125), (int) (frameHeight / 3.33) - 20,
                (int) (frameHeight / 5) - 20);
        communityText.setText("");
        communityText.setBorder(BorderFactory.createLineBorder(Color.black,1));
        communityText.setHorizontalAlignment(JLabel.CENTER);
        communityText.setVerticalAlignment(JLabel.CENTER);
        communityText.setVisible(false);
        communityText.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
        communityText.setForeground(Color.white);
        communityText.setBackground(Color.BLUE);
        communityText.setOpaque(true);

        chanceText = new JLabel("",JLabel.CENTER);
        chanceText.setBounds((int) (frameHeight / 6.5 * 3.5),
                (int) (frameHeight / 6.5 * 4) + 10, (int) (frameHeight / 3.33) - 20,
                (int) (frameHeight / 5) - 20);
        chanceText.setText("");
        chanceText.setBorder(BorderFactory.createLineBorder(Color.black,1));
        chanceText.setHorizontalAlignment(JLabel.CENTER);
        chanceText.setVerticalAlignment(JLabel.CENTER);
        chanceText.setVisible(false);
        chanceText.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
        chanceText.setBackground(Color.orange);
        chanceText.setOpaque(true);

        left1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_1.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_2.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left4.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_4.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_5.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left6.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_6.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left7.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_7.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left8.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_8.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        left9.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left_9.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_1.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_3.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top4.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_4.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_5.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top6.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_6.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top7.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_7.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top8.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_8.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        top9.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top_9.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_1.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_2.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right4.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_4.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_5.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right7.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_7.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        right9.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right_9.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });
        bottom1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_1.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        bottom2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_2.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        bottom4.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_4.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        bottom5.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_5.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        bottom7.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_7.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

        });

        bottom9.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent arg0) {

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ImageIcon img=new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom_9.jpg");
                deed.setIcon(img);
                deed.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deed.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });


        frame.getContentPane().add(community,1);
        frame.getContentPane().add(chance,1);
        frame.getContentPane().add(deed, 0);
        frame.getContentPane().add(communityText);
        frame.getContentPane().add(chanceText);


        JLayeredPane player_1 = new JLayeredPane();
        player_1.setBounds(frameWidth /2 + 45, 0, (int) (frameHeight / 4.5) -2 ,
                (int) (frameHeight / 6.5));
        player_1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player1name = new JTextField();
        player1name.setBounds(15, 10, 120, 30);
        player1name.setHorizontalAlignment(SwingConstants.CENTER);
        player1name.setVisible(false);
        player_1.setBackground(new Color(239,229,218));
        player_1.setOpaque(true);
        player_1.add(player1name);

        JLayeredPane player_2 = new JLayeredPane();
        player_2.setBounds(frameWidth /2 + 46 + (int) (frameHeight / 4.5) -2 , 0,
                (int) (frameHeight / 4.5) - 2, (int) (frameHeight / 6.5));
        player_2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player2name = new JTextField();
        player2name.setBounds(20, 10, 120, 30);
        player2name.setHorizontalAlignment(SwingConstants.CENTER);
        player2name.setVisible(false);
        player_2.setBackground(new Color(239,229,218));
        player_2.setOpaque(true);
        player_2.add(player2name);

        JLayeredPane player_3 = new JLayeredPane();
        player_3.setBounds(frameWidth /2 + 45 + (int) (frameHeight / 2.25) -3, 0,
                (int) (frameHeight / 4.5) -2, (int) (frameHeight / 6.5));
        player_3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player3name = new JTextField();
        player3name.setBounds(20, 10, 120, 30);
        player3name.setHorizontalAlignment(SwingConstants.CENTER);
        player3name.setVisible(false);
        player_3.setBackground(new Color(239,229,218));
        player_3.setOpaque(true);
        player_3.add(player3name);

        JLayeredPane player_4 = new JLayeredPane();
        player_4.setBounds(frameWidth /2 + 45 + (int) (frameHeight / 1.5) -4, 0,
                (int) (frameHeight / 4.5) - 6, (int) (frameHeight / 6.5));
        player_4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player4name = new JTextField();
        player4name.setBounds(20, 10, 120, 30);
        player4name.setHorizontalAlignment(SwingConstants.CENTER);
        player4name.setVisible(false);
        player_4.setBackground(new Color(239,229,218));
        player_4.setOpaque(true);
        player_4.add(player4name);

        JLayeredPane player_5 = new JLayeredPane();
        player_5.setBounds(frameWidth /2 + 45,
                (int) (frameHeight / 6.5) + 2, (int) (frameHeight / 4.5) -2 ,
                (int) (frameHeight / 6.5));
        player_5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player5name = new JTextField();
        player5name.setBounds(20, 10, 120, 30);
        player5name.setHorizontalAlignment(SwingConstants.CENTER);
        player5name.setVisible(false);
        player_5.setBackground(new Color(239,229,218));
        player_5.setOpaque(true);
        player_5.add(player5name);

        JLayeredPane player_6 = new JLayeredPane();
        player_6.setBounds(frameWidth /2 + 46 + (int) (frameHeight / 4.5) -2,
                (int) (frameHeight / 6.5) + 2, (int) (frameHeight / 4.5) -2 ,
                (int) (frameHeight / 6.5));
        player_6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player6name = new JTextField();
        player6name.setBounds(20, 10, 120, 30);
        player6name.setHorizontalAlignment(SwingConstants.CENTER);
        player6name.setVisible(false);
        player_6.setBackground(new Color(239,229,218));
        player_6.setOpaque(true);
        player_6.add(player6name);

        JLayeredPane player_7 = new JLayeredPane();
        player_7.setBounds(frameWidth /2 + 45 + (int) (frameHeight / 2.25) -3,
                (int) (frameHeight / 6.5) + 2, (int) (frameHeight / 4.5) -2 ,
                (int) (frameHeight / 6.5));
        player_7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player7name = new JTextField();
        player7name.setBounds(20, 10, 120, 30);
        player7name.setHorizontalAlignment(SwingConstants.CENTER);
        player7name.setVisible(false);
        player_7.setBackground(new Color(239,229,218));
        player_7.setOpaque(true);
        player_7.add(player7name);

        JLayeredPane player_8 = new JLayeredPane();
        player_8.setBounds(frameWidth /2 + 45 + (int) (frameHeight / 1.5) -4,
                (int) (frameHeight / 6.5) + 2, (int) (frameHeight / 4.5) -6 ,
                (int) (frameHeight / 6.5));
        player_8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        player8name = new JTextField();
        player8name.setBounds(20, 10, 120, 30);
        player8name.setHorizontalAlignment(SwingConstants.CENTER);
        player8name.setVisible(false);
        player_8.setBackground(new Color(239,229,218));
        player_8.setOpaque(true);
        player_8.add(player8name);

        JLayeredPane gameConsole = new JLayeredPane();

        pay50toGetOutOfJail = new JButton("Pay Rs50 to get out of Quarantine");
        pay50toGetOutOfJail.setBounds(frameHeight + 200,
                (int) (frameHeight / 2 + 60) + 30, 230, 20);
        pay50toGetOutOfJail.setVisible(false);
        useGetOutOfJailCard = new JButton("Use the card");
        useGetOutOfJailCard.setBounds(frameHeight + 230,
                (int) (frameHeight / 2 + 35) + 90, 160, 20);
        useGetOutOfJailCard.setVisible(false);
        buyProperty = new JButton("Buy");
        dontBuyProperty = new JButton("Don't buy");
        payRent = new JButton("Pay rent");
        buyProperty.setBounds(frameHeight + 150, (int) (frameHeight / 2 + 35) + 60,
                160, 20);
        dontBuyProperty.setBounds(frameHeight + 320,
                (int) (frameHeight / 2 + 35) + 60, 160, 20);
        payRent.setBounds(frameHeight + 200, (int) (frameHeight / 2 + 60) + 75, 230,
                20);
        buyProperty.setVisible(false);
        dontBuyProperty.setVisible(false);
        payRent.setVisible(false);
        logText = new JTextArea();
        logText.setFont(new Font("Arial", Font.BOLD, 12));
        log = "  /> the Game has started\n";
        logText.append(log);
        logText.setEditable(false);

        gameLog = new JScrollPane(logText);
        gameConsole.setBounds(frameHeight + 20, (int) (frameHeight / 2) + 50,
                (int) (frameHeight / 4) * 3 + 55, (int) (frameHeight / 3));
        gameLog.setBounds(frameHeight + 20, (int) (frameHeight / 3.25 + 20),
                (int) (frameHeight / 4) * 3 + 55, (int) (frameHeight / 6.5) + 50);
        gameLog.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        Border lined = BorderFactory.createLineBorder(Color.black, 1);
        Border innerGameLog1 = BorderFactory.createTitledBorder(lined,
                "Game info:", 2, 2, new Font("Arial", Font.ITALIC, 12),
                Color.black);
        Border innerGameConsole1 = BorderFactory.createTitledBorder(lined,
                "Game console:", 2, 2, new Font("Arial", Font.ITALIC, 12),
                Color.black);
        Border outerBorder = BorderFactory.createEmptyBorder(2, 0, 2, 0);
        gameLog.setBorder(BorderFactory.createCompoundBorder(outerBorder,
                innerGameLog1));
        gameConsole.setBorder(BorderFactory.createCompoundBorder(outerBorder,
                innerGameConsole1));
        gameConsole.setBackground(new Color(239,229,218));
        gameConsole.setOpaque(true);

        gameLog.setVisible(false);

        ownedProperty = new JLabel("Owned properties >>");
        ownedProperty.setBounds(frameHeight + 50, (int) (frameHeight / 2 + 190),
                150, 20);
        ownedProperty.setVisible(true);
        propertyComboBox = new JComboBox<String>();
        propertyComboBox.setBounds(frameHeight + 190,
                (int) (frameHeight / 2 + 190), 160, 20);
        buyer = new JComboBox<String>();
        buyer.setBounds(frameHeight + 350, (int) (frameHeight / 2 + 190), 140,
                20);
        sell = new JButton("Select the buyer");
        sell.setBounds(frameHeight + 350, (int) (frameHeight / 2 + 190), 140,
                20);
        sellToBuyer = new JButton("Sell");
        sellToBuyer.setBounds(frameHeight + 515,
                (int) (frameHeight / 2 + 190), 60, 20);
        ownedProperty.setVisible(false);
        propertyComboBox.setVisible(false);
        buyer.setVisible(false);
        sell.setVisible(false);
        sellToBuyer.setVisible(false);


        addPlayer1Name = new JButton("Add player");
        addPlayer2Name = new JButton("Add player");
        addPlayer3Name = new JButton("Add player");
        addPlayer4Name = new JButton("Add player");
        addPlayer5Name = new JButton("Add player");
        addPlayer6Name = new JButton("Add player");
        addPlayer7Name = new JButton("Add player");
        addPlayer8Name = new JButton("Add player");
        addPlayer1Name.setBounds(frameHeight + 20, 50, 120, 40);
        addPlayer2Name.setBounds((frameHeight * 5)/4,
                50, 120, 40);
        addPlayer3Name.setBounds((frameHeight*3)/2 - 25,
                50, 120, 40);
        addPlayer4Name.setBounds((frameHeight*7)/4 - 50,
                50, 120, 40);
        addPlayer5Name.setBounds(frameHeight + 20,
                (int) (frameHeight / 6.5) + 50, 120, 40);
        addPlayer6Name.setBounds((frameHeight * 5)/4,
                (int) (frameHeight / 6.5) + 50, 120, 40);
        addPlayer7Name.setBounds((frameHeight*3)/2 - 25,
                (int) (frameHeight / 6.5) + 50, 120, 40);
        addPlayer8Name.setBounds((frameHeight*7)/4 - 50,
                (int) (frameHeight / 6.5) + 50, 120, 40);
        addPlayer1Name.setVisible(false);
        addPlayer2Name.setVisible(false);
        addPlayer3Name.setVisible(false);
        addPlayer4Name.setVisible(false);
        addPlayer5Name.setVisible(false);
        addPlayer6Name.setVisible(false);
        addPlayer7Name.setVisible(false);
        addPlayer8Name.setVisible(false);

        addPlayer1 = new JButton();
        player1nameLabel = new JLabel();
        player1balance = new JLabel();
        balanceLabels.add(player1balance);
        player1nameLabel.setBounds(frameHeight + 60, 5, 140, 40);
        player1balance.setBounds(frameHeight + 60, 20, 140, 40);
        addPlayer1.setBounds(frameHeight + 10 , 35, 140, 40);
        ImageIcon img2 = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/addplayer.jpg");
        addPlayer1.setIcon(img2);
        addPlayer1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer1.setBorderPainted(false);
        addPlayer1.setContentAreaFilled(false);
        addPlayer1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer1.setVisible(false);
                player1name.setVisible(true);
                addPlayer1Name.setVisible(true);
                addPlayer1Name.setEnabled(true);
            }
        });

        addPlayer1Name.addActionListener(new ActionListener() {
            // adds first player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(player1name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player1name.getText()));
                player1nameLabel.setText(player1name.getText());
                player1nameLabel.setForeground(Color.RED);
                player1balance.setText("Rs"
                        + String.valueOf(players.get(0).getMoney()));
                frame.getContentPane().add(player1nameLabel,0);
                frame.getContentPane().add(player1balance,0);
                player1name.setVisible(false);
                addPlayer1Name.setVisible(false);
                addPlayer2.setEnabled(true);
                playerCount++;

                player1 = new JLabel();
                player1.setBounds((int) (frameHeight / 6.5 * 5.5) + 20,
                        (int) (frameHeight / 6.5 * 5.5) + 20, 35, 35);

                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token1.png");
                player1.setIcon(img);

                frame.getContentPane().add(player1, 0);
                playerIndicators.add(player1);
            }

        });
        addPlayer2 = new JButton();
        addPlayer2.setBounds((frameHeight * 5)/4 - 10, 35,
                140, 40);
        player2nameLabel = new JLabel();
        player2balance = new JLabel();
        balanceLabels.add(player2balance);
        player2balance.setBounds(frameHeight + 40 + (int) (frameHeight / 4),
                20, 140, 40);
        player2nameLabel.setBounds(frameHeight + 40 + (int) (frameHeight / 4),
                5, 140, 40);
        addPlayer2.setIcon(img2);
        addPlayer2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer2.setBorderPainted(false);
        addPlayer2.setContentAreaFilled(false);
        addPlayer2.setEnabled(false);
        addPlayer2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer2.setVisible(false);
                player2name.setVisible(true);
                addPlayer2Name.setVisible(true);
                addPlayer2Name.setEnabled(true);
            }
        });

        addPlayer2Name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player2name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player2name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player2name.getText()));
                player2nameLabel.setText(player2name.getText());
                player2nameLabel.setForeground(Color.BLUE);
                player2balance.setText("Rs"
                        + String.valueOf(players.get(1).getMoney()));
                frame.getContentPane().add(player2nameLabel,0);
                frame.getContentPane().add(player2balance,0);
                System.out.println(players.get(1).getName());
                player2name.setVisible(false);
                addPlayer2Name.setVisible(false);
                addPlayer3.setEnabled(true);
                startGame.setEnabled(true);
                playerCount++;// after creating two players, the
                // game can be started


                player2 = new JLabel();
                player2.setBounds((int) (frameHeight / 6.5 * 5.5) + 23,
                        (int) (frameHeight / 6.5 * 5.5) + 23, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token2.png");
                player2.setIcon(img);
                frame.getContentPane().add(player2, 0);
                playerIndicators.add(player2);
            }

        });

        addPlayer3 = new JButton();
        player3nameLabel = new JLabel();
        player3balance = new JLabel();
        balanceLabels.add(player3balance);
        player3balance.setBounds(frameHeight + 20 + (int) (frameHeight / 2),
                20, 140, 40);
        player3nameLabel.setBounds(frameHeight + 20 + (int) (frameHeight / 2),
                5, 140, 40);
        addPlayer3.setBounds((frameHeight*3)/2 - 35, 35,
                140, 40);
        addPlayer3.setIcon(img2);
        addPlayer3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer3.setBorderPainted(false);
        addPlayer3.setContentAreaFilled(false);
        addPlayer3.setEnabled(false);
        addPlayer3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer3.setVisible(false);
                player3name.setVisible(true);
                addPlayer3Name.setVisible(true);
                addPlayer3Name.setEnabled(true);
            }
        });

        addPlayer3Name.addActionListener(new ActionListener() {
            // adds third player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player3name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player3name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player3name.getText()));
                player3nameLabel.setText(player3name.getText());
                player3nameLabel.setForeground(Color.BLACK);
                player3balance.setText("Rs"
                        + String.valueOf(players.get(2).getMoney()));
                frame.getContentPane().add(player3nameLabel,0);
                frame.getContentPane().add(player3balance,0);
                System.out.println(players.get(2).getName());
                player3name.setVisible(false);
                addPlayer3Name.setVisible(false);
                addPlayer4.setEnabled(true);
                playerCount++;


                player3 = new JLabel();
                player3.setBounds((int) (frameHeight / 6.5 * 5.5) + 26,
                        (int) (frameHeight / 6.5 * 5.5) + 26, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token3.png");
                player3.setIcon(img);
                frame.getContentPane().add(player3, 0);
                playerIndicators.add(player3);
            }

        });

        addPlayer4 = new JButton();
        player4nameLabel = new JLabel();
        player4balance = new JLabel();
        balanceLabels.add(player4balance);
        player4balance.setBounds(frameHeight + 180 + (int) (frameHeight / 2),
                20, 140, 40);
        player4nameLabel.setBounds(frameHeight + 180 + (int) (frameHeight / 2),
                5, 140, 40);
        addPlayer4.setBounds((frameHeight*7)/4 - 60, 35,
                140, 40);

        addPlayer4.setIcon(img2);
        addPlayer4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer4.setBorderPainted(false);
        addPlayer4.setContentAreaFilled(false);
        addPlayer4.setEnabled(false);
        addPlayer4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer4.setVisible(false);
                player4name.setVisible(true);
                addPlayer4Name.setVisible(true);
                addPlayer4Name.setEnabled(true);
            }
        });

        addPlayer4Name.addActionListener(new ActionListener() {
            // adds fourth player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player4name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player4name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player4name.getText()));
                player4nameLabel.setText(player4name.getText());
                player4nameLabel.setForeground(Color.GREEN);
                player4balance.setText("Rs"
                        + String.valueOf(players.get(3).getMoney()));
                frame.getContentPane().add(player4nameLabel,0);
                frame.getContentPane().add(player4balance,0);
                System.out.println(players.get(3).getName());
                player4name.setVisible(false);
                addPlayer4Name.setVisible(false);
                addPlayer5.setEnabled(true);
                playerCount++;

                player4 = new JLabel();
                player4.setBounds((int) (frameHeight / 6.5 * 5.5) + 29,
                        (int) (frameHeight / 6.5 * 5.5) + 29, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token4.png");
                player4.setIcon(img);
                frame.getContentPane().add(player4, 0);
                playerIndicators.add(player4);
            }

        });

        addPlayer5 = new JButton();
        player5nameLabel = new JLabel();
        player5balance = new JLabel();
        balanceLabels.add(player5balance);
        player5balance.setBounds(frameHeight + 60,
                (int) (frameHeight / 6.5) + 22, 140, 40);
        player5nameLabel.setBounds(frameHeight + 60,
                (int) (frameHeight / 6.5) + 7, 140, 40);
        addPlayer5.setBounds(frameHeight + 10,
                (int) (frameHeight / 6.5) + 35, 140, 40);
        addPlayer5.setIcon(img2);
        addPlayer5.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer5.setBorderPainted(false);
        addPlayer5.setContentAreaFilled(false);
        addPlayer5.setEnabled(false);
        addPlayer5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer5.setVisible(false);
                player5name.setVisible(true);
                addPlayer5Name.setVisible(true);
                addPlayer5Name.setEnabled(true);
            }
        });

        addPlayer5Name.addActionListener(new ActionListener() {
            // adds fifth player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player5name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player5name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player5name.getText()));
                player5nameLabel.setText(player5name.getText());
                player5nameLabel.setForeground(Color.ORANGE);
                player5balance.setText("Rs"
                        + String.valueOf(players.get(4).getMoney()));
                frame.getContentPane().add(player5nameLabel,0);
                frame.getContentPane().add(player5balance,0);
                System.out.println(players.get(4).getName());
                player5name.setVisible(false);
                addPlayer5Name.setVisible(false);
                addPlayer6.setEnabled(true);
                playerCount++;

                player5 = new JLabel();
                player5.setBounds((int) (frameHeight / 6.5 * 5.5) + 32,
                        (int) (frameHeight / 6.5 * 5.5) + 32, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token5.png");
                player5.setIcon(img);
                frame.getContentPane().add(player5, 0);
                playerIndicators.add(player5);
            }

        });

        addPlayer6 = new JButton();
        player6nameLabel = new JLabel();
        player6balance = new JLabel();
        balanceLabels.add(player6balance);
        player6balance.setBounds(frameHeight + 40 + (int) (frameHeight / 4),
                (int) (frameHeight / 6.5) + 22, 140, 40);
        player6nameLabel.setBounds(frameHeight + 40 + (int) (frameHeight / 4),
                (int) (frameHeight / 6.5) + 7, 140, 40);
        addPlayer6.setBounds((frameHeight * 5)/4 - 10,
                (int) (frameHeight / 6.5) + 35, 140, 40);

        addPlayer6.setIcon(img2);
        addPlayer6.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer6.setBorderPainted(false);
        addPlayer6.setContentAreaFilled(false);
        addPlayer6.setEnabled(false);
        addPlayer6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer6.setVisible(false);
                player6name.setVisible(true);
                addPlayer6Name.setVisible(true);
                addPlayer6Name.setEnabled(true);
            }
        });

        addPlayer6Name.addActionListener(new ActionListener() {
            // adds sixth player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player6name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player6name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player6name.getText()));
                player6nameLabel.setText(player6name.getText());
                player6nameLabel.setForeground(Color.magenta);
                player6balance.setText("Rs"
                        + String.valueOf(players.get(5).getMoney()));
                frame.getContentPane().add(player6nameLabel,0);
                frame.getContentPane().add(player6balance,0);
                System.out.println(players.get(5).getName());
                player6name.setVisible(false);
                addPlayer6Name.setVisible(false);
                addPlayer7.setEnabled(true);
                playerCount++;

                player6 = new JLabel();
                player6.setBounds((int) (frameHeight / 6.5 * 5.5) + 35,
                        (int) (frameHeight / 6.5 * 5.5) + 35, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token6.png");
                player6.setIcon(img);
                frame.getContentPane().add(player6, 0);
                playerIndicators.add(player6);
            }

        });


        addPlayer7 = new JButton();
        player7nameLabel = new JLabel();
        player7balance = new JLabel();
        balanceLabels.add(player7balance);
        player7balance.setBounds(frameHeight + 20 + (int) (frameHeight / 2),
                (int) (frameHeight / 6.5) + 22, 140, 40);
        player7nameLabel.setBounds(frameHeight + 20 + (int) (frameHeight / 2),
                (int) (frameHeight / 6.5) + 7, 140, 40);
        addPlayer7.setBounds((frameHeight*3)/2 - 35,
                (int) (frameHeight / 6.5) + 35, 140, 40);

        addPlayer7.setIcon(img2);
        addPlayer7.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer7.setBorderPainted(false);
        addPlayer7.setContentAreaFilled(false);
        addPlayer7.setEnabled(false);
        addPlayer7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer7.setVisible(false);
                player7name.setVisible(true);
                addPlayer7Name.setVisible(true);
                addPlayer7Name.setEnabled(true);
            }
        });

        addPlayer7Name.addActionListener(new ActionListener() {
            // adds seventh player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player7name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player7name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player7name.getText()));
                player7nameLabel.setText(player7name.getText());
                player7nameLabel.setForeground(Color.yellow);
                player7balance.setText("Rs"
                        + String.valueOf(players.get(6).getMoney()));
                frame.getContentPane().add(player7nameLabel,0);
                frame.getContentPane().add(player7balance,0);
                System.out.println(players.get(6).getName());
                player7name.setVisible(false);
                addPlayer7Name.setVisible(false);
                addPlayer8.setEnabled(true);
                playerCount++;

                player7 = new JLabel();
                player7.setBounds((int) (frameHeight / 6.5 * 5.5) + 35,
                        (int) (frameHeight / 6.5 * 5.5) + 35, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token1.png");
                player7.setIcon(img);
                frame.getContentPane().add(player7, 0);
                playerIndicators.add(player7);
            }

        });

        addPlayer8 = new JButton();
        player8nameLabel = new JLabel();
        player8balance = new JLabel();
        balanceLabels.add(player8balance);
        player8balance.setBounds(frameHeight + 180 + (int) (frameHeight / 2),
                (int) (frameHeight / 6.5) + 22, 140, 40);
        player8nameLabel.setBounds(frameHeight + 180 + (int) (frameHeight / 2),
                (int) (frameHeight / 6.5) + 7, 140, 40);
        addPlayer8.setBounds((frameHeight*7)/4 - 60,
                (int) (frameHeight / 6.5) + 35, 140, 40);

        addPlayer8.setIcon(img2);
        addPlayer8.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addPlayer8.setBorderPainted(false);
        addPlayer8.setContentAreaFilled(false);
        addPlayer8.setEnabled(false);
        addPlayer8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer8.setVisible(false);
                player8name.setVisible(true);
                addPlayer8Name.setVisible(true);
                addPlayer8Name.setEnabled(true);
            }
        });

        addPlayer8Name.addActionListener(new ActionListener() {
            // adds eighth player to the ArrayList of players
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(Player player: players){
                    if(player.getName().equals(player8name.getText())){
                        JOptionPane.showMessageDialog(frame,"Name is already taken");
                        return;
                    }
                }
                if(player8name.getText().length() < 3){
                    JOptionPane.showMessageDialog(frame,"Enter a name with more than or equal to 3 letters");
                    return;
                }
                players.add(new Player(player8name.getText()));
                player8nameLabel.setText(player8name.getText());
                player8nameLabel.setForeground(Color.pink);
                player8balance.setText("Rs"
                        + String.valueOf(players.get(7).getMoney()));
                frame.getContentPane().add(player8nameLabel,0);
                frame.getContentPane().add(player8balance,0);
                System.out.println(players.get(7).getName());
                player8name.setVisible(false);
                addPlayer8Name.setVisible(false);
                playerCount++;

                player8 = new JLabel();
                player8.setBounds((int) (frameHeight / 6.5 * 5.5) + 35,
                        (int) (frameHeight / 6.5 * 5.5) + 35, 35, 35);
                ImageIcon img = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/token1.png");
                player8.setIcon(img);
                frame.getContentPane().add(player8, 0);
                playerIndicators.add(player8);
            }

        });

        playerNames.add(player1nameLabel);
        playerNames.add(player2nameLabel);
        playerNames.add(player3nameLabel);
        playerNames.add(player4nameLabel);
        playerNames.add(player5nameLabel);
        playerNames.add(player6nameLabel);
        playerNames.add(player7nameLabel);
        playerNames.add(player8nameLabel);
//
        startGame = new JButton();
        finishTurn = new JButton();
        exitButton = new JButton("Exit Game");
        startGame.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
                (int) (frameHeight / 3) + 30, 140, 40);
        finishTurn.setBounds(frameHeight + 60 + (int) (frameHeight / 4),
                frameHeight - 60, 140, 40);
        exitButton.setBounds(frameHeight + (int) (frameHeight / 2) + 150,
                frameHeight - 40, 110, 30);
        ImageIcon img5 = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/startthegame.jpg");
        startGame.setIcon(img5);
        ImageIcon img6 = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/finishturn.jpg");
        finishTurn.setIcon(img6);
        startGame.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        startGame.setBorderPainted(false);
        startGame.setContentAreaFilled(false);
        startGame.setEnabled(false);
        finishTurn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        finishTurn.setBorderPainted(false);
        finishTurn.setContentAreaFilled(false);
        finishTurn.setEnabled(false);
        finishTurn.setVisible(false);
        exitButton.setBackground(Color.pink);
        exitButton.setForeground(Color.blue);
        exitButton.setVisible(false);
        exitButton.setEnabled(false);
        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                addPlayer3.setVisible(false);
                addPlayer3Name.setVisible(false);
                player3name.setVisible(false);
                addPlayer4.setVisible(false);
                player4name.setVisible(false);
                addPlayer4Name.setVisible(false);
                addPlayer5.setVisible(false);
                player5name.setVisible(false);
                addPlayer5Name.setVisible(false);
                addPlayer6.setVisible(false);
                player6name.setVisible(false);
                addPlayer6Name.setVisible(false);
                addPlayer7.setVisible(false);
                player7name.setVisible(false);
                addPlayer7Name.setVisible(false);
                addPlayer8.setVisible(false);
                player8name.setVisible(false);
                addPlayer8Name.setVisible(false);
                startNewGame();
            }
        });

        frame.getContentPane().add(player_1,2);
        frame.getContentPane().add(player_2,2);
        frame.getContentPane().add(player_3,2);
        frame.getContentPane().add(player_4,2);
        frame.getContentPane().add(player_5,2);
        frame.getContentPane().add(player_6,2);
        frame.getContentPane().add(player_7,2);
        frame.getContentPane().add(player_8,2);
        frame.getContentPane().add(addPlayer1,0);
        frame.getContentPane().add(addPlayer2,0);
        frame.getContentPane().add(addPlayer3,0);
        frame.getContentPane().add(addPlayer4,0);
        frame.getContentPane().add(addPlayer5,0);
        frame.getContentPane().add(addPlayer6,0);
        frame.getContentPane().add(addPlayer7,0);
        frame.getContentPane().add(addPlayer8,0);
        frame.getContentPane().add(addPlayer1Name,0);
        frame.getContentPane().add(addPlayer2Name,0);
        frame.getContentPane().add(addPlayer3Name,0);
        frame.getContentPane().add(addPlayer4Name,0);
        frame.getContentPane().add(addPlayer5Name,0);
        frame.getContentPane().add(addPlayer6Name,0);
        frame.getContentPane().add(addPlayer7Name,0);
        frame.getContentPane().add(addPlayer8Name,0);
        frame.getContentPane().add(startGame);
        frame.getContentPane().add(gameLog,0);
        frame.getContentPane().add(gameConsole, 2);
        frame.getContentPane().add(useGetOutOfJailCard,0);
        frame.getContentPane().add(buyProperty,0);
        frame.getContentPane().add(dontBuyProperty,0);
        frame.getContentPane().add(payRent,0);
        frame.getContentPane().add(deed, 2);


        rollTheDice = new JButton();
        rollTheDice.setBounds(frameHeight / 2 - 70, frameHeight / 2 + 40, 140,
                40);
        ImageIcon img3 = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/rollthedice.jpg");
        rollTheDice.setIcon(img3);
        rollTheDice.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rollTheDice.setBorderPainted(false);
        rollTheDice.setContentAreaFilled(false);
        rollTheDice.setVisible(false);
        dice1 = new JLabel();
        dice1.setBounds(frameHeight / 2 - 110, frameHeight / 2 - 70, 100, 100);
        ImageIcon img4 = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/dice6.jpg");
        dice1.setIcon(img4);
        dice2 = new JLabel();
        dice2.setBounds(frameHeight / 2, frameHeight / 2 - 70, 100, 100);
        dice2.setIcon(img4);
        dice1.setVisible(false);
        dice2.setVisible(false);
        frame.getContentPane().add(rollTheDice);
        frame.getContentPane().add(dice1);
        frame.getContentPane().add(dice2);

        frame.getContentPane().add(finishTurn);
        frame.getContentPane().add(exitButton);
        frame.getContentPane().add(pay50toGetOutOfJail,0);
        frame.getContentPane().add(ownedProperty,0);
        frame.getContentPane().add(propertyComboBox,0);
        frame.getContentPane().add(buyer,0);
        frame.getContentPane().add(sell,0);
        frame.getContentPane().add(sellToBuyer,0);

    }
    private void settopLeftClean() {
        topLeftLabel = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/topLeft.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        topLeftLabel.setIcon(new ImageIcon(img));
    }
    private void setleft1Clean() {
        left1Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left1.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left1Label.setIcon(new ImageIcon(img));
    }
    private void setleft2Clean() {
        left2Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left2.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left2Label.setIcon(new ImageIcon(img));
    }
    private void setleft3Clean() {
        left3Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left3.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left3Label.setIcon(new ImageIcon(img));
    }
    private void setleft4Clean() {
        left4Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left4.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left4Label.setIcon(new ImageIcon(img));
    }
    private void setleft5Clean() {
        left5Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left5.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left5Label.setIcon(new ImageIcon(img));
    }
    private void setleft6Clean() {
        left6Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left6.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left6Label.setIcon(new ImageIcon(img));
    }
    private void setleft7Clean() {
        left7Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left7.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left7Label.setIcon(new ImageIcon(img));
    }
    private void setleft8Clean() {
        left8Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left8.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left8Label.setIcon(new ImageIcon(img));
    }
    private void setleft9Clean() {
        left9Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/left9.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        left9Label.setIcon(new ImageIcon(img));
    }
    private void setbottomLeftClean() {
        bottomLeftLabel = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottomLeft.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), (int) (frameHeight /6.5 ), Image.SCALE_SMOOTH);
        bottomLeftLabel.setIcon(new ImageIcon(img));
    }
    private void settop1Clean() {
        top1Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top1.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top1Label.setIcon(new ImageIcon(img));
    }
    private void settop2Clean() {
        top2Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top2.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top2Label.setIcon(new ImageIcon(img));
    }
    private void settop3Clean() {
        top3Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top3.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top3Label.setIcon(new ImageIcon(img));
    }
    private void settop4Clean() {
        top4Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top4.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top4Label.setIcon(new ImageIcon(img));
    }
    private void settop5Clean() {
        top5Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top5.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top5Label.setIcon(new ImageIcon(img));
    }
    private void settop6Clean() {
        top6Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top6.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top6Label.setIcon(new ImageIcon(img));
    }
    private void settop7Clean() {
        top7Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top7.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top7Label.setIcon(new ImageIcon(img));
    }
    private void settop8Clean() {
        top8Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top8.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top8Label.setIcon(new ImageIcon(img));
    }
    private void settop9Clean() {
        top9Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/top9.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        top9Label.setIcon(new ImageIcon(img));
    }
    private void settopRightClean() {
        topRightLabel = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/topRight.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        topRightLabel.setIcon(new ImageIcon(img));
    }
    private void setright1Clean() {
        right1Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right1.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right1Label.setIcon(new ImageIcon(img));
    }
    private void setright2Clean() {
        right2Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right2.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right2Label.setIcon(new ImageIcon(img));
    }
    private void setright3Clean() {
        right3Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right3.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right3Label.setIcon(new ImageIcon(img));
    }
    private void setright4Clean() {
        right4Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right4.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right4Label.setIcon(new ImageIcon(img));
    }
    private void setright5Clean() {
        right5Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right5.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right5Label.setIcon(new ImageIcon(img));
    }
    private void setright6Clean() {
        right6Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right6.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right6Label.setIcon(new ImageIcon(img));
    }
    private void setright7Clean() {
        right7Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right7.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right7Label.setIcon(new ImageIcon(img));
    }
    private void setright8Clean() {
        right8Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right8.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right8Label.setIcon(new ImageIcon(img));
    }
    private void setright9Clean() {
        right9Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/right9.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), frameHeight / 13, Image.SCALE_SMOOTH);
        right9Label.setIcon(new ImageIcon(img));
    }
    private void setbottomRightClean() {
        bottomRightLabel = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/start.jpg");
        Image img= icon.getImage().getScaledInstance((int) (frameHeight / 6.5), (int) (frameHeight /6.5 ), Image.SCALE_SMOOTH);
        bottomRightLabel.setIcon(new ImageIcon(img));
    }
    private void setbottom1Clean() {
        bottom1Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom1.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom1Label.setIcon(new ImageIcon(img));
    }
    private void setbottom2Clean() {
        bottom2Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom2.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom2Label.setIcon(new ImageIcon(img));
    }
    private void setbottom3Clean() {
        bottom3Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom3.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom3Label.setIcon(new ImageIcon(img));
    }
    private void setbottom4Clean() {
        bottom4Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom4.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom4Label.setIcon(new ImageIcon(img));
    }
    private void setbottom5Clean() {
        bottom5Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom5.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom5Label.setIcon(new ImageIcon(img));
    }
    private void setbottom6Clean() {
        bottom6Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom6.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom6Label.setIcon(new ImageIcon(img));
    }
    private void setbottom7Clean() {
        bottom7Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom7.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom7Label.setIcon(new ImageIcon(img));
    }
    private void setbottom8Clean() {
        bottom8Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom8.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom8Label.setIcon(new ImageIcon(img));
    }
    private void setbottom9Clean() {
        bottom9Label = new JLabel();
        ImageIcon icon = new ImageIcon("/Users/rijulradhu/Developer/monopoly_group0/src/group0/resources/bottom9.jpg");
        Image img= icon.getImage().getScaledInstance(frameHeight / 13, (int) (frameHeight / 6.5), Image.SCALE_SMOOTH);
        bottom9Label.setIcon(new ImageIcon(img));
    }

    private void diceIndicator(int random, JLabel dice){
        switch (random) {
            case 1:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice1.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
            case 2:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice2.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
            case 3:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice3.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
            case 4:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice4.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
            case 5:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice5.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
            case 6:
                try {
                    Image img = ImageIO.read(Objects.requireNonNull(getClass().getResource(
                            "resources/dice6.jpg")));
                    dice.setIcon(new ImageIcon(img));
                } catch (IOException ex) {
                }
                break;
        }
    }

    private void startNewGame(){
        startGame.setVisible(false);
        gameLog.setVisible(true);
        finishTurn.setVisible(true);
        rollTheDice.setVisible(true);
        dice1.setVisible(true);
        dice2.setVisible(true);
        playerIndex = 0;
        ownedProperty.setVisible(true);
        propertyComboBox.setVisible(true);
        sell.setVisible(true);
        buyer.setEnabled(true);
        exitButton.setEnabled(true);
        exitButton.setVisible(true);
        updateOwnedPropBox();
        playerCount = players.size();
        rollTheDice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player presentPlayer = players.get(playerIndex);
                presentPlayer.setTurns();
                if(presentPlayer.getTurns() == COUNT+1){
                    endGame();
                    return;
                }
                randomDice1 = random.nextInt(6) + 1;
                randomDice2 = random.nextInt(6) + 1;
                diceIndicator(randomDice1,dice1);
                diceIndicator(randomDice2,dice2);
                rollTheDice.setEnabled(false);
                if(presentPlayer.getInQuarantine()){
                    presentPlayer.setCountJail(1);
                    if(presentPlayer.getCountJail() < 3){
                        pay50toGetOutOfJail.setVisible(true);
                        pay50toGetOutOfJail.setEnabled(true);
                        if(presentPlayer.getNumOfJailFree() > 0){
                            useGetOutOfJailCard.setVisible(true);
                            useGetOutOfJailCard.setEnabled(true);
                        }
                        if(randomDice1 == randomDice2){
                            presentPlayer.leaveQuarantine();
                            logText.append("/> "+presentPlayer.getName() + " got a double. Out of quarantine now. \n");
                            presentPlayer.setNotInJail();
                        }
                        finishTurn.setEnabled(true);
                    }
                    else{
                        if(presentPlayer.getNumOfJailFree() > 0){
                            useGetOutOfJailCard.setVisible(true);
                            useGetOutOfJailCard.setEnabled(true);
                        }
                        pay50toGetOutOfJail.setVisible(true);
                        pay50toGetOutOfJail.setEnabled(true);
                        exitButton.setEnabled(false);
                    }
                }
                else{
                    presentPlayer.move(randomDice1+randomDice2);
                    adjustPlayerPosition();
                    if(presentPlayer.getPosition() == 2 || presentPlayer.getPosition() == 17 ||
                            presentPlayer.getPosition() == 33){
                        logText.append("/> "+presentPlayer.getName() + " landed on Community Chest \n");
                        communityChestDraw();
                        adjustPlayerPosition();
                    }
                    else if(presentPlayer.getPosition() == 7 || presentPlayer.getPosition() == 22 ||
                            presentPlayer.getPosition() == 36){
                        logText.append("/> "+presentPlayer.getName() + " landed on Chance \n");
                        chanceDraw();
                        adjustPlayerPosition();
                    }
                    else if(presentPlayer.getPosition() == 10){
                        finishTurn.setEnabled(true);
                        logText.append("/> "+presentPlayer.getName() + " is visiting Hostel \n");
                        finishTurn.setEnabled(true);
                    }
                    else if(presentPlayer.getPosition() == 30){
                        presentPlayer.toQuarantine();
                        presentPlayer.moveto(10);
                        adjustPlayerPosition();
                        logText.append("/> "+presentPlayer.getName() + " is now in Quarantine \n");
                        finishTurn.setEnabled(true);
                    }
                    else if(presentPlayer.getPosition() == 4 || presentPlayer.getPosition() == 38){
                        payRent.setText("Pay Fee");
                        payRent.setVisible(true);
                        payRent.setEnabled(true);
                        exitButton.setEnabled(false);
                        logText.append("/> "+presentPlayer.getName() + " needs to pay Rs" + board[presentPlayer.getPosition()].getCost() + " \n");
                    }
                    else if(presentPlayer.getPosition() == 20){
                        logText.append("/> "+presentPlayer.getName() + " is in the Parking \n");
                        finishTurn.setEnabled(true);
                    }
                    else if(presentPlayer.getPosition() == 0){
                        finishTurn.setEnabled(true);
                    }
                    else{
                        logText.append("/> "+presentPlayer.getName() + " landed on " + board[presentPlayer.getPosition()].getName() + " \n");
                        if(board[presentPlayer.getPosition()].getOwner() == null){
                            buyProperty.setVisible(true);
                            buyProperty.setEnabled(true);
                            dontBuyProperty.setVisible(true);
                            dontBuyProperty.setEnabled(true);
                            finishTurn.setEnabled(false);
                        }
                        else{
                            payRent.setText("Pay Rent");
                            payRent.setVisible(true);
                            payRent.setEnabled(true);
                            exitButton.setEnabled(false);
                        }
                    }
                }
            }
        });

        finishTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(playerIndex == players.size()-1){
                    playerIndex = 0;
                }
                else{
                    playerIndex++;
                }
                while(players.get(playerIndex).getIsBankrupt()){
                    if(playerIndex == players.size()-1){
                        playerIndex = 0;
                    }
                    else{
                        playerIndex++;
                    }
                }
                rollTheDice.setEnabled(true);
                finishTurn.setEnabled(false);
                pay50toGetOutOfJail.setEnabled(false);
                pay50toGetOutOfJail.setVisible(false);
                useGetOutOfJailCard.setEnabled(false);
                useGetOutOfJailCard.setVisible(false);
                buyProperty.setVisible(false);
                buyProperty.setEnabled(false);
                dontBuyProperty.setVisible(false);
                dontBuyProperty.setEnabled(false);
                chance.setVisible(true);
                chanceText.setVisible(false);
                community.setVisible(true);
                communityText.setVisible(false);
                sellToBuyer.setEnabled(false);
                sellToBuyer.setVisible(false);
                buyer.setVisible(false);
                buyer.setEnabled(false);
                sell.setVisible(true);
                sell.setEnabled(true);
                updateOwnedPropBox();
                exitButton.setEnabled(true);
                logText.append("/> It is "+players.get(playerIndex).getName() + "\'s turn \n");
            }
        });

        pay50toGetOutOfJail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player presentPlayer = players.get(playerIndex);
                if(presentPlayer.getMoney() < 50){
                    removeFromGame(playerIndex,true, null);
                }
                else{
                    presentPlayer.substractMoney(50);
                    presentPlayer.leaveQuarantine();
                    updateBalance();
                    presentPlayer.setNotInJail();
                    finishTurn.setEnabled(true);
                    logText.append("/> "+players.get(playerIndex).getName() + " paid the Hostel fee. Allowed to go outside now. \n");
                }
                pay50toGetOutOfJail.setEnabled(false);
                pay50toGetOutOfJail.setVisible(false);
            }
        });

        useGetOutOfJailCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                players.get(playerIndex).useHostelFreeCard();
                useGetOutOfJailCard.setVisible(false);
                useGetOutOfJailCard.setEnabled(false);
                logText.append("/> "+players.get(playerIndex).getName() + " is out of Quarantine. \n");
                finishTurn.setEnabled(true);
            }
        });

        payRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(payRent.getText() == "Pay Fee"){
                    if(players.get(playerIndex).getPosition() == 4){
                        payTaxSem();
                    }
                    else if(players.get(playerIndex).getPosition() == 38){
                        payTaxDisco();
                    }
                }
                else if(payRent.getText() == "Pay New Amount"){
                    if(players.get(playerIndex).getMoney() < 10*(randomDice1+randomDice2)){
                        removeFromGame(playerIndex,false, board[players.get(playerIndex).getPosition()].getOwner());
                    }
                    else{
                        players.get(playerIndex).substractMoney(10*(randomDice1+randomDice2));
                        Player owner = board[players.get(playerIndex).getPosition()].getOwner();
                        owner.addMoney(board[players.get(playerIndex).getPosition()].rent());
                        logText.append("/> "+players.get(playerIndex).getName() + " paid the new amount \n");
                        updateBalance();
                        finishTurn.setEnabled(true);
                        payRent.setEnabled(false);
                        payRent.setVisible(false);
                    }
                    finishTurn.setEnabled(true);
                }
                else{
                    if(players.get(playerIndex).getMoney() < board[players.get(playerIndex).getPosition()].rent()){
                        removeFromGame(playerIndex, false, board[players.get(playerIndex).getPosition()].getOwner());
                    }
                    else{
                        players.get(playerIndex).substractMoney(board[players.get(playerIndex).getPosition()].rent());
                        Player owner = board[players.get(playerIndex).getPosition()].getOwner();
                        owner.addMoney(board[players.get(playerIndex).getPosition()].rent());
                        logText.append("/> "+players.get(playerIndex).getName() + " paid the rent \n");
                        updateBalance();
                        finishTurn.setEnabled(true);
                        payRent.setEnabled(false);
                        payRent.setVisible(false);
                    }
                    finishTurn.setEnabled(true);
                }
            }
        });

        buyProperty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tile property = board[players.get(playerIndex).getPosition()];
                if(players.get(playerIndex).getMoney() < property.getCost()){
                    logText.append("/> "+players.get(playerIndex).getName() + " doesn't have sufficient funds \n");
                    finishTurn.setEnabled(true);
                }
                else {
                    players.get(playerIndex).buyProperty(property);
                    logText.append("/> "+players.get(playerIndex).getName() + " bought " + property.getName() + " for Rs" + property.getCost()+"\n");
                    updateBalance();
                    buyProperty.setVisible(false);
                    buyProperty.setEnabled(false);
                    dontBuyProperty.setVisible(false);
                    dontBuyProperty.setEnabled(false);
                    finishTurn.setEnabled(true);
                    updateOwnedPropBox();
                }
            }
        });

        dontBuyProperty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finishTurn.setEnabled(true);
                buyProperty.setVisible(false);
                buyProperty.setEnabled(false);
                dontBuyProperty.setVisible(false);
                dontBuyProperty.setEnabled(false);
            }
        });

        sell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(players.get(playerIndex).getProperties().size() == 0){
                    logText.append("/> Buy a property first \n");
                    return;
                }
                buyer.setVisible(true);
                buyer.setEnabled(true);
                sellToBuyer.setVisible(true);
                sellToBuyer.setEnabled(true);
                sell.setVisible(false);
                updatePlayersBox();
            }
        });

        sellToBuyer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player selectedPlayer = players.get(0);
                for(Player player: players){
                    if(player.getName() == buyer.getSelectedItem()){
                        selectedPlayer = player;
                    }
                }
                for(Tile property: players.get(playerIndex).getProperties()){
                    if(property.getName() == propertyComboBox.getSelectedItem().toString()){
                        selectedProp = property;
                    }
                }
                int result = JOptionPane.showConfirmDialog(frame,selectedPlayer.getName()+", Do you want to buy the property for Rs"+selectedProp.getCost()+"?",
                        "Select Yes or No", JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    if(selectedPlayer.getMoney() < selectedProp.getCost()){
                        logText.append("/> "+selectedPlayer + " doesn't have sufficient funds \n");
                    }
                    else{
                        players.get(playerIndex).sellProperty(selectedProp, selectedPlayer);
                        updateOwnedPropBox();
                        updateBalance();
                        logText.append("/> "+players.get(playerIndex).getName() + " sold " + selectedProp.getName() + " for Rs" + selectedProp.getCost() + " to "+selectedPlayer.getName()+"\n");
                    }
                }
                sellToBuyer.setVisible(false);
                sellToBuyer.setEnabled(false);
                buyer.setVisible(false);
                sell.setVisible(true);
                sell.setEnabled(true);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame,"Are you sure?","Select your response",JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    removeFromGame(playerIndex,true,null);
                    if(playerCount < 2){
                        endGame();
                    }
                }
                else{
                    return;
                }
                finishTurn.setEnabled(true);
                exitButton.setEnabled(false);
                rollTheDice.setEnabled(false);
                sell.setEnabled(false);
                sellToBuyer.setVisible(false);
                buyer.setVisible(false);
                buyProperty.setVisible(false);
                dontBuyProperty.setVisible(false);
                pay50toGetOutOfJail.setVisible(false);
                payRent.setVisible(false);
                useGetOutOfJailCard.setVisible(false);
            }
        });
    }

    private void updatePlayersBox(){
        buyer.removeAllItems();
        for(Player player: players){
            if(player == players.get(playerIndex) || player.getIsBankrupt()){
                continue;
            }
            buyer.addItem(player.getName());
        }
    }

    private void updateOwnedPropBox(){
        Player presentPlayer = players.get(playerIndex);
        propertyComboBox.removeAllItems();
        for(Tile property : presentPlayer.getProperties()){
            propertyComboBox.addItem(property.getName());
        }
    }

    private void updateBalance(){
        for(int i = 0; i<players.size(); i++){
            balanceLabels.get(i).setText("Rs"+players.get(i).getMoney());
        }
    }

    private void updateBalance(int decre){
        for(int i = 0; i<players.size(); i++){
            if(i == playerIndex){
                continue;
            }
            if(players.get(i).getMoney() < decre){
                removeFromGame(i,false, players.get(playerIndex));
                continue;
            }
            players.get(i).substractMoney(decre);
        }
        updateBalance();
    }

    public void endGame(){
        Player winner = players.get(0);
        int max = 0;
        for(Player p: players){
            if(!p.getIsBankrupt()){
                if(p.getTotalValue() > max){
                    max = p.getTotalValue();
                    winner = p;
                }
            }
        }
        String[] options = {"Restart", "Exit"};
        int result = JOptionPane.showOptionDialog(frame, "Congratulations "+winner.getName()+", You won the game.", "Select the option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
        if(result == 0){
            frame.dispose();
            Monopoly monopoly1 = new Monopoly();
            monopoly1.frame.setVisible(true);
        }
        else{
            System.exit(0);
        }
    }

    private void payTaxDisco(){
        if(players.get(playerIndex).getMoney() < board[players.get(playerIndex).getPosition()].getCost()){
            removeFromGame(playerIndex,true, null);
        }
        else{
            players.get(playerIndex).substractMoney(100);
            logText.append("/> "+players.get(playerIndex).getName() + " paid the Dsico fee \n");
            updateBalance();
            finishTurn.setEnabled(true);
            payRent.setEnabled(false);
            payRent.setVisible(false);
        }
    }

    private void payTaxSem(){
        if(players.get(playerIndex).getMoney() < board[players.get(playerIndex).getPosition()].getCost()){
            removeFromGame(playerIndex,true, null);
        }
        else{
            players.get(playerIndex).substractMoney(200);
            logText.append("/> "+players.get(playerIndex).getName() + " paid the Sem fee \n");
            updateBalance();
            finishTurn.setEnabled(true);
            payRent.setEnabled(false);
            payRent.setVisible(false);
        }
    }

    private void removeFromGame(int index, boolean toBank, Player transferPlayer){
        Player playerBan = players.get(index);
        if(toBank){
            for(Tile prop: playerBan.getProperties()){
                prop.setOwnerToNull();
            }
        }
        else if(transferPlayer != null){
            for(Tile prop: playerBan.getProperties()){
                prop.setOwnerToNull();
                prop.setOwned();
                prop.setOwner(transferPlayer);
                transferPlayer.addMoney(playerBan.getMoney());
            }
        }
        playerBan.setBankrupt();
        updateBalance();
        updateOwnedPropBox();
        updatePlayersBox();
        playerCount--;
        playerIndicators.get(index).setVisible(false);
        balanceLabels.get(index).setVisible(false);
        playerNames.get(index).setVisible(false);
        Player presentPlayer = players.get(playerIndex);
        logText.append("/> "+presentPlayer.getName() + " is Bankrupt. \n/> Player is removed from the game.\n" +
                "/> Press Finish Turn to leave \n");
        finishTurn.setEnabled(true);
        updateBalance();
    };

    private void adjustPlayerPosition() {
        Player presentPlayer = players.get(playerIndex);
        JLabel presentPos = playerIndicators.get(playerIndex);
        switch (presentPlayer.getPosition()) {
            case 0:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 1:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 2:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 4.5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 3:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 4) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 4:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 3.5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 5:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 3) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 6:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 2.5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 7:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 2) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 8:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 1.5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 9:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5) + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 10:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 4, 38,
                        35);
                break;
            case 11:
                presentPos.setBounds(
                                20 + playerIndex * 3,
                                (int) (frameHeight / 6.5 * 5) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 12:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 4.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 13:
                presentPos.setBounds(
                                20 + playerIndex * 3,
                                (int) (frameHeight / 6.5 * 4) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 14:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 3.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 15:
                presentPos.setBounds(
                                20 + playerIndex * 3,
                                (int) (frameHeight / 6.5 * 3) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 16:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 2.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 17:
                presentPos.setBounds(
                                20 + playerIndex * 3,
                                (int) (frameHeight / 6.5 * 2) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 18:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 1.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 19:
                presentPos.setBounds(20 + playerIndex * 3,
                        (int) (frameHeight / 6.5) + 2 + playerIndex * 3, 38, 35);
                break;
            case 20:
                presentPos.setBounds(30 + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 21:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 22:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 1.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 23:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 2) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 24:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 2.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 25:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 3) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 26:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 3.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 27:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 4) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 28:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 4.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 29:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 30:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + playerIndex * 3,
                        20 + playerIndex * 4, 38, 35);
                break;
            case 31:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 3,
                        (int) (frameHeight / 6.5) + 2 + playerIndex * 3, 38, 35);
                break;
            case 32:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 1.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 33:
                presentPos.setBounds(
                                (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex
                                        * 3,
                                (int) (frameHeight / 6.5 * 2) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 34:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 2.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 35:
                presentPos.setBounds(
                                (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex
                                        * 3,
                                (int) (frameHeight / 6.5 * 3) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 36:
                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 3.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 37:
                presentPos.setBounds(
                                (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex
                                        * 3,
                                (int) (frameHeight / 6.5 * 4) + 2 + playerIndex * 3,
                                38, 35);
                break;
            case 38:

                presentPos.setBounds(
                        (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex * 3,
                        (int) (frameHeight / 6.5 * 4.5) + 2 + playerIndex * 3, 38,
                        35);
                break;
            case 39:
                presentPos.setBounds(
                                (int) (frameHeight / 6.5 * 5.5) + 30 + playerIndex
                                        * 3,
                                (int) (frameHeight / 6.5 * 5) + 2 + playerIndex * 3,
                                38, 35);
                break;
        }

        if (players.get(playerIndex).isDidPassGo()) {
            balanceLabels.get(playerIndex).setText(
                    "Rs" + players.get(playerIndex).getMoney());
            log = "  /> " + players.get(playerIndex).getName()
                    + " got Rs200 for passing \"GO\" " + "\n";
            logText.append(log);
            players.get(playerIndex).notPassGo();
        }
    }

    private void communityChestDraw(){
        community.setVisible(false);
        communityText.setVisible(true);
        int draw = random.nextInt(7);
        Player presentPlayer = players.get(playerIndex);
        switch (draw){
            case 0:
                communityText.setText("Advance to Go");
                presentPlayer.moveto(40);
                finishTurn.setEnabled(true);
                break;
            case 1:
                communityText.setText("Bank error. Collect Rs75");
                updateBalance();
                logText.append("/> "+presentPlayer.getName() + " got Rs75 added \n");
                finishTurn.setEnabled(true);
                break;
            case 2:
                communityText.setText("Doctor's fee. Pay Rs50");
                if(presentPlayer.getMoney() < 50){
                    removeFromGame(playerIndex,true, null);
                }
                else{
                    presentPlayer.substractMoney(50);
                    updateBalance();
                    logText.append("/> "+presentPlayer.getName() + " had to pay Rs50 \n");
                    finishTurn.setEnabled(true);
                }
                break;
            case 3:
                communityText.setText("<html> You get a GetOutOfHostel Card </html>");
                presentPlayer.addHostelFreeCard();
                logText.append("/> "+presentPlayer.getName() + " got a GetOutOfQuarantine Card \n");
                finishTurn.setEnabled(true);
                break;
            case 4:
                communityText.setText("Go to Quarantine");
                presentPlayer.moveto(10);
                presentPlayer.toQuarantine();
                logText.append("/> "+presentPlayer.getName() + " is now in Quarantine \n");
                finishTurn.setEnabled(true);
                break;
            case 5:
                communityText.setText("<html> It's your birthday. Collect Rs10 from each player</html>");
                presentPlayer.addMoney(10*(players.size()-1));
                updateBalance(10);
                logText.append("/> "+presentPlayer.getName() + " got Rs"+10*(players.size()-1)+" added \n");
                finishTurn.setEnabled(true);
                break;
            case 6:
                communityText.setText("<html> Grand party organized. Collect Rs50 from each player</html>");
                presentPlayer.addMoney(50*(players.size()-1));
                updateBalance(50);
                logText.append("/> "+presentPlayer.getName() + " got Rs"+50*(players.size()-1)+" added \n");
                finishTurn.setEnabled(true);
                break;
        }
    }

    private void chanceDraw(){
        chance.setVisible(false);
        chanceText.setVisible(true);
        int draw = random.nextInt(7);
        Player presentPlayer = players.get(playerIndex);
        switch (draw){
            case 0:
                chanceText.setText("Advance to Go");
                presentPlayer.moveto(40);
                finishTurn.setEnabled(true);
                break;
            case 1:
                chanceText.setText("<html> Advance to B-Dome (Collect Rs200 if you pass Go)</html>");
                if(presentPlayer.getPosition() == 7){
                    presentPlayer.moveto(24);
                }
                else if(presentPlayer.getPosition() == 22 || presentPlayer.getPosition() == 36){
                    presentPlayer.moveto(24);
                    presentPlayer.setDidPassGo();
                }
                logText.append("/> "+presentPlayer.getName() + " landed on " + board[presentPlayer.getPosition()].getName() + " \n");
                if(board[presentPlayer.getPosition()].getOwner() == null){
                    buyProperty.setVisible(true);
                    buyProperty.setEnabled(true);
                    dontBuyProperty.setVisible(true);
                    dontBuyProperty.setEnabled(true);
                }
                else{
                    payRent.setText("Pay Rent");
                    payRent.setVisible(true);
                    payRent.setEnabled(true);
                }
                break;
            case 2:
                chanceText.setText("<html> Advance to nearest Utility. If owned, pay 10 times the rent to the owner</html>");
                if(presentPlayer.getPosition() == 7){
                    presentPlayer.moveto(12);
                }
                else if(presentPlayer.getPosition() == 22 || presentPlayer.getPosition() == 36){
                    presentPlayer.moveto(28);
                }
                logText.append("/> "+presentPlayer.getName() + " landed on " + board[presentPlayer.getPosition()].getName() + " \n");
                if(board[presentPlayer.getPosition()].getOwner() == null){
                    buyProperty.setVisible(true);
                    buyProperty.setEnabled(true);
                    dontBuyProperty.setVisible(true);
                    dontBuyProperty.setEnabled(true);
                }
                else{
                    payRent.setText("Pay New Amount");
                    payRent.setVisible(true);
                    payRent.setEnabled(true);
                }
                break;
            case 3:
                chanceText.setText("<html>Advance to nearest Food Outlet</html>");
                if(presentPlayer.getPosition() == 7){
                    presentPlayer.moveto(5);
                }
                else if(presentPlayer.getPosition() == 22){
                    presentPlayer.moveto(25);
                }
                else if(presentPlayer.getPosition() == 36){
                    presentPlayer.moveto(35);
                }
                logText.append("/> "+presentPlayer.getName() + " landed on " + board[presentPlayer.getPosition()].getName() + " \n");
                if(board[presentPlayer.getPosition()].getOwner() == null){
                    buyProperty.setVisible(true);
                    buyProperty.setEnabled(true);
                    dontBuyProperty.setVisible(true);
                    dontBuyProperty.setEnabled(true);
                }
                else{
                    payRent.setText("Pay Rent");
                    payRent.setVisible(true);
                    payRent.setEnabled(true);
                }
                break;
            case 4:
                chanceText.setText("Advance to DLTS");
                if(presentPlayer.getPosition() == 7){
                    presentPlayer.moveto(11);
                }
                else if(presentPlayer.getPosition() == 22 || presentPlayer.getPosition() == 36){
                    presentPlayer.moveto(11);
                    presentPlayer.setDidPassGo();
                }
                logText.append("/> "+presentPlayer.getName() + " landed on " + board[presentPlayer.getPosition()].getName() + " \n");
                if(board[presentPlayer.getPosition()].getOwner() == null){
                    buyProperty.setVisible(true);
                    buyProperty.setEnabled(true);
                    dontBuyProperty.setVisible(true);
                    dontBuyProperty.setEnabled(true);
                }
                else{
                    payRent.setText("Pay Rent");
                    payRent.setVisible(true);
                    payRent.setEnabled(true);
                }
                break;
            case 5:
                chanceText.setText("Bank pays you Rs50");
                presentPlayer.addMoney(50);
                updateBalance();
                logText.append("/> "+presentPlayer.getName() + " got Rs50 added \n");
                finishTurn.setEnabled(true);
                break;
            case 6:
                chanceText.setText("<html> You get a GetOutOfHostel Card </html>");
                presentPlayer.addHostelFreeCard();
                logText.append("/> "+presentPlayer.getName() + " got a GetOutOfQuarantine Card \n");
                finishTurn.setEnabled(true);
                break;
        }
    }
}

