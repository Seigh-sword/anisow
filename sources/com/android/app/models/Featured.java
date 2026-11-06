package com.android.app.models;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Featured {
    private final String age;
    private final String genres;
    private final int id;
    private final String poster;
    private final String premiered;
    private final String rating;
    private final String runtime;
    private final Float score;
    private final String share;
    private final String status;
    private final String title;
    private final String type;

    public Featured(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Float f6, String str9, String str10) {
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str10, "share");
        this.id = i6;
        this.type = str;
        this.title = str2;
        this.poster = str3;
        this.status = str4;
        this.runtime = str5;
        this.premiered = str6;
        this.rating = str7;
        this.age = str8;
        this.score = f6;
        this.genres = str9;
        this.share = str10;
    }

    public final int component1() {
        return this.id;
    }

    public final Float component10() {
        return this.score;
    }

    public final String component11() {
        return this.genres;
    }

    public final String component12() {
        return this.share;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.poster;
    }

    public final String component5() {
        return this.status;
    }

    public final String component6() {
        return this.runtime;
    }

    public final String component7() {
        return this.premiered;
    }

    public final String component8() {
        return this.rating;
    }

    public final String component9() {
        return this.age;
    }

    public final Featured copy(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Float f6, String str9, String str10) {
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str10, "share");
        return new Featured(i6, str, str2, str3, str4, str5, str6, str7, str8, f6, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Featured)) {
            return false;
        }
        Featured featured = (Featured) obj;
        return this.id == featured.id && AbstractC1305a.c(this.type, featured.type) && AbstractC1305a.c(this.title, featured.title) && AbstractC1305a.c(this.poster, featured.poster) && AbstractC1305a.c(this.status, featured.status) && AbstractC1305a.c(this.runtime, featured.runtime) && AbstractC1305a.c(this.premiered, featured.premiered) && AbstractC1305a.c(this.rating, featured.rating) && AbstractC1305a.c(this.age, featured.age) && AbstractC1305a.c(this.score, featured.score) && AbstractC1305a.c(this.genres, featured.genres) && AbstractC1305a.c(this.share, featured.share);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getGenres() {
        return this.genres;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPoster() {
        return this.poster;
    }

    public final String getPremiered() {
        return this.premiered;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getRuntime() {
        return this.runtime;
    }

    public final Float getScore() {
        return this.score;
    }

    public final String getShare() {
        return this.share;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.type;
        int iE = AbstractC0628i.e(this.title, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.poster;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.runtime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.premiered;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rating;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.age;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f6 = this.score;
        int iHashCode8 = (iHashCode7 + (f6 == null ? 0 : f6.hashCode())) * 31;
        String str8 = this.genres;
        return this.share.hashCode() + ((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "Featured(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", poster=" + this.poster + ", status=" + this.status + ", runtime=" + this.runtime + ", premiered=" + this.premiered + ", rating=" + this.rating + ", age=" + this.age + ", score=" + this.score + ", genres=" + this.genres + ", share=" + this.share + ')';
    }
}
