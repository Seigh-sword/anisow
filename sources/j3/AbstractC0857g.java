package j3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/* JADX INFO: renamed from: j3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9468a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e6) {
                Log.e("FirebaseCrashlytics", str, e6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean zF = f();
        ?? r02 = zF;
        if (g()) {
            r02 = (zF ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r02 | 4 : r02;
    }

    public static int d(Context context, String str, String str2) {
        String resourcePackageName;
        Resources resources = context.getResources();
        int i6 = context.getApplicationContext().getApplicationInfo().icon;
        if (i6 > 0) {
            try {
                resourcePackageName = context.getResources().getResourcePackageName(i6);
                if ("android".equals(resourcePackageName)) {
                    resourcePackageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                resourcePackageName = context.getPackageName();
            }
        } else {
            resourcePackageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, resourcePackageName);
    }

    public static String e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            int i7 = i6 * 2;
            char[] cArr2 = f9468a;
            cArr[i7] = cArr2[(b6 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public static boolean f() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean g() {
        boolean zF = f();
        String str = Build.TAGS;
        if ((zF || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zF && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String h(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return e(messageDigest.digest());
        } catch (NoSuchAlgorithmException e6) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e6);
            return "";
        }
    }

    public static String i(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
