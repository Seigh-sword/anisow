package c;

import D.InterfaceC0003d;
import L0.h;
import Z.j;
import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d2.AbstractC0651b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p.BinderC1230a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f6092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6093z;

    public /* synthetic */ d(int i6, Object obj, Intent intent) {
        this.f6090w = 5;
        this.f6092y = obj;
        this.f6093z = intent;
        this.f6091x = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f6090w;
        int i7 = 0;
        Object obj = this.f6093z;
        int i8 = this.f6091x;
        Object obj2 = this.f6092y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((e) obj).a(i8, (Bundle) obj2);
                return;
            case 1:
                ((BinderC1230a) obj).getClass();
                throw null;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i7 < length) {
                    iArr[i7] = packageManager.checkPermission(strArr[i7], packageName);
                    i7++;
                }
                ((InterfaceC0003d) activity).onRequestPermissionsResult(i8, strArr, iArr);
                return;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                com.bumptech.glide.d dVar = (com.bumptech.glide.d) ((L3.c) obj2).f1734x;
                if (dVar != null) {
                    dVar.s(i8);
                    return;
                }
                return;
            case j.LONG_FIELD_NUMBER /* 4 */:
                List list = (List) obj2;
                int size = list.size();
                if (i8 != 1) {
                    while (i7 < size) {
                        ((c0.j) list.get(i7)).getClass();
                        i7++;
                    }
                    return;
                } else {
                    while (i7 < size) {
                        ((c0.j) list.get(i7)).a();
                        i7++;
                    }
                    return;
                }
            case j.STRING_FIELD_NUMBER /* 5 */:
                ((h) obj2).b((Intent) obj, i8);
                return;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((SystemForegroundService) obj).f5854A.notify(i8, (Notification) obj2);
                return;
            default:
                ((BottomSheetBehavior) obj).K((View) obj2, i8, false);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i6, ArrayList arrayList) {
        this(arrayList, i6, (Throwable) null);
        this.f6090w = 4;
    }

    public /* synthetic */ d(SystemForegroundService systemForegroundService, int i6, Notification notification) {
        this.f6090w = 6;
        this.f6093z = systemForegroundService;
        this.f6091x = i6;
        this.f6092y = notification;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(c0.j jVar, int i6) {
        this(Arrays.asList(jVar), i6, (Throwable) null);
        this.f6090w = 4;
        AbstractC0651b.f(jVar, "initCallback cannot be null");
    }

    public /* synthetic */ d(Object obj, Object obj2, int i6, int i7) {
        this.f6090w = i7;
        this.f6093z = obj;
        this.f6092y = obj2;
        this.f6091x = i6;
    }

    public d(List list, int i6, Throwable th) {
        this.f6090w = 4;
        AbstractC0651b.f(list, "initCallbacks cannot be null");
        this.f6092y = new ArrayList(list);
        this.f6091x = i6;
        this.f6093z = th;
    }
}
