package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0436j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import f2.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l2.AbstractC0937a;
import l2.b;
import l2.c;
import m2.C1051k0;
import m2.Q0;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f7021b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0937a f7022a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C1051k0 c1051k0) {
        this.f7022a = new c(c1051k0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f7021b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f7021b == null) {
                        Q0 q02 = (Q0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (q02 != null) {
                            f7021b = new AppMeasurement(q02);
                        } else {
                            f7021b = new AppMeasurement(C1051k0.b(context, new C0436j0(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f7021b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f7022a.j(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f7022a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f7022a.e(str);
    }

    @Keep
    public long generateEventId() {
        return this.f7022a.g();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f7022a.l();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listI = this.f7022a.i(str, str2);
        ArrayList arrayList = new ArrayList(listI == null ? 0 : listI.size());
        for (Bundle bundle : listI) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            AbstractC1332d.m(bundle);
            conditionalUserProperty.mAppId = (String) h.M(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) h.M(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) h.M(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = h.M(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) h.M(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) h.M(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) h.M(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) h.M(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) h.M(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) h.M(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) h.M(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) h.M(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) h.M(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) h.M(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) h.M(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) h.M(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f7022a.h();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f7022a.m();
    }

    @Keep
    public String getGmpAppId() {
        return this.f7022a.f();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f7022a.b(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z5) {
        return this.f7022a.k(str, str2, z5);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f7022a.c(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC1332d.m(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            h.O(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f7022a.d(bundle);
    }

    public AppMeasurement(Q0 q02) {
        this.f7022a = new b(q02);
    }
}
