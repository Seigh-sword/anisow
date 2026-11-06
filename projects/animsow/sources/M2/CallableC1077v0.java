package m2;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1077v0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC1066p0 f11118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y1.a f11119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11120d;

    public /* synthetic */ CallableC1077v0(BinderC1066p0 binderC1066p0, Y1.a aVar, Object obj, int i6) {
        this.f11117a = i6;
        this.f11119c = aVar;
        this.f11120d = obj;
        this.f11118b = binderC1066p0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        int i6 = this.f11117a;
        BinderC1066p0 binderC1066p0 = this.f11118b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                binderC1066p0.f11055c.b0();
                T0 t02 = binderC1066p0.f11055c.f11244D;
                x1.x(t02);
                t02.r();
                ((C1051k0) t02.f1668w).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                binderC1066p0.f11055c.b0();
                B1 b1 = (B1) this.f11119c;
                Bundle bundle = (Bundle) this.f11120d;
                x1 x1Var = binderC1066p0.f11055c;
                x1Var.g().r();
                J4.a();
                if (!x1Var.Q().D(b1.f10525w, AbstractC1078w.f11133G0) || (str = b1.f10525w) == null) {
                    return new ArrayList();
                }
                if (bundle != null) {
                    int[] intArray = bundle.getIntArray("uriSources");
                    long[] longArray = bundle.getLongArray("uriTimestamps");
                    if (intArray != null) {
                        if (longArray == null || longArray.length != intArray.length) {
                            x1Var.f().f10715B.d("Uri sources and timestamps do not match");
                        } else {
                            for (int i7 = 0; i7 < intArray.length; i7++) {
                                C1044i c1044i = x1Var.f11272y;
                                x1.x(c1044i);
                                int i8 = intArray[i7];
                                long j6 = longArray[i7];
                                AbstractC1332d.g(str);
                                c1044i.r();
                                c1044i.v();
                                try {
                                    int iDelete = c1044i.z().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i8), String.valueOf(j6)});
                                    c1044i.f().f10723J.e("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i8), Long.valueOf(j6));
                                } catch (SQLiteException e6) {
                                    c1044i.f().f10715B.b(N.x(str), e6, "Error pruning trigger URIs. appId");
                                }
                            }
                        }
                    }
                }
                C1044i c1044i2 = x1Var.f11272y;
                x1.x(c1044i2);
                AbstractC1332d.g(str);
                c1044i2.r();
                c1044i2.v();
                ArrayList arrayList = new ArrayList();
                Cursor cursorQuery = null;
                try {
                    try {
                        cursorQuery = c1044i2.z().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                        if (cursorQuery.moveToFirst()) {
                            do {
                                String string = cursorQuery.getString(0);
                                if (string == null) {
                                    string = "";
                                }
                                arrayList.add(new r1(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        return arrayList;
                    } catch (SQLiteException e7) {
                        c1044i2.f().f10715B.b(N.x(str), e7, "Error querying trigger uris. appId");
                        List listEmptyList = Collections.emptyList();
                        if (cursorQuery == null) {
                            return listEmptyList;
                        }
                        cursorQuery.close();
                        return listEmptyList;
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
        }
    }
}
