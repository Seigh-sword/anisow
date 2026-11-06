package com.android.app.models;

import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class MyList {
    private final List<Integer> ids;

    public MyList(List<Integer> list) {
        AbstractC1305a.o(list, "ids");
        this.ids = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyList copy$default(MyList myList, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = myList.ids;
        }
        return myList.copy(list);
    }

    public final List<Integer> component1() {
        return this.ids;
    }

    public final MyList copy(List<Integer> list) {
        AbstractC1305a.o(list, "ids");
        return new MyList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyList) && AbstractC1305a.c(this.ids, ((MyList) obj).ids);
    }

    public final List<Integer> getIds() {
        return this.ids;
    }

    public int hashCode() {
        return this.ids.hashCode();
    }

    public String toString() {
        return "MyList(ids=" + this.ids + ')';
    }
}
