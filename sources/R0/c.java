package R0;

import android.database.Cursor;
import java.util.ArrayList;
import w0.p;
import w0.r;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2889b;

    public c(p pVar, int i6) {
        if (i6 == 1) {
            this.f2888a = pVar;
            this.f2889b = new b(this, pVar, 1);
        } else if (i6 == 2) {
            this.f2888a = pVar;
            this.f2889b = new b(this, pVar, 3);
        } else if (i6 != 3) {
            this.f2888a = pVar;
            this.f2889b = new b(this, pVar, 0);
        } else {
            this.f2888a = pVar;
            this.f2889b = new b(this, pVar, 6);
        }
    }

    public final ArrayList a(String str) {
        r rVarB = r.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        p pVar = this.f2888a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final Long b(String str) {
        r rVarB = r.b(1, "SELECT long_value FROM Preference where `key`=?");
        rVarB.l(1, str);
        p pVar = this.f2888a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarB);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final ArrayList c(String str) {
        r rVarB = r.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        p pVar = this.f2888a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final boolean d(String str) {
        r rVarB = r.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        p pVar = this.f2888a;
        pVar.b();
        Cursor cursorG = pVar.g(rVarB);
        try {
            boolean z5 = false;
            if (cursorG.moveToFirst()) {
                z5 = cursorG.getInt(0) != 0;
            }
            return z5;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final void e(d dVar) {
        p pVar = this.f2888a;
        pVar.b();
        pVar.c();
        try {
            this.f2889b.e(dVar);
            pVar.h();
        } finally {
            pVar.f();
        }
    }
}
