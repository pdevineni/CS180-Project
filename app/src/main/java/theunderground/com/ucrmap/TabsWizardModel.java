package theunderground.com.ucrmap;

/**
 * Created by Sara on 5/1/16.
 */
public class TabsWizardModel {
    protected String title;
    protected int imageUrl;

    public TabsWizardModel(String title, int imageUrl) {

        this.title = title;
        this.imageUrl = imageUrl;
    }
    // getters & setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getImageUrl() {
        return imageUrl;
    }
}
