package X1;

import android.accounts.Account;
import d.AbstractC0628i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n2.C1153a;
import s.C1280b;

/* JADX INFO: renamed from: X1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f4589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f4591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f4592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1153a f4595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f4596h;

    public C0239g(Account account, Set set, C1280b c1280b, String str, String str2, C1153a c1153a) {
        this.f4589a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f4590b = setEmptySet;
        Map mapEmptyMap = c1280b == null ? Collections.emptyMap() : c1280b;
        this.f4592d = mapEmptyMap;
        this.f4593e = str;
        this.f4594f = str2;
        this.f4595g = c1153a == null ? C1153a.f11698a : c1153a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        this.f4591c = Collections.unmodifiableSet(hashSet);
    }
}
