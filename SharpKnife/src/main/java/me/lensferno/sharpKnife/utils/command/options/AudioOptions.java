package me.lensferno.sharpKnife.utils.command.options;

import java.util.LinkedHashMap;

public class AudioOptions implements Options{

    public void setAudioBitrate(String bitrate) {
        options.put("-b:a", bitrate);
    }

    public void setAudioCodec(String codec) {
        options.put("-c:a", codec);
    }

    public void setAudioVolume(String volume) {
        options.put("-volume", volume);
    }

    public void setAudioChannels(String channels) {
        options.put("-ac", channels);
    }

    public void disableAudio(boolean isDisableAudio) {
        options.put("-an", "");
    }

}
