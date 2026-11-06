package L1;

import E1.g;
import F0.C0022i;
import H1.i;
import H1.j;
import I1.h;
import N1.l;
import android.util.Log;
import com.onesignal.C0602w0;
import j3.AbstractC0857g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import l3.f;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f1707A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1711z;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f1708w = i6;
        this.f1709x = obj;
        this.f1710y = obj2;
        this.f1711z = obj3;
        this.f1707A = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e6;
        BufferedWriter bufferedWriter2;
        int i6 = this.f1708w;
        ?? r12 = 0;
        ?? r13 = 0;
        Object obj = this.f1707A;
        Object obj2 = this.f1711z;
        Object obj3 = this.f1710y;
        Object obj4 = this.f1709x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                b bVar = (b) obj4;
                j jVar = (j) obj3;
                g gVar = (g) obj2;
                i iVar = (i) obj;
                bVar.getClass();
                Logger logger = b.f1712f;
                try {
                    h hVarA = bVar.f1715c.a(jVar.f934a);
                    if (hVarA == null) {
                        String str = "Transport backend '" + jVar.f934a + "' is not registered";
                        logger.warning(str);
                        gVar.a(new IllegalArgumentException(str));
                    } else {
                        ((l) bVar.f1717e).k(new C0022i(bVar, jVar, ((F1.d) hVarA).a(iVar), 1));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e7) {
                    logger.warning("Error scheduling event " + e7.getMessage());
                    gVar.a(e7);
                    return;
                }
            default:
                C1251c c1251c = (C1251c) obj4;
                String str2 = (String) obj3;
                Map map = (Map) obj2;
                List list = (List) obj;
                if (((String) ((AtomicMarkableReference) c1251c.f12324h).getReference()) != null) {
                    f fVar = (f) c1251c.f12319c;
                    String str3 = (String) ((AtomicMarkableReference) c1251c.f12324h).getReference();
                    ?? r9 = "user-data";
                    File fileN = fVar.f10042a.n(str2, "user-data");
                    try {
                        try {
                            String string = new C0602w0(str3).toString();
                            bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileN), f.f10041b));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                r9 = bufferedWriter2;
                            } catch (Exception e8) {
                                e = e8;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r9 = bufferedWriter2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r13 = r9;
                            AbstractC0857g.b(r13, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        bufferedWriter2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC0857g.b(r13, "Failed to close user metadata file.");
                        throw th;
                    }
                    AbstractC0857g.b(r9, "Failed to close user metadata file.");
                    break;
                }
                if (!map.isEmpty()) {
                    ((f) c1251c.f12319c).g(str2, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File fileN2 = ((f) c1251c.f12319c).f10042a.n(str2, "rollouts-state");
                ?? IsEmpty = list.isEmpty();
                try {
                    if (IsEmpty != 0) {
                        f.f(fileN2);
                        return;
                    }
                    try {
                        String strE = f.e(list);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileN2), f.f10041b));
                        try {
                            bufferedWriter.write(strE);
                            bufferedWriter.flush();
                            AbstractC0857g.b(bufferedWriter, "Failed to close rollouts state file.");
                            IsEmpty = bufferedWriter;
                        } catch (Exception e10) {
                            e6 = e10;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e6);
                            f.f(fileN2);
                            AbstractC0857g.b(bufferedWriter, "Failed to close rollouts state file.");
                            IsEmpty = bufferedWriter;
                        }
                    } catch (Exception e11) {
                        bufferedWriter = null;
                        e6 = e11;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    r12 = IsEmpty;
                }
                AbstractC0857g.b(r12, "Failed to close rollouts state file.");
                throw th;
        }
    }
}
