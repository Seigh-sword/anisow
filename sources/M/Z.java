package m;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import k.C0878a;
import m2.InterfaceC1055l1;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f10230A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10231w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f10233y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10234z;

    public /* synthetic */ Z(C0878a c0878a, int i6, m2.N n5, Intent intent) {
        this.f10233y = c0878a;
        this.f10232x = i6;
        this.f10234z = n5;
        this.f10230A = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10231w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((TextView) this.f10233y).setTypeface((Typeface) this.f10234z, this.f10232x);
                break;
            default:
                C0878a c0878a = (C0878a) this.f10233y;
                int i6 = this.f10232x;
                m2.N n5 = (m2.N) this.f10234z;
                Intent intent = (Intent) this.f10230A;
                if (((InterfaceC1055l1) c0878a.f9565x).d(i6)) {
                    n5.f10723J.c(Integer.valueOf(i6), "Local AppMeasurementService processed last upload request. StartId");
                    c0878a.f().f10723J.d("Completed wakeful intent.");
                    ((InterfaceC1055l1) c0878a.f9565x).b(intent);
                }
                break;
        }
    }

    public Z(C0956d0 c0956d0, TextView textView, Typeface typeface, int i6) {
        this.f10230A = c0956d0;
        this.f10233y = textView;
        this.f10234z = typeface;
        this.f10232x = i6;
    }
}
