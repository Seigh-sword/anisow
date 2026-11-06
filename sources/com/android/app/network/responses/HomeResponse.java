package com.android.app.network.responses;

import com.android.app.models.Featured;
import com.android.app.models.Section;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class HomeResponse {
    private final Featured featured;
    private final List<Section> sections;

    public HomeResponse(Featured featured, List<Section> list) {
        AbstractC1305a.o(featured, "featured");
        AbstractC1305a.o(list, "sections");
        this.featured = featured;
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeResponse copy$default(HomeResponse homeResponse, Featured featured, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            featured = homeResponse.featured;
        }
        if ((i6 & 2) != 0) {
            list = homeResponse.sections;
        }
        return homeResponse.copy(featured, list);
    }

    public final Featured component1() {
        return this.featured;
    }

    public final List<Section> component2() {
        return this.sections;
    }

    public final HomeResponse copy(Featured featured, List<Section> list) {
        AbstractC1305a.o(featured, "featured");
        AbstractC1305a.o(list, "sections");
        return new HomeResponse(featured, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeResponse)) {
            return false;
        }
        HomeResponse homeResponse = (HomeResponse) obj;
        return AbstractC1305a.c(this.featured, homeResponse.featured) && AbstractC1305a.c(this.sections, homeResponse.sections);
    }

    public final Featured getFeatured() {
        return this.featured;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode() + (this.featured.hashCode() * 31);
    }

    public String toString() {
        return "HomeResponse(featured=" + this.featured + ", sections=" + this.sections + ')';
    }
}
