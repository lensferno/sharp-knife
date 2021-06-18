package me.lensferno.sharpKnife.utils.command;

import java.util.LinkedHashMap;

public class CommandGenerator {

    LinkedHashMap<String, String> Options = new LinkedHashMap<>();

    public String getCommand(){
        return "";
    }

    // set a specific option
    // if it's a single flag without param,set param to ""
    public void setOption(String flag, String param){
        Options.put(flag, param);
    }

}
