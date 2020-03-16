public class Wall {
    private int id;
    private boolean read;
    private boolean like;
    private boolean share;
    private boolean canComments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public boolean isCanComments() {
        return canComments;
    }

    public void setCanComments(boolean canComments) {
        this.canComments = canComments;
    }
}
