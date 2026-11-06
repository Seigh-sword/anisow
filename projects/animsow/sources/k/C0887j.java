package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import h.AbstractC0732a;
import i.C0803c;
import java.io.IOException;
import l.r;
import m.AbstractC0983r0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: k.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887j extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f9616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f9617f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9621d;

    static {
        Class[] clsArr = {Context.class};
        f9616e = clsArr;
        f9617f = clsArr;
    }

    public C0887j(Context context) {
        super(context);
        this.f9620c = context;
        Object[] objArr = {context};
        this.f9618a = objArr;
        this.f9619b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [k.j] */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v69, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i6;
        ?? r5;
        int i7;
        ?? r8;
        r rVar;
        ColorStateList colorStateList;
        C0886i c0886i = new C0886i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i6 = 2;
            r5 = 1;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == r5) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i6) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z6 && name2.equals(str)) {
                        r8 = r5;
                        z6 = false;
                        str = null;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        c0886i.f9591b = 0;
                        c0886i.f9592c = 0;
                        c0886i.f9593d = 0;
                        c0886i.f9594e = 0;
                        c0886i.f9595f = r5;
                        c0886i.f9596g = r5;
                    } else if (name2.equals("item")) {
                        if (!c0886i.f9597h) {
                            r rVar2 = c0886i.f9615z;
                            if (rVar2 == null || !rVar2.f9811b.hasSubMenu()) {
                                c0886i.f9597h = r5;
                                c0886i.b(c0886i.f9590a.add(c0886i.f9591b, c0886i.f9598i, c0886i.f9599j, c0886i.f9600k));
                            } else {
                                c0886i.f9597h = r5;
                                c0886i.b(c0886i.f9590a.addSubMenu(c0886i.f9591b, c0886i.f9598i, c0886i.f9599j, c0886i.f9600k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        ?? r82 = r5;
                        z5 = r82 == true ? 1 : 0;
                        r8 = r82;
                        z6 = z6;
                    }
                    i7 = i6;
                }
                eventType = xmlResourceParser.next();
                i6 = i7;
                r5 = r8;
                z5 = z5;
                z6 = z6;
            } else if (!z6) {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                C0887j c0887j = c0886i.f9589E;
                if (zEquals) {
                    ?? ObtainStyledAttributes = c0887j.f9620c.obtainStyledAttributes(attributeSet, AbstractC0732a.f8578p);
                    c0886i.f9591b = ObtainStyledAttributes.getResourceId(r5, 0);
                    c0886i.f9592c = ObtainStyledAttributes.getInt(3, 0);
                    c0886i.f9593d = ObtainStyledAttributes.getInt(4, 0);
                    c0886i.f9594e = ObtainStyledAttributes.getInt(5, 0);
                    c0886i.f9595f = ObtainStyledAttributes.getBoolean(2, r5);
                    c0886i.f9596g = ObtainStyledAttributes.getBoolean(0, r5);
                    ObtainStyledAttributes.recycle();
                    r8 = r5;
                    i7 = 2;
                } else if (name3.equals("item")) {
                    Context context = c0887j.f9620c;
                    i7 = 2;
                    C0803c c0803c = new C0803c(context, i7, context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8579q));
                    c0886i.f9598i = c0803c.B(2, 0);
                    c0886i.f9599j = (c0803c.z(5, c0886i.f9592c) & (-65536)) | (c0803c.z(6, c0886i.f9593d) & 65535);
                    c0886i.f9600k = c0803c.E(7);
                    c0886i.f9601l = c0803c.E(8);
                    c0886i.f9602m = c0803c.B(0, 0);
                    String strC = c0803c.C(9);
                    c0886i.f9603n = strC == null ? (char) 0 : strC.charAt(0);
                    c0886i.f9604o = c0803c.z(16, 4096);
                    String strC2 = c0803c.C(10);
                    c0886i.f9605p = strC2 == null ? (char) 0 : strC2.charAt(0);
                    c0886i.f9606q = c0803c.z(20, 4096);
                    c0886i.f9607r = c0803c.G(11) ? c0803c.r(11, false) : c0886i.f9594e;
                    c0886i.f9608s = c0803c.r(3, false);
                    c0886i.f9609t = c0803c.r(4, c0886i.f9595f);
                    c0886i.f9610u = c0803c.r(1, c0886i.f9596g);
                    c0886i.f9611v = c0803c.z(21, -1);
                    c0886i.f9614y = c0803c.C(12);
                    c0886i.f9612w = c0803c.B(13, 0);
                    c0886i.f9613x = c0803c.C(15);
                    String strC3 = c0803c.C(14);
                    boolean z7 = strC3 != null;
                    if (z7 && c0886i.f9612w == 0 && c0886i.f9613x == null) {
                        rVar = (r) c0886i.a(strC3, f9617f, c0887j.f9619b);
                    } else {
                        if (z7) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        rVar = null;
                    }
                    c0886i.f9615z = rVar;
                    c0886i.f9585A = c0803c.E(17);
                    c0886i.f9586B = c0803c.E(22);
                    if (c0803c.G(19)) {
                        c0886i.f9588D = AbstractC0983r0.b(c0803c.z(19, -1), c0886i.f9588D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        c0886i.f9588D = null;
                    }
                    if (c0803c.G(18)) {
                        c0886i.f9587C = c0803c.s(18);
                    } else {
                        c0886i.f9587C = colorStateList;
                    }
                    c0803c.M();
                    c0886i.f9597h = false;
                    r8 = 1;
                } else {
                    i7 = 2;
                    if (name3.equals("menu")) {
                        r8 = 1;
                        c0886i.f9597h = true;
                        SubMenu subMenuAddSubMenu = c0886i.f9590a.addSubMenu(c0886i.f9591b, c0886i.f9598i, c0886i.f9599j, c0886i.f9600k);
                        c0886i.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        r8 = 1;
                        str = name3;
                        z6 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i6 = i7;
                r5 = r8;
                z5 = z5;
                z6 = z6;
            }
            r8 = r5;
            z5 = z5;
            z6 = z6;
            i7 = i6;
            eventType = xmlResourceParser.next();
            i6 = i7;
            r5 = r8;
            z5 = z5;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i6, Menu menu) {
        if (!(menu instanceof I.a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z5 = false;
        try {
            try {
                layout = this.f9620c.getResources().getLayout(i6);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof l.o) {
                    l.o oVar = (l.o) menu;
                    if (!oVar.f9769p) {
                        oVar.w();
                        z5 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z5) {
                    ((l.o) menu).v();
                }
                layout.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (z5) {
                ((l.o) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
