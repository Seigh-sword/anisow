package N;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import b3.C0343c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import i.C0803c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import n3.C1156c;
import n3.InterfaceC1155b;
import p3.C1251c;
import q2.InterfaceC1262e;

/* JADX INFO: renamed from: N.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0095h implements F0.v, E1.g, N1.j, S2.y, L3.e, d3.f, D3.a, InterfaceC1262e, InterfaceC1155b, d3.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1989w;

    public /* synthetic */ C0095h(int i6) {
        this.f1989w = i6;
    }

    @Override // N1.j
    public Object apply(Object obj) {
        switch (this.f1989w) {
            case 9:
                E1.c cVar = N1.l.f2100B;
                throw new O1.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 10:
                E1.c cVar2 = N1.l.f2100B;
                throw new O1.a("Timed out while trying to open db.", (Throwable) obj);
            case 11:
                E1.c cVar3 = N1.l.f2100B;
                return (List) N1.l.n(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C0095h(13));
            case 12:
                Cursor cursor = (Cursor) obj;
                E1.c cVar4 = N1.l.f2100B;
                return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
            case 13:
                Cursor cursor2 = (Cursor) obj;
                E1.c cVar5 = N1.l.f2100B;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    C0803c c0803cA = H1.j.a();
                    c0803cA.Q(cursor2.getString(1));
                    c0803cA.R(Q1.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    c0803cA.f9278y = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(c0803cA.k());
                }
                return arrayList;
            case 14:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 15:
                Cursor cursor3 = (Cursor) obj;
                E1.c cVar6 = N1.l.f2100B;
                if (cursor3.moveToNext()) {
                    return Long.valueOf(cursor3.getLong(0));
                }
                return null;
            case 16:
                E1.c cVar7 = N1.l.f2100B;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                Cursor cursor4 = (Cursor) obj;
                E1.c cVar8 = N1.l.f2100B;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i6);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // n3.InterfaceC1155b
    public Object c(JsonReader jsonReader) throws IOException {
        switch (this.f1989w) {
            case 26:
                K1.b bVar = C1156c.f11702a;
                C0343c c0343c = new C0343c(3);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            String strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            c0343c.f5931x = strNextString;
                            break;
                            break;
                        case "arch":
                            String strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null arch");
                            }
                            c0343c.f5930w = strNextString2;
                            break;
                            break;
                        case "buildId":
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            c0343c.f5932y = strNextString3;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return c0343c.h();
            case 27:
                return C1156c.b(jsonReader);
            case 28:
                return C1156c.b(jsonReader);
            default:
                return C1156c.g(jsonReader);
        }
    }

    @Override // d3.f
    public List d(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // d3.e
    public Object f(C1251c c1251c) {
        switch (this.f1989w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7427a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7429c.get();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f7428b.get();
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                d3.n nVar = ExecutorsRegistrar.f7427a;
                return e3.k.f8291w;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return TransportRegistrar.lambda$getComponents$0(c1251c);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return TransportRegistrar.lambda$getComponents$1(c1251c);
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return TransportRegistrar.lambda$getComponents$2(c1251c);
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c1251c);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                Set setG = c1251c.g(d3.r.a(L3.a.class));
                L3.c cVar = L3.c.f1732y;
                if (cVar == null) {
                    synchronized (L3.c.class) {
                        try {
                            cVar = L3.c.f1732y;
                            if (cVar == null) {
                                cVar = new L3.c(0, 0);
                                L3.c.f1732y = cVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return new L3.b(setG, cVar);
            case 9:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c1251c);
            case 10:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c1251c);
            case 11:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(c1251c);
            case 12:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(c1251c);
            case 13:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(c1251c);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(c1251c);
        }
    }

    @Override // q2.InterfaceC1262e
    public void g(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // E1.g
    public void a(Exception exc) {
    }

    @Override // D3.a
    public void e(D3.c cVar) {
    }
}
