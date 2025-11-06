package exercise1;

public class Singers
{
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String singerDateOfBirth;
    private int madeAlbums;

    //Defauly values
    public Singers(){
        singerId = 0;
        singerName = "NA";
        singerAddress = "NA";
        singerDateOfBirth = "NA";
        madeAlbums = 0;
    }

    //Constructors
    public Singers(int id){
        this();
        singerId = id;
    }

    public Singers(int id, String name){
        this(id);
        singerName = name;
    }

    public Singers(int id, String name, String address){
        this(id,name);
        singerAddress = address;
    }

    public Singers(int id, String name, String address, String birthday){
        this(id,name,address);
        singerDateOfBirth = birthday;
    }

    public Singers(int id, String name, String address, String birthday, int album) {
        this(id, name, address, birthday);
        madeAlbums = album;
    }

    //Setters values
    public void setSingerId(int id) {
        singerId = id;
    }

    public void setSingerName(String name){
        singerName = name;
    }

    public void setSingerAddress(String address){
        singerAddress = address;
    }

    public void setSingerDateOfBirth(String birthday){
        singerDateOfBirth = birthday;
    }

    public void setMadeAlbums(int album){
        madeAlbums = album;
    }

    //Set all values
    public void setAll(int id, String name, String address, String birthday, int album){
        setSingerId(id);
        setSingerName(name);
        setSingerAddress(address);
        setSingerDateOfBirth(birthday);
        setMadeAlbums(album);
    }


    //Getting
    public int getSingerId(){
        return singerId;
    }

    public String getSingerName(){
        return singerName;
    }

    public String getSingerAddress(){
        return singerAddress;
    }

    public String getSingerDateOfBirth(){
        return singerDateOfBirth;
    }

    public int getMadeAlbums(){
        return madeAlbums;
    }
}









