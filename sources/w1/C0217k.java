package W1;

import X1.AbstractC0242j;
import X1.C0248p;
import android.os.Parcel;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.RunnableC0632m;
import h2.AbstractC0770b;
import j.RunnableC0835a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: W1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4323e;

    public /* synthetic */ C0217k() {
        this.f4319a = 0;
        this.f4321c = true;
        this.f4322d = 0;
    }

    public final void a(int i6) {
        switch (this.f4319a) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                WeakReference weakReference = ((BottomSheetBehavior) this.f4320b).f7072U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f4322d = i6;
                    if (!this.f4321c) {
                        View view = (View) ((BottomSheetBehavior) this.f4320b).f7072U.get();
                        Runnable runnable = (Runnable) this.f4323e;
                        WeakHashMap weakHashMap = N.V.f1964a;
                        view.postOnAnimation(runnable);
                        this.f4321c = true;
                    }
                    break;
                }
                break;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f4320b).f7286p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f4322d = i6;
                    if (!this.f4321c) {
                        View view2 = (View) ((SideSheetBehavior) this.f4320b).f7286p.get();
                        Runnable runnable2 = (Runnable) this.f4323e;
                        WeakHashMap weakHashMap2 = N.V.f1964a;
                        view2.postOnAnimation(runnable2);
                        this.f4321c = true;
                    }
                    break;
                }
                break;
        }
    }

    public final void b(AbstractC0242j abstractC0242j, q2.j jVar) {
        K1.b bVar = (K1.b) ((C0217k) this.f4323e).f4323e;
        bVar.getClass();
        Z1.a aVar = (Z1.a) ((Z1.d) abstractC0242j).t();
        C0248p c0248p = (C0248p) bVar.f1515x;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f8976d);
        int i6 = AbstractC0770b.f8977a;
        if (c0248p == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c0248p.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f8975c.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            jVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public C0217k(C0217k c0217k, U1.d[] dVarArr, boolean z5, int i6) {
        this.f4319a = 1;
        this.f4323e = c0217k;
        this.f4320b = dVarArr;
        this.f4321c = dVarArr != null && z5;
        this.f4322d = i6;
    }

    public C0217k(BottomSheetBehavior bottomSheetBehavior) {
        this.f4319a = 2;
        this.f4320b = bottomSheetBehavior;
        this.f4323e = new RunnableC0835a(21, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0217k(BottomSheetBehavior bottomSheetBehavior, int i6) {
        this(bottomSheetBehavior);
        this.f4319a = 2;
    }

    public C0217k(SideSheetBehavior sideSheetBehavior) {
        this.f4319a = 3;
        this.f4320b = sideSheetBehavior;
        this.f4323e = new RunnableC0632m(15, this);
    }
}
