package manager;

import domain.Post;
import javafx.geometry.Pos;

public class PostManager {
    private Post[] posts;
    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count;
    private int offset;
    private int postId;

    public Post[] wallSearch(int date, String text, int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        // TODO: add logic //
        return null;
    }

    public void wallDelete(int ownerId, int postId) {
        // TODO: add logic //
    }
}