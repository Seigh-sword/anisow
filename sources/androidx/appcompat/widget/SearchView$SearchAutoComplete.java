package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import j.RunnableC0835a;
import m.C0984s;
import m.W0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C0984s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5215A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5216B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RunnableC0835a f5217C;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5217C = new RunnableC0835a(2, this);
        this.f5215A = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (i6 >= 960 && i7 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i6 < 600) {
            return (i6 < 640 || i7 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f5215A <= 0 || super.enoughToFilter();
    }

    @Override // m.C0984s, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f5216B) {
            RunnableC0835a runnableC0835a = this.f5217C;
            removeCallbacks(runnableC0835a);
            post(runnableC0835a);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        super.onFocusChanged(z5, i6, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
        if (i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i6, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        if (z5) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z5) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC0835a runnableC0835a = this.f5217C;
        if (!z5) {
            this.f5216B = false;
            removeCallbacks(runnableC0835a);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f5216B = true;
                return;
            }
            this.f5216B = false;
            removeCallbacks(runnableC0835a);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i6) {
        super.setThreshold(i6);
        this.f5215A = i6;
    }

    public void setSearchView(W0 w02) {
    }
}
