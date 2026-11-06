package i;

import android.view.ViewGroup;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0801a extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9272a;

    public AbstractC0801a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9272a = 0;
    }

    public AbstractC0801a(AbstractC0801a abstractC0801a) {
        super((ViewGroup.MarginLayoutParams) abstractC0801a);
        this.f9272a = 0;
        this.f9272a = abstractC0801a.f9272a;
    }
}
