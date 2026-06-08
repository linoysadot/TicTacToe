import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class borderLayout {

    static boolean xturn = true;
    static boolean gameOver = false;
    static JButton[] buttons = new JButton[9];


    public static void main (String [] args){
        SoundPlayer.play("src/start.wav");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,1500);

        frame.setLayout(new BorderLayout(5,5));
        //BorderLayout: Its function is to arrange the game board itself in relation to the
        // rest of the program elements (such as the title and the exit button).
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();


        panel1.setBackground(Color.blue);

        JLabel label = new JLabel("Welcome to Tic Tac Toe");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));

        label.setForeground(Color.WHITE); // צבע טקסט לבן כדי שייראה על כחול
        label.setFont(new Font("David", Font.CENTER_BASELINE, 60));// גודל וסוג גופן
        panel1.add(label);



        panel3.setBackground(Color.RED);
        JLabel label3 = new JLabel(" number of games: " );
        label3.setForeground(Color.WHITE); // צבע טקסט לבן כדי שייראה על אדום
        label3.setFont(new Font("David", Font.CENTER_BASELINE, 30));// גודל וסוג גופן

        JLabel label3_2 = new JLabel(" time for each game: ");
        label3_2.setForeground(Color.WHITE);
        label3_2.setFont(new Font("David", Font.CENTER_BASELINE, 30));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 150));
        panel3.setLayout(new GridLayout(8, 0, 0, 50));

        panel3.add(label3);
        panel3.add(label3_2);



        panel4.setBackground(Color.gray);
        JLabel label4 = new JLabel(" Score: ");
        label4.setForeground(Color.WHITE); // צבע טקסט לבן כדי שייראה על כחול
        label4.setFont(new Font("David", Font.CENTER_BASELINE, 30));// גודל וסוג גופן
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 150));
        panel4.setLayout(new GridLayout(7, 0, 0, 50));

        panel4.add(label4);
        JLabel label4_2 = new JLabel(" toleen: 0"+" "+" " + "  linoy: 0");
        label4_2.setForeground(Color.WHITE);
        label4_2.setFont(new Font("David", Font.CENTER_BASELINE, 30));
        panel4.add(label4_2);



        panel5.setBackground(Color.WHITE);
        panel2.setBackground(Color.pink);


        panel5.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {

            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));

            buttons[i].addActionListener(e -> {

                JButton btn = (JButton) e.getSource();

                if (gameOver || !btn.getText().equals("")) {
                    return;
                }

                if (xturn) {
                    btn.setText("X");
                } else {
                    btn.setText("O");
                }

                if (checkWinner()) {

                    gameOver = true;


                     //סאונד ניצחון
                     SoundPlayer.play("src/win.wav");

                    JLabel label2 = new JLabel("the winner is: "+(xturn ? "toleen" : "linoy"));


                    label2.setForeground(Color.WHITE); // צבע טקסט לבן כדי שייראה על ורוד
                    label2.setFont(new Font("David", Font.CENTER_BASELINE, 60));// גודל וסוג גופן
                    panel2.add(label2);



                    return;
                }

                if (checkDraw()) {

                    gameOver = true;


                    // סאונד תיקו
                    SoundPlayer.play("src/drow.wav");
                    JLabel label2 = new JLabel("the winner is: "+(xturn ? "toleen" : "linoy"));

                    return;
                }

                xturn = !xturn;
            });

            panel5.add(buttons[i]);
        }




        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(300,150));
        panel3.setPreferredSize(new Dimension(300,400));
        panel4.setPreferredSize(new Dimension(300,100));
        panel5.setPreferredSize(new Dimension(100,100));
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
        panel5.setBounds(50, 50, 400, 400);


        frame.add(panel5);
       frame.setVisible(true);
        frame.setResizable(false);
        frame.add(panel1);
        frame.repaint();

    }
    public static boolean checkWinner() {

        int[][] win = {
                {0,1,2},
                {3,4,5},
                {6,7,8},

                {0,3,6},
                {1,4,7},
                {2,5,8},

                {0,4,8},
                {2,4,6}
        };

        for (int[] line : win) {

            String a = buttons[line[0]].getText();
            String b = buttons[line[1]].getText();
            String c = buttons[line[2]].getText();

            if (!a.equals("") && a.equals(b) && b.equals(c)) {

                return true;
            }
        }

        return false;
    }
    public static boolean checkDraw() {

        for (JButton btn : buttons) {

            if (btn.getText().equals("")) {
                return false;
            }
        }

        return true;
    }
}