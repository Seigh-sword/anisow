package u2;

import H2.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.xo.anilab.R;
import f2.h;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f12910b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f12915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12919k;

    public c(Context context, b bVar) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        int i6 = bVar.f12905w;
        if (i6 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i6);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e6) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i6));
                notFoundException.initCause(e6);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayE = m.e(context, attributeSet, AbstractC1274a.f12447a, R.attr.badgeStyle, styleAttribute == 0 ? 2131887099 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f12911c = typedArrayE.getDimensionPixelSize(4, -1);
        this.f12917i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f12918j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f12912d = typedArrayE.getDimensionPixelSize(14, -1);
        this.f12913e = typedArrayE.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f12915g = typedArrayE.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f12914f = typedArrayE.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f12916h = typedArrayE.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f12919k = typedArrayE.getInt(24, 1);
        b bVar2 = this.f12910b;
        int i7 = bVar.f12883E;
        bVar2.f12883E = i7 == -2 ? 255 : i7;
        int i8 = bVar.f12885G;
        if (i8 != -2) {
            bVar2.f12885G = i8;
        } else if (typedArrayE.hasValue(23)) {
            this.f12910b.f12885G = typedArrayE.getInt(23, 0);
        } else {
            this.f12910b.f12885G = -1;
        }
        String str = bVar.f12884F;
        if (str != null) {
            this.f12910b.f12884F = str;
        } else if (typedArrayE.hasValue(7)) {
            this.f12910b.f12884F = typedArrayE.getString(7);
        }
        b bVar3 = this.f12910b;
        bVar3.f12889K = bVar.f12889K;
        CharSequence charSequence = bVar.f12890L;
        bVar3.f12890L = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar4 = this.f12910b;
        int i9 = bVar.f12891M;
        bVar4.f12891M = i9 == 0 ? R.plurals.mtrl_badge_content_description : i9;
        int i10 = bVar.f12892N;
        bVar4.f12892N = i10 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i10;
        Boolean bool = bVar.f12894P;
        bVar4.f12894P = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar5 = this.f12910b;
        int i11 = bVar.f12886H;
        bVar5.f12886H = i11 == -2 ? typedArrayE.getInt(21, -2) : i11;
        b bVar6 = this.f12910b;
        int i12 = bVar.f12887I;
        bVar6.f12887I = i12 == -2 ? typedArrayE.getInt(22, -2) : i12;
        b bVar7 = this.f12910b;
        Integer num = bVar.f12879A;
        bVar7.f12879A = Integer.valueOf(num == null ? typedArrayE.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar8 = this.f12910b;
        Integer num2 = bVar.f12880B;
        bVar8.f12880B = Integer.valueOf(num2 == null ? typedArrayE.getResourceId(6, 0) : num2.intValue());
        b bVar9 = this.f12910b;
        Integer num3 = bVar.f12881C;
        bVar9.f12881C = Integer.valueOf(num3 == null ? typedArrayE.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar10 = this.f12910b;
        Integer num4 = bVar.f12882D;
        bVar10.f12882D = Integer.valueOf(num4 == null ? typedArrayE.getResourceId(16, 0) : num4.intValue());
        b bVar11 = this.f12910b;
        Integer num5 = bVar.f12906x;
        bVar11.f12906x = Integer.valueOf(num5 == null ? h.o(context, typedArrayE, 1).getDefaultColor() : num5.intValue());
        b bVar12 = this.f12910b;
        Integer num6 = bVar.f12908z;
        bVar12.f12908z = Integer.valueOf(num6 == null ? typedArrayE.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f12907y;
        if (num7 != null) {
            this.f12910b.f12907y = num7;
        } else if (typedArrayE.hasValue(9)) {
            this.f12910b.f12907y = Integer.valueOf(h.o(context, typedArrayE, 9).getDefaultColor());
        } else {
            int iIntValue = this.f12910b.f12908z.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC1274a.f12443G);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListO = h.o(context, typedArrayObtainStyledAttributes, 3);
            h.o(context, typedArrayObtainStyledAttributes, 4);
            h.o(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i13 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i13, 0);
            typedArrayObtainStyledAttributes.getString(i13);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            h.o(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC1274a.f12469w);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f12910b.f12907y = Integer.valueOf(colorStateListO.getDefaultColor());
        }
        b bVar13 = this.f12910b;
        Integer num8 = bVar.f12893O;
        bVar13.f12893O = Integer.valueOf(num8 == null ? typedArrayE.getInt(2, 8388661) : num8.intValue());
        b bVar14 = this.f12910b;
        Integer num9 = bVar.f12895Q;
        bVar14.f12895Q = Integer.valueOf(num9 == null ? typedArrayE.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar15 = this.f12910b;
        Integer num10 = bVar.f12896R;
        bVar15.f12896R = Integer.valueOf(num10 == null ? typedArrayE.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar16 = this.f12910b;
        Integer num11 = bVar.f12897S;
        bVar16.f12897S = Integer.valueOf(num11 == null ? typedArrayE.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar17 = this.f12910b;
        Integer num12 = bVar.f12898T;
        bVar17.f12898T = Integer.valueOf(num12 == null ? typedArrayE.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar18 = this.f12910b;
        Integer num13 = bVar.f12899U;
        bVar18.f12899U = Integer.valueOf(num13 == null ? typedArrayE.getDimensionPixelOffset(19, bVar18.f12897S.intValue()) : num13.intValue());
        b bVar19 = this.f12910b;
        Integer num14 = bVar.f12900V;
        bVar19.f12900V = Integer.valueOf(num14 == null ? typedArrayE.getDimensionPixelOffset(26, bVar19.f12898T.intValue()) : num14.intValue());
        b bVar20 = this.f12910b;
        Integer num15 = bVar.f12903Y;
        bVar20.f12903Y = Integer.valueOf(num15 == null ? typedArrayE.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar21 = this.f12910b;
        Integer num16 = bVar.f12901W;
        bVar21.f12901W = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar22 = this.f12910b;
        Integer num17 = bVar.f12902X;
        bVar22.f12902X = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar23 = this.f12910b;
        Boolean bool2 = bVar.f12904Z;
        bVar23.f12904Z = Boolean.valueOf(bool2 == null ? typedArrayE.getBoolean(0, false) : bool2.booleanValue());
        typedArrayE.recycle();
        Locale locale = bVar.f12888J;
        if (locale == null) {
            this.f12910b.f12888J = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f12910b.f12888J = locale;
        }
        this.f12909a = bVar;
    }
}
