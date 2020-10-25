
package com.example.visitseattle;

/**
 * {@link Place} represents the name of the place that user wants to visit.
 */
public class Place {

    /** Name of the place to visit */
    private String mplaceName;

    /** Phone number to call */
    private String mphoneNumber;

    /** Image resource ID for the word */
    private int mImageResourceId;




    /**
     * Create a new Place object.
     *
     * @param placeName is the name of the place
     * @param phoneNumber is the phone number of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     *
     */
    public Place(String placeName, String phoneNumber, int imageResourceId) {
        mplaceName = placeName;
        mphoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place to visit
     */

    public String getplaceName() {
        return mplaceName;
    }

    /**
     * Get the phone number of the place to visit
     */
    public String getphoneNumber() {
        return mphoneNumber;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}