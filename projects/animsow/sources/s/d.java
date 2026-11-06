package S;

import J3.G;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f3053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, G g4) {
        super(inputConnection, false);
        this.f3053a = g4;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        L3.c cVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            cVar = new L3.c(12, new f(inputContentInfo));
        }
        if (this.f3053a.a(cVar, i6, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i6, bundle);
    }
}
