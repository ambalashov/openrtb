package rtb.core.v22.enums;

public enum VideoPlaybackMethod {
    AUTO_PLAY_SOUND_OFN(1),
    AUTO_PLAY_SOUND_OFF(2),
    CLICK_TO_PLAY(3),
    MOUSE_OVER(4);

    private final int id;

    VideoPlaybackMethod(int id) {
        this.id = id;
    }
}
