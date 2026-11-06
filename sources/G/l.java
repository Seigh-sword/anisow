package G;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l extends S0.f {
    public static Font I(FontFamily fontFamily, int i6) {
        FontStyle fontStyle = new FontStyle((i6 & 1) != 0 ? 700 : 400, (i6 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iJ = J(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int iJ2 = J(fontStyle, font2.getStyle());
            if (iJ2 < iJ) {
                font = font2;
                iJ = iJ2;
            }
        }
        return font;
    }

    public static int J(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // S0.f
    public final K.h A(int i6, K.h[] hVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // S0.f
    public final Typeface u(Context context, F.g gVar, Resources resources, int i6) {
        try {
            FontFamily.Builder builder = null;
            for (F.h hVar : gVar.f436a) {
                try {
                    Font fontBuild = new Font.Builder(resources, hVar.f442f).setWeight(hVar.f438b).setSlant(hVar.f439c ? 1 : 0).setTtcIndex(hVar.f441e).setFontVariationSettings(hVar.f440d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(I(fontFamilyBuild, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // S0.f
    public final Typeface v(Context context, K.h[] hVarArr, int i6) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (K.h hVar : hVarArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(hVar.f1487a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f1489c).setSlant(hVar.f1490d ? 1 : 0).setTtcIndex(hVar.f1488b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(I(fontFamilyBuild, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // S0.f
    public final Typeface w(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // S0.f
    public final Typeface x(Context context, Resources resources, int i6, String str, int i7) {
        try {
            Font fontBuild = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
