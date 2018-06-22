package model;

public class Users {
    private int id;
    private String name;
    private String urlIMG;

    public Users(int id, String name, String urlIMG) {
        this.id = id;
        this.name = name;
        this.urlIMG = urlIMG;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlIMG() {
        return urlIMG;
    }

    public void setUrlIMG(String urlIMG) {
        this.urlIMG = urlIMG;
    }
}
