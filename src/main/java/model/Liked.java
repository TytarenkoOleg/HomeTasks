package model;

public class Liked {

    private Long id;
    private Long idFirstUser;
    private Long idLikedUser;

    public Liked(Long id, Long idFirstUser, Long idLikedUser) {
        this.id = id;
        this.idFirstUser = idFirstUser;
        this.idLikedUser = idLikedUser;
    }

    public Liked() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFirstUser() {
        return idFirstUser;
    }

    public void setIdFirstUser(Long idFirstUser) {
        this.idFirstUser = idFirstUser;
    }

    public Long getIdLikedUser() {
        return idLikedUser;
    }

    public void setIdLikedUser(Long idLikedUser) {
        this.idLikedUser = idLikedUser;
    }
}
