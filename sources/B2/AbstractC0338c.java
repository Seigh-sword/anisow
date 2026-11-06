package b2;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: b2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0338c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5916a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5917b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f5918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f5919d;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f5918c == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f5918c = Application.getProcessName();
            } else {
                int iMyPid = f5919d;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f5919d = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                AbstractC1332d.m(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                                if (bufferedReader != null) {
                                }
                                f5918c = strTrim;
                                return f5918c;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f5918c = strTrim;
            }
        }
        return f5918c;
    }
}
