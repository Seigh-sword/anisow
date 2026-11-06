package y0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f13717d;

    public f(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f13714a = str;
        this.f13715b = Collections.unmodifiableMap(map);
        this.f13716c = Collections.unmodifiableSet(hashSet);
        this.f13717d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static f a(B0.b bVar, String str) {
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        Cursor cursorK = bVar.k("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorK.getColumnCount() > 0) {
                int columnIndex = cursorK.getColumnIndex("name");
                int columnIndex2 = cursorK.getColumnIndex("type");
                int columnIndex3 = cursorK.getColumnIndex("notnull");
                int columnIndex4 = cursorK.getColumnIndex("pk");
                int columnIndex5 = cursorK.getColumnIndex("dflt_value");
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(columnIndex);
                    map.put(string, new C1495b(string, cursorK.getString(columnIndex2), cursorK.getInt(columnIndex3) != 0, cursorK.getInt(columnIndex4), cursorK.getString(columnIndex5), 2));
                }
            }
            cursorK.close();
            HashSet hashSet = new HashSet();
            cursorK = bVar.k("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorK.getColumnIndex("id");
                int columnIndex7 = cursorK.getColumnIndex("seq");
                int columnIndex8 = cursorK.getColumnIndex("table");
                int columnIndex9 = cursorK.getColumnIndex("on_delete");
                int columnIndex10 = cursorK.getColumnIndex("on_update");
                ArrayList<d> arrayListB = b(cursorK);
                int count = cursorK.getCount();
                int i9 = 0;
                while (i9 < count) {
                    cursorK.moveToPosition(i9);
                    if (cursorK.getInt(columnIndex7) != 0) {
                        i6 = columnIndex6;
                        i7 = columnIndex7;
                        arrayList = arrayListB;
                        i8 = count;
                    } else {
                        int i10 = cursorK.getInt(columnIndex6);
                        i6 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i7 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        for (d dVar : arrayListB) {
                            ArrayList arrayList4 = arrayListB;
                            int i11 = count;
                            if (dVar.f13707w == i10) {
                                arrayList2.add(dVar.f13709y);
                                arrayList3.add(dVar.f13710z);
                            }
                            count = i11;
                            arrayListB = arrayList4;
                        }
                        arrayList = arrayListB;
                        i8 = count;
                        hashSet.add(new C1496c(cursorK.getString(columnIndex8), cursorK.getString(columnIndex9), cursorK.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i9++;
                    columnIndex6 = i6;
                    columnIndex7 = i7;
                    count = i8;
                    arrayListB = arrayList;
                }
                cursorK.close();
                cursorK = bVar.k("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorK.getColumnIndex("name");
                    int columnIndex12 = cursorK.getColumnIndex("origin");
                    int columnIndex13 = cursorK.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorK.moveToNext()) {
                        if ("c".equals(cursorK.getString(columnIndex12))) {
                            e eVarC = c(bVar, cursorK.getString(columnIndex11), cursorK.getInt(columnIndex13) == 1);
                            if (eVarC == null) {
                                break;
                            }
                            hashSet3.add(eVarC);
                        }
                    }
                    cursorK.close();
                    hashSet2 = hashSet3;
                    return new f(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < count; i6++) {
            cursor.moveToPosition(i6);
            arrayList.add(new d(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static e c(B0.b bVar, String str, boolean z5) {
        Cursor cursorK = bVar.k("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorK.getColumnIndex("seqno");
            int columnIndex2 = cursorK.getColumnIndex("cid");
            int columnIndex3 = cursorK.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorK.moveToNext()) {
                    if (cursorK.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorK.getInt(columnIndex)), cursorK.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                e eVar = new e(str, z5, arrayList);
                cursorK.close();
                return eVar;
            }
            cursorK.close();
            return null;
        } catch (Throwable th) {
            cursorK.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = fVar.f13714a;
        String str2 = this.f13714a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = fVar.f13715b;
        Map map2 = this.f13715b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = fVar.f13716c;
        Set set3 = this.f13716c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f13717d;
        if (set4 == null || (set = fVar.f13717d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f13714a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f13715b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f13716c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f13714a + "', columns=" + this.f13715b + ", foreignKeys=" + this.f13716c + ", indices=" + this.f13717d + '}';
    }
}
