package hust.soict.globalict.aims.media;

public class Track implements Playable { 
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
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