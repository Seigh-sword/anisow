package p1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t1.C1341d;

/* JADX INFO: loaded from: classes.dex */
public final class m implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12262a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12264c;

    public m(Context context, InterfaceC1246l interfaceC1246l) {
        this.f12263b = context.getApplicationContext();
        this.f12264c = interfaceC1246l;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        int i6 = this.f12262a;
        Object obj2 = this.f12263b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            case 1:
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    if (((x) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            default:
                Uri uri = (Uri) obj;
                if ("android.resource".equals(uri.getScheme()) && ((Context) obj2).getPackageName().equals(uri.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        w wVarB;
        int i8 = this.f12262a;
        Object obj2 = this.f12263b;
        w wVarB2 = null;
        Object obj3 = this.f12264c;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return c((Integer) obj, i6, i7, mVar);
            case 1:
                List list = (List) obj2;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                j1.i iVar = null;
                for (int i9 = 0; i9 < size; i9++) {
                    x xVar = (x) list.get(i9);
                    if (xVar.a(obj) && (wVarB = xVar.b(obj, i6, i7, mVar)) != null) {
                        arrayList.add(wVarB.f12288c);
                        iVar = wVarB.f12286a;
                    }
                }
                if (arrayList.isEmpty() || iVar == null) {
                    return null;
                }
                return new w(iVar, new C1232A(arrayList, (M.b) obj3));
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return c((Integer) obj, i6, i7, mVar);
            default:
                Uri uri = (Uri) obj;
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i10 = Integer.parseInt(uri.getPathSegments().get(0));
                        if (i10 != 0) {
                            wVarB2 = ((x) obj3).b(Integer.valueOf(i10), i6, i7, mVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                        }
                        return wVarB2;
                    } catch (NumberFormatException e6) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return wVarB2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e6);
                        return wVarB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
                    return null;
                }
                List<String> pathSegments2 = uri.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return ((x) obj3).b(Integer.valueOf(identifier), i6, i7, mVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
        }
    }

    public final w c(Integer num, int i6, int i7, j1.m mVar) {
        Uri uri;
        int i8 = this.f12262a;
        Object obj = this.f12263b;
        Object obj2 = this.f12264c;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Resources.Theme theme = (Resources.Theme) mVar.c(C1341d.f12723b);
                return new w(new B1.b(num), new C1245k(theme, theme != null ? theme.getResources() : ((Context) obj).getResources(), (InterfaceC1246l) obj2, num.intValue()));
            default:
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj2).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj2).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj2).getResourceEntryName(num.intValue()));
                    break;
                } catch (Resources.NotFoundException e6) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e6);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((x) obj).b(uri, i6, i7, mVar);
        }
    }

    public final String toString() {
        switch (this.f12262a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f12263b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public m(Context context, x xVar) {
        this.f12263b = context.getApplicationContext();
        this.f12264c = xVar;
    }

    public m(Resources resources, x xVar) {
        this.f12264c = resources;
        this.f12263b = xVar;
    }

    public m(ArrayList arrayList, M.b bVar) {
        this.f12263b = arrayList;
        this.f12264c = bVar;
    }
}
