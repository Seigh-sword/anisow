package l3;

import android.util.Log;
import d.AbstractC0628i;
import j3.AbstractC0857g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f10041b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1251c f10042a;

    public f(C1251c c1251c) {
        this.f10042a = c1251c;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            String string = jSONArray.getString(i6);
            try {
                arrayList.add(l.a(string));
            } catch (Exception e6) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e6);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i6 = 0; i6 < list.size(); i6++) {
            try {
                jSONArray.put(new JSONObject(l.f10060a.c(list.get(i6))));
            } catch (JSONException e6) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e6);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Map c(String str, boolean z5) throws Throwable {
        FileInputStream fileInputStream;
        Exception e6;
        C1251c c1251c = this.f10042a;
        File fileN = z5 ? c1251c.n(str, "internal-keys") : c1251c.n(str, "keys");
        if (fileN.exists()) {
            ?? length = fileN.length();
            if (length != 0) {
                ?? r8 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileN);
                        try {
                            HashMap mapA = a(AbstractC0857g.i(fileInputStream));
                            AbstractC0857g.b(fileInputStream, "Failed to close user metadata file.");
                            return mapA;
                        } catch (Exception e7) {
                            e6 = e7;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e6);
                            f(fileN);
                            AbstractC0857g.b(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        r8 = length;
                        AbstractC0857g.b(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e8) {
                    fileInputStream = null;
                    e6 = e8;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC0857g.b(r8, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(fileN);
        return Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileN = this.f10042a.n(str, "user-data");
        ?? r42 = 0;
        if (fileN.exists()) {
            ?? r32 = (fileN.length() > 0L ? 1 : (fileN.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileN);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC0857g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            AbstractC0857g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e6) {
                            e = e6;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileN);
                            AbstractC0857g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0857g.b(r42, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r42 = r32;
            }
        }
        String strQ = AbstractC0628i.q("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strQ, null);
        }
        f(fileN);
        return null;
    }

    public final void g(String str, Map map, boolean z5) {
        String string;
        BufferedWriter bufferedWriter;
        C1251c c1251c = this.f10042a;
        File fileN = z5 ? c1251c.n(str, "internal-keys") : c1251c.n(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileN), f10041b));
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            AbstractC0857g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(fileN);
            AbstractC0857g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0857g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
