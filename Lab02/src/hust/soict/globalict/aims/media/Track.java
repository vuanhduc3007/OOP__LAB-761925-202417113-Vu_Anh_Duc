package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD/Track: " + this.getTitle());
            System.out.println("Length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD/Track length is non-positive!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        // Kiểm tra xem có đúng là Bài hát (Track) không
        if (obj instanceof Track) {
            Track track = (Track) obj;
            // So sánh trùng Tên VÀ trùng Độ dài
            return this.getTitle().equals(track.getTitle()) && this.getLength() == track.getLength();
        }
        return false;
    }
}