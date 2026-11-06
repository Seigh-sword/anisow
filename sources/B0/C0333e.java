package b0;

import android.view.View;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333e extends h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5879x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333e(int i6, String str) {
        super(str);
        this.f5879x = i6;
    }

    @Override // L.i
    public final /* bridge */ /* synthetic */ float i(Object obj) {
        switch (this.f5879x) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return s((View) obj);
    }

    @Override // L.i
    public final /* bridge */ /* synthetic */ void m(Object obj, float f6) {
        switch (this.f5879x) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                t((View) obj, f6);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                t((View) obj, f6);
                break;
            case 9:
                t((View) obj, f6);
                break;
            case 10:
                t((View) obj, f6);
                break;
            case 11:
                t((View) obj, f6);
                break;
            default:
                t((View) obj, f6);
                break;
        }
    }

    public final float s(View view) {
        switch (this.f5879x) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return view.getAlpha();
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return view.getScaleX();
            case 9:
                return view.getScaleY();
            case 10:
                return view.getRotation();
            case 11:
                return view.getRotationX();
            default:
                return view.getRotationY();
        }
    }

    public final void t(View view, float f6) {
        switch (this.f5879x) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                view.setAlpha(f6);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                view.setScaleX(f6);
                break;
            case 9:
                view.setScaleY(f6);
                break;
            case 10:
                view.setRotation(f6);
                break;
            case 11:
                view.setRotationX(f6);
                break;
            default:
                view.setRotationY(f6);
                break;
        }
    }
}
