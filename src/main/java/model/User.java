package model;

public class User {
    private int liked;
    private int disliked;

    public User(int liked, int disliked) {
        this.liked = liked;
        this.disliked = disliked;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getDisliked() {
        return disliked;
    }

    public void setDisliked(int disliked) {
        this.disliked = disliked;
    }
}
