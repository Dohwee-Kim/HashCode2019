import java.io.*;
import java.util.Scanner;

public class HashCode2019 {

    public static String a_FilePath = "./data/a_example.txt";
    public static String b_FilePath = "./data/b_lovely_landscapes.txt";
    public static String c_FilePath = "./data/c_memorable_moment.txt";
    public static String d_FilePath = "./data/d_pet_pictures.txt";
    public static String e_FilePath = "./data/e_shiny_selfies.txt";

    public static void main(String[] args) {
        String choice;

        System.out.println("Choose your test run :");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        //test choice
        System.out.println("a: example, b: lovely_lanscapes, c: memorable_moments, d: pet pictures, e: shiny selfies ");
        choice = sc.next();

        switch(choice){
            case "a":
                exampleTest();
                break;
            case "b":
                lovelyLandscapesTest();
                break;
            case "c":
                memorableMoments();
                break;
            case "d":
                petPictures();
                break;
            case "e":
                shinnySelfies();
                break;
        }
    }

    public static void exampleTest(){
        System.out.println("Test A is running ");
        FileInputStream fileStream =null; //File stream
        try {

            fileStream = new FileInputStream( a_FilePath );

            byte[ ] readBuffer = new byte[fileStream.available()];
            while(fileStream.read(readBuffer) != -1) {
            }

            System.out.println(new String (readBuffer) );
            fileStream.close();
        } catch (Exception e) {
            System.out.println("File Read error");
            e.getStackTrace();
        }

        finally {
            try {
                fileStream.close(); // Close file
            } catch (Exception e) {
                System.out.println("File closing failure in Finally");
            }
        }

    }

    public static void lovelyLandscapesTest() {
        System.out.println("Test B is running ");
    }

    public static void memorableMoments() {
        System.out.println("Test C is running ");
    }

    public static void petPictures() {
        System.out.println("Test D is running ");
    }

    public static void shinnySelfies() {
        System.out.println("Test E is running ");
    }

    //TODO : Refactor this later
    public static void fileLoader(String filePath) {

    }


}
