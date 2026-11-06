package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6932x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6933y;

    public /* synthetic */ r(int i6, Object obj) {
        this.f6931w = i6;
        this.f6933y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f6931w;
        Object obj = this.f6933y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f6932x < ((C0471p) obj).f6918w.length()) {
                }
                break;
            case 1:
                if (this.f6932x < ((C0471p) obj).f6918w.length()) {
                }
                break;
            default:
                if (this.f6932x < ((C0405e) obj).s()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i6 = this.f6931w;
        Object obj = this.f6933y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0471p c0471p = (C0471p) obj;
                if (this.f6932x >= c0471p.f6918w.length()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f6932x;
                this.f6932x = i7 + 1;
                return new C0471p(String.valueOf(c0471p.f6918w.charAt(i7)));
            case 1:
                if (this.f6932x >= ((C0471p) obj).f6918w.length()) {
                    throw new NoSuchElementException();
                }
                int i8 = this.f6932x;
                this.f6932x = i8 + 1;
                return new C0471p(String.valueOf(i8));
            default:
                C0405e c0405e = (C0405e) obj;
                if (this.f6932x >= c0405e.s()) {
                    throw new NoSuchElementException(AbstractC0628i.f("Out of bounds index: ", this.f6932x));
                }
                int i9 = this.f6932x;
                this.f6932x = i9 + 1;
                return c0405e.q(i9);
        }
    }
}
