package gamePackages;

import java.util.ArrayList;

public class Profession {
    public String code;
    public String profession; // name of profession
    public String title; // title or rank or position , etc
    public ArrayList<String> tools;
    public String area_of_expertise;

    public Profession(String code, String profession, String title, ArrayList<String> tools, String area_of_expertise) {
        this.code = code;
        this.profession = profession;
        this.title = title;
        this.tools = tools;
        this.area_of_expertise = area_of_expertise;
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

    public String getArea_of_expertise() {
        return area_of_expertise;
    }

    public void setArea_of_expertise(String area_of_expertise) {
        this.area_of_expertise = area_of_expertise;
    }

}