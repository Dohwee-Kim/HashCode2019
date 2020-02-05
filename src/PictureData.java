import java.util.ArrayList;


public class PictureData {

    public static final int MAX_DEFINED_TAGS = 10;

    private int pictureIndex;
    private int verticalIndex1;
    private int verticalIndex2;
    private char isVertical;
    private ArrayList<String> hashTags= new ArrayList<>(MAX_DEFINED_TAGS);

    PictureData(int pictureIndex, char isVertical) {
        this.pictureIndex = pictureIndex;
        this.isVertical = isVertical;
    }

    PictureData(int verticalIndex1, int verticalIndex2, char isVertical) {
        this.verticalIndex1 = verticalIndex1;
        this.verticalIndex2 = verticalIndex2;
        this.isVertical = isVertical;
    }

    public void addHashTag(String hashTag) {
        this.hashTags.add(hashTag);
    }

    public void addAllHashTag(ArrayList<String> hashTags) {
        this.hashTags.addAll(hashTags);
    }

    public ArrayList<String> getHashTags() {
        return this.hashTags;
    }

    public int getVIdex1 () {
        return this.verticalIndex1;
    }

    public int getVIdex2 () {
        return this.verticalIndex2;
    }

    public int getPictureIndex () {
        return this.pictureIndex;
    }

    public char getIsVertical () {
        return this.isVertical;
    }


}
