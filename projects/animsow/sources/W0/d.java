package W0;

import S2.u;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import c1.t;
import com.android.app.activities.CategoryActivity;
import com.google.android.material.datepicker.l;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4195x;

    public /* synthetic */ d(int i6, Object obj) {
        this.f4194w = i6;
        this.f4195x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        int i6 = this.f4194w;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f4195x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                CategoryActivity categoryActivity = (CategoryActivity) obj;
                int i7 = CategoryActivity.f6265g0;
                AbstractC1305a.o(categoryActivity, "this$0");
                categoryActivity.finish();
                return;
            case 1:
                t tVar = (t) obj;
                int i8 = t.f6226I0;
                AbstractC1305a.o(tVar, "this$0");
                EditText editText2 = tVar.f6229C0;
                if (editText2 == null) {
                    AbstractC1305a.W("searchInput");
                    throw null;
                }
                editText2.setText("");
                tVar.Z();
                tVar.Y();
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                int i9 = l.f7204h1;
                ((l) obj).Y();
                throw null;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                S2.d dVar = (S2.d) obj;
                EditText editText3 = dVar.f3120i;
                if (editText3 == null) {
                    return;
                }
                Editable text = editText3.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.q();
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                ((S2.j) obj).u();
                return;
            default:
                u uVar = (u) obj;
                EditText editText4 = uVar.f3220f;
                if (editText4 == null) {
                    return;
                }
                int selectionEnd = editText4.getSelectionEnd();
                EditText editText5 = uVar.f3220f;
                if (editText5 == null || !(editText5.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    editText = uVar.f3220f;
                    passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                } else {
                    editText = uVar.f3220f;
                }
                editText.setTransformationMethod(passwordTransformationMethod);
                if (selectionEnd >= 0) {
                    uVar.f3220f.setSelection(selectionEnd);
                }
                uVar.q();
                return;
        }
    }
}
