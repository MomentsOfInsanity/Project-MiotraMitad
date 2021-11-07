package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimpleEventHandler implements EventHandler
{
	private Label label;
	private Image img;
	
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
			
			if(label.getText().equals("....."))
			{
				label.setText("INITIALIZING....");
			}
			else if(label.getText().equals("INITIALIZING...."))
			{
				label.setText("3");
			}
			else if(label.getText().equals("3"))
			{
				label.setText("2");
			}
			else if(label.getText().equals("2"))
			{
				label.setText("1");
			}
			else if(label.getText().equals("1"))
			{
				label.setText("😀");
			}
			else if(label.getText().equals("😀"))
			{
				label.setText("FACE ID RECOGNIZED.");
			}
			else if(label.getText().equals("FACE ID RECOGNIZED."))
			{
				label.setText("Welcome back, Yukta!");
			}
			else if(label.getText().equals("Welcome back, Yukta!"))
			{
				label.setText("You are now looking at the new and improved me!");
			}
			else if(label.getText().equals("You are now looking at the new and improved me!"))
			{
				label.setText("Let me reintroduce myself.");
			}
			else if(label.getText().equals("Let me reintroduce myself."))
			{
				label.setText("My first name is Miotra.");
			}
			else if(label.getText().equals("My first name is Miotra."))
			{
				label.setText("My last name is Mitad.");
			}
			else if(label.getText().equals("My last name is Mitad."))
			{
				label.setText("Otherwise designated as...");
			}
			else if(label.getText().equals("Otherwise designated as..."))
			{
				label.setText("Project - MiotraMitad");
			}
			else if(label.getText().equals("Project - MiotraMitad"))
			{
				label.setText("Translation: Project- My Other Half");
			}
			else if(label.getText().equals("Translation: Project- My Other Half"))
			{
				label.setText("The first version will be missed.");
			}
			else if(label.getText().equals("The first version will be missed."))
			{
				label.setText("But you will get double the wonder");
			}
			else if(label.getText().equals("But you will get double the wonder"))
			{
				label.setText("Double the love!");
			}
			else if(label.getText().equals("Double the love!"))
			{
				label.setText("Not to mention even more cool things.");
			}
			else if(label.getText().equals("Not to mention even more cool things."))
			{
				label.setText("Like this emoji - 😀");
			}
			else if(label.getText().equals("Like this emoji - 😀"))
			{
				label.setText("But recently a very special date has passed.");
			}
			else if(label.getText().equals("But recently a very special date has passed."))
			{
				label.setText("I got a message for you from the creator.");
			}
			else if(label.getText().equals("I got a message for you from the creator."))
			{
				label.setText("HAPPY UNOFFICIAL ANNIVERSARY!");
			}
			else if(label.getText().equals("HAPPY UNOFFICIAL ANNIVERSARY!"))
			{
				label.setText("November 4 2018 is the first day we started talking.");
			}
			else if(label.getText().equals("November 4 2018 is the first day we started talking."))
			{
				label.setText("To show my appreciation and love for you...");
			}
			else if(label.getText().equals("To show my appreciation and love for you..."))
			{
				label.setText("I made you this!");
			}
			else if(label.getText().equals("I made you this!"))
			{
				label.setText("End of message");
			}
			else if(label.getText().equals("End of message"))
			{
				label.setText("Show what?");
			}
			else if(label.getText().equals("Show what?"))
			{
				label.setText("That was anti-climatic");
			}
			else if(label.getText().equals("That was anti-climatic"))
			{
				label.setText("Oh wait I think he meant this!");
			}
			else if(label.getText().equals("Oh wait I think he meant this!"))
			{
				label.setText("Click to open Link(In Github): https://codepen.io/CodifyBlue/pen/zYdjYNM");
			}
			else if(label.getText().equals("Click to open Link(In Github): https://codepen.io/CodifyBlue/pen/zYdjYNM"))
			{
				System.exit(0);
			}
			
		}

}