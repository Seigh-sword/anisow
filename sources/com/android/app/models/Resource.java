package com.android.app.models;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Resource<T> {
    private final T data;
    private final String error;
    private final boolean isLoading;

    public Resource(boolean z5, T t5, String str) {
        this.isLoading = z5;
        this.data = t5;
        this.error = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, boolean z5, Object obj, String str, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            z5 = resource.isLoading;
        }
        if ((i6 & 2) != 0) {
            obj = resource.data;
        }
        if ((i6 & 4) != 0) {
            str = resource.error;
        }
        return resource.copy(z5, obj, str);
    }

    public final boolean component1() {
        return this.isLoading;
    }

    public final T component2() {
        return this.data;
    }

    public final String component3() {
        return this.error;
    }

    public final Resource<T> copy(boolean z5, T t5, String str) {
        return new Resource<>(z5, t5, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return this.isLoading == resource.isLoading && AbstractC1305a.c(this.data, resource.data) && AbstractC1305a.c(this.error, resource.error);
    }

    public final T getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        T t5 = this.data;
        int iHashCode2 = (iHashCode + (t5 == null ? 0 : t5.hashCode())) * 31;
        String str = this.error;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "Resource(isLoading=" + this.isLoading + ", data=" + this.data + ", error=" + this.error + ')';
    }
}
