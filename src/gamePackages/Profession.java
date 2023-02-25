package gamePackages;

import java.util.ArrayList;

public class Profession {
    public String code;
    public String profession; // name of profession
    public String title; // title or rank or position , etc
    public ArrayList<String> tools;
    public String expertiseArea;

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
