package p3;

import F.d;
import H1.u;
import P0.h;
import a3.C0261b;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bumptech.glide.k;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.RunnableC0632m;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.r;
import d3.s;
import g3.C0731c;
import h0.C0733A;
import i.C0803c;
import j3.AbstractC0857g;
import j3.C0851a;
import j3.C0860j;
import j3.C0869s;
import j3.C0874x;
import j3.C0875y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k3.C0899e;
import k3.ExecutorC0896b;
import l1.v;
import l1.x;
import l3.C0939b;
import l3.C0941d;
import l3.C0942e;
import l3.f;
import l3.l;
import l3.m;
import m3.B;
import m3.C;
import m3.C1090b0;
import m3.C1096e0;
import m3.C1098f0;
import m3.C1102h0;
import m3.C1104i0;
import m3.D0;
import m3.E0;
import m3.G;
import m3.L0;
import m3.P;
import m3.Q;
import m3.S;
import m3.T;
import m3.V;
import m3.W;
import m3.X;
import n3.C1156c;
import p3.C1249a;
import p3.C1251c;
import q2.j;
import q3.C1263a;
import q3.C1265c;
import s3.InterfaceC1304a;

/* JADX INFO: renamed from: p3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1251c implements InterfaceC0655c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f12324h;

    public C1251c(int i6) {
        this.f12317a = i6;
    }

    public static Q h(Q q5, C0942e c0942e, C1251c c1251c) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        P pA = q5.a();
        String strE = c0942e.f10040b.e();
        if (strE != null) {
            pA.f11397e = new C1096e0(strE);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        C0941d c0941d = (C0941d) ((AtomicMarkableReference) ((k) c1251c.f12321e).f6357x).getReference();
        synchronized (c0941d) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c0941d.f10035a));
        }
        List listO = o(mapUnmodifiableMap);
        C0941d c0941d2 = (C0941d) ((AtomicMarkableReference) ((k) c1251c.f12322f).f6357x).getReference();
        synchronized (c0941d2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(c0941d2.f10035a));
        }
        List listO2 = o(mapUnmodifiableMap2);
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            S s5 = (S) q5.f11403c;
            D0 d02 = s5.f11407a;
            if (d02 == null) {
                StringBuilder sb = new StringBuilder();
                if (d02 == null) {
                    sb.append(" execution");
                }
                throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
            }
            pA.f11395c = new S(d02, listO, listO2, s5.f11410d, s5.f11411e, s5.f11412f, s5.f11413g);
        }
        return pA.a();
    }

    public static L0 i(Q q5, C1251c c1251c) {
        List listUnmodifiableList;
        m mVar = (m) c1251c.f12323g;
        synchronized (mVar) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(mVar.f10061a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < listUnmodifiableList.size(); i6++) {
            l lVar = (l) listUnmodifiableList.get(i6);
            lVar.getClass();
            C1098f0 c1098f0 = new C1098f0();
            C0939b c0939b = (C0939b) lVar;
            String str = c0939b.f10033e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = c0939b.f10030b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            c1098f0.f11504a = new C1102h0(str2, str);
            String str3 = c0939b.f10031c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            c1098f0.f11505b = str3;
            String str4 = c0939b.f10032d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            c1098f0.f11506c = str4;
            c1098f0.f11507d = c0939b.f10034f;
            c1098f0.f11508e = (byte) (c1098f0.f11508e | 1);
            arrayList.add(c1098f0.a());
        }
        if (arrayList.isEmpty()) {
            return q5;
        }
        P pA = q5.a();
        pA.f11398f = new C1104i0(arrayList);
        return pA.a();
    }

    public static C1251c l(Context context, C0875y c0875y, C1251c c1251c, android.support.v4.media.b bVar, C0942e c0942e, C1251c c1251c2, d dVar, J0.l lVar, C0261b c0261b, C0860j c0860j, C0899e c0899e) {
        C0869s c0869s = new C0869s(context, c0875y, bVar, dVar, lVar);
        C1249a c1249a = new C1249a(c1251c, lVar, c0860j);
        C1156c c1156c = C1263a.f12380b;
        u.b(context);
        return new C1251c(c0869s, c1249a, new C1263a(new C1265c(u.a().c(new F1.a(C1263a.f12381c, C1263a.f12382d)).a("FIREBASE_CRASHLYTICS_REPORT", new E1.c("json"), C1263a.f12383e), lVar.c(), c0261b)), c0942e, c1251c2, c0875y, c0899e, 9);
    }

    public static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new G(str, str2));
        }
        Collections.sort(arrayList, new K.b(2));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void q(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean r(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    public static List s(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    @Override // d3.InterfaceC0655c
    public final Object a(Class cls) {
        if (!((Set) this.f12318b).contains(r.a(cls))) {
            throw new C0733A("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((InterfaceC0655c) this.f12324h).a(cls);
        if (!cls.equals(A3.b.class)) {
            return objA;
        }
        return new s();
    }

    @Override // d3.InterfaceC0655c
    public final D3.c b(Class cls) {
        return c(r.a(cls));
    }

    @Override // d3.InterfaceC0655c
    public final D3.c c(r rVar) {
        if (((Set) this.f12319c).contains(rVar)) {
            return ((InterfaceC0655c) this.f12324h).c(rVar);
        }
        throw new C0733A("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // d3.InterfaceC0655c
    public final D3.b d(r rVar) {
        if (((Set) this.f12320d).contains(rVar)) {
            return ((InterfaceC0655c) this.f12324h).d(rVar);
        }
        throw new C0733A("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // d3.InterfaceC0655c
    public final D3.c e(r rVar) {
        if (((Set) this.f12322f).contains(rVar)) {
            return ((InterfaceC0655c) this.f12324h).e(rVar);
        }
        throw new C0733A("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    @Override // d3.InterfaceC0655c
    public final Object f(r rVar) {
        if (((Set) this.f12318b).contains(rVar)) {
            return ((InterfaceC0655c) this.f12324h).f(rVar);
        }
        throw new C0733A("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // d3.InterfaceC0655c
    public final Set g(r rVar) {
        if (((Set) this.f12321e).contains(rVar)) {
            return ((InterfaceC0655c) this.f12324h).g(rVar);
        }
        throw new C0733A("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    public final F3.a j() {
        String strI = ((F3.c) this.f12319c) == null ? " registrationStatus" : "";
        if (((Long) this.f12322f) == null) {
            strI = strI.concat(" expiresInSecs");
        }
        if (((Long) this.f12323g) == null) {
            strI = AbstractC0628i.i(strI, " tokenCreationEpochInSecs");
        }
        if (strI.isEmpty()) {
            return new F3.a((String) this.f12318b, (F3.c) this.f12319c, (String) this.f12320d, (String) this.f12321e, ((Long) this.f12322f).longValue(), ((Long) this.f12323g).longValue(), (String) this.f12324h);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public final void k(String str) {
        File file = new File((File) this.f12319c, str);
        if (file.exists() && r(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public final D3.b m(Class cls) {
        return d(r.a(cls));
    }

    public final File n(String str, String str2) {
        File file = new File((File) this.f12321e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public final void p(Throwable th, Thread thread, final String str, String str2, long j6, boolean z5) {
        InterfaceC1304a interfaceC1304a;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        InterfaceC1304a interfaceC1304a2;
        final boolean zEquals = str2.equals("crash");
        C0869s c0869s = (C0869s) this.f12318b;
        Context context = c0869s.f9530a;
        int i6 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        h hVar = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            interfaceC1304a = c0869s.f9533d;
            if (zIsEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            hVar = new h(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC1304a.a(th2.getStackTrace()), hVar);
        }
        P p5 = new P();
        p5.f11394b = str2;
        p5.f11393a = j6;
        p5.f11399g = (byte) (p5.f11399g | 1);
        E0 e0F = C0731c.f8532b.f(context);
        int i7 = ((C1090b0) e0F).f11466c;
        Boolean boolValueOf = i7 > 0 ? Boolean.valueOf(i7 != 100) : null;
        ArrayList arrayListE = C0731c.e(context);
        byte b6 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f2409c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b7 = (byte) 1;
        List listD = C0869s.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b7 != 1) {
            StringBuilder sb = new StringBuilder();
            if ((b7 & 1) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
        }
        arrayList.add(new X(name, 4, listD));
        if (z5) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    interfaceC1304a2 = interfaceC1304a;
                } else {
                    StackTraceElement[] stackTraceElementArrA = interfaceC1304a.a(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listD2 = C0869s.d(stackTraceElementArrA, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b7 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((1 & b7) == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb2));
                    }
                    interfaceC1304a2 = interfaceC1304a;
                    arrayList.add(new X(name2, 0, listD2));
                }
                it2 = it;
                interfaceC1304a = interfaceC1304a2;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        V vC = C0869s.c(hVar, 0);
        if (b7 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if ((1 & b7) == 0) {
                sb3.append(" address");
            }
            throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb3));
        }
        W w5 = new W("0", "0", 0L);
        List listA = c0869s.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        T t5 = new T(listUnmodifiableList, vC, null, w5, listA);
        if (b6 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if ((1 & b6) == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb4));
        }
        p5.f11395c = new S(t5, null, null, boolValueOf, e0F, arrayListE, i6);
        p5.f11396d = c0869s.b(i6);
        final L0 l0I = i(h(p5.a(), (C0942e) this.f12321e, (C1251c) this.f12322f), (C1251c) this.f12322f);
        if (z5) {
            ((C1249a) this.f12319c).c(l0I, str, zEquals);
        } else {
            ((C0899e) this.f12324h).f9656b.a(new Runnable() { // from class: j3.B
                @Override // java.lang.Runnable
                public final void run() {
                    C1251c c1251c = this.f9448w;
                    c1251c.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    ((C1249a) c1251c.f12319c).c(l0I, str, zEquals);
                }
            });
        }
    }

    public final q2.s t(String str, ExecutorC0896b executorC0896b) {
        j jVar;
        ArrayList<File> arrayListB = ((C1249a) this.f12319c).b();
        ArrayList<C0851a> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                C1156c c1156c = C1249a.f12309g;
                String strD = C1249a.d(file);
                c1156c.getClass();
                arrayList.add(new C0851a(C1156c.i(strD), file.getName(), file));
            } catch (IOException e6) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e6);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0851a c0851a : arrayList) {
            if (str == null || str.equals(c0851a.f9454b)) {
                C1263a c1263a = (C1263a) this.f12320d;
                C c6 = (C) c0851a.f9453a;
                if (c6.f11307f == null || c6.f11308g == null) {
                    C0874x c0874xB = ((C0875y) this.f12323g).b(true);
                    B bA = c0851a.f9453a.a();
                    bA.f11294e = c0874xB.f9554a;
                    B bA2 = bA.a().a();
                    bA2.f11295f = c0874xB.f9555b;
                    c0851a = new C0851a(bA2.a(), c0851a.f9454b, c0851a.f9455c);
                }
                boolean z5 = str != null;
                C1265c c1265c = c1263a.f12384a;
                synchronized (c1265c.f12394f) {
                    try {
                        jVar = new j();
                        if (z5) {
                            ((AtomicInteger) c1265c.f12397i.f5011x).getAndIncrement();
                            if (c1265c.f12394f.size() < c1265c.f12393e) {
                                C0731c c0731c = C0731c.f8531a;
                                c0731c.c("Enqueueing report: " + c0851a.f9454b);
                                c0731c.c("Queue size: " + c1265c.f12394f.size());
                                c1265c.f12395g.execute(new K.a(c1265c, c0851a, jVar));
                                c0731c.c("Closing task for report: " + c0851a.f9454b);
                                jVar.c(c0851a);
                            } else {
                                c1265c.a();
                                String str2 = "Dropping report due to queue being full: " + c0851a.f9454b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) c1265c.f12397i.f5012y).getAndIncrement();
                                jVar.c(c0851a);
                            }
                        } else {
                            c1265c.b(c0851a, jVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(jVar.f12351a.i(executorC0896b, new J3.G(20, this)));
            }
        }
        return f2.h.J(arrayList2);
    }

    public final void u(String str) {
        k kVar = (k) this.f12322f;
        synchronized (kVar) {
            try {
                if (((C0941d) ((AtomicMarkableReference) kVar.f6357x).getReference()).b(str)) {
                    Object obj = kVar.f6357x;
                    ((AtomicMarkableReference) obj).set((C0941d) ((AtomicMarkableReference) obj).getReference(), true);
                    RunnableC0632m runnableC0632m = new RunnableC0632m(19, kVar);
                    AtomicReference atomicReference = (AtomicReference) kVar.f6358y;
                    while (!atomicReference.compareAndSet(null, runnableC0632m)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((C0899e) ((C1251c) kVar.f6359z).f12320d).f9656b.a(runnableC0632m);
                }
            } finally {
            }
        }
    }

    public final void v(F3.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f12319c = cVar;
    }

    public C1251c(F3.a aVar) {
        this.f12317a = 12;
        this.f12318b = aVar.f620a;
        this.f12319c = aVar.f621b;
        this.f12320d = aVar.f622c;
        this.f12321e = aVar.f623d;
        this.f12322f = Long.valueOf(aVar.f624e);
        this.f12323g = Long.valueOf(aVar.f625f);
        this.f12324h = aVar.f626g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1251c(F3.a aVar, int i6) {
        this(aVar);
        this.f12317a = 12;
    }

    public C1251c(Context context, int i6) {
        String string;
        this.f12317a = i6;
        if (i6 == 1) {
            this.f12321e = new WindowManager.LayoutParams();
            this.f12322f = new Rect();
            this.f12323g = new int[2];
            this.f12324h = new int[2];
            this.f12318b = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            this.f12319c = viewInflate;
            this.f12320d = (TextView) viewInflate.findViewById(R.id.message);
            ((WindowManager.LayoutParams) this.f12321e).setTitle(C1251c.class.getSimpleName());
            ((WindowManager.LayoutParams) this.f12321e).packageName = ((Context) this.f12318b).getPackageName();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f12321e;
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            return;
        }
        this.f12318b = ((C1090b0) C0731c.f8532b.f(context)).f11464a;
        this.f12319c = context.getFilesDir();
        if (!((String) this.f12318b).isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            String str = (String) this.f12318b;
            sb.append(str.length() > 40 ? AbstractC0857g.h(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File((File) this.f12319c, string);
        q(file);
        this.f12320d = file;
        File file2 = new File((File) this.f12320d, "open-sessions");
        q(file2);
        this.f12321e = file2;
        File file3 = new File((File) this.f12320d, "reports");
        q(file3);
        this.f12322f = file3;
        File file4 = new File((File) this.f12320d, "priority-reports");
        q(file4);
        this.f12323g = file4;
        File file5 = new File((File) this.f12320d, "native-reports");
        q(file5);
        this.f12324h = file5;
    }

    public C1251c(C0654b c0654b, d3.h hVar) {
        this.f12317a = 8;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (d3.k kVar : c0654b.f8183c) {
            int i6 = kVar.f8206c;
            boolean z5 = i6 == 0;
            int i7 = kVar.f8205b;
            r rVar = kVar.f8204a;
            if (z5) {
                if (i7 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i6 == 2) {
                hashSet3.add(rVar);
            } else if (i7 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        Set set = c0654b.f8187g;
        if (!set.isEmpty()) {
            hashSet.add(r.a(A3.b.class));
        }
        this.f12318b = Collections.unmodifiableSet(hashSet);
        this.f12319c = Collections.unmodifiableSet(hashSet2);
        this.f12320d = Collections.unmodifiableSet(hashSet3);
        this.f12321e = Collections.unmodifiableSet(hashSet4);
        this.f12322f = Collections.unmodifiableSet(hashSet5);
        this.f12323g = set;
        this.f12324h = hVar;
    }

    public /* synthetic */ C1251c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i6) {
        this.f12317a = i6;
        this.f12318b = obj;
        this.f12319c = obj2;
        this.f12320d = obj3;
        this.f12321e = obj4;
        this.f12322f = obj5;
        this.f12323g = obj6;
        this.f12324h = obj7;
    }

    public C1251c(String str, C1251c c1251c, C0899e c0899e) {
        this.f12317a = 10;
        this.f12321e = new k(this, false);
        this.f12322f = new k(this, true);
        this.f12323g = new m();
        this.f12324h = new AtomicMarkableReference(null, false);
        this.f12318b = str;
        this.f12319c = new f(c1251c);
        this.f12320d = c0899e;
    }

    public C1251c(o1.d dVar, o1.d dVar2, o1.d dVar3, o1.d dVar4, v vVar, x xVar) {
        this.f12317a = 5;
        this.f12324h = new C0803c(new M.c(150), new S0.f(21, this), D1.d.f289a);
        this.f12318b = dVar;
        this.f12319c = dVar2;
        this.f12320d = dVar3;
        this.f12321e = dVar4;
        this.f12322f = vVar;
        this.f12323g = xVar;
    }
}
