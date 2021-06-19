package me.lensferno.sharpKnife.utils.command.options;

import java.util.LinkedHashMap;

public interface Options {

    LinkedHashMap<String, String> options = new LinkedHashMap<>();

    default String getOptionsString(){
        StringBuffer commandString = new StringBuffer();
        String[] flags = options.keySet().toArray(new String[0]);

        for (String flag : flags) {
            if (options.get(flag).equals("")) {
                commandString.append(flag).append(" ");
            } else {
                commandString.append(flag).append(" ").append(options.get(flag)).append(" ");
            }
        }

        return commandString.toString().trim();
    }

}
