package rtb.core.v22.enums;

/**
 * The following table specifies a standard list of creative attributes that can describe an ad being served or serve
 * as restrictions of thereof
 */
public enum CreativeAttribute {

    /**
     * Audio Ad (Auto Play)
     */
    AUDIO_AD_AUTO_PLAY(1),
    /**
     * Audio Ad (User Initiated)
     */
    AUDIO_AD_USER_INITIATED(2),
    /**
     * Expandable (Automatic)
     */
    EXPANDABLE_AUTOMATIC(3),
    /**
     * Expandable (User Initiated Click)
     */
    EXPANDABLE_USER_INITIATED_CLICK(4),
    /**
     * Expandable (User Initiated Rollover)
     */
    EXPANDABLE_USER_INITIATED_ROLLOVER(5),
    /**
     * In Banner Video Ad Auto Play
     */
    IN_BANNER_VIDEO_AD_AUTO_PLAY(6),
    /**
     * In Banner Video Ad (User Initiated)
     */
    IN_BANNER_VIDEO_AD_USER_INITIATED(7),
    /**
     * Pop (e. g. Over Under or upon Exit)
     */
    POP(8),
    /**
     * Provocative or Suggestive Imagery
     */
    PROVOCATIVE_OR_SUGGESTIVE_IMAGERY(9),
    /**
     * Shaky, Flashing, Flickering, Extreme, Animation, Smileys
     */
    SHAKY_FLASHING_FLICKERING_EXTREME_ANIMATION_SMILEYS(10),
    /**
     * Surveys
     */
    SURVEYS(11),
    /**
     * Text Only
     */
    TEXT_ONLY(12),
    /**
     * User Interactive (e.g. Embedded Games)
     */
    USER_INTERACTIVE(13),
    /**
     * Windows Dialog or Alert Style
     */
    WINDOWS_DIALOG_OR_ALERT_STYLE(14),
    /**
     * Has audio on off button
     */
    HAS_AUDIO_ON_OFF_BUTTON(15),
    /**
     * Ad can be skipped (e.g. skip button on preroll video)
     */
    AD_CAN_BE_SKIPPED(16);

    private final int id;

    CreativeAttribute(int id) {
        this.id = id;
    }


}
