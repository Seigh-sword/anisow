package y2;

import N.C0083b;
import R2.l;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: renamed from: y2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1503e extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13796e;

    public /* synthetic */ C1503e(int i6, Object obj) {
        this.f13795d = i6;
        this.f13796e = obj;
    }

    @Override // N.C0083b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f13795d) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f13796e).f7257z);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        int i6;
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        int i7 = this.f13795d;
        Object obj = this.f13796e;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((DialogC1506h) obj).f13807F) {
                    iVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i8 = MaterialButtonToggleGroup.f7125G;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < materialButtonToggleGroup.getChildCount(); i10++) {
                        if (materialButtonToggleGroup.getChildAt(i10) == view) {
                            i6 = i9;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.c(i10)) {
                                i9++;
                            }
                        }
                    }
                    i6 = -1;
                } else {
                    i6 = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i6, 1, false, ((MaterialButton) view).f7121K));
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f7255A);
                accessibilityNodeInfo.setChecked(checkableImageButton.f7257z);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f7261T);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                iVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
        }
    }

    @Override // N.C0083b
    public final boolean g(View view, int i6, Bundle bundle) {
        int i7 = this.f13795d;
        Object obj = this.f13796e;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (i6 == 1048576) {
                    DialogC1506h dialogC1506h = (DialogC1506h) obj;
                    if (dialogC1506h.f13807F) {
                        dialogC1506h.cancel();
                    }
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (i6 == 1048576) {
                    ((l) ((R2.j) obj)).a(3);
                }
                break;
        }
        return super.g(view, i6, bundle);
    }
}
