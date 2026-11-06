package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.xo.anilab.R;
import h.AbstractC0732a;
import i.C0803c;
import l.InterfaceC0902B;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0902B, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CheckBox f5112A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f5113B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ImageView f5114C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f5115D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f5116E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Drawable f5117F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f5118G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Context f5119H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5120I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Drawable f5121J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f5122K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LayoutInflater f5123L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f5124M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f5125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f5126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RadioButton f5127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f5128z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0803c c0803cJ = C0803c.J(getContext(), attributeSet, AbstractC0732a.f8580r, R.attr.listMenuViewStyle, 0);
        this.f5117F = c0803cJ.v(5);
        this.f5118G = c0803cJ.B(1, -1);
        this.f5120I = c0803cJ.r(7, false);
        this.f5119H = context;
        this.f5121J = c0803cJ.v(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f5122K = typedArrayObtainStyledAttributes.hasValue(0);
        c0803cJ.M();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f5123L == null) {
            this.f5123L = LayoutInflater.from(getContext());
        }
        return this.f5123L;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f5114C;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f5115D;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5115D.getLayoutParams();
        rect.top = this.f5115D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // l.InterfaceC0902B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(l.q r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.q):void");
    }

    @Override // l.InterfaceC0902B
    public q getItemData() {
        return this.f5125w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f5117F);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f5128z = textView;
        int i6 = this.f5118G;
        if (i6 != -1) {
            textView.setTextAppearance(this.f5119H, i6);
        }
        this.f5113B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f5114C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f5121J);
        }
        this.f5115D = (ImageView) findViewById(R.id.group_divider);
        this.f5116E = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (this.f5126x != null && this.f5120I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5126x.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i6, i7);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f5127y == null && this.f5112A == null) {
            return;
        }
        if ((this.f5125w.f9807x & 4) != 0) {
            if (this.f5127y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f5127y = radioButton;
                LinearLayout linearLayout = this.f5116E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f5127y;
            view = this.f5112A;
        } else {
            if (this.f5112A == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f5112A = checkBox;
                LinearLayout linearLayout2 = this.f5116E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f5112A;
            view = this.f5127y;
        }
        if (z5) {
            compoundButton.setChecked(this.f5125w.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f5112A;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f5127y;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f5125w.f9807x & 4) != 0) {
            if (this.f5127y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f5127y = radioButton;
                LinearLayout linearLayout = this.f5116E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f5127y;
        } else {
            if (this.f5112A == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f5112A = checkBox;
                LinearLayout linearLayout2 = this.f5116E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f5112A;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f5124M = z5;
        this.f5120I = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f5115D;
        if (imageView != null) {
            imageView.setVisibility((this.f5122K || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5125w.f9797n.getClass();
        boolean z5 = this.f5124M;
        if (z5 || this.f5120I) {
            ImageView imageView = this.f5126x;
            if (imageView == null && drawable == null && !this.f5120I) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f5126x = imageView2;
                LinearLayout linearLayout = this.f5116E;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f5120I) {
                this.f5126x.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f5126x;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f5126x.getVisibility() != 0) {
                this.f5126x.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i6;
        TextView textView;
        if (charSequence != null) {
            this.f5128z.setText(charSequence);
            if (this.f5128z.getVisibility() == 0) {
                return;
            }
            textView = this.f5128z;
            i6 = 0;
        } else {
            i6 = 8;
            if (this.f5128z.getVisibility() == 8) {
                return;
            } else {
                textView = this.f5128z;
            }
        }
        textView.setVisibility(i6);
    }
}
