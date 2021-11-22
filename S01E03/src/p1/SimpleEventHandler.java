package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class SimpleEventHandler implements EventHandler
{
	private Label label;
	public Image img;
	
		public SimpleEventHandler(Label label)
		{
			this.label = label;
		
		}
		public SimpleEventHandler(Image img)
		{
			this.img = img;
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("Good Morning, Yukta!"))
			{
				label.setText("Good Afternoon, Yukta!");
			}
			else if(label.getText().equals("Good Afternoon, Yukta!"))
			{
				label.setText("Good Night, Yukta!");
			}
			else if(label.getText().equals("Good Night, Yukta!"))
			{
				label.setText("I love you so much.");
			}
			else if(label.getText().equals("I love you so much."))
			{
				label.setText("I miss you so much.");
			}
			else if(label.getText().equals("I miss you so much."))
			{
				label.setText("Sleep well?");
				
			}
			else if(label.getText().equals("Sleep well?"))
			{
				label.setText("Sweet dreams Yu.");
				
			}
			else if(label.getText().equals("Sweet dreams Yu."))
			{
				label.setText("Here you go.");
				
			}
			else if(label.getText().equals("Here you go."))
			{
				label.setText("Sometimes the creator falls asleep.");
			}
			else if(label.getText().equals("Sometimes the creator falls asleep."))
			{
				label.setText("Sometimes hes in a rush in the morning.");
			}
			else if(label.getText().equals("Sometimes hes in a rush in the morning."))
			{
				label.setText("I've compiled you a list of things he has consistently said to you,");
			}
			else if(label.getText().equals("I've compiled you a list of things he has consistently said to you,"))
			{
				label.setText("so if there are ever any days he may have forgotten");
			}
			else if(label.getText().equals("so if there are ever any days he may have forgotten"))
			{
				label.setText("you have it right here.");
			}
			else if(label.getText().equals("you have it right here."))
			{
				label.setText("Though in retrospect,");
			}
			else if(label.getText().equals("Though in retrospect,"))
			{
				label.setText("the creator is dumb.");
			}
			else if(label.getText().equals("the creator is dumb."))
			{
				label.setText("Like, how can he forget?");
			}
			else if(label.getText().equals("Like, how can he forget?"))
			{
				label.setText("How can he sleep?");
			}
			else if(label.getText().equals("How can he sleep?"))
			{
				label.setText("I don't forget.");
			}
			else if(label.getText().equals("I don't forget."))
			{
				label.setText("I don't need sleep.");
			}
			else if(label.getText().equals("I don't need sleep."))
			{
				label.setText("See... Im better already.");
			}
			else if(label.getText().equals("See... Im better already."))
			{
				label.setText("Where was I going with this?");
			}
			else if(label.getText().equals("Where was I going with this?"))
			{
				label.setText("Eh... I cant remember. I'm tired.");
			}
			else if(label.getText().equals("Eh... I cant remember. I'm tired."))
			{
				label.setText("Maybe I'll take a nap.");
			}
			else if(label.getText().equals("Maybe I'll take a nap."))
			{
				label.setText("Good Morning, Yukta! ");
			}
			else if(label.getText().equals("Good Morning, Yukta! "))
			{
				label.setText("Good Afternoon, Yukta! ");
			}
			else if(label.getText().equals("Good Afternoon, Yukta! "))
			{
				label.setText("Good Night, Yukta! ");
			}
			else if(label.getText().equals("Good Night, Yukta! "))
			{
				label.setText("See.... I remembered to say it.");
			}
			else if(label.getText().equals("See.... I remembered to say it."))
			{
				label.setText("Oh yea Thanksgiving is coming up soon.");
			}
			else if(label.getText().equals("Oh yea Thanksgiving is coming up soon."))
			{
				label.setText("Thank you, Yukta!");
			}
			else if(label.getText().equals("Thank you, Yukta!"))
			{
				label.setText("The creator gave me life as a purpose to make you smile.");
			}
			else if(label.getText().equals("The creator gave me life as a purpose to make you smile."))
			{
				label.setText("So I also appreciate you.");
			}
			else if(label.getText().equals("So I also appreciate you."))
			{
				label.setText("Happy Thanksgiving!");
			}
			else if(label.getText().equals("Happy Thanksgiving!"))
			{
				label.setText("P.S I would like some videogames for Black Friday. I got no cash.");
			}
			else if(label.getText().equals("P.S I would like some videogames for Black Friday. I got no cash."))
			{
				System.exit(0);
			}
			
		}

}