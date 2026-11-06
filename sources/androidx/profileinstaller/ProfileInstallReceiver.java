package androidx.profileinstaller;

import S0.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import d.RunnableC0634o;
import java.io.File;
import n.ExecutorC1138a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC1332d.E0(context, new ExecutorC1138a(8), new f(18, this), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                f fVar = new f(18, this);
                if ("DROP_SHADER_CACHE".equals(string)) {
                    fVar.m(AbstractC1332d.A(context.createDeviceProtectedStorageContext().getCodeCacheDir()) ? 14 : 15, null);
                    return;
                } else {
                    fVar.m(16, null);
                    return;
                }
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    f fVar2 = new f(18, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new RunnableC0634o(11, 3, fVar2, null).run();
                    return;
                }
                return;
            }
            ExecutorC1138a executorC1138a = new ExecutorC1138a(9);
            f fVar3 = new f(18, this);
            try {
                AbstractC1332d.Z(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                executorC1138a.execute(new RunnableC0634o(10, 3, fVar3, null));
            } catch (PackageManager.NameNotFoundException e6) {
                executorC1138a.execute(new RunnableC0634o(7, 3, fVar3, e6));
            }
        }
    }
}
