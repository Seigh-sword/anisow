package com.android.app.network.responses;

import com.android.app.models.Category;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class CategoriesResponse {
    private final List<Category> categories;

    public CategoriesResponse(List<Category> list) {
        AbstractC1305a.o(list, "categories");
        this.categories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoriesResponse copy$default(CategoriesResponse categoriesResponse, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = categoriesResponse.categories;
        }
        return categoriesResponse.copy(list);
    }

    public final List<Category> component1() {
        return this.categories;
    }

    public final CategoriesResponse copy(List<Category> list) {
        AbstractC1305a.o(list, "categories");
        return new CategoriesResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoriesResponse) && AbstractC1305a.c(this.categories, ((CategoriesResponse) obj).categories);
    }

    public final List<Category> getCategories() {
        return this.categories;
    }

    public int hashCode() {
        return this.categories.hashCode();
    }

    public String toString() {
        return "CategoriesResponse(categories=" + this.categories + ')';
    }
}
