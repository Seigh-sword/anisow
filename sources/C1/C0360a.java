package c1;

import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import s4.InterfaceC1309e;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0360a extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1309e f6173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0360a(InterfaceC1309e interfaceC1309e, int i6) {
        super(0);
        this.f6172x = i6;
        this.f6173y = interfaceC1309e;
    }

    public final i0 a() {
        int i6 = this.f6172x;
        InterfaceC1309e interfaceC1309e = this.f6173y;
        switch (i6) {
        }
        return ((j0) interfaceC1309e.getValue()).e();
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f6172x) {
        }
        return a();
    }
}
