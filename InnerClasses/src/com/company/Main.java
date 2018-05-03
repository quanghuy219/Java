package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	    Album album = new Album("Fortune", "Chris Brown");
	    album.addSong("Turn up the music", 4);
        album.addSong("Bassline", 4);
        album.addSong("Till I Die", 4);
        album.addSong("Don't judge me", 4);
        album.addSong("2012", 4);

        albums.add(album);


        Album album1 = new Album("Coast to Coast", "Westlife");
        album1.addSong("My love", 3);
        album1.addSong("I lay my love on you", 3);
        album1.addSong("I have a dream", 3);
        album1.addSong("Close", 3);
        album1.addSong("Soledad", 3);

        albums.add(album1);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlaylist(1, playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist(4, playlist);
        albums.get(0).addToPlaylist(10, playlist);
        albums.get(1).addToPlaylist("My love", playlist);
        albums.get(1).addToPlaylist("Close", playlist);
        albums.get(1).addToPlaylist("I have a dream", playlist);

        play(playlist);
    }

    public static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        Scanner sc = new Scanner(System.in);

        boolean quit = false;
        boolean forward = true;

        if(playlist.size() == 0) {
            System.out.println("No songs in the album");
            return;
        } else {
            System.out.println("Playing " + listIterator.next().toString());
        }
        printMenu();
        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached end of playlist");
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at end of playlist1");
                        }

                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }



    }

    public static void printList(LinkedList<Song> playlist) {
        for (Song song: playlist) {
            System.out.println(song.getTitle());
        }
    }

    public static void printMenu() {
        System.out.println( "0. Quit \n" +
                            "1. Forward\n" +
                            "2. Backward\n" +
                            "3. Replay\n" +
                            "4. Print playlist\n" +
                            "5. Print menu\n");
    }
}
