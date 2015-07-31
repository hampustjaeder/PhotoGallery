package se.umu.hatj0006.photogallery;

/**
 * Created by mtr on 7/30/2015.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getId() {
        return mId;
    }

    public void setId(String Id) {
        mId = Id;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String toString() {
        return mCaption;
    }
}
