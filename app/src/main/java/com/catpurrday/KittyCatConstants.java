package com.catpurrday;

import java.util.Calendar;

public class KittyCatConstants {

    // Ganked URLs to images; I have no affiliation with any of these sites.
    private static String MONDAY_CAT = "http://dancesuperdigi.com/wp/wp-content/uploads/2013/08/monday_grumpycat.png";
    private static String TUESDAY_CAT = "http://sherrigaster.pbworks.com/f/Happy%20Tuesday.png";
    private static String WEDNESDAY_CAT = "http://ilovefunnycatpicturesalot.com/wp-content/uploads/2013/10/Untitled-401.jpg";
    private static String THURSDAY_CAT = "http://cdn.meme.am/instances/500x/53379596.jpg";
    private static String FRIDAY_CAT = "https://s-media-cache-ak0.pinimg.com/736x/b5/e2/0d/b5e20d7414f336e2d93c63f81ddd8bf5.jpg";
    private static String SATURDAY_CAT = "https://s-media-cache-ak0.pinimg.com/736x/13/9d/58/139d586bd6ada82523217ffe01693548.jpg";
    private static String SUNDAY_CAT = "https://c1.staticflickr.com/5/4030/4329567320_c139746e11.jpg";

    public static String getCatForDay() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return SUNDAY_CAT;
            case 2:
                return MONDAY_CAT;
            case 3:
                return TUESDAY_CAT;
            case 4:
                return WEDNESDAY_CAT;
            case 5:
                return THURSDAY_CAT;
            case 6:
                return FRIDAY_CAT;
            case 7:
                return SATURDAY_CAT;
            default:
                return MONDAY_CAT;
        }
    }
}
