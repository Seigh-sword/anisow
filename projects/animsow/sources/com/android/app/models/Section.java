package com.android.app.models;

import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Section {
    private final String name;
    private final List<Post> posts;

    public Section(String str, List<Post> list) {
        AbstractC1305a.o(str, "name");
        AbstractC1305a.o(list, "posts");
        this.name = str;
        this.posts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Section copy$default(Section section, String str, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = section.name;
        }
        if ((i6 & 2) != 0) {
            list = section.posts;
        }
        return section.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<Post> component2() {
        return this.posts;
    }

    public final Section copy(String str, List<Post> list) {
        AbstractC1305a.o(str, "name");
        AbstractC1305a.o(list, "posts");
        return new Section(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return AbstractC1305a.c(this.name, section.name) && AbstractC1305a.c(this.posts, section.posts);
    }

    public final String getName() {
        return this.name;
    }

    public final List<Post> getPosts() {
        return this.posts;
    }

    public int hashCode() {
        return this.posts.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "Section(name=" + this.name + ", posts=" + this.posts + ')';
    }
}
