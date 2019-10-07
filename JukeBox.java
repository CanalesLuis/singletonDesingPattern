/**
 * @author Luis
 * 
 */
import java.util.*;

public class JukeBox {
	
	private Queue<String> songQueue = new LinkedList<String>();
	private static JukeBox jukeBox;
	
	private JukeBox() {}
	
	/**
	 * instantiates and only allows one instance of Juke Box to occur
	 */
	public static JukeBox getInstance() {
		if(jukeBox == null) {
			System.out.println("Initializing a JukeBox!!! Let's get Dancing");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	
	/**
	 * Prints by peeking into songQueue if it is empty
	 * prints message to add to song queue or prints to
	 * "Jam" to song at the top of the queue
	 */
	public void playNextSong() {
		if(songQueue.peek()==null){
			System.out.println("You need to add songs to the list");
		}
		else{
			System.out.println("Let's jam to "+songQueue.peek());
			songQueue.remove();
		}
	}
	
	/**
	 * @param songName
	 * Adds song to songqueue by taking in a string
	 * prints message "SongName is now number # on the list"
	 * 
	 */
	public void requestSong(String songName)	{
		songQueue.add(songName);
		System.out.println(songName+" is now number "+songQueue.size()+" on the list");
	}
	
	/**
	 * @return
	 * Tests if songqueue is size is 0
	 * if 0 then song queue is empty and returns false
	 * if not 0 then returns true, playlist not empty
	 * 
	 */
	public boolean hasMoreSongs() {
		if(songQueue.size() == 0) {
			return false;
		}
		return true;
	}
	
	
}
