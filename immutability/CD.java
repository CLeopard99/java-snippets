package main.immutability;

import java.util.*;

public final class CD {

	private final SortedMap<Integer, Song> tracks;
	private final int year;

	public CD(Song[] songs, int year) {
		tracks = new TreeMap<Integer, Song>();
		for (int i = 0; i < songs.length; i++) {
			final Song s = new Song(songs[i].getTitle(), songs[i].getArtist());
			tracks.put(i + 1, s);
		}
		this.year = year;
	}

	public SortedMap<Integer, Song> getTracks() {
		final SortedMap<Integer, Song> t = new TreeMap<Integer, Song>();
		for (Integer i : tracks.keySet()) {
			final Song s = tracks.get(i);
			t.put(i, new Song(s.getTitle(), s.getArtist()));
		}
		return t;
	}

	public int getYear() {
		return year;
	}
}
