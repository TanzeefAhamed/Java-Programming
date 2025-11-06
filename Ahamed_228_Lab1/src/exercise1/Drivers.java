package exercise1;

public class Drivers {
    public static void main(String[] args) {
        //create new objects
        Singers singer1 = new Singers();

        //Print Default Values
        System.out.println("===Deafult Singer Values===");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Birthbay: " + singer1.getSingerDateOfBirth());
        System.out.println("Album: " + singer1.getMadeAlbums());

        //set Updated values
        singer1.setSingerId(111);
        singer1.setSingerName("El Snappo");
        singer1.setSingerAddress("Florida, USA");
        singer1.setSingerDateOfBirth("Nov 4,1996");
        singer1.setMadeAlbums(8);

        //Print Updated Values
        System.out.println("\n===Updated Singer Values===");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Birthbay: " + singer1.getSingerDateOfBirth());
        System.out.println("Album: " + singer1.getMadeAlbums());
    }


}
