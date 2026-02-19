package org.example.HashMap;

public class HashmapEquals {
    public class Song {

        public String Artist;
        public String songName;

        public String getArtist() {
            return Artist;
        }
        public void setArtist(String artist) {
            Artist = artist;
        }
        public String getSongName() {
            return songName;
        }

        Song (String songName,String artist) {
            this.Artist = artist;
            this.songName = songName;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            return (((Song) o).getArtist().equals(this.getArtist())) &&
                    ((Song) o).getSongName().equals(this.getSongName());
        }

        @Override
        public int hashCode() {
            return this.getSongName().hashCode() +
                    this.getArtist().hashCode();
        }
    }

    public static void main(String[]args){
        HashmapEquals hashMapEquals = new HashmapEquals();
        Song song1 = hashMapEquals.new Song("Shape of you", "Ed Sheeran");
        Song song2 = hashMapEquals.new Song("Shape of you", "Ed Sheeran");
        Song song3 = hashMapEquals.new Song("Perfect", "Ed Sheeran");

        System.out.println(song1.equals(song2)); // true
        System.out.println(song1.equals(song3)); // false
    }
}
