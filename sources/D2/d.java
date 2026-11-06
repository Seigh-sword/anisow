package D2;

import O.i;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.xo.anilab.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends V.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f295q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f295q = chip;
    }

    @Override // V.b
    public final void l(ArrayList arrayList) {
        boolean z5 = false;
        arrayList.add(0);
        Rect rect = Chip.f7146S;
        Chip chip = this.f295q;
        if (chip.c()) {
            f fVar = chip.f7149A;
            if (fVar != null && fVar.f337g0) {
                z5 = true;
            }
            if (!z5 || chip.f7152D == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // V.b
    public final void o(int i6, i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        if (i6 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f7146S);
            return;
        }
        Chip chip = this.f295q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.isEmpty(text) ? "" : text;
            accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        iVar.b(O.d.f2289e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
