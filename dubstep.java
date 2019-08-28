
public class Dubstep {

    public static String SongDecoder(String song) {
        // Your code is here...
        String c = song.replaceAll("(WUB){1,}", " ").trim();
        return c;
    }

    public static void main(String[] args) {
        String remixSong = new String("WUBWUBIWUBAMWUBWUBX");

        System.out.println(SongDecoder(remixSong));
    }
}