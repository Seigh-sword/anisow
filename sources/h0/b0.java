package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new C0737b(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8756A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f8757B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f8758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f8759D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f8760E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f8761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f8762G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8763H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f8764I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f8765J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f8766K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f8768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f8770z;

    public b0(Parcel parcel) {
        this.f8767w = parcel.readString();
        this.f8768x = parcel.readString();
        this.f8769y = parcel.readInt() != 0;
        this.f8770z = parcel.readInt() != 0;
        this.f8756A = parcel.readInt();
        this.f8757B = parcel.readInt();
        this.f8758C = parcel.readString();
        this.f8759D = parcel.readInt() != 0;
        this.f8760E = parcel.readInt() != 0;
        this.f8761F = parcel.readInt() != 0;
        this.f8762G = parcel.readInt() != 0;
        this.f8763H = parcel.readInt();
        this.f8764I = parcel.readString();
        this.f8765J = parcel.readInt();
        this.f8766K = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8767w);
        sb.append(" (");
        sb.append(this.f8768x);
        sb.append(")}:");
        if (this.f8769y) {
            sb.append(" fromLayout");
        }
        if (this.f8770z) {
            sb.append(" dynamicContainer");
        }
        int i6 = this.f8757B;
        if (i6 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i6));
        }
        String str = this.f8758C;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f8759D) {
            sb.append(" retainInstance");
        }
        if (this.f8760E) {
            sb.append(" removing");
        }
        if (this.f8761F) {
            sb.append(" detached");
        }
        if (this.f8762G) {
            sb.append(" hidden");
        }
        String str2 = this.f8764I;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f8765J);
        }
        if (this.f8766K) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f8767w);
        parcel.writeString(this.f8768x);
        parcel.writeInt(this.f8769y ? 1 : 0);
        parcel.writeInt(this.f8770z ? 1 : 0);
        parcel.writeInt(this.f8756A);
        parcel.writeInt(this.f8757B);
        parcel.writeString(this.f8758C);
        parcel.writeInt(this.f8759D ? 1 : 0);
        parcel.writeInt(this.f8760E ? 1 : 0);
        parcel.writeInt(this.f8761F ? 1 : 0);
        parcel.writeInt(this.f8762G ? 1 : 0);
        parcel.writeInt(this.f8763H);
        parcel.writeString(this.f8764I);
        parcel.writeInt(this.f8765J);
        parcel.writeInt(this.f8766K ? 1 : 0);
    }

    public b0(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        this.f8767w = abstractComponentCallbacksC0734B.getClass().getName();
        this.f8768x = abstractComponentCallbacksC0734B.f8590A;
        this.f8769y = abstractComponentCallbacksC0734B.f8599J;
        this.f8770z = abstractComponentCallbacksC0734B.f8601L;
        this.f8756A = abstractComponentCallbacksC0734B.f8609T;
        this.f8757B = abstractComponentCallbacksC0734B.f8610U;
        this.f8758C = abstractComponentCallbacksC0734B.f8611V;
        this.f8759D = abstractComponentCallbacksC0734B.f8614Y;
        this.f8760E = abstractComponentCallbacksC0734B.f8597H;
        this.f8761F = abstractComponentCallbacksC0734B.f8613X;
        this.f8762G = abstractComponentCallbacksC0734B.f8612W;
        this.f8763H = abstractComponentCallbacksC0734B.f8626k0.ordinal();
        this.f8764I = abstractComponentCallbacksC0734B.f8593D;
        this.f8765J = abstractComponentCallbacksC0734B.f8594E;
        this.f8766K = abstractComponentCallbacksC0734B.f8620e0;
    }
}
