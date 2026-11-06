package w0;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import x0.AbstractC1484a;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f13522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f13523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f13524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A0.c f13525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13526h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13528j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f13530l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f13519a = WorkDatabase.class;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13527i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L3.c f13529k = new L3.c(20, 0);

    public o(Context context, String str) {
        this.f13521c = context;
        this.f13520b = str;
    }

    public final void a(AbstractC1484a... abstractC1484aArr) {
        if (this.f13530l == null) {
            this.f13530l = new HashSet();
        }
        for (AbstractC1484a abstractC1484a : abstractC1484aArr) {
            this.f13530l.add(Integer.valueOf(abstractC1484a.f13663a));
            this.f13530l.add(Integer.valueOf(abstractC1484a.f13664b));
        }
        L3.c cVar = this.f13529k;
        cVar.getClass();
        for (AbstractC1484a abstractC1484a2 : abstractC1484aArr) {
            int i6 = abstractC1484a2.f13663a;
            TreeMap treeMap = (TreeMap) ((HashMap) cVar.f1734x).get(Integer.valueOf(i6));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) cVar.f1734x).put(Integer.valueOf(i6), treeMap);
            }
            int i7 = abstractC1484a2.f13664b;
            AbstractC1484a abstractC1484a3 = (AbstractC1484a) treeMap.get(Integer.valueOf(i7));
            if (abstractC1484a3 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC1484a3 + " with " + abstractC1484a2);
            }
            treeMap.put(Integer.valueOf(i7), abstractC1484a2);
        }
    }
}
