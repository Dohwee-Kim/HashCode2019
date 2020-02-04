import java.util.ArrayList;


public class PictureData {

    int MAX_DEFINED_TAGS = 10;

    private int pictureNumber;
    private boolean isVertical;
    private ArrayList<String> hashTags= new ArrayList<>(MAX_DEFINED_TAGS);

    PictureData(int pictureNumber, boolean isVertical) {
        this.pictureNumber = pictureNumber;
        this.isVertical = isVertical;
    }


}
