package X1;

import W1.InterfaceC0213g;
import android.content.Intent;

/* JADX INFO: renamed from: X1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251t extends u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Intent f4647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0213g f4648x;

    public C0251t(Intent intent, InterfaceC0213g interfaceC0213g) {
        this.f4647w = intent;
        this.f4648x = interfaceC0213g;
    }

    @Override // X1.u
    public final void a() {
        Intent intent = this.f4647w;
        if (intent != null) {
            this.f4648x.startActivityForResult(intent, 2);
        }
    }
}
