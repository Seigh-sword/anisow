package H0;

import android.os.Parcel;
import android.util.SparseIntArray;
import d.AbstractC0628i;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f903k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1280b(), new C1280b(), new C1280b());
    }

    @Override // H0.a
    public final b a() {
        Parcel parcel = this.f897e;
        int iDataPosition = parcel.dataPosition();
        int i6 = this.f902j;
        if (i6 == this.f898f) {
            i6 = this.f899g;
        }
        return new b(parcel, iDataPosition, i6, AbstractC0628i.m(new StringBuilder(), this.f900h, "  "), this.f893a, this.f894b, this.f895c);
    }

    @Override // H0.a
    public final boolean e(int i6) {
        while (this.f902j < this.f899g) {
            int i7 = this.f903k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            int i8 = this.f902j;
            Parcel parcel = this.f897e;
            parcel.setDataPosition(i8);
            int i9 = parcel.readInt();
            this.f903k = parcel.readInt();
            this.f902j += i9;
        }
        return this.f903k == i6;
    }

    @Override // H0.a
    public final void i(int i6) {
        int i7 = this.f901i;
        SparseIntArray sparseIntArray = this.f896d;
        Parcel parcel = this.f897e;
        if (i7 >= 0) {
            int i8 = sparseIntArray.get(i7);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i8);
            parcel.writeInt(iDataPosition - i8);
            parcel.setDataPosition(iDataPosition);
        }
        this.f901i = i6;
        sparseIntArray.put(i6, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i6);
    }

    public b(Parcel parcel, int i6, int i7, String str, C1280b c1280b, C1280b c1280b2, C1280b c1280b3) {
        super(c1280b, c1280b2, c1280b3);
        this.f896d = new SparseIntArray();
        this.f901i = -1;
        this.f903k = -1;
        this.f897e = parcel;
        this.f898f = i6;
        this.f899g = i7;
        this.f902j = i6;
        this.f900h = str;
    }
}
