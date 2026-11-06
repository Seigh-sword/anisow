package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6467a;

    static {
        int[] iArr = new int[F.values().length];
        f6467a = iArr;
        try {
            iArr[F.ASSIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6467a[F.CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6467a[F.CREATE_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6467a[F.CREATE_OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6467a[F.EXPRESSION_LIST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6467a[F.GET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6467a[F.GET_INDEX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6467a[F.GET_PROPERTY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6467a[F.NULL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f6467a[F.SET_PROPERTY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f6467a[F.TYPEOF.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f6467a[F.UNDEFINED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f6467a[F.VAR.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
    }
}
