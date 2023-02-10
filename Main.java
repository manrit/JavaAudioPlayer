package somePackage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.IOException;
import java.util.Scanner;
import java.util.scanner;
import javax.sound.sampled.*;


public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, java.io.IOException, LineUnavailableException {
	
		//can create a GUI system that played until music is done or leave a scanner so we can keep playing without stippong 
		
		Scanner scanner = new Scanner(System.in);
		
		
		File file = new File("ice.wav");
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		String response = " "; 
		
		
		while(!response.equals("Q")){
			
			System.out.println("P = play, S = Stop, R = reset, Q = Quit ");
			System.out.println("Enter your choice: ");
			response = scanner.next(); 
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("s"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("Q"): clip.close();
				break;
				default: System.out.println("not a valid response");
			}
		}
		
		
		
	}
	

}

