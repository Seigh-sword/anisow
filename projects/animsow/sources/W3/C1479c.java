package w3;

import a3.C0261b;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1479c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13591b;

    public C1479c(String str, Map map) {
        this.f13590a = str;
        this.f13591b = map;
    }

    public static C0261b a(String str) {
        return new C0261b(8, str);
    }

    public static C1479c b(String str) {
        return new C1479c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1479c)) {
            return false;
        }
        C1479c c1479c = (C1479c) obj;
        return this.f13590a.equals(c1479c.f13590a) && this.f13591b.equals(c1479c.f13591b);
    }

    public final int hashCode() {
        return this.f13591b.hashCode() + (this.f13590a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f13590a + ", properties=" + this.f13591b.values() + "}";
    }
}
