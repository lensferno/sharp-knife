package me.lensferno.sharpKnife.utils.command.options;

import java.util.*;

public class GlobalOptions implements Options{

    // add the "-hide_banner" flag to let ffmpeg not show the banner information
    // so that we can get the pure information from ffmpeg output
    public void hideBanner(boolean isHideBanner) {
        if (isHideBanner) {
            options.put("-hide_banner","");
        } else {
            options.remove("-hide_banner");
        }
    }

    public void showVersion(){
        options.put("-version","");
    }

    public void setInputFile(String location) {
        options.put("-i", location);
    }

    public void overwriteExistOutput(boolean isOverwrite){
        options.put("-y","");
    }

}
