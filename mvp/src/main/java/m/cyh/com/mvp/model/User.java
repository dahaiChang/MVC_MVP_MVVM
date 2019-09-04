package m.cyh.com.mvp.model;

public class User {
    private String user;
    private String psd;

    public User(String user, String psd) {
        this.user = user;
        this.psd = psd;
    }

    public String getUser() {

        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
