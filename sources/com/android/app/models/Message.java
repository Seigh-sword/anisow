package com.android.app.models;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Message {
    private final String action;
    private final boolean force;
    private final String icon;
    private final String id;
    private final String message;
    private final boolean persistent;
    private final String title;
    private final String url;

    public Message(String str, String str2, String str3, String str4, String str5, String str6, boolean z5, boolean z6) {
        AbstractC1305a.o(str, "id");
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str3, "message");
        AbstractC1305a.o(str4, "icon");
        AbstractC1305a.o(str5, "url");
        AbstractC1305a.o(str6, "action");
        this.id = str;
        this.title = str2;
        this.message = str3;
        this.icon = str4;
        this.url = str5;
        this.action = str6;
        this.force = z5;
        this.persistent = z6;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.url;
    }

    public final String component6() {
        return this.action;
    }

    public final boolean component7() {
        return this.force;
    }

    public final boolean component8() {
        return this.persistent;
    }

    public final Message copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z5, boolean z6) {
        AbstractC1305a.o(str, "id");
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str3, "message");
        AbstractC1305a.o(str4, "icon");
        AbstractC1305a.o(str5, "url");
        AbstractC1305a.o(str6, "action");
        return new Message(str, str2, str3, str4, str5, str6, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return AbstractC1305a.c(this.id, message.id) && AbstractC1305a.c(this.title, message.title) && AbstractC1305a.c(this.message, message.message) && AbstractC1305a.c(this.icon, message.icon) && AbstractC1305a.c(this.url, message.url) && AbstractC1305a.c(this.action, message.action) && this.force == message.force && this.persistent == message.persistent;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getForce() {
        return this.force;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getPersistent() {
        return this.persistent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.persistent) + ((Boolean.hashCode(this.force) + AbstractC0628i.e(this.action, AbstractC0628i.e(this.url, AbstractC0628i.e(this.icon, AbstractC0628i.e(this.message, AbstractC0628i.e(this.title, this.id.hashCode() * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public String toString() {
        return "Message(id=" + this.id + ", title=" + this.title + ", message=" + this.message + ", icon=" + this.icon + ", url=" + this.url + ", action=" + this.action + ", force=" + this.force + ", persistent=" + this.persistent + ')';
    }
}
