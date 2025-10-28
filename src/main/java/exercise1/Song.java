package exercise1;

public class Song {

    //Declare Vars
    String titel;
    int duration;
    String artist;
    int minutes;
    int seconds;

    //Create Constructor
    public Song(String titel, int duration, String artist) {
        this.titel = titel;
        this.duration = duration;
        this.artist = artist;
    }

    public String songTime() {
        //Change seconds into X Minuten x Sekunden
        minutes = duration / 60;

        seconds = duration - minutes * 60;


        return minutes + " M " + "and " + seconds + " S ";
    }

    @Override
    public String toString() {
        //Change toString Method output
        return "the song " + titel + " from the artist " + artist + " " +
                "is this many " + songTime() + "long";
    }
}
