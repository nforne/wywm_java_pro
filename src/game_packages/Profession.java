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
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getTools() {
        return tools;
    }

    public void setTools(ArrayList<String> tools) {
        this.tools = tools;
    }

    public String expertiseArea() {
        return expertiseArea;
    }

    public void expertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

}
