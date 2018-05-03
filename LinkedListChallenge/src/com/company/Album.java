package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song checkedSong = findSong(title);
        Song addedSong = new Song(title,duration);
        if(checkedSong == null) {
            this.songs.add(addedSong);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        /*
        Iterator<Song> currentSong = songs.iterator();

        while (currentSong.hasNext()) {
            if (currentSong.next().getTitle().equals(title)) return currentSong;
        }
        */

        for (Song currentSong: this.songs) {
            if(currentSong.getTitle().equals(title)) return currentSong;
        }
        return null;
    }

    public boolean removeSong(String title) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            int index = songs.indexOf(checkedSong);
            songs.remove(checkedSong);
            return true;
        }

        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if(index >= 0 && index <= songs.size()) {
            playlist.add(this.songs.get(index));
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
