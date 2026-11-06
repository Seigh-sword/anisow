package y0;

import d.AbstractC0628i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1496c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13706e;

    public C1496c(String str, String str2, String str3, List list, List list2) {
        this.f13702a = str;
        this.f13703b = str2;
        this.f13704c = str3;
        this.f13705d = Collections.unmodifiableList(list);
        this.f13706e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1496c.class != obj.getClass()) {
            return false;
        }
        C1496c c1496c = (C1496c) obj;
        if (this.f13702a.equals(c1496c.f13702a) && this.f13703b.equals(c1496c.f13703b) && this.f13704c.equals(c1496c.f13704c) && this.f13705d.equals(c1496c.f13705d)) {
            return this.f13706e.equals(c1496c.f13706e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13706e.hashCode() + ((this.f13705d.hashCode() + AbstractC0628i.e(this.f13704c, AbstractC0628i.e(this.f13703b, this.f13702a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f13702a + "', onDelete='" + this.f13703b + "', onUpdate='" + this.f13704c + "', columnNames=" + this.f13705d + ", referenceColumnNames=" + this.f13706e + '}';
    }
}
