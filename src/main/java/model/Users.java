package model;

public class Users {
    private Long id;
    private String name;
    private String urlIMG;

    public Users(Long id, String name, String urlIMG) {
        this.id = id;
        this.name = name;
        this.urlIMG = urlIMG;
    }

    public Users() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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
