package a0;

import androidx.lifecycle.j0;
import f5.w;
import java.io.File;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: a0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257e extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C4.a f4989y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0257e(C4.a aVar, int i6) {
        super(0);
        this.f4988x = i6;
        this.f4989y = aVar;
    }

    public final j0 a() {
        int i6 = this.f4988x;
        C4.a aVar = this.f4989y;
        switch (i6) {
        }
        return (j0) aVar.b();
    }

    @Override // C4.a
    public final Object b() {
        switch (this.f4988x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                File file = (File) this.f4989y.b();
                AbstractC1305a.o(file, "<this>");
                String name = file.getName();
                AbstractC1305a.n(name, "getName(...)");
                if (AbstractC1305a.c(K4.h.k0(name, ""), "preferences_pb")) {
                    String str = w.f8492x;
                    File absoluteFile = file.getAbsoluteFile();
                    AbstractC1305a.n(absoluteFile, "file.absoluteFile");
                    return B3.e.p(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 1:
                return a();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return a();
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return a();
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return a();
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return a();
            default:
                return a();
        }
    }
}
