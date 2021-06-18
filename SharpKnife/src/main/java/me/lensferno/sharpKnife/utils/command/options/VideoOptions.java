package me.lensferno.sharpKnife.utils.command.options;

import java.util.LinkedHashMap;

public class VideoOptions implements Options{

    private final LinkedHashMap<String, String> videoOptions = new LinkedHashMap<>();

    @Override
    public String getCommandString() {

        StringBuffer commandString = new StringBuffer();
        String[] flags = videoOptions.keySet().toArray(new String[0]);

        for (String flag : flags) {
            if (videoOptions.get(flag).equals("")) {
                commandString.append(flag).append(" ");
            } else {
                commandString.append(flag).append(" ").append(videoOptions.get(flag));
            }
        }

        return commandString.toString();
    }
}
