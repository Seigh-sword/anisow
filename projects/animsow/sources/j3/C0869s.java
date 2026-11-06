package j3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import m3.C1092c0;
import m3.C1094d0;
import m3.U;
import m3.V;
import m3.Y;
import s3.InterfaceC1304a;

/* JADX INFO: renamed from: j3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f9528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9529g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0875y f9531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.b f9532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1304a f9533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J0.l f9534e;

    static {
        HashMap map = new HashMap();
        f9528f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f9529g = "Crashlytics Android SDK/19.2.0";
    }

    public C0869s(Context context, C0875y c0875y, android.support.v4.media.b bVar, F.d dVar, J0.l lVar) {
        this.f9530a = context;
        this.f9531b = c0875y;
        this.f9532c = bVar;
        this.f9533d = dVar;
        this.f9534e = lVar;
    }

    public static V c(P0.h hVar, int i6) {
        String str = (String) hVar.f2408b;
        String str2 = (String) hVar.f2407a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f2409c;
        int i7 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        P0.h hVar2 = (P0.h) hVar.f2410d;
        if (i6 >= 8) {
            P0.h hVar3 = hVar2;
            while (hVar3 != null) {
                hVar3 = (P0.h) hVar3.f2410d;
                i7++;
            }
        }
        int i8 = i7;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b6 = (byte) (0 | 1);
        V vC = null;
        if (hVar2 != null && i8 == 0) {
            vC = c(hVar2, i6 + 1);
        }
        if (b6 == 1) {
            return new V(str, str2, listD, vC, i8);
        }
        StringBuilder sb = new StringBuilder();
        if ((b6 & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i6) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            Y y5 = new Y();
            y5.f11438e = i6;
            y5.f11439f = (byte) (y5.f11439f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            y5.f11434a = jMax;
            byte b6 = (byte) (y5.f11439f | 1);
            y5.f11439f = b6;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            y5.f11435b = str;
            y5.f11436c = fileName;
            y5.f11437d = lineNumber;
            y5.f11439f = (byte) (b6 | 2);
            arrayList.add(y5.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        byte b6 = (byte) (((byte) (0 | 1)) | 2);
        android.support.v4.media.b bVar = this.f9532c;
        String str = (String) bVar.f5069e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = (String) bVar.f5066b;
        if (b6 == 3) {
            return Collections.singletonList(new U(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b6 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b6 & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }

    public final C1094d0 b(int i6) {
        boolean z5;
        Float fValueOf;
        Intent intentRegisterReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.f9530a;
        boolean z6 = false;
        try {
            intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e6) {
            e = e6;
            z5 = false;
        }
        if (intentRegisterReceiver != null) {
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            z5 = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e7) {
                e = e7;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
            }
            fValueOf = (intExtra == -1 || intExtra2 == -1) ? null : Float.valueOf(intExtra / intExtra2);
        } else {
            fValueOf = null;
            z5 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        int i7 = (!z5 || fValueOf == null) ? 1 : ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
        if (!AbstractC0857g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z6 = true;
        }
        long jA = AbstractC0857g.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j6 = jA - memoryInfo.availMem;
        if (j6 <= 0) {
            j6 = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        C1092c0 c1092c0 = new C1092c0();
        c1092c0.f11471a = dValueOf;
        c1092c0.f11472b = i7;
        byte b6 = (byte) (c1092c0.f11477g | 1);
        c1092c0.f11473c = z6;
        c1092c0.f11474d = i6;
        c1092c0.f11475e = j6;
        c1092c0.f11476f = blockCount;
        c1092c0.f11477g = (byte) (((byte) (((byte) (((byte) (b6 | 2)) | 4)) | 8)) | 16);
        return c1092c0.a();
    }
}
