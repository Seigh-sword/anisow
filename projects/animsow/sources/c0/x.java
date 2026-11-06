package c0;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.Y1;
import d.AbstractC0628i;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, int i6) {
        super(null);
        this.f6160a = i6;
        this.f6161b = obj;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        switch (this.f6160a) {
            case 1:
                ((V1) this.f6161b).f6708a.set(true);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Y1 y12 = (Y1) this.f6161b;
                synchronized (y12.f6741A) {
                    y12.f6742B = null;
                    y12.f6746y.run();
                    break;
                }
                synchronized (y12) {
                    try {
                        Iterator it = y12.f6743C.iterator();
                        if (it.hasNext()) {
                            AbstractC0628i.p(it.next());
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onChange(z5);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5, Uri uri) {
        switch (this.f6160a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((y) this.f6161b).c();
                break;
            default:
                super.onChange(z5, uri);
                break;
        }
    }
}
