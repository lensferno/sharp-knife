package me.lensferno.sharpKnife.utils.command.options;

import java.util.LinkedHashMap;

public class VideoOptions implements Options {

    public void setVideoBitrate(String bitrate) {
        options.put("-b:v", bitrate);
    }

    public void setVideoCodec(String codec) {
        options.put("-c:v", codec);
    }

    // this a lossy way (audio and video)
    public void setVideoFps(String fps) {
        options.put("-qscale", "0");
        options.put("-r", fps);
    }

    public void disableVideo(boolean isDisableVideo) {
        options.put("-vn", "");
    }
}
