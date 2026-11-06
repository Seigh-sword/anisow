package H1;

import a3.C0261b;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC0292q;
import com.google.android.gms.internal.measurement.R2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import w3.C1479c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i6) {
        return i6 != 1 ? i6 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
    }

    public static /* synthetic */ String B(int i6) {
        switch (i6) {
            case 1:
                return "ENQUEUED";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "RUNNING";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SUCCEEDED";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "FAILED";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "BLOCKED";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String C(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
    }

    public static /* synthetic */ String D(int i6) {
        switch (i6) {
            case 1:
                return "BEGIN_ARRAY";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "END_ARRAY";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "END_OBJECT";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "WRITE_ONLY" : "READ_ONLY" : "READ_AND_WRITE";
    }

    public static /* synthetic */ String F(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
    }

    public static /* synthetic */ String G(int i6) {
        return i6 != 1 ? i6 != 2 ? "null" : "END_SESSION" : "BACKGROUND";
    }

    public static /* synthetic */ String H(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "UNKNOWN" : "CUSTOM" : "SESSION_TIME" : "TIME_SINCE_LAST_IN_APP";
    }

    public static final boolean a(int i6) {
        return i6 == 3 || i6 == 4 || i6 == 6;
    }

    public static int b(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 != 3) {
            return i6 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int c(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 != 3) {
            return i6 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int d(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 != 3) {
            return i6 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ String e(int i6) {
        if (i6 == 1) {
            return "webview";
        }
        if (i6 == 2) {
            return "browser";
        }
        if (i6 == 3) {
            return "replacement";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i6) {
        switch (i6) {
            case 1:
                return "greater";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "less";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "equal";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "not_equal";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "less_or_equal";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "greater_or_equal";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "exists";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "not_exists";
            case 9:
                return "in";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i6) {
        if (i6 == 1) {
            return "data";
        }
        if (i6 == 2) {
            return "https";
        }
        if (i6 == 3) {
            return "http";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i6) {
        if (i6 == 1) {
            return "min_time_since";
        }
        if (i6 == 2) {
            return "session_time";
        }
        if (i6 == 3) {
            return "custom";
        }
        if (i6 == 4) {
            return "unknown";
        }
        throw null;
    }

    public static int i(int i6, int i7, int i8, int i9) {
        return AbstractC0292q.x(i6) + i7 + i8 + i9;
    }

    public static String j(String str, int i6, String str2) {
        return str + i6 + str2;
    }

    public static String k(String str, int i6, String str2, int i7) {
        return str + i6 + str2 + i7;
    }

    public static StringBuilder l(String str, int i6, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i6);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ Iterator m() {
        try {
            return Arrays.asList(new N4.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static C1479c n(T1.j jVar, C0261b c0261b) {
        c0261b.s(jVar.d());
        return c0261b.b();
    }

    public static /* synthetic */ void o(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void p(R2 r22) {
        if (r22 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void q(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ Iterator r() {
        try {
            return Arrays.asList(new N4.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String s(int i6) {
        switch (i6) {
            case 1:
                return "ENQUEUED";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "RUNNING";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SUCCEEDED";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "FAILED";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "BLOCKED";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i6) {
        if (i6 == 1) {
            return "UNKNOWN_COMPARISON_TYPE";
        }
        if (i6 == 2) {
            return "LESS_THAN";
        }
        if (i6 == 3) {
            return "GREATER_THAN";
        }
        if (i6 == 4) {
            return "EQUAL";
        }
        if (i6 == 5) {
            return "BETWEEN";
        }
        throw null;
    }

    public static /* synthetic */ String u(int i6) {
        switch (i6) {
            case 1:
                return "UNKNOWN_MATCH_TYPE";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "REGEXP";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGINS_WITH";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "ENDS_WITH";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "PARTIAL";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "EXACT";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "IN_LIST";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String v(int i6) {
        return i6 != 1 ? i6 != 2 ? "null" : "LINEAR" : "EXPONENTIAL";
    }

    public static /* synthetic */ String w(int i6) {
        switch (i6) {
            case 1:
                return "NOT_REQUIRED";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "CONNECTED";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "UNMETERED";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "NOT_ROAMING";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "METERED";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i6) {
        switch (i6) {
            case 1:
                return "GREATER_THAN";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "LESS_THAN";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "EQUAL_TO";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "NOT_EQUAL_TO";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "LESS_THAN_OR_EQUAL_TO";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "GREATER_THAN_OR_EQUAL_TO";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "EXISTS";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "NOT_EXISTS";
            case 9:
                return "CONTAINS";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "APP_CLOSE" : "APP_OPEN" : "NOTIFICATION_CLICK";
    }

    public static /* synthetic */ String z(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "ERROR" : "LOCATION_PERMISSIONS_MISSING_MANIFEST" : "PERMISSION_DENIED" : "PERMISSION_GRANTED";
    }
}
