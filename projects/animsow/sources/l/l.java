package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f9747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9748b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f9751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9752f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z5, int i6) {
        this.f9750d = z5;
        this.f9751e = layoutInflater;
        this.f9747a = oVar;
        this.f9752f = i6;
        a();
    }

    public final void a() {
        o oVar = this.f9747a;
        q qVar = oVar.f9775v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f9763j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((q) arrayList.get(i6)) == qVar) {
                    this.f9748b = i6;
                    return;
                }
            }
        }
        this.f9748b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i6) {
        ArrayList arrayListL;
        boolean z5 = this.f9750d;
        o oVar = this.f9747a;
        if (z5) {
            oVar.i();
            arrayListL = oVar.f9763j;
        } else {
            arrayListL = oVar.l();
        }
        int i7 = this.f9748b;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return (q) arrayListL.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z5 = this.f9750d;
        o oVar = this.f9747a;
        if (z5) {
            oVar.i();
            arrayListL = oVar.f9763j;
        } else {
            arrayListL = oVar.l();
        }
        int i6 = this.f9748b;
        int size = arrayListL.size();
        return i6 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f9751e.inflate(this.f9752f, viewGroup, false);
        }
        int i7 = getItem(i6).f9785b;
        int i8 = i6 - 1;
        int i9 = i8 >= 0 ? getItem(i8).f9785b : i7;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9747a.m() && i7 != i9) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        InterfaceC0902B interfaceC0902B = (InterfaceC0902B) view;
        if (this.f9749c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0902B.b(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
