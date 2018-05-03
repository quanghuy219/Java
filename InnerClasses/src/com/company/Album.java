package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public class SongList {
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        public boolean addSongToSongList(String title, double duration) {
            Song songToAdd = new Song(title, duration);
            if (findSongInSongList(title) == null) {
                this.songList.add(songToAdd);
                return true;
            }
            return false;
        }

        public Song findSongInSongList(String title) {
            for (Song currentSong: this.songList) {
                if(currentSong.getTitle().equals(title)) return currentSong;
            }
            return null;
        }
    }

    public boolean addSong(String title, double duration) {
        return this.songs.addSongToSongList(title, duration);
    }

    private Song findSong(String title) {
        /*
        Iterator<Song> currentSong = songs.iterator();

        while (currentSong.hasNext()) {
            if (currentSong.next().getTitle().equals(title)) return currentSong;
        }
        */

        return this.songs.findSongInSongList(title);
    }

    public boolean removeSong(String title) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            int index = this.songs.songList.indexOf(checkedSong);
            this.songs.songList.remove(checkedSong);
            return true;
        }

        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songs.songList.size()) {
            playlist.add(this.songs.songList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have song " + "'" + title + "'");
        return false;
    }


}
