package f0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import d.AbstractC0628i;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: f0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f8341A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f8342B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f8343C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f8344D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0687d f8345E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0687d[][] f8346F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0687d[] f8347G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final HashMap[] f8348H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final HashMap[] f8349I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final HashSet f8350J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final HashMap f8351K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Charset f8352L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f8353M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f8354N;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f8355l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f8356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f8357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f8358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f8359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f8360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f8361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f8362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f8363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f8364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f8365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f8366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f8367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f8368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f8369z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f8370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f8371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f8373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f8374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f8375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8380k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f8356m = new int[]{8, 8, 8};
        f8357n = new int[]{8};
        f8358o = new byte[]{-1, -40, -1};
        f8359p = new byte[]{102, 116, 121, 112};
        f8360q = new byte[]{109, 105, 102, 49};
        f8361r = new byte[]{104, 101, 105, 99};
        f8362s = new byte[]{79, 76, 89, 77, 80, 0};
        f8363t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f8364u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f8365v = new byte[]{101, 88, 73, 102};
        f8366w = new byte[]{73, 72, 68, 82};
        f8367x = new byte[]{73, 69, 78, 68};
        f8368y = new byte[]{82, 73, 70, 70};
        f8369z = new byte[]{87, 69, 66, 80};
        f8341A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f8342B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f8343C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f8344D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0687d[] c0687dArr = {new C0687d("NewSubfileType", 254, 4), new C0687d("SubfileType", 255, 4), new C0687d(256, 3, 4, "ImageWidth"), new C0687d(257, 3, 4, "ImageLength"), new C0687d("BitsPerSample", 258, 3), new C0687d("Compression", 259, 3), new C0687d("PhotometricInterpretation", 262, 3), new C0687d("ImageDescription", 270, 2), new C0687d("Make", 271, 2), new C0687d("Model", 272, 2), new C0687d(273, 3, 4, "StripOffsets"), new C0687d("Orientation", 274, 3), new C0687d("SamplesPerPixel", 277, 3), new C0687d(278, 3, 4, "RowsPerStrip"), new C0687d(279, 3, 4, "StripByteCounts"), new C0687d("XResolution", 282, 5), new C0687d("YResolution", 283, 5), new C0687d("PlanarConfiguration", 284, 3), new C0687d("ResolutionUnit", 296, 3), new C0687d("TransferFunction", 301, 3), new C0687d("Software", 305, 2), new C0687d("DateTime", 306, 2), new C0687d("Artist", 315, 2), new C0687d("WhitePoint", 318, 5), new C0687d("PrimaryChromaticities", 319, 5), new C0687d("SubIFDPointer", 330, 4), new C0687d("JPEGInterchangeFormat", 513, 4), new C0687d("JPEGInterchangeFormatLength", 514, 4), new C0687d("YCbCrCoefficients", 529, 5), new C0687d("YCbCrSubSampling", 530, 3), new C0687d("YCbCrPositioning", 531, 3), new C0687d("ReferenceBlackWhite", 532, 5), new C0687d("Copyright", 33432, 2), new C0687d("ExifIFDPointer", 34665, 4), new C0687d("GPSInfoIFDPointer", 34853, 4), new C0687d("SensorTopBorder", 4, 4), new C0687d("SensorLeftBorder", 5, 4), new C0687d("SensorBottomBorder", 6, 4), new C0687d("SensorRightBorder", 7, 4), new C0687d("ISO", 23, 3), new C0687d("JpgFromRaw", 46, 7), new C0687d("Xmp", 700, 1)};
        C0687d[] c0687dArr2 = {new C0687d("ExposureTime", 33434, 5), new C0687d("FNumber", 33437, 5), new C0687d("ExposureProgram", 34850, 3), new C0687d("SpectralSensitivity", 34852, 2), new C0687d("PhotographicSensitivity", 34855, 3), new C0687d("OECF", 34856, 7), new C0687d("SensitivityType", 34864, 3), new C0687d("StandardOutputSensitivity", 34865, 4), new C0687d("RecommendedExposureIndex", 34866, 4), new C0687d("ISOSpeed", 34867, 4), new C0687d("ISOSpeedLatitudeyyy", 34868, 4), new C0687d("ISOSpeedLatitudezzz", 34869, 4), new C0687d("ExifVersion", 36864, 2), new C0687d("DateTimeOriginal", 36867, 2), new C0687d("DateTimeDigitized", 36868, 2), new C0687d("OffsetTime", 36880, 2), new C0687d("OffsetTimeOriginal", 36881, 2), new C0687d("OffsetTimeDigitized", 36882, 2), new C0687d("ComponentsConfiguration", 37121, 7), new C0687d("CompressedBitsPerPixel", 37122, 5), new C0687d("ShutterSpeedValue", 37377, 10), new C0687d("ApertureValue", 37378, 5), new C0687d("BrightnessValue", 37379, 10), new C0687d("ExposureBiasValue", 37380, 10), new C0687d("MaxApertureValue", 37381, 5), new C0687d("SubjectDistance", 37382, 5), new C0687d("MeteringMode", 37383, 3), new C0687d("LightSource", 37384, 3), new C0687d("Flash", 37385, 3), new C0687d("FocalLength", 37386, 5), new C0687d("SubjectArea", 37396, 3), new C0687d("MakerNote", 37500, 7), new C0687d("UserComment", 37510, 7), new C0687d("SubSecTime", 37520, 2), new C0687d("SubSecTimeOriginal", 37521, 2), new C0687d("SubSecTimeDigitized", 37522, 2), new C0687d("FlashpixVersion", 40960, 7), new C0687d("ColorSpace", 40961, 3), new C0687d(40962, 3, 4, "PixelXDimension"), new C0687d(40963, 3, 4, "PixelYDimension"), new C0687d("RelatedSoundFile", 40964, 2), new C0687d("InteroperabilityIFDPointer", 40965, 4), new C0687d("FlashEnergy", 41483, 5), new C0687d("SpatialFrequencyResponse", 41484, 7), new C0687d("FocalPlaneXResolution", 41486, 5), new C0687d("FocalPlaneYResolution", 41487, 5), new C0687d("FocalPlaneResolutionUnit", 41488, 3), new C0687d("SubjectLocation", 41492, 3), new C0687d("ExposureIndex", 41493, 5), new C0687d("SensingMethod", 41495, 3), new C0687d("FileSource", 41728, 7), new C0687d("SceneType", 41729, 7), new C0687d("CFAPattern", 41730, 7), new C0687d("CustomRendered", 41985, 3), new C0687d("ExposureMode", 41986, 3), new C0687d("WhiteBalance", 41987, 3), new C0687d("DigitalZoomRatio", 41988, 5), new C0687d("FocalLengthIn35mmFilm", 41989, 3), new C0687d("SceneCaptureType", 41990, 3), new C0687d("GainControl", 41991, 3), new C0687d("Contrast", 41992, 3), new C0687d("Saturation", 41993, 3), new C0687d("Sharpness", 41994, 3), new C0687d("DeviceSettingDescription", 41995, 7), new C0687d("SubjectDistanceRange", 41996, 3), new C0687d("ImageUniqueID", 42016, 2), new C0687d("CameraOwnerName", 42032, 2), new C0687d("BodySerialNumber", 42033, 2), new C0687d("LensSpecification", 42034, 5), new C0687d("LensMake", 42035, 2), new C0687d("LensModel", 42036, 2), new C0687d("Gamma", 42240, 5), new C0687d("DNGVersion", 50706, 1), new C0687d(50720, 3, 4, "DefaultCropSize")};
        C0687d[] c0687dArr3 = {new C0687d("GPSVersionID", 0, 1), new C0687d("GPSLatitudeRef", 1, 2), new C0687d(2, 5, 10, "GPSLatitude"), new C0687d("GPSLongitudeRef", 3, 2), new C0687d(4, 5, 10, "GPSLongitude"), new C0687d("GPSAltitudeRef", 5, 1), new C0687d("GPSAltitude", 6, 5), new C0687d("GPSTimeStamp", 7, 5), new C0687d("GPSSatellites", 8, 2), new C0687d("GPSStatus", 9, 2), new C0687d("GPSMeasureMode", 10, 2), new C0687d("GPSDOP", 11, 5), new C0687d("GPSSpeedRef", 12, 2), new C0687d("GPSSpeed", 13, 5), new C0687d("GPSTrackRef", 14, 2), new C0687d("GPSTrack", 15, 5), new C0687d("GPSImgDirectionRef", 16, 2), new C0687d("GPSImgDirection", 17, 5), new C0687d("GPSMapDatum", 18, 2), new C0687d("GPSDestLatitudeRef", 19, 2), new C0687d("GPSDestLatitude", 20, 5), new C0687d("GPSDestLongitudeRef", 21, 2), new C0687d("GPSDestLongitude", 22, 5), new C0687d("GPSDestBearingRef", 23, 2), new C0687d("GPSDestBearing", 24, 5), new C0687d("GPSDestDistanceRef", 25, 2), new C0687d("GPSDestDistance", 26, 5), new C0687d("GPSProcessingMethod", 27, 7), new C0687d("GPSAreaInformation", 28, 7), new C0687d("GPSDateStamp", 29, 2), new C0687d("GPSDifferential", 30, 3), new C0687d("GPSHPositioningError", 31, 5)};
        C0687d[] c0687dArr4 = {new C0687d("InteroperabilityIndex", 1, 2)};
        C0687d[] c0687dArr5 = {new C0687d("NewSubfileType", 254, 4), new C0687d("SubfileType", 255, 4), new C0687d(256, 3, 4, "ThumbnailImageWidth"), new C0687d(257, 3, 4, "ThumbnailImageLength"), new C0687d("BitsPerSample", 258, 3), new C0687d("Compression", 259, 3), new C0687d("PhotometricInterpretation", 262, 3), new C0687d("ImageDescription", 270, 2), new C0687d("Make", 271, 2), new C0687d("Model", 272, 2), new C0687d(273, 3, 4, "StripOffsets"), new C0687d("ThumbnailOrientation", 274, 3), new C0687d("SamplesPerPixel", 277, 3), new C0687d(278, 3, 4, "RowsPerStrip"), new C0687d(279, 3, 4, "StripByteCounts"), new C0687d("XResolution", 282, 5), new C0687d("YResolution", 283, 5), new C0687d("PlanarConfiguration", 284, 3), new C0687d("ResolutionUnit", 296, 3), new C0687d("TransferFunction", 301, 3), new C0687d("Software", 305, 2), new C0687d("DateTime", 306, 2), new C0687d("Artist", 315, 2), new C0687d("WhitePoint", 318, 5), new C0687d("PrimaryChromaticities", 319, 5), new C0687d("SubIFDPointer", 330, 4), new C0687d("JPEGInterchangeFormat", 513, 4), new C0687d("JPEGInterchangeFormatLength", 514, 4), new C0687d("YCbCrCoefficients", 529, 5), new C0687d("YCbCrSubSampling", 530, 3), new C0687d("YCbCrPositioning", 531, 3), new C0687d("ReferenceBlackWhite", 532, 5), new C0687d("Copyright", 33432, 2), new C0687d("ExifIFDPointer", 34665, 4), new C0687d("GPSInfoIFDPointer", 34853, 4), new C0687d("DNGVersion", 50706, 1), new C0687d(50720, 3, 4, "DefaultCropSize")};
        f8345E = new C0687d("StripOffsets", 273, 3);
        f8346F = new C0687d[][]{c0687dArr, c0687dArr2, c0687dArr3, c0687dArr4, c0687dArr5, c0687dArr, new C0687d[]{new C0687d("ThumbnailImage", 256, 7), new C0687d("CameraSettingsIFDPointer", 8224, 4), new C0687d("ImageProcessingIFDPointer", 8256, 4)}, new C0687d[]{new C0687d("PreviewImageStart", 257, 4), new C0687d("PreviewImageLength", 258, 4)}, new C0687d[]{new C0687d("AspectFrame", 4371, 3)}, new C0687d[]{new C0687d("ColorSpace", 55, 3)}};
        f8347G = new C0687d[]{new C0687d("SubIFDPointer", 330, 4), new C0687d("ExifIFDPointer", 34665, 4), new C0687d("GPSInfoIFDPointer", 34853, 4), new C0687d("InteroperabilityIFDPointer", 40965, 4), new C0687d("CameraSettingsIFDPointer", 8224, 1), new C0687d("ImageProcessingIFDPointer", 8256, 1)};
        f8348H = new HashMap[10];
        f8349I = new HashMap[10];
        f8350J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f8351K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f8352L = charsetForName;
        f8353M = "Exif\u0000\u0000".getBytes(charsetForName);
        f8354N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            C0687d[][] c0687dArr6 = f8346F;
            if (i6 >= c0687dArr6.length) {
                HashMap map = f8351K;
                C0687d[] c0687dArr7 = f8347G;
                map.put(Integer.valueOf(c0687dArr7[0].f8335a), 5);
                map.put(Integer.valueOf(c0687dArr7[1].f8335a), 1);
                map.put(Integer.valueOf(c0687dArr7[2].f8335a), 2);
                map.put(Integer.valueOf(c0687dArr7[3].f8335a), 3);
                map.put(Integer.valueOf(c0687dArr7[4].f8335a), 7);
                map.put(Integer.valueOf(c0687dArr7[5].f8335a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f8348H[i6] = new HashMap();
            f8349I[i6] = new HashMap();
            for (C0687d c0687d : c0687dArr6[i6]) {
                f8348H[i6].put(Integer.valueOf(c0687d.f8335a), c0687d);
                f8349I[i6].put(c0687d.f8336b, c0687d);
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: all -> 0x005f, UnsupportedOperationException -> 0x0062, IOException -> 0x0065, LOOP:0: B:70:0x0050->B:19:0x0053, LOOP_END, TryCatch #3 {all -> 0x005f, blocks: (B:17:0x0050, B:19:0x0053, B:26:0x0068, B:32:0x0085, B:34:0x0090, B:42:0x00a6, B:37:0x0097, B:40:0x009f, B:41:0x00a3, B:43:0x00b0, B:45:0x00b9, B:47:0x00bf, B:49:0x00c5, B:51:0x00cb, B:56:0x00d9), top: B:70:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: all -> 0x005f, UnsupportedOperationException -> 0x0062, IOException -> 0x0065, TryCatch #3 {all -> 0x005f, blocks: (B:17:0x0050, B:19:0x0053, B:26:0x0068, B:32:0x0085, B:34:0x0090, B:42:0x00a6, B:37:0x0097, B:40:0x009f, B:41:0x00a3, B:43:0x00b0, B:45:0x00b9, B:47:0x00bf, B:49:0x00c5, B:51:0x00cb, B:56:0x00d9), top: B:70:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[Catch: all -> 0x005f, UnsupportedOperationException -> 0x0062, IOException -> 0x0065, TryCatch #3 {all -> 0x005f, blocks: (B:17:0x0050, B:19:0x0053, B:26:0x0068, B:32:0x0085, B:34:0x0090, B:42:0x00a6, B:37:0x0097, B:40:0x009f, B:41:0x00a3, B:43:0x00b0, B:45:0x00b9, B:47:0x00bf, B:49:0x00c5, B:51:0x00cb, B:56:0x00d9), top: B:70:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005f, blocks: (B:17:0x0050, B:19:0x0053, B:26:0x0068, B:32:0x0085, B:34:0x0090, B:42:0x00a6, B:37:0x0097, B:40:0x009f, B:41:0x00a3, B:43:0x00b0, B:45:0x00b9, B:47:0x00bf, B:49:0x00c5, B:51:0x00cb, B:56:0x00d9), top: B:70:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0690g(java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0690g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(C0685b c0685b) throws IOException {
        short s5 = c0685b.readShort();
        boolean z5 = f8355l;
        if (s5 == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s5 == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s5));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f8373d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f8352L);
            map.put("DateTime", new C0686c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0686c.a(0L, this.f8375f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0686c.a(0L, this.f8375f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", C0686c.a(0L, this.f8375f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", C0686c.a(0L, this.f8375f));
        }
    }

    public final String b(String str) {
        String str2;
        C0686c c0686cC = c(str);
        if (c0686cC != null) {
            if (!f8350J.contains(str)) {
                return c0686cC.f(this.f8375f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i6 = c0686cC.f8331a;
                if (i6 == 5 || i6 == 10) {
                    C0688e[] c0688eArr = (C0688e[]) c0686cC.g(this.f8375f);
                    if (c0688eArr != null && c0688eArr.length == 3) {
                        C0688e c0688e = c0688eArr[0];
                        Integer numValueOf = Integer.valueOf((int) (c0688e.f8339a / c0688e.f8340b));
                        C0688e c0688e2 = c0688eArr[1];
                        Integer numValueOf2 = Integer.valueOf((int) (c0688e2.f8339a / c0688e2.f8340b));
                        C0688e c0688e3 = c0688eArr[2];
                        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0688e3.f8339a / c0688e3.f8340b)));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(c0688eArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + i6;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(c0686cC.d(this.f8375f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0686c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f8355l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < f8346F.length; i6++) {
            C0686c c0686c = (C0686c) this.f8373d[i6].get(str);
            if (c0686c != null) {
                return c0686c;
            }
        }
        return null;
    }

    public final void d(C0689f c0689f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0692i.a(mediaMetadataRetriever, new C0684a(c0689f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f8373d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C0686c.c(Integer.parseInt(strExtractMetadata), this.f8375f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C0686c.c(Integer.parseInt(strExtractMetadata2), this.f8375f));
                }
                if (strExtractMetadata3 != null) {
                    int i6 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C0686c.c(i6 != 90 ? i6 != 180 ? i6 != 270 ? 1 : 8 : 3 : 6, this.f8375f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i7 = Integer.parseInt(strExtractMetadata4);
                    int i8 = Integer.parseInt(strExtractMetadata5);
                    if (i8 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0689f.c(i7);
                    byte[] bArr = new byte[6];
                    if (c0689f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i9 = i7 + 6;
                    int i10 = i8 - 6;
                    if (!Arrays.equals(bArr, f8353M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    if (c0689f.read(bArr2) != i10) {
                        throw new IOException("Can't read exif");
                    }
                    this.f8377h = i9;
                    r(0, bArr2);
                }
                if (f8355l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d A[LOOP:0: B:10:0x0034->B:82:0x018d, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(f0.C0685b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0690g.e(f0.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0690g.f(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(f0.C0689f r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0690g.g(f0.f):void");
    }

    public final void h(C0685b c0685b) throws Throwable {
        if (f8355l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0685b);
        }
        c0685b.f8328x = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f8364u;
        c0685b.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i6 = c0685b.readInt();
                byte[] bArr2 = new byte[4];
                if (c0685b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, f8366w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f8367x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f8365v)) {
                    byte[] bArr3 = new byte[i6];
                    if (c0685b.read(bArr3) != i6) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + com.bumptech.glide.d.c(bArr2));
                    }
                    int i8 = c0685b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i8) {
                        this.f8377h = i7;
                        r(0, bArr3);
                        x();
                        u(new C0685b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                }
                int i9 = i6 + 4;
                c0685b.b(i9);
                length = i7 + i9;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C0685b c0685b) throws Throwable {
        boolean z5 = f8355l;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0685b);
        }
        c0685b.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0685b.read(bArr);
        c0685b.read(bArr2);
        c0685b.read(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        c0685b.b(i6 - c0685b.f8329y);
        c0685b.read(bArr4);
        e(new C0685b(bArr4), i6, 5);
        c0685b.b(i8 - c0685b.f8329y);
        c0685b.f8328x = ByteOrder.BIG_ENDIAN;
        int i9 = c0685b.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int unsignedShort = c0685b.readUnsignedShort();
            int unsignedShort2 = c0685b.readUnsignedShort();
            if (unsignedShort == f8345E.f8335a) {
                short s5 = c0685b.readShort();
                short s6 = c0685b.readShort();
                C0686c c0686cC = C0686c.c(s5, this.f8375f);
                C0686c c0686cC2 = C0686c.c(s6, this.f8375f);
                HashMap[] mapArr = this.f8373d;
                mapArr[0].put("ImageLength", c0686cC);
                mapArr[0].put("ImageWidth", c0686cC2);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s5) + ", width: " + ((int) s6));
                    return;
                }
                return;
            }
            c0685b.b(unsignedShort2);
        }
    }

    public final void j(C0689f c0689f) throws Throwable {
        o(c0689f);
        s(c0689f, 0);
        w(c0689f, 0);
        w(c0689f, 5);
        w(c0689f, 4);
        x();
        if (this.f8372c == 8) {
            HashMap[] mapArr = this.f8373d;
            C0686c c0686c = (C0686c) mapArr[1].get("MakerNote");
            if (c0686c != null) {
                C0689f c0689f2 = new C0689f(c0686c.f8334d);
                c0689f2.f8328x = this.f8375f;
                c0689f2.b(6);
                s(c0689f2, 9);
                C0686c c0686c2 = (C0686c) mapArr[9].get("ColorSpace");
                if (c0686c2 != null) {
                    mapArr[1].put("ColorSpace", c0686c2);
                }
            }
        }
    }

    public final void k(C0689f c0689f) throws Throwable {
        if (f8355l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c0689f);
        }
        j(c0689f);
        HashMap[] mapArr = this.f8373d;
        C0686c c0686c = (C0686c) mapArr[0].get("JpgFromRaw");
        if (c0686c != null) {
            e(new C0685b(c0686c.f8334d), (int) c0686c.f8333c, 5);
        }
        C0686c c0686c2 = (C0686c) mapArr[0].get("ISO");
        C0686c c0686c3 = (C0686c) mapArr[1].get("PhotographicSensitivity");
        if (c0686c2 == null || c0686c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0686c2);
    }

    public final void l(C0685b c0685b) throws Throwable {
        if (f8355l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0685b);
        }
        c0685b.f8328x = ByteOrder.LITTLE_ENDIAN;
        c0685b.b(f8368y.length);
        int i6 = c0685b.readInt() + 8;
        byte[] bArr = f8369z;
        c0685b.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0685b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i7 = c0685b.readInt();
                int i8 = length + 8;
                if (Arrays.equals(f8341A, bArr2)) {
                    byte[] bArr3 = new byte[i7];
                    if (c0685b.read(bArr3) == i7) {
                        this.f8377h = i8;
                        r(0, bArr3);
                        u(new C0685b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + com.bumptech.glide.d.c(bArr2));
                    }
                }
                if (i7 % 2 == 1) {
                    i7++;
                }
                length = i8 + i7;
                if (length == i6) {
                    return;
                }
                if (length > i6) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0685b.b(i7);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C0685b c0685b, HashMap map) throws Throwable {
        C0686c c0686c = (C0686c) map.get("JPEGInterchangeFormat");
        C0686c c0686c2 = (C0686c) map.get("JPEGInterchangeFormatLength");
        if (c0686c == null || c0686c2 == null) {
            return;
        }
        int iE = c0686c.e(this.f8375f);
        int iE2 = c0686c2.e(this.f8375f);
        if (this.f8372c == 7) {
            iE += this.f8378i;
        }
        if (iE > 0 && iE2 > 0 && this.f8371b == null && this.f8370a == null) {
            c0685b.skip(iE);
            c0685b.read(new byte[iE2]);
        }
        if (f8355l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        C0686c c0686c = (C0686c) map.get("ImageLength");
        C0686c c0686c2 = (C0686c) map.get("ImageWidth");
        if (c0686c == null || c0686c2 == null) {
            return false;
        }
        return c0686c.e(this.f8375f) <= 512 && c0686c2.e(this.f8375f) <= 512;
    }

    public final void o(C0685b c0685b) throws IOException {
        ByteOrder byteOrderQ = q(c0685b);
        this.f8375f = byteOrderQ;
        c0685b.f8328x = byteOrderQ;
        int unsignedShort = c0685b.readUnsignedShort();
        int i6 = this.f8372c;
        if (i6 != 7 && i6 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i7 = c0685b.readInt();
        if (i7 < 8) {
            throw new IOException(AbstractC0628i.f("Invalid first Ifd offset: ", i7));
        }
        int i8 = i7 - 8;
        if (i8 > 0) {
            c0685b.b(i8);
        }
    }

    public final void p() {
        int i6 = 0;
        while (true) {
            HashMap[] mapArr = this.f8373d;
            if (i6 >= mapArr.length) {
                return;
            }
            StringBuilder sbL = H1.a.l("The size of tag group[", i6, "]: ");
            sbL.append(mapArr[i6].size());
            Log.d("ExifInterface", sbL.toString());
            for (Map.Entry entry : mapArr[i6].entrySet()) {
                C0686c c0686c = (C0686c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0686c.toString() + ", tagValue: '" + c0686c.f(this.f8375f) + "'");
            }
            i6++;
        }
    }

    public final void r(int i6, byte[] bArr) throws IOException {
        C0689f c0689f = new C0689f(bArr);
        o(c0689f);
        s(c0689f, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(f0.C0689f r33, int r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0690g.s(f0.f, int):void");
    }

    public final void t(int i6, String str, String str2) {
        HashMap[] mapArr = this.f8373d;
        if (mapArr[i6].isEmpty() || mapArr[i6].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i6];
        map.put(str2, map.get(str));
        mapArr[i6].remove(str);
    }

    public final void u(C0685b c0685b) throws Throwable {
        String str;
        String string;
        StringBuilder sb;
        C0686c c0686c;
        int iE;
        HashMap map = this.f8373d[4];
        C0686c c0686c2 = (C0686c) map.get("Compression");
        if (c0686c2 == null) {
            m(c0685b, map);
            return;
        }
        int iE2 = c0686c2.e(this.f8375f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(c0685b, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        C0686c c0686c3 = (C0686c) map.get("BitsPerSample");
        if (c0686c3 != null) {
            int[] iArr = (int[]) c0686c3.g(this.f8375f);
            int[] iArr2 = f8356m;
            if (Arrays.equals(iArr2, iArr) || (this.f8372c == 3 && (c0686c = (C0686c) map.get("PhotometricInterpretation")) != null && (((iE = c0686c.e(this.f8375f)) == 1 && Arrays.equals(iArr, f8357n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                C0686c c0686c4 = (C0686c) map.get("StripOffsets");
                C0686c c0686c5 = (C0686c) map.get("StripByteCounts");
                if (c0686c4 == null || c0686c5 == null) {
                    return;
                }
                long[] jArrG = com.bumptech.glide.d.g(c0686c4.g(this.f8375f));
                long[] jArrG2 = com.bumptech.glide.d.g(c0686c5.g(this.f8375f));
                if (jArrG == null || jArrG.length == 0) {
                    str = "stripOffsets should not be null or have zero length.";
                } else if (jArrG2 == null || jArrG2.length == 0) {
                    str = "stripByteCounts should not be null or have zero length.";
                } else {
                    if (jArrG.length == jArrG2.length) {
                        long j6 = 0;
                        for (long j7 : jArrG2) {
                            j6 += j7;
                        }
                        byte[] bArr = new byte[(int) j6];
                        this.f8376g = true;
                        int i6 = 0;
                        int i7 = 0;
                        for (int i8 = 0; i8 < jArrG.length; i8++) {
                            int i9 = (int) jArrG[i8];
                            int i10 = (int) jArrG2[i8];
                            if (i8 < jArrG.length - 1 && i9 + i10 != jArrG[i8 + 1]) {
                                this.f8376g = false;
                            }
                            int i11 = i9 - i6;
                            if (i11 < 0) {
                                string = "Invalid strip offset value";
                            } else {
                                long j8 = i11;
                                if (c0685b.skip(j8) != j8) {
                                    sb = new StringBuilder("Failed to skip ");
                                    sb.append(i11);
                                } else {
                                    int i12 = i6 + i11;
                                    byte[] bArr2 = new byte[i10];
                                    if (c0685b.read(bArr2) != i10) {
                                        sb = new StringBuilder("Failed to read ");
                                        sb.append(i10);
                                    } else {
                                        i6 = i12 + i10;
                                        System.arraycopy(bArr2, 0, bArr, i7, i10);
                                        i7 += i10;
                                    }
                                }
                                sb.append(" bytes.");
                                string = sb.toString();
                            }
                            Log.d("ExifInterface", string);
                            return;
                        }
                        if (this.f8376g) {
                            long j9 = jArrG[0];
                            return;
                        }
                        return;
                    }
                    str = "stripOffsets and stripByteCounts should have same length.";
                }
                Log.w("ExifInterface", str);
                return;
            }
        }
        if (f8355l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i6, int i7) throws Throwable {
        String str;
        HashMap[] mapArr = this.f8373d;
        boolean zIsEmpty = mapArr[i6].isEmpty();
        boolean z5 = f8355l;
        if (zIsEmpty || mapArr[i7].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C0686c c0686c = (C0686c) mapArr[i6].get("ImageLength");
        C0686c c0686c2 = (C0686c) mapArr[i6].get("ImageWidth");
        C0686c c0686c3 = (C0686c) mapArr[i7].get("ImageLength");
        C0686c c0686c4 = (C0686c) mapArr[i7].get("ImageWidth");
        if (c0686c == null || c0686c2 == null) {
            if (!z5) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (c0686c3 != null && c0686c4 != null) {
                int iE = c0686c.e(this.f8375f);
                int iE2 = c0686c2.e(this.f8375f);
                int iE3 = c0686c3.e(this.f8375f);
                int iE4 = c0686c4.e(this.f8375f);
                if (iE >= iE3 || iE2 >= iE4) {
                    return;
                }
                HashMap map = mapArr[i6];
                mapArr[i6] = mapArr[i7];
                mapArr[i7] = map;
                return;
            }
            if (!z5) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    public final void w(C0689f c0689f, int i6) throws Throwable {
        StringBuilder sb;
        String string;
        C0686c c0686cC;
        C0686c c0686cC2;
        HashMap[] mapArr = this.f8373d;
        C0686c c0686c = (C0686c) mapArr[i6].get("DefaultCropSize");
        C0686c c0686c2 = (C0686c) mapArr[i6].get("SensorTopBorder");
        C0686c c0686c3 = (C0686c) mapArr[i6].get("SensorLeftBorder");
        C0686c c0686c4 = (C0686c) mapArr[i6].get("SensorBottomBorder");
        C0686c c0686c5 = (C0686c) mapArr[i6].get("SensorRightBorder");
        if (c0686c != null) {
            if (c0686c.f8331a == 5) {
                C0688e[] c0688eArr = (C0688e[]) c0686c.g(this.f8375f);
                if (c0688eArr == null || c0688eArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    string = Arrays.toString(c0688eArr);
                    sb.append(string);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                c0686cC = C0686c.b(c0688eArr[0], this.f8375f);
                c0686cC2 = C0686c.b(c0688eArr[1], this.f8375f);
                mapArr[i6].put("ImageWidth", c0686cC);
                mapArr[i6].put("ImageLength", c0686cC2);
                return;
            }
            int[] iArr = (int[]) c0686c.g(this.f8375f);
            if (iArr == null || iArr.length != 2) {
                sb = new StringBuilder("Invalid crop size values. cropSize=");
                string = Arrays.toString(iArr);
                sb.append(string);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            c0686cC = C0686c.c(iArr[0], this.f8375f);
            c0686cC2 = C0686c.c(iArr[1], this.f8375f);
            mapArr[i6].put("ImageWidth", c0686cC);
            mapArr[i6].put("ImageLength", c0686cC2);
            return;
        }
        if (c0686c2 != null && c0686c3 != null && c0686c4 != null && c0686c5 != null) {
            int iE = c0686c2.e(this.f8375f);
            int iE2 = c0686c4.e(this.f8375f);
            int iE3 = c0686c5.e(this.f8375f);
            int iE4 = c0686c3.e(this.f8375f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            C0686c c0686cC3 = C0686c.c(iE2 - iE, this.f8375f);
            C0686c c0686cC4 = C0686c.c(iE3 - iE4, this.f8375f);
            mapArr[i6].put("ImageLength", c0686cC3);
            mapArr[i6].put("ImageWidth", c0686cC4);
            return;
        }
        C0686c c0686c6 = (C0686c) mapArr[i6].get("ImageLength");
        C0686c c0686c7 = (C0686c) mapArr[i6].get("ImageWidth");
        if (c0686c6 == null || c0686c7 == null) {
            C0686c c0686c8 = (C0686c) mapArr[i6].get("JPEGInterchangeFormat");
            C0686c c0686c9 = (C0686c) mapArr[i6].get("JPEGInterchangeFormatLength");
            if (c0686c8 == null || c0686c9 == null) {
                return;
            }
            int iE5 = c0686c8.e(this.f8375f);
            int iE6 = c0686c8.e(this.f8375f);
            c0689f.c(iE5);
            byte[] bArr = new byte[iE6];
            c0689f.read(bArr);
            e(new C0685b(bArr), iE5, i6);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f8373d;
        C0686c c0686c = (C0686c) mapArr[1].get("PixelXDimension");
        C0686c c0686c2 = (C0686c) mapArr[1].get("PixelYDimension");
        if (c0686c != null && c0686c2 != null) {
            mapArr[0].put("ImageWidth", c0686c);
            mapArr[0].put("ImageLength", c0686c2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
