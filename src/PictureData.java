import java.util.ArrayList;


public class PictureData {

    public static final int MAX_DEFINED_TAGS = 10;

    private int pictureIndex;
    private char isVertical;
    private ArrayList<String> hashTags= new ArrayList<>(MAX_DEFINED_TAGS);

    PictureData(int pictureNumber, char isVertical) {
        this.pictureIndex = pictureNumber;
        this.isVertical = isVertical;
    }

    public void addHashTag(String hashTag) {
        this.hashTags.add(hashTag);
    }

    public ArrayList<String> getHashTags() {
        return this.hashTags;
    }

}
