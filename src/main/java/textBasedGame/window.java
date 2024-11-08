
package textBasedGame;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
public class window {
    
    JFrame myWindow;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50);
    Font normalText = new Font("Times New Roman", Font.PLAIN, 30);
    Font authorText = new Font("Times New Roman", Font.PLAIN, 23);
    JButton startButton, nextButton, secondNextButton, thirdNextButton;
    JTextArea mainTextArea;
    String postion;
    
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    
    public static void main(String[] args){
        new window();
    }
    
    public window(){
        
        myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.getContentPane().setBackground(Color.black);
        myWindow.setLayout(null);
        myWindow.setVisible(true);
        con = myWindow.getContentPane();
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("The Walls of the Fallen");
        titleNameLabel.setForeground(Color.white);
        titleNamePanel.add(titleNameLabel);
        
       startButtonPanel = new JPanel();
       startButtonPanel.setBounds(300, 300, 200, 100);
       startButtonPanel.setBackground(Color.black);
       
       
       startButton = new JButton("START");
       startButton.setBackground(Color.black);
       startButton.setForeground(Color.white);
       startButton.setFocusPainted(false);
       startButton.setFont(normalText);
       startButton.addActionListener(tsHandler);
        
        titleNameLabel.setFont(titleFont);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
        
        
        
    }
    
    public void createGameScreen(){
        
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);
        
        mainTextArea = new JTextArea();
       
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(authorText);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
        
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(200, 350, 400, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);
        
        nextButton = new JButton("Next");
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(choiceHandler);
        nextButton.setFont(normalText);
        nextButton.setActionCommand("c1");
        choiceButtonPanel.add(nextButton);
        
        secondNextButton = new JButton("");
        secondNextButton.setBackground(Color.black);
        secondNextButton.setForeground(Color.white);
        secondNextButton.setFocusPainted(false);
        secondNextButton.addActionListener(choiceHandler);
        secondNextButton.setFont(normalText);
        secondNextButton.setActionCommand("c2");
        choiceButtonPanel.add(secondNextButton);
        
        thirdNextButton = new JButton("");
        thirdNextButton.setBackground(Color.black);
        thirdNextButton.setForeground(Color.white);
        thirdNextButton.setFocusPainted(false);
        thirdNextButton.addActionListener(choiceHandler);
        thirdNextButton.setFont(normalText);
        thirdNextButton.setActionCommand("c3");
        choiceButtonPanel.add(thirdNextButton);
        
        
        
        
    }
    
    public class TitleScreenHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            createGameScreen();
            
            firstIntro();
        }
    }
    
    public class ChoiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String yourChoice = event.getActionCommand();
            
            
            
            
            if(yourChoice.equals("c1")){
                secondIntro();
               }  else if(yourChoice.equals("c2")){
                    thirdIntro();
                }
            }
        }
    
    
    public void firstIntro(){
        String position = "firstIntro";
        
    mainTextArea.setText("In plunge into chaos and darkness, where life and death blur\n" +
                       "Musashi Miyamoto, once an honorable warrior,\n" +
                       "now walks the fine line between salvation and oblivion\n" +
                       "bound as a puppet to the demonic realm.");  


    
    nextButton.setText("Next");
    secondNextButton.setVisible(false);
    thirdNextButton.setVisible(false);

    
    
    }
    
    public void secondIntro(){
        String position = "secondIntro";
        mainTextArea.setText("The land is on the brink of destruction, "
                + "as an ancient demonic \nforce stirs beneath the surface, "
                + "threatening to annihilate all of \nhumanity. ");
        
        nextButton.setVisible(false);
        secondNextButton.setVisible(true);
        secondNextButton.setText("next");
    }
    
    public void thirdIntro(){
        String position = "thirdIntro";
        mainTextArea.setText("Now, the battle approaches. Before Musashi stands Krev Malak,the God of Despair. "
                + "An ancient entity who thrives on suffering and shadows. Get ready for BATTLE!");  
        
        nextButton.setVisible(false);
        secondNextButton.setVisible(false);
        thirdNextButton.setVisible(true);
        thirdNextButton.setText("FIGHT!");
    }
    
    
  
    
}

