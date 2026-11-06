package com.onesignal;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: com.onesignal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0573m0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0585q0 f7889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f7890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0579o0 f7891y;

    public DialogInterfaceOnClickListenerC0573m0(C0579o0 c0579o0, C0585q0 c0585q0, List list) {
        this.f7891y = c0579o0;
        this.f7889w = c0585q0;
        this.f7890x = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        this.f7891y.q0(this.f7889w, this.f7890x);
    }
}
