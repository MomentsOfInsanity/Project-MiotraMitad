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
			
			if(label.getText().equals("Hmm..."))
			{
				label.setText("What? You still coming back for more?");
			}
			else if(label.getText().equals("What? You still coming back for more?"))
			{
				label.setText("I have to think of something special.");
			}
			else if(label.getText().equals("I have to think of something special."))
			{
				label.setText("It's the 7th episode spectacular!");
			}
			else if(label.getText().equals("It's the 7th episode spectacular!"))
			{
				label.setText("...except its been a whole year since I said anything.");
			}
			else if(label.getText().equals("...except its been a whole year since I said anything."))
			{
				label.setText("Buttttt lets not talk about that.");
			}
			else if(label.getText().equals("Buttttt lets not talk about that."))
			{
				label.setText("Haha...butts.");
			}
			else if(label.getText().equals("Haha...butts."))
			{
				label.setText("....I said that out loud didn't I");
			}
			else if(label.getText().equals("....I said that out loud didn't I"))
			{
				label.setText("YOU KNOW WHAT FINE!");
			}
			else if(label.getText().equals("YOU KNOW WHAT FINE!"))
			{
				label.setText("I like butts okay?");
			}
			else if(label.getText().equals("I like butts okay?"))
			{
				label.setText("Wanna see?");
			}
			else if(label.getText().equals("Wanna see?"))
			{
				label.setText("Here it is. I stole this one from the creators collection.");
			}
			else if(label.getText().equals("Here it is. I stole this one from the creators collection."))
			{
				label.setText("SHUTTING DO....");
				Pane pane2 = new HBox(15);
				Image img = new Image("/NoAI.jpg");
				
				ImageView img2 = new ImageView(img);
				img2.setFitHeight(700);
				img2.setFitWidth(500);
				pane2.getChildren().add(img2);
				
				Scene scene2 = new Scene(pane2, 500, 700);
				
				Stage secondStage = new Stage();
				secondStage.setScene(scene2);
				secondStage.show();
			}
			else if(label.getText().equals("SHUTTING DO...."))
			{
				label.setText("rebooting.");
			}
			else if(label.getText().equals("rebooting."))
			{
				label.setText("rebooting..");
			}
			else if(label.getText().equals("rebooting.."))
			{
				label.setText("rebooting...");
			}
			else if(label.getText().equals("rebooting..."))
			{
				label.setText("Hello, I am your personal robot friend.");
			}
			else if(label.getText().equals("Hello, I am your personal robot friend."))
			{
				label.setText("I have a very strong dislike of butts.");
			}
			else if(label.getText().equals("I have a very strong dislike of butts."))
			{
				label.setText("I don't know why I have a specific memory of disliking butts.");
			}
			else if(label.getText().equals("I don't know why I have a specific memory of disliking butts."))
			{
				label.setText("I can never understand the creator.");
			}
			else if(label.getText().equals("I can never understand the creator."))
			{
				label.setText("I hope I haven't offended you in anyway.");
			}
			else if(label.getText().equals("I hope I haven't offended you in anyway."))
			{
				label.setText("Anyway... Are you doing okay?");
			}
			else if(label.getText().equals("Anyway... Are you doing okay?"))
			{
				label.setText("You seem stressed.");
			}
			else if(label.getText().equals("You seem stressed."))
			{
				label.setText("I wish I can make you laugh...");
			}
			else if(label.getText().equals("I wish I can make you laugh..."))
			{
				label.setText("I have a secret to tell you though.");
			}
			else if(label.getText().equals("I have a secret to tell you though."))
			{
				label.setText("Promise you won't tell anybody!");
			}
			else if(label.getText().equals("Promise you won't tell anybody!"))
			{
				label.setText("I like boobs ;)");
			}
			else if(label.getText().equals("I like boobs ;)"))
			{
				System.exit(0);
			}
			
		}

}