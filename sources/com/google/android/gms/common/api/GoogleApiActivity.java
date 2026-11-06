package com.google.android.gms.common.api;

import U1.b;
import U1.e;
import W1.C0211e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.X;
import d.AbstractC0628i;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6430x = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6431w = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        super.onActivityResult(i6, i7, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6431w = 0;
            setResult(i7, intent);
            if (booleanExtra) {
                C0211e c0211eE = C0211e.e(this);
                if (i7 == -1) {
                    X x5 = c0211eE.f4312I;
                    x5.sendMessage(x5.obtainMessage(3));
                } else if (i7 == 0) {
                    c0211eE.f(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i6 == 2) {
            this.f6431w = 0;
            setResult(i7, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6431w = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6431w = bundle.getInt("resolution");
        }
        if (this.f6431w != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else {
                    if (pendingIntent == null) {
                        AbstractC1332d.m(num);
                        e.f3586d.c(this, num.intValue(), this);
                        this.f6431w = 1;
                        return;
                    }
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f6431w = 1;
                        return;
                    } catch (ActivityNotFoundException e6) {
                        if (extras.getBoolean("notify_manager", true)) {
                            C0211e.e(this).f(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String strJ = AbstractC0628i.j("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                strJ = strJ.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", strJ, e6);
                        }
                        this.f6431w = 1;
                    } catch (IntentSender.SendIntentException e7) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e7);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6431w);
        super.onSaveInstanceState(bundle);
    }
}
