import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/*
<applet  code="Music" width=430 height=250>
</applet>
*/

public class Music extends Applet implements ActionListener
{
Button b1,b2;
List l;
AudioClip ac;

public void init()
{
    

   l=new List(5);
   l.add("SMACK THAT.mp3");
   l.add("SPIDER VERSE.mp3");
   l.add("VELLIPOMAKEY.mp3");
   l.add("MIA.mp3");
   l.add("BELIEVER.mp3");
      
    
 
System.out.println("initializing an applet");
System.out.println("The full path to our applet file : " + getDocumentBase());	
System.out.println("Directory in which our applet file is located : " + getCodeBase());	


b1 = new Button("Play");
add(b1);
b2= new Button("Stop");
add(b2);
add(l);

b1.addActionListener(this);
b2.addActionListener(this);
l.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{
  if (ae.getActionCommand().equals("Play")&&(l.getSelectedIndex()==0)){
   play(getDocumentBase(),"akon.wav");}
 
  else if(ae.getActionCommand().equals("Play")&&(l.getSelectedIndex()==1)){
   play(getDocumentBase(),"spider.wav");}

   else if(ae.getActionCommand().equals("Play")&&(l.getSelectedIndex()==2)){
   play(getDocumentBase(),"vellipo.wav");}

        else if(ae.getActionCommand().equals("Play")&&(l.getSelectedIndex()==3)){
   play(getDocumentBase(),"mia.wav");}

         else if(ae.getActionCommand().equals("Play")&&(l.getSelectedIndex()==4)){
   play(getDocumentBase(),"believer.wav");}






     
      else if(ae.getActionCommand().equals("Stop")&&(l.getSelectedIndex()==0))
             {ac=getAudioClip(getDocumentBase(),"akon.wav");
                   ac.stop();}
         else if(ae.getActionCommand().equals("Stop")&&(l.getSelectedIndex()==1))
                {ac=getAudioClip(getDocumentBase(),"spider.wav");
                   ac.stop();}
            else if(ae.getActionCommand().equals("Stop")&&(l.getSelectedIndex()==2))
                  {ac=getAudioClip(getDocumentBase(),"vellipo.wav");
                   ac.stop();}

             else if(ae.getActionCommand().equals("Stop")&&(l.getSelectedIndex()==3))
                  {ac=getAudioClip(getDocumentBase(),"mia.wav");
                   ac.stop();}


               else if(ae.getActionCommand().equals("Stop")&&(l.getSelectedIndex()==4))
                  {ac=getAudioClip(getDocumentBase(),"believer.wav");
                   ac.stop();}


}


public void paint(Graphics g)
{
g.drawString(" Select the song and Click on the play button to play the music", 80,150);
showStatus("Applet playing audio(.wav file)");
l.setBounds(250,10,150,70);

}
}