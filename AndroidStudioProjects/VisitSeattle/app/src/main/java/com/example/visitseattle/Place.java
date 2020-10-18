
package com.example.visitseattle;

/**
 * {@link Place} represents the name of the place that user wants to visit.
 */
public class Place {

    /** Name of the place to visit */
    private String mplaceName;

    /** Phone number to call */
    private String mphoneNumber;

    /**
     * Create a new Place object.
     *
     * @param placeName is the name of place to visit
     * @param phoneNumber is the phone number of the place
     */

    public Place(String placeName, String phoneNumber) {
        mplaceName = placeName;
        mphoneNumber = phoneNumber;
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

}