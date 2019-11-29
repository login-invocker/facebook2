package com.liliana.facebook2.list.For.Gerana.Page;

public class ItemObject_Page_General {
    private int icon;
    private String title;
    private String messenger;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public ItemObject_Page_General(int icon, String title, String messenger) {
        this.icon = icon;
        this.title = title;
        this.messenger = messenger;
    }
}
