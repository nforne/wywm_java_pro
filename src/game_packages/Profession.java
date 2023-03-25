package game_packages;

import java.util.ArrayList;

public class Profession {
    private String code;
    private String profession; // name of profession
    private String title; // title or rank or position , etc
    private ArrayList<String> tools;
    private String expertiseArea;

    public Profession(String code, String occupation, String title, ArrayList<String> tools, String expertiseArea) {
        this.code = code;
        this.profession = occupation;
        this.title = title;
        this.tools = tools;
        this.expertiseArea = expertiseArea;
    }

}
