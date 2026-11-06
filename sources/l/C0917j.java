package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.xo.anilab.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0917j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9739a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0918k f9740b;

    public C0917j(C0918k c0918k) {
        this.f9740b = c0918k;
        a();
    }

    public final void a() {
        o oVar = this.f9740b.f9745y;
        q qVar = oVar.f9775v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f9763j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((q) arrayList.get(i6)) == qVar) {
                    this.f9739a = i6;
                    return;
                }
            }
        }
        this.f9739a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i6) {
        C0918k c0918k = this.f9740b;
        o oVar = c0918k.f9745y;
        oVar.i();
        ArrayList arrayList = oVar.f9763j;
        c0918k.getClass();
        int i7 = this.f9739a;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return (q) arrayList.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0918k c0918k = this.f9740b;
        o oVar = c0918k.f9745y;
        oVar.i();
        int size = oVar.f9763j.size();
        c0918k.getClass();
        return this.f9739a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9740b.f9744x.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0902B) view).b(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
