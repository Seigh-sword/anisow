package f2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import n1.C1151g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8402c;

    public d() {
        this.f8400a = 0;
        this.f8401b = 0;
        this.f8402c = 0;
    }

    public d(C1151g c1151g) {
        Context context = c1151g.f11692a;
        ActivityManager activityManager = c1151g.f11693b;
        int i6 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f8402c = i6;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c1151g.f11694c.f3073x;
        float f6 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f7 = c1151g.f11695d;
        int iRound2 = Math.round(f6 * f7);
        int iRound3 = Math.round(f6 * 2.0f);
        int i7 = iRound - i6;
        int i8 = iRound3 + iRound2;
        if (i8 <= i7) {
            this.f8401b = iRound3;
            this.f8400a = iRound2;
        } else {
            float f8 = i7 / (f7 + 2.0f);
            this.f8401b = Math.round(2.0f * f8);
            this.f8400a = Math.round(f8 * f7);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f8401b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f8400a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i6));
            sb.append(", memory class limited? ");
            sb.append(i8 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
