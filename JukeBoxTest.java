import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


class JukeBoxTest {
	
	JukeBox jukeBox = JukeBox.getInstance();
	
	@BeforeClass
	public static void onetTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@Before
	public static void setup() {
		JukeBox jukeBox = JukeBox.getInstance();
	}
	
	@After
	public static void tearDown() {
		
	}
	
	
	//Tests for song added to JukeBox
	@Test
	public void testAddSong() {
		jukeBox.requestSong("The Blanks");
		assertNotNull(jukeBox);
	}
	
	//Tests that song was removed
	@Test
	public void testRemoveSong() {
		jukeBox.playNextSong();
		assertFalse(jukeBox.hasMoreSongs());
	}
	
	//Tests for empty playlist and playlist message
	@Test
	public void testEmptyPlaylist() {
		jukeBox.playNextSong();
		assertFalse(jukeBox.hasMoreSongs());
		
	}

}
