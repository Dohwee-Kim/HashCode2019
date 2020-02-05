import java.io.*;
import java.util.*;


public class HashCode2019 {

    public static final String A_FILE_PATH = "./data/a_example.txt";
    public static final int A_FILE_DATA_SIZE = 4;

    public static final String B_FILE_PATH = "./data/b_lovely_landscapes.txt";
    public static final int B_FILE_DATA_SIZE = 80000;

    public static final String C_FILE_PATH = "./data/c_memorable_moment.txt";
    public static final int C_FILE_DATA_SIZE = 1000;

    public static final String D_FILE_PATH = "./data/d_pet_pictures.txt";
    public static final int D_FILE_DATA_SIZE = 90000;

    public static final String E_FILE_PATH = "./data/e_shiny_selfies.txt";
    public static final int E_FILE_DATA_SIZE = 80000;



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

        List<PictureData> pictureDataList = fileLoader(A_FILE_PATH);
        List<PictureData> outOutDataList = new ArrayList<>(pictureDataList.size());

        int randomPicked = getRandomNumberInRange(0, pictureDataList.size());

        for ( int i=0; i < pictureDataList.size(); i++) {
            if (i== randomPicked){
                continue;
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

    public static List<PictureData> fileLoader(String filePath) {
        BufferedReader br = null;
        List<PictureData> pictureDataArrayList = new ArrayList<>(A_FILE_DATA_SIZE);

        try {

            int pictureIndexNumber = 0;

            File txtFile = new File(A_FILE_PATH);
            System.out.println("Open the file .... ");
            br = new BufferedReader(new FileReader(txtFile));
            String line ="";
            //Read line by line
            while((line = br.readLine()) != null) {
                String[] token = line.split(" ", -1);

                if (line.matches("^[0-9].*$")) {
                    continue;
                }

                PictureData pictureData = new PictureData( pictureIndexNumber ,token[0].charAt(0));

                for (int i = 2 ; i < token.length ; i++ ) {
                    pictureData.addHashTag(token[i]);
                }

                pictureDataArrayList.add(pictureData);
                //Increase index
                pictureIndexNumber++;
            }

            System.out.println("PictureData read complete");


        } catch (FileNotFoundException e) {
            System.out.println("File NOT FOUND error");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close(); // Close file
                } catch (Exception e) {
                    System.out.println("File closing failure in Finally");
                    e.printStackTrace();
                }
            }
        }

        return pictureDataArrayList;
    }

    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    /**
     *
     * @param h1 : Horizontal picture 1
     * @param h2 : Horizontal picture 2
     * @return : min score of (union, intersection, and difference of tags)
     */

    private static int scoreCalculatorHtoH(PictureData h1, PictureData h2){
        int minScore = 0;

        int interMin = 0;
        int diffMin = 0;


        // if one of them is subset of the other one, return 0
        if (h1.getHashTags().containsAll(h2.getHashTags()) || h2.getHashTags().containsAll(h1.getHashTags())) {
            minScore = 0;
            return minScore;
        }
        else {
            interMin = h1.getHashTags().retainAll( h2.getHashTags() );

        }
        return minScore;
    }

    /**
     *
     * @param h1 : Horizontal picture 1
     * @param v1 : Vertical picture 1 (will be combined with v2)
     * @param v2 : Vertical picture 2
     * @return : min score of (union, intersection, and difference of tags)
     */
    private static int scoreCalculatorHtoV(PictureData h1, PictureData v1, PictureData v2){
        return 1;
    }

    private static PictureData vvMerger(PictureData v1, PictureData v2) {

    }

}
