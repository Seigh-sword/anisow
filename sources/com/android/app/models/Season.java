package com.android.app.models;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Season {
    private final int id;
    private final String poster;
    private final String title;

    public Season(int i6, String str, String str2) {
        AbstractC1305a.o(str, "title");
        this.id = i6;
        this.title = str;
        this.poster = str2;
    }

    public static /* synthetic */ Season copy$default(Season season, int i6, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = season.id;
        }
        if ((i7 & 2) != 0) {
            str = season.title;
        }
        if ((i7 & 4) != 0) {
            str2 = season.poster;
        }
        return season.copy(i6, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.poster;
    }

    public final Season copy(int i6, String str, String str2) {
        AbstractC1305a.o(str, "title");
        return new Season(i6, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Season)) {
            return false;
        }
        Season season = (Season) obj;
        return this.id == season.id && AbstractC1305a.c(this.title, season.title) && AbstractC1305a.c(this.poster, season.poster);
    }

    public final int getId() {
        return this.id;
    }

    public final String getPoster() {
        return this.poster;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = AbstractC0628i.e(this.title, Integer.hashCode(this.id) * 31, 31);
        String str = this.poster;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Season(id=" + this.id + ", title=" + this.title + ", poster=" + this.poster + ')';
    }
}
