package B3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f100a;

    public i(Context context, String str) {
        this.f100a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j6 = this.f100a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f100a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f100a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f100a.edit().putStringSet(key, hashSet).putLong("fire-count", j6 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f100a.edit();
            int i6 = 0;
            for (Map.Entry<String, ?> entry : this.f100a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i6++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i6 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i6);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f100a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f100a.edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j6) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j6).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j6));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f100a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f100a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f100a.edit().remove(strE) : this.f100a.edit().putStringSet(strE, hashSet)).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j6) {
        if (!this.f100a.contains("fire-global")) {
            this.f100a.edit().putLong("fire-global", j6).commit();
            return true;
        }
        long j7 = this.f100a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j7).equals(d(j6))) {
                return false;
            }
            this.f100a.edit().putLong("fire-global", j6).commit();
            return true;
        }
    }

    public final synchronized void h(String str, long j6) {
        String strD = d(j6);
        if (this.f100a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j7 = this.f100a.getLong("fire-count", 0L);
        if (j7 + 1 == 30) {
            a();
            j7 = this.f100a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f100a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f100a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 + 1).putString("last-used-date", strD).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f100a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f100a.edit().putStringSet(str, hashSet).commit();
    }
}
