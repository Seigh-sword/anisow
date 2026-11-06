package m;

import N.C0089e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.xo.anilab.R;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import n.ExecutorC1138a;
import u1.C1358b;

/* JADX INFO: renamed from: m.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10426f;

    public C0996y() {
        this.f10421a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f10422b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f10423c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f10424d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f10425e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f10426f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i6) {
        for (int i7 : iArr) {
            if (i7 == i6) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i6) {
        int iC = X0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{X0.f10219b, X0.f10221d, X0.f10220c, X0.f10223f}, new int[]{X0.b(context, R.attr.colorButtonNormal), G.a.b(iC, i6), G.a.b(iC, i6), i6});
    }

    public static LayerDrawable d(R0 r02, Context context, int i6) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
        Drawable drawableE = r02.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = r02.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterG;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0998z.f10427b;
        }
        PorterDuff.Mode mode2 = C0998z.f10427b;
        synchronized (C0998z.class) {
            porterDuffColorFilterG = R0.g(i6, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final q2.s c(q2.s sVar) {
        return sVar.i(new ExecutorC1138a(17), new J3.G(24, this));
    }

    public final ColorStateList e(Context context, int i6) {
        if (i6 == R.drawable.abc_edit_text_material) {
            return E.f.b(context, R.color.abc_tint_edittext);
        }
        if (i6 == R.drawable.abc_switch_track_mtrl_alpha) {
            return E.f.b(context, R.color.abc_tint_switch_track);
        }
        if (i6 != R.drawable.abc_switch_thumb_material) {
            if (i6 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, X0.c(context, R.attr.colorButtonNormal));
            }
            if (i6 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i6 == R.drawable.abc_btn_colored_material) {
                return b(context, X0.c(context, R.attr.colorAccent));
            }
            if (i6 == R.drawable.abc_spinner_mtrl_am_alpha || i6 == R.drawable.abc_spinner_textfield_background_material) {
                return E.f.b(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f10422b, i6)) {
                return X0.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f10425e, i6)) {
                return E.f.b(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f10426f, i6)) {
                return E.f.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i6 == R.drawable.abc_seekbar_thumb_material) {
                return E.f.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = X0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = X0.f10219b;
            iArr2[0] = X0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = X0.f10222e;
            iArr2[1] = X0.c(context, R.attr.colorControlActivated);
            iArr[2] = X0.f10223f;
            iArr2[2] = X0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = X0.f10219b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = X0.f10222e;
            iArr2[1] = X0.c(context, R.attr.colorControlActivated);
            iArr[2] = X0.f10223f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final void f(String str, String str2, Bundle bundle) {
        int i6;
        String str3;
        String strEncodeToString;
        boolean zG;
        int i7;
        PackageInfo packageInfoI;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        Y2.g gVar = (Y2.g) this.f10421a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f4818c.f4832b);
        C0089e c0089e = (C0089e) this.f10422b;
        synchronized (c0089e) {
            try {
                if (c0089e.f1985y == 0 && (packageInfoI = c0089e.i("com.google.android.gms")) != null) {
                    c0089e.f1985y = packageInfoI.versionCode;
                }
                i6 = c0089e.f1985y;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i6));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C0089e) this.f10422b).g());
        C0089e c0089e2 = (C0089e) this.f10422b;
        synchronized (c0089e2) {
            try {
                if (((String) c0089e2.f1982B) == null) {
                    c0089e2.k();
                }
                str3 = (String) c0089e2.f1982B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        Y2.g gVar2 = (Y2.g) this.f10421a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f4817b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((E3.a) f2.h.b(((E3.c) ((E3.d) this.f10426f)).d())).f393a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e6) {
            e = e6;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) f2.h.b(((E3.c) ((E3.d) this.f10426f)).c()));
        bundle.putString("cliv", "fcm-24.0.2");
        B3.g gVar3 = (B3.g) ((D3.c) this.f10425e).get();
        L3.b bVar = (L3.b) ((D3.c) this.f10424d).get();
        if (gVar3 == null || bVar == null) {
            return;
        }
        B3.d dVar = (B3.d) gVar3;
        synchronized (dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            B3.i iVar = (B3.i) dVar.f94a.get();
            synchronized (iVar) {
                zG = iVar.g(jCurrentTimeMillis);
            }
            if (zG) {
                synchronized (iVar) {
                    String strD = iVar.d(System.currentTimeMillis());
                    iVar.f100a.edit().putString("last-used-date", strD).commit();
                    iVar.f(strD);
                }
                i7 = 3;
            } else {
                i7 = 1;
            }
        }
        if (i7 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(u.h.b(i7)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public final q2.s h(String str, String str2, Bundle bundle) {
        int i6;
        try {
            f(str, str2, bundle);
            T1.b bVar = (T1.b) this.f10423c;
            e0.b bVar2 = bVar.f3410c;
            int iA = bVar2.a();
            T1.r rVar = T1.r.f3450w;
            if (iA >= 12000000) {
                T1.q qVarA = T1.q.a(bVar.f3409b);
                synchronized (qVarA) {
                    i6 = qVarA.f3446a;
                    qVarA.f3446a = i6 + 1;
                }
                return qVarA.b(new T1.n(i6, 1, bundle, 1)).i(rVar, T1.c.f3415w);
            }
            if (bVar2.b() != 0) {
                return bVar.a(bundle).j(rVar, new C1358b(bVar, 14, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            q2.s sVar = new q2.s();
            sVar.k(iOException);
            return sVar;
        } catch (InterruptedException | ExecutionException e6) {
            q2.s sVar2 = new q2.s();
            sVar2.k(e6);
            return sVar2;
        }
    }

    public /* synthetic */ C0996y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f10421a = obj;
        this.f10422b = obj2;
        this.f10423c = obj3;
        this.f10424d = obj4;
        this.f10425e = obj5;
        this.f10426f = obj6;
    }
}
