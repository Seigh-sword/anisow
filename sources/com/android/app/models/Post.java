package com.android.app.models;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Post {
    private final String age;
    private final int id;
    private final String poster;

    public Post(int i6, String str, String str2) {
        this.id = i6;
        this.poster = str;
        this.age = str2;
    }

    public static /* synthetic */ Post copy$default(Post post, int i6, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = post.id;
        }
        if ((i7 & 2) != 0) {
            str = post.poster;
        }
        if ((i7 & 4) != 0) {
            str2 = post.age;
        }
        return post.copy(i6, str, str2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.poster;
    }

    public final String component3() {
        return this.age;
    }

    public final Post copy(int i6, String str, String str2) {
        return new Post(i6, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Post)) {
            return false;
        }
        Post post = (Post) obj;
        return this.id == post.id && AbstractC1305a.c(this.poster, post.poster) && AbstractC1305a.c(this.age, post.age);
    }

    public final String getAge() {
        return this.age;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPoster() {
        return this.poster;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.poster;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.age;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Post(id=" + this.id + ", poster=" + this.poster + ", age=" + this.age + ')';
    }
}
