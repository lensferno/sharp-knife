package me.lensferno.sharpKnife.utils.command.options;

import java.util.LinkedHashMap;

public class AudioOptions implements Options{

    private final LinkedHashMap<String, String> audioOptions = new LinkedHashMap<>();

    @Override
    public String getCommandString() {

        StringBuffer commandString = new StringBuffer();
        String[] flags = audioOptions.keySet().toArray(new String[0]);

        for (String flag : flags) {
            if (audioOptions.get(flag).equals("")) {
                commandString.append(flag).append(" ");
            } else {
                commandString.append(flag).append(" ").append(audioOptions.get(flag));
            }
        }

        return commandString.toString();
    }
}
