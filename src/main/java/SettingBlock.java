public class SettingBlock {
    private boolean writeMessage;
    private boolean shareWithFriends;
    private boolean notificationOn;

    public boolean isWriteMessage() {
        return writeMessage;
    }

    public void setWriteMessage(boolean writeMessage) {
        this.writeMessage = writeMessage;
    }

    public boolean isShareWithFriends() {
        return shareWithFriends;
    }

    public void setShareWithFriends(boolean shareWithFriends) {
        this.shareWithFriends = shareWithFriends;
    }

    public boolean isNotificationOn() {
        return notificationOn;
    }

    public void setNotificationOn(boolean notificationOn) {
        this.notificationOn = notificationOn;
    }
}
