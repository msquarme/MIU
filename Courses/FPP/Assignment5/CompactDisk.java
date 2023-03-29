package Lesson5;

import java.util.Date;

public class CompactDisk extends Asset {
	 
    private String artist;
    private String title;
 
    public CompactDisk(String type, String serialNumber, Date datePurchased, String artist, String title) {
        super(type, serialNumber, datePurchased);
        this.artist = artist;
        this.title = title;
    }
 
    public String getArtist() {
        return artist;
    }
 
    public void setArtist(String artist) {
        this.artist = artist;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    @Override
    public String toString() {
        return "CompactDisk{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
