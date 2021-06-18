package me.lensferno.sharpKnife.utils.command.options;

import java.util.*;

public class GlobalOptions implements Options{

    private final LinkedHashMap<String, String> globalOptions = new LinkedHashMap<>();

    // add the "-hide_banner" flag to let ffmpeg not show the banner information
    // so that we can get the pure information from ffmpeg output
    public void hideBanner(boolean isHideBanner) {
        if (isHideBanner) {
            globalOptions.put("-hide_banner","");
        } else {
            globalOptions.remove("-hide_banner");
        }
    }

    public void setInputFile(String location) {
        globalOptions.put("-i", location);
    }

    @Override
    public String getCommandString() {

        StringBuffer commandString = new StringBuffer();
        String[] flags = globalOptions.keySet().toArray(new String[0]);

        for (String flag : flags) {
            if (globalOptions.get(flag).equals("")) {
                commandString.append(flag).append(" ");
            } else {
                commandString.append(flag).append(" ").append(globalOptions.get(flag));
            }
        }

        return commandString.toString();
    }
}
