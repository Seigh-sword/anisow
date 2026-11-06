package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import d2.AbstractC0651b;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f9140A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f9141y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ H f9142z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(H h4, Context context) {
        super(h4);
        this.f9142z = h4;
        this.f9140A = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // i.E
    public final IntentFilter c() {
        switch (this.f9141y) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // i.E
    public final int e() {
        long j6;
        int i6 = this.f9141y;
        Object obj = this.f9140A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!y.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                C0803c c0803c = (C0803c) obj;
                Q q5 = (Q) c0803c.f9279z;
                if (q5.f9238b <= System.currentTimeMillis()) {
                    Location locationA = AbstractC0651b.h((Context) c0803c.f9277x, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c0803c.A("network") : null;
                    Location locationA2 = AbstractC0651b.h((Context) c0803c.f9277x, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c0803c.A("gps") : null;
                    if (locationA2 == null || locationA == null ? locationA2 != null : locationA2.getTime() > locationA.getTime()) {
                        locationA = locationA2;
                    }
                    if (locationA != null) {
                        Q q6 = (Q) c0803c.f9279z;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (P.f9233d == null) {
                            P.f9233d = new P();
                        }
                        P p5 = P.f9233d;
                        p5.a(locationA.getLatitude(), locationA.getLongitude(), jCurrentTimeMillis - 86400000);
                        p5.a(locationA.getLatitude(), locationA.getLongitude(), jCurrentTimeMillis);
                        boolean z5 = p5.f9236c == 1;
                        long j7 = p5.f9235b;
                        long j8 = p5.f9234a;
                        p5.a(locationA.getLatitude(), locationA.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j9 = p5.f9235b;
                        if (j7 == -1 || j8 == -1) {
                            j6 = 43200000 + jCurrentTimeMillis;
                        } else {
                            if (jCurrentTimeMillis > j8) {
                                j7 = j9;
                            } else if (jCurrentTimeMillis > j7) {
                                j7 = j8;
                            }
                            j6 = j7 + 60000;
                        }
                        q6.f9237a = z5;
                        q6.f9238b = j6;
                        if (q5.f9237a) {
                        }
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                        }
                    }
                } else if (q5.f9237a) {
                }
                break;
        }
        return 1;
    }

    @Override // i.E
    public final void g() throws IllegalAccessException {
        int i6 = this.f9141y;
        H h4 = this.f9142z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                h4.m(true, true);
                break;
            default:
                h4.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(H h4, C0803c c0803c) {
        super(h4);
        this.f9142z = h4;
        this.f9140A = c0803c;
    }
}
