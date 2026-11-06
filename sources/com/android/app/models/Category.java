package com.android.app.models;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Category {
    private final int id;
    private final String name;

    public Category(int i6, String str) {
        AbstractC1305a.o(str, "name");
        this.id = i6;
        this.name = str;
    }

    public static /* synthetic */ Category copy$default(Category category, int i6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = category.id;
        }
        if ((i7 & 2) != 0) {
            str = category.name;
        }
        return category.copy(i6, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Category copy(int i6, String str) {
        AbstractC1305a.o(str, "name");
        return new Category(i6, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return this.id == category.id && AbstractC1305a.c(this.name, category.name);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return "Category(id=" + this.id + ", name=" + this.name + ')';
    }
}
