import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber <= 0) {
            return false;
        }

        if (trackNumber > songs.size()) {
            return false;
        }

        Song songFromAlbum = this.songs.get(trackNumber - 1);
        String songTitleFromAlbum = songFromAlbum.getTitle();
        ListIterator<Song> playListIterator = playlist.listIterator();
        while(playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songTitleFromAlbum) == 0) {
                return false;
            }

        }
        playlist.add(songFromAlbum);
        return true;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song songFromAlbum = findSong(title);
        if (songFromAlbum == null) {
            return false;
        }

        for (Song song : songs) {
            if (song.getTitle().equals(songFromAlbum)) {
                return false;
            }
        }
        playlist.add(songFromAlbum);
        return true;
    }
}
