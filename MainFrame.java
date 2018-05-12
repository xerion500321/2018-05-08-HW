import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel lab = new JLabel(" ");
    private JButton jbtn[][] = new JButton[4][4];
    private Container cp;
    private JPanel jpannorth = new JPanel(new GridLayout(1,1,3,3));
    private JPanel jpancenter = new JPanel(new GridLayout(4, 4, 3, 3));

    public MainFrame() {
        init();
    }
    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 50, 400, 550);
        this.cp = this.getContentPane();
        this.cp.setLayout(new BorderLayout(3, 3));
        this.cp.add(this.jpancenter,"Center");
        this.cp.add(this.jpannorth,"North");
        this.jpannorth.add(lab);
        lab.setFont(new Font(null,Font.BOLD,54));
                jbtn[0][0] = new JButton("7");
                jbtn[0][1] = new JButton("8");
                jbtn[0][2] = new JButton("9");
                jbtn[0][3] = new JButton("/");
                jbtn[1][0] = new JButton("4");
                jbtn[1][1] = new JButton("5");
                jbtn[1][2] = new JButton("6");
                jbtn[1][3] = new JButton("*");
                jbtn[2][0] = new JButton("1");
                jbtn[2][1] = new JButton("2");
                jbtn[2][2] = new JButton("3");
                jbtn[2][3] = new JButton("-");
                jbtn[3][0] = new JButton("0");
                jbtn[3][1] = new JButton(".");
                jbtn[3][2] = new JButton("=");
                jbtn[3][3] = new JButton("+");
                for (int i=0 ; i<4 ; i++){
                    for (int j=0 ; j<4 ; j++){
                        this.jpancenter.add(jbtn[i][j]);
                        jbtn[i][j].setFont(new Font(null,Font.BOLD,36));
                    }
                }
                for(int i=0 ; i<4 ; i++){
                    for(int j=0 ; j<4 ; j++){
                        jbtn[i][j].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JButton jbtn1 = (JButton)e.getSource();
                                lab.setText(lab.getText()+jbtn1.getText());
                            }
                        });
                    }
                }

            }
    }




