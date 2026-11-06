package c0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import d2.AbstractC0651b;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D extends SpannableStringBuilder {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Class f6100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f6101x;

    public D(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f6101x = new ArrayList();
        AbstractC0651b.f(cls, "watcherClass cannot be null");
        this.f6100w = cls;
    }

    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f6101x;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((C) arrayList.get(i6)).f6099x.incrementAndGet();
            i6++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    public final void b() {
        e();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f6101x;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((C) arrayList.get(i6)).onTextChanged(this, 0, length(), length());
            i6++;
        }
    }

    public final C c(Object obj) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f6101x;
            if (i6 >= arrayList.size()) {
                return null;
            }
            C c6 = (C) arrayList.get(i6);
            if (c6.f6098w == obj) {
                return c6;
            }
            i6++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f6100w == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f6101x;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((C) arrayList.get(i6)).f6099x.decrementAndGet();
            i6++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C c6;
        if (d(obj) && (c6 = c(obj)) != null) {
            obj = c6;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i6, int i7, Class cls) {
        if (this.f6100w != cls) {
            return super.getSpans(i6, i7, cls);
        }
        C[] cArr = (C[]) super.getSpans(i6, i7, C.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, cArr.length);
        for (int i8 = 0; i8 < cArr.length; i8++) {
            objArr[i8] = cArr[i8].f6098w;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        if (cls == null || this.f6100w == cls) {
            cls = C.class;
        }
        return super.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C c6;
        if (d(obj)) {
            c6 = c(obj);
            if (c6 != null) {
                obj = c6;
            }
        } else {
            c6 = null;
        }
        super.removeSpan(obj);
        if (c6 != null) {
            this.f6101x.remove(c6);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence) {
        replace(i6, i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        if (d(obj)) {
            C c6 = new C(obj);
            this.f6101x.add(c6);
            obj = c6;
        }
        super.setSpan(obj, i6, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        return new D(this.f6100w, this, i6, i7);
    }

    public D(Class cls, CharSequence charSequence, int i6, int i7) {
        super(charSequence, i6, i7);
        this.f6101x = new ArrayList();
        AbstractC0651b.f(cls, "watcherClass cannot be null");
        this.f6100w = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        replace(i6, i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence) {
        a();
        super.replace(i6, i7, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        a();
        super.replace(i6, i7, charSequence, i8, i9);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }
}
