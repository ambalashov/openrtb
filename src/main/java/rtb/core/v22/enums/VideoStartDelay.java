package rtb.core.v22.enums;

/**
 * The following table lists the various options for the video start delay. If the start delay value is 
 * greater than 0 then the position is mid‐roll, and the value represents the number of seconds 
 * into the content that the ad will be displayed. If the start delay time is not available, the 
 * exchange can report the position of the ad in general terms using this table of negative numbers.
 * */
public enum VideoStartDelay {
    PRE_POLL(0),
    GENERIC_MID_ROLL(-1),
    GENERIC_POST_ROLL(-2);


    private final int id;

    VideoStartDelay(int id) {
        this.id = id;
    }
}
