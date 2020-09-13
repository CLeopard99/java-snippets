package main.immutability;

public class Song implements Comparable<Song> {

	private String title;
	private String artist;

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public int compareTo(Song rhs) {
		int aCmp = artist.compareTo(rhs.artist);
		if (aCmp != 0)
			return aCmp;
		return title.compareTo(rhs.title);
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist; }

	public void setTitle(String t) {
		title = t;  }

	public void setArtist(String a) {
		artist = a;  }

	public String toString() {
		return title + " : " + artist;
	}
}
