package j3;

import java.util.Objects;
import p3.C1251c;

/* JADX INFO: renamed from: j3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0871u f9475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0859i f9476b;

    public C0860j(C0871u c0871u, C1251c c1251c) {
        this.f9475a = c0871u;
        this.f9476b = new C0859i(c1251c);
    }

    public final void a(String str) {
        C0859i c0859i = this.f9476b;
        synchronized (c0859i) {
            if (!Objects.equals(c0859i.f9473b, str)) {
                C0859i.a(c0859i.f9472a, str, c0859i.f9474c);
                c0859i.f9473b = str;
            }
        }
    }
}
