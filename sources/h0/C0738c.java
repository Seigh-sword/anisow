package h0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738c implements Parcelable {
    public static final Parcelable.Creator<C0738c> CREATOR = new C0737b(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f8772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f8773C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f8774D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CharSequence f8775E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8776F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final CharSequence f8777G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f8778H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f8779I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f8780J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f8781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f8782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f8783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f8784z;

    public C0738c(Parcel parcel) {
        this.f8781w = parcel.createIntArray();
        this.f8782x = parcel.createStringArrayList();
        this.f8783y = parcel.createIntArray();
        this.f8784z = parcel.createIntArray();
        this.f8771A = parcel.readInt();
        this.f8772B = parcel.readString();
        this.f8773C = parcel.readInt();
        this.f8774D = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8775E = (CharSequence) creator.createFromParcel(parcel);
        this.f8776F = parcel.readInt();
        this.f8777G = (CharSequence) creator.createFromParcel(parcel);
        this.f8778H = parcel.createStringArrayList();
        this.f8779I = parcel.createStringArrayList();
        this.f8780J = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f8781w);
        parcel.writeStringList(this.f8782x);
        parcel.writeIntArray(this.f8783y);
        parcel.writeIntArray(this.f8784z);
        parcel.writeInt(this.f8771A);
        parcel.writeString(this.f8772B);
        parcel.writeInt(this.f8773C);
        parcel.writeInt(this.f8774D);
        TextUtils.writeToParcel(this.f8775E, parcel, 0);
        parcel.writeInt(this.f8776F);
        TextUtils.writeToParcel(this.f8777G, parcel, 0);
        parcel.writeStringList(this.f8778H);
        parcel.writeStringList(this.f8779I);
        parcel.writeInt(this.f8780J ? 1 : 0);
    }

    public C0738c(C0736a c0736a) {
        int size = c0736a.f8736a.size();
        this.f8781w = new int[size * 6];
        if (!c0736a.f8742g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8782x = new ArrayList(size);
        this.f8783y = new int[size];
        this.f8784z = new int[size];
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            d0 d0Var = (d0) c0736a.f8736a.get(i7);
            int i8 = i6 + 1;
            this.f8781w[i6] = d0Var.f8792a;
            ArrayList arrayList = this.f8782x;
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = d0Var.f8793b;
            arrayList.add(abstractComponentCallbacksC0734B != null ? abstractComponentCallbacksC0734B.f8590A : null);
            int[] iArr = this.f8781w;
            iArr[i8] = d0Var.f8794c ? 1 : 0;
            iArr[i6 + 2] = d0Var.f8795d;
            iArr[i6 + 3] = d0Var.f8796e;
            int i9 = i6 + 5;
            iArr[i6 + 4] = d0Var.f8797f;
            i6 += 6;
            iArr[i9] = d0Var.f8798g;
            this.f8783y[i7] = d0Var.f8799h.ordinal();
            this.f8784z[i7] = d0Var.f8800i.ordinal();
        }
        this.f8771A = c0736a.f8741f;
        this.f8772B = c0736a.f8743h;
        this.f8773C = c0736a.f8754s;
        this.f8774D = c0736a.f8744i;
        this.f8775E = c0736a.f8745j;
        this.f8776F = c0736a.f8746k;
        this.f8777G = c0736a.f8747l;
        this.f8778H = c0736a.f8748m;
        this.f8779I = c0736a.f8749n;
        this.f8780J = c0736a.f8750o;
    }
}
