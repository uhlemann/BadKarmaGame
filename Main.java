import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Random;
 
// Damit Objekte der Klasse BeispielListener
// zum ActionListener werden kann, muss das Interface
// ActionListener implementiert werden
public class Main extends JFrame implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    
    JLabel label;
    JPanel panel;
 
    public Main(){
        this.setTitle("BadKarmaGame");
        this.setSize(700, 200);
        panel = new JPanel();
 
        // Leeres JLabel-Objekt wird erzeugt
        label = new JLabel();
 
        //Drei Buttons werden erstellt
        button1 = new JButton("2");
        button2 = new JButton ("3");
        button3 = new JButton ("4");
        button4 = new JButton ("5");
        button5 = new JButton ("6");
        button6 = new JButton ("7");
        button7 = new JButton ("8");
        button8 = new JButton ("9");
        button9 = new JButton ("10");
        button10 = new JButton ("11");
        button11 = new JButton ("12");
        button12 = new JButton ("STRAFE");
        
        //Buttons werden dem Listener zugeordnet
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        
        //Buttons werden dem JPanel hinzugefügt
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        
        //JLabel wird dem Panel hinzugefügt
        panel.add(label);
        this.add(panel);
    }
 
    public static void main(String[] args)
    {
        // Ein neues Objekt der Klasse BeispielListener wird erzeugt
        // und sichtbar gemacht
        Main bl = new Main();
        bl.setVisible(true);
    }
 
    public void actionPerformed (ActionEvent ae){
        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        //String path = "/home/maik/Bilder/badKarmaGame/"; 
    	
        String str1 = "Trink ein Getränk deiner Wahl";
        String str2 = "Bruderschaftstrinken mit deinem linken Mitspieler.";
        String str3 = "Trink von dem Getränk mit dem hösten Alkoholgehalt einen Doppelten (4cl).";
        String str4 = "Trink 100ml Wasser.";
        String str5 = "Würfel nochmal!";
        String str6 = "EX das Getränk des Mitspielers rechts von dir.";
        String str7 = "Du darfst wählen, wer trinken muss. Und was.";
        String str8 = "Ein Mitspieler deiner Wahl muss dein Getränk (so wie es ist) zur Hälfte austrinken.";
        String str9 = "Fülle die Gläser aller Mitspieler auf!";
        String str10 = "Der Mitspieler der dir gegenüber sitzt, sagt dir eine Fitnesübung. Mache 5 Wiederholungen!";
        String str11 = "Alle müssen trinken! (Getränk nach Wahl, ausser NICHT-ALKOHOLISCHE-GETRÄNKE)";
        String str12 = "Ein 'normales' Glas wird mit je 2cl von allen Getränke aufgfüllt. Du musst es austrinken!";
        
    	if(ae.getSource() == this.button1){
            label.setText(str1);
        }
        else if(ae.getSource() == this.button2){
            label.setText(str2);
        }
        else if (ae.getSource() == this.button3){
            label.setText(str3);
        }
        else if (ae.getSource() == this.button4){
            label.setText(str4);
        }
        else if (ae.getSource() == this.button5){
            label.setText(str5);
        }
        else if (ae.getSource() == this.button6){
            label.setText(str6);
        }
        else if (ae.getSource() == this.button7){
            label.setText(str7);
        }
        else if (ae.getSource() == this.button8){
            label.setText(str8);
        }
        else if (ae.getSource() == this.button9){
            label.setText(str9);
        }
        else if (ae.getSource() == this.button10){
            label.setText(str10);
        }
        else if (ae.getSource() == this.button11){
            label.setText(str11);
        }
        else if (ae.getSource() == this.button12){
            label.setText(str12);
        }
        
    }
    
    public static int zufall(){
    	// erzeugt ein neuen zufallsgenerator
    	Random würfel = new Random();
    	
    	//es wird eine zahl zwischen 1 und 12 ausgegeben
    	int zahl = 1+ würfel.nextInt(12);
    	return zahl;
    }
    
}
