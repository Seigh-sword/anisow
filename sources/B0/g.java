package B0;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SQLiteStatement f76x;

    public g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f76x = sQLiteStatement;
    }

    public final void l() {
        this.f76x.executeUpdateDelete();
    }
}
