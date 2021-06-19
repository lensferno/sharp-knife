package me.lensferno.sharpKnife.utils.command;

import me.lensferno.sharpKnife.utils.command.options.Options;

import java.util.LinkedHashMap;

public class CommandGenerator implements Options{

    public String getFullCommand(String ffmpegLocation, String outputLocation, Options globalOptions, Options audioOptions, Options videoOptions){
        return ffmpegLocation + " " + getAllOptionsString(globalOptions, audioOptions, videoOptions) + " " + outputLocation;
    }

    private String getAllOptionsString(Options globalOptions, Options audioOptions, Options videoOptions){
        return  globalOptions.getOptionsString() +
                audioOptions.getOptionsString() +
                videoOptions.getOptionsString() +
                this.getOptionsString();
    }

    // set a specific option
    // the added specific options would be add to the end of command
    // if it's a single flag without param,set param to ""
    public void setOption(String flag, String param){
        options.put(flag, param);
    }

}
