package android.example.musicstructure;

public class Songs {

    private String mSongName;
    private String mSinger;

    public Songs(String defaultSong, String defaultSinger){
        mSongName = defaultSong;
        mSinger = defaultSinger;
    }

    public String getDefaultSong(){
        return mSongName;
    }

    public String getDefaultSinger(){
        return mSinger;
    }
}
