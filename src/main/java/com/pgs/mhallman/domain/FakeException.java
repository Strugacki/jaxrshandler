package com.pgs.mhallman.domain;

/**
 * Created by mhallman on 26.06.2017.
 */
public class FakeException {

    private String title;

    private int status;

    private String cause;

    private String emoji;

    public FakeException(String title, int status, String cause, String emoji) {
        this.title = title;
        this.status = status;
        this.cause = cause;
        this.emoji = emoji;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

}
