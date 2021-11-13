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
			
			if(label.getText().equals("NEW MEMORY UNLOCKED!"))
			{
				label.setText("You got a new message!");
			}
			else if(label.getText().equals("You got a new message!"))
			{
				label.setText("Hey Yukta!");
			}
			else if(label.getText().equals("Hey Yukta!"))
			{
				label.setText("The date we had was really fun.");
			}
			else if(label.getText().equals("The date we had was really fun."))
			{
				label.setText("We tried something new");
			}
			else if(label.getText().equals("We tried something new"))
			{
				label.setText("and saw something old.");
			}
			else if(label.getText().equals("and saw something old."))
			{
				label.setText("We were at something blue...");
			}
			else if(label.getText().equals("We were at something blue..."))
			{
				label.setText("if you count the sky and ocean.");
				
				Pane pane2 = new HBox(15);
				Image img = new Image("/Beach.jpg");
				
				ImageView img2 = new ImageView(img);
				img2.setFitHeight(700);
				img2.setFitWidth(500);
				pane2.getChildren().add(img2);
				
				Scene scene2 = new Scene(pane2, 500, 700);
				
				Stage secondStage = new Stage();
				secondStage.setScene(scene2);
				secondStage.show();
			}
			else if(label.getText().equals("if you count the sky and ocean."))
			{
				label.setText("and finally something borrowed.");
			}
			else if(label.getText().equals("and finally something borrowed."))
			{
				label.setText("I still at this point in time have your container");
			}
			else if(label.getText().equals("I still at this point in time have your container"))
			{
				label.setText("We just completed a wedding tradition.");
			}
			else if(label.getText().equals("We just completed a wedding tradition."))
			{
				label.setText("The phrase goes like this...");
			}
			else if(label.getText().equals("The phrase goes like this..."))
			{
				label.setText("Something Old,");
			}
			else if(label.getText().equals("Something Old,"))
			{
				label.setText("Something New,");
			}
			else if(label.getText().equals("Something New,"))
			{
				label.setText("Something Borrowed,");
			}
			else if(label.getText().equals("Something Borrowed,"))
			{
				label.setText("Something Blue.");
			}
			else if(label.getText().equals("Something Blue."))
			{
				label.setText("I'm not sure for the reason.");
			}
			else if(label.getText().equals("I'm not sure for the reason."))
			{
				label.setText("But I know its used frequently in weddings.");
			}
			else if(label.getText().equals("But I know its used frequently in weddings."))
			{
				label.setText("While we aren't getting married yet...");
			}
			else if(label.getText().equals("While we aren't getting married yet..."))
			{
				label.setText("I noticed the resemblance.");
			}
			else if(label.getText().equals("I noticed the resemblance."))
			{
				label.setText("A memory was made");
			}
			else if(label.getText().equals("A memory was made"))
			{
				label.setText("And now you can always call upon it");
			}
			else if(label.getText().equals("And now you can always call upon it"))
			{
				label.setText("We went out 11/10/21");
			}
			else if(label.getText().equals("We went out 11/10/21"))
			{
				label.setText("No special occasion but...");
			}
			else if(label.getText().equals("No special occasion but..."))
			{
				label.setText("It was a nice day regardless.");
			}
			else if(label.getText().equals("It was a nice day regardless."))
			{
				label.setText("We are nearing 3 years.");
			}
			else if(label.getText().equals("We are nearing 3 years."))
			{
				label.setText("but it gets difficult to remember all we have done");
			}
			else if(label.getText().equals("but it gets difficult to remember all we have done"))
			{
				label.setText("So I hope these memories can help refresh");
			}
			else if(label.getText().equals("So I hope these memories can help refresh"))
			{
				label.setText("the happier days much farther down");
			}
			else if(label.getText().equals("the happier days much farther down"))
			{
				label.setText("or if you are sad.");
			}
			else if(label.getText().equals("or if you are sad."))
			{
				label.setText("I Love You Yukta!");
			}
			else if(label.getText().equals("I Love You Yukta!"))
			{
				label.setText("End of Message");
			}
			else if(label.getText().equals("End of Message"))
			{
				label.setText("IM NOT CRYING! YOU ARE CRYING!");
			}
			else if(label.getText().equals("IM NOT CRYING! YOU ARE CRYING!"))
			{
				System.exit(0);
			}
			
		}

}