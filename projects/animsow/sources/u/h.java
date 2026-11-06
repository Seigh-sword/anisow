package u;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12800a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ boolean a(int i6, int i7) {
        if (i6 != 0) {
            return i6 == i7;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i6) {
        if (i6 != 0) {
            return i6 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i6) {
        int[] iArr = new int[i6];
        System.arraycopy(f12800a, 0, iArr, 0, i6);
        return iArr;
    }
}
