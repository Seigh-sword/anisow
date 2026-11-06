package J0;

import I0.o;
import I0.u;
import I0.w;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0396c2;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f1182F = o.y("WorkContinuationImpl");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f1183A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f1184B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f1186D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0396c2 f1187E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f1188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f1189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1190z = 2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f1185C = new ArrayList();

    public e(k kVar, String str, List list) {
        this.f1188x = kVar;
        this.f1189y = str;
        this.f1183A = list;
        this.f1184B = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            String string = ((w) list.get(i6)).f1115a.toString();
            this.f1184B.add(string);
            this.f1185C.add(string);
        }
    }

    public static boolean T(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f1184B);
        HashSet hashSetU = U(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetU.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f1184B);
        return false;
    }

    public static HashSet U(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }

    public final u S() {
        if (this.f1186D) {
            o.w().z(f1182F, AbstractC0628i.j("Already enqueued work ids (", TextUtils.join(", ", this.f1184B), ")"), new Throwable[0]);
        } else {
            S0.d dVar = new S0.d(this);
            this.f1188x.f1209k.p(dVar);
            this.f1187E = dVar.f3066x;
        }
        return this.f1187E;
    }
}
