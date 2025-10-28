package exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {
    private Song song;

    @BeforeEach
    public void setUp() {
         song = new Song("Imagine", 183, "John Lennon");
    }


    @Test
    public void songTime() {
        String expected = "3 Minuten 3 Sekunden";
        assertEquals(expected, song.songTime());
    }

    @Test
    public void testToString() {
        String expected = "The song Imagine from John Lennon is 183 seconds long";
        assertEquals(expected, song.toString());
    }
}