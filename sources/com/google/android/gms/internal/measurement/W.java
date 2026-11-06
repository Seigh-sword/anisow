package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J2 f6727a = new J2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J2 f6728b = new J2();

    public static void A(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof V2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).f(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                Logger logger = A2.f6441h;
                i8 += 8;
            }
            ((A2) c1243i.f12254x).v(i8);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).g(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        V2 v22 = (V2) list;
        if (!z5) {
            while (i7 < v22.f6721y) {
                ((A2) c1243i.f12254x).f(i6, v22.f(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < v22.f6721y; i11++) {
            v22.f(i11);
            Logger logger2 = A2.f6441h;
            i10 += 8;
        }
        ((A2) c1243i.f12254x).v(i10);
        while (i7 < v22.f6721y) {
            ((A2) c1243i.f12254x).g(v22.f(i7));
            i7++;
        }
    }

    public static int B(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (A2.I(i6) * list.size()) + C(list);
    }

    public static int C(List list) {
        int iG;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            iG = 0;
            while (i6 < size) {
                iG += A2.G(v22.f(i6));
                i6++;
            }
        } else {
            iG = 0;
            while (i6 < size) {
                iG += A2.G(((Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return iG;
    }

    public static void D(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        if (list instanceof G2) {
            if (!z5) {
                throw null;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            throw null;
        }
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                A2 a22 = (A2) c1243i.f12254x;
                float fFloatValue = ((Float) list.get(i7)).floatValue();
                a22.getClass();
                a22.e(i6, Float.floatToRawIntBits(fFloatValue));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            Logger logger = A2.f6441h;
            i8 += 4;
        }
        ((A2) c1243i.f12254x).v(i8);
        while (i7 < list.size()) {
            A2 a23 = (A2) c1243i.f12254x;
            float fFloatValue2 = ((Float) list.get(i7)).floatValue();
            a23.getClass();
            a23.d(Float.floatToRawIntBits(fFloatValue2));
            i7++;
        }
    }

    public static int E(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + F(list);
    }

    public static int F(List list) {
        int iK;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L2) {
            L2 l22 = (L2) list;
            iK = 0;
            while (i6 < size) {
                int iE = l22.e(i6);
                iK += A2.K((iE >> 31) ^ (iE << 1));
                i6++;
            }
        } else {
            iK = 0;
            while (i6 < size) {
                int iIntValue = ((Integer) list.get(i6)).intValue();
                iK += A2.K((iIntValue >> 31) ^ (iIntValue << 1));
                i6++;
            }
        }
        return iK;
    }

    public static void G(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).q(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iG = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iG += A2.G(((Integer) list.get(i8)).intValue());
            }
            ((A2) c1243i.f12254x).v(iG);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).p(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                ((A2) c1243i.f12254x).q(i6, l22.e(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iG2 = 0;
        for (int i9 = 0; i9 < l22.f6626y; i9++) {
            iG2 += A2.G(l22.e(i9));
        }
        ((A2) c1243i.f12254x).v(iG2);
        while (i7 < l22.f6626y) {
            ((A2) c1243i.f12254x).p(l22.e(i7));
            i7++;
        }
    }

    public static int H(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + I(list);
    }

    public static int I(List list) {
        int iG;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            iG = 0;
            while (i6 < size) {
                long jF = v22.f(i6);
                iG += A2.G((jF >> 63) ^ (jF << 1));
                i6++;
            }
        } else {
            iG = 0;
            while (i6 < size) {
                long jLongValue = ((Long) list.get(i6)).longValue();
                iG += A2.G((jLongValue >> 63) ^ (jLongValue << 1));
                i6++;
            }
        }
        return iG;
    }

    public static void J(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof V2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).r(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iG = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iG += A2.G(((Long) list.get(i8)).longValue());
            }
            ((A2) c1243i.f12254x).v(iG);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).s(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        V2 v22 = (V2) list;
        if (!z5) {
            while (i7 < v22.f6721y) {
                ((A2) c1243i.f12254x).r(i6, v22.f(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iG2 = 0;
        for (int i9 = 0; i9 < v22.f6721y; i9++) {
            iG2 += A2.G(v22.f(i9));
        }
        ((A2) c1243i.f12254x).v(iG2);
        while (i7 < v22.f6721y) {
            ((A2) c1243i.f12254x).s(v22.f(i7));
            i7++;
        }
    }

    public static int K(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + L(list);
    }

    public static int L(List list) {
        int iK;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L2) {
            L2 l22 = (L2) list;
            iK = 0;
            while (i6 < size) {
                iK += A2.K(l22.e(i6));
                i6++;
            }
        } else {
            iK = 0;
            while (i6 < size) {
                iK += A2.K(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iK;
    }

    public static void M(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).e(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                Logger logger = A2.f6441h;
                i8 += 4;
            }
            ((A2) c1243i.f12254x).v(i8);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).d(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                ((A2) c1243i.f12254x).e(i6, l22.e(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < l22.f6626y; i11++) {
            l22.e(i11);
            Logger logger2 = A2.f6441h;
            i10 += 4;
        }
        ((A2) c1243i.f12254x).v(i10);
        while (i7 < l22.f6626y) {
            ((A2) c1243i.f12254x).d(l22.e(i7));
            i7++;
        }
    }

    public static int N(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + O(list);
    }

    public static int O(List list) {
        int iG;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof V2) {
            V2 v22 = (V2) list;
            iG = 0;
            while (i6 < size) {
                iG += A2.G(v22.f(i6));
                i6++;
            }
        } else {
            iG = 0;
            while (i6 < size) {
                iG += A2.G(((Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return iG;
    }

    public static void P(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof V2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).f(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                Logger logger = A2.f6441h;
                i8 += 8;
            }
            ((A2) c1243i.f12254x).v(i8);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).g(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        V2 v22 = (V2) list;
        if (!z5) {
            while (i7 < v22.f6721y) {
                ((A2) c1243i.f12254x).f(i6, v22.f(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < v22.f6721y; i11++) {
            v22.f(i11);
            Logger logger2 = A2.f6441h;
            i10 += 8;
        }
        ((A2) c1243i.f12254x).v(i10);
        while (i7 < v22.f6721y) {
            ((A2) c1243i.f12254x).g(v22.f(i7));
            i7++;
        }
    }

    public static void Q(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    A2 a22 = (A2) c1243i.f12254x;
                    int iIntValue = ((Integer) list.get(i7)).intValue();
                    a22.z(i6, (iIntValue >> 31) ^ (iIntValue << 1));
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iK = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue2 = ((Integer) list.get(i8)).intValue();
                iK += A2.K((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            ((A2) c1243i.f12254x).v(iK);
            while (i7 < list.size()) {
                A2 a23 = (A2) c1243i.f12254x;
                int iIntValue3 = ((Integer) list.get(i7)).intValue();
                a23.v((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                A2 a24 = (A2) c1243i.f12254x;
                int iE = l22.e(i7);
                a24.z(i6, (iE >> 31) ^ (iE << 1));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iK2 = 0;
        for (int i9 = 0; i9 < l22.f6626y; i9++) {
            int iE2 = l22.e(i9);
            iK2 += A2.K((iE2 >> 31) ^ (iE2 << 1));
        }
        ((A2) c1243i.f12254x).v(iK2);
        while (i7 < l22.f6626y) {
            A2 a25 = (A2) c1243i.f12254x;
            int iE3 = l22.e(i7);
            a25.v((iE3 >> 31) ^ (iE3 << 1));
            i7++;
        }
    }

    public static void R(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof V2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    A2 a22 = (A2) c1243i.f12254x;
                    long jLongValue = ((Long) list.get(i7)).longValue();
                    a22.r(i6, (jLongValue >> 63) ^ (jLongValue << 1));
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iG = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long jLongValue2 = ((Long) list.get(i8)).longValue();
                iG += A2.G((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            ((A2) c1243i.f12254x).v(iG);
            while (i7 < list.size()) {
                A2 a23 = (A2) c1243i.f12254x;
                long jLongValue3 = ((Long) list.get(i7)).longValue();
                a23.s((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i7++;
            }
            return;
        }
        V2 v22 = (V2) list;
        if (!z5) {
            while (i7 < v22.f6721y) {
                A2 a24 = (A2) c1243i.f12254x;
                long jF = v22.f(i7);
                a24.r(i6, (jF >> 63) ^ (jF << 1));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iG2 = 0;
        for (int i9 = 0; i9 < v22.f6721y; i9++) {
            long jF2 = v22.f(i9);
            iG2 += A2.G((jF2 >> 63) ^ (jF2 << 1));
        }
        ((A2) c1243i.f12254x).v(iG2);
        while (i7 < v22.f6721y) {
            A2 a25 = (A2) c1243i.f12254x;
            long jF3 = v22.f(i7);
            a25.s((jF3 >> 63) ^ (jF3 << 1));
            i7++;
        }
    }

    public static void S(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).z(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iK = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iK += A2.K(((Integer) list.get(i8)).intValue());
            }
            ((A2) c1243i.f12254x).v(iK);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).v(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                ((A2) c1243i.f12254x).z(i6, l22.e(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iK2 = 0;
        for (int i9 = 0; i9 < l22.f6626y; i9++) {
            iK2 += A2.K(l22.e(i9));
        }
        ((A2) c1243i.f12254x).v(iK2);
        while (i7 < l22.f6626y) {
            ((A2) c1243i.f12254x).v(l22.e(i7));
            i7++;
        }
    }

    public static void T(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof V2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).r(i6, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iG = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iG += A2.G(((Long) list.get(i8)).longValue());
            }
            ((A2) c1243i.f12254x).v(iG);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).s(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        V2 v22 = (V2) list;
        if (!z5) {
            while (i7 < v22.f6721y) {
                ((A2) c1243i.f12254x).r(i6, v22.f(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iG2 = 0;
        for (int i9 = 0; i9 < v22.f6721y; i9++) {
            iG2 += A2.G(v22.f(i9));
        }
        ((A2) c1243i.f12254x).v(iG2);
        while (i7 < v22.f6721y) {
            ((A2) c1243i.f12254x).s(v22.f(i7));
            i7++;
        }
    }

    public static int a(int i6, InterfaceC0457m3 interfaceC0457m3, Object obj) {
        int iK = A2.K(i6 << 3);
        int iA = ((AbstractC0474p2) ((InterfaceC0403d3) obj)).a(interfaceC0457m3);
        return A2.K(iA) + iA + iK;
    }

    public static int b(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A2.l(i6) * size;
    }

    public static int c(int i6, List list, InterfaceC0457m3 interfaceC0457m3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM += A2.m(i6, (InterfaceC0403d3) list.get(i7), interfaceC0457m3);
        }
        return iM;
    }

    public static int d(List list) {
        return list.size();
    }

    public static void e(int i6, List list, C1243i c1243i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            A2 a22 = (A2) c1243i.f12254x;
            AbstractC0527y2 abstractC0527y2 = (AbstractC0527y2) list.get(i7);
            a22.w(i6, 2);
            a22.h(abstractC0527y2);
        }
    }

    public static void f(int i6, List list, C1243i c1243i, InterfaceC0457m3 interfaceC0457m3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            c1243i.x(i6, interfaceC0457m3, list.get(i7));
        }
    }

    public static void g(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        if (list instanceof AbstractC0497t2) {
            if (!z5) {
                throw null;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            throw null;
        }
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                A2 a22 = (A2) c1243i.f12254x;
                boolean zBooleanValue = ((Boolean) list.get(i7)).booleanValue();
                a22.w(i6, 0);
                a22.c(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            Logger logger = A2.f6441h;
            i8++;
        }
        ((A2) c1243i.f12254x).v(i8);
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((A2) c1243i.f12254x).c(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void h(J2 j22, Object obj, Object obj2) {
        j22.getClass();
        I2 i22 = (I2) obj;
        C0475p3 c0475p3 = i22.zzb;
        C0475p3 c0475p32 = ((I2) obj2).zzb;
        C0475p3 c0475p33 = C0475p3.f6922f;
        if (!c0475p33.equals(c0475p32)) {
            if (c0475p33.equals(c0475p3)) {
                int i6 = c0475p3.f6923a + c0475p32.f6923a;
                int[] iArrCopyOf = Arrays.copyOf(c0475p3.f6924b, i6);
                System.arraycopy(c0475p32.f6924b, 0, iArrCopyOf, c0475p3.f6923a, c0475p32.f6923a);
                Object[] objArrCopyOf = Arrays.copyOf(c0475p3.f6925c, i6);
                System.arraycopy(c0475p32.f6925c, 0, objArrCopyOf, c0475p3.f6923a, c0475p32.f6923a);
                c0475p3 = new C0475p3(i6, iArrCopyOf, objArrCopyOf, true);
            } else {
                c0475p3.getClass();
                if (!c0475p32.equals(c0475p33)) {
                    if (!c0475p3.f6927e) {
                        throw new UnsupportedOperationException();
                    }
                    int i7 = c0475p3.f6923a + c0475p32.f6923a;
                    c0475p3.b(i7);
                    System.arraycopy(c0475p32.f6924b, 0, c0475p3.f6924b, c0475p3.f6923a, c0475p32.f6923a);
                    System.arraycopy(c0475p32.f6925c, 0, c0475p3.f6925c, c0475p3.f6923a, c0475p32.f6923a);
                    c0475p3.f6923a = i7;
                }
            }
        }
        i22.zzb = c0475p3;
    }

    public static void i(Object obj, int i6, R2 r22, M2 m22, J2 j22) {
        if (m22 == null) {
            return;
        }
        boolean z5 = r22 instanceof RandomAccess;
        C0475p3 c0475p3 = C0475p3.f6922f;
        C0475p3 c0475p32 = null;
        if (!z5) {
            Iterator it = r22.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!m22.d(iIntValue)) {
                    if (c0475p32 == null) {
                        j22.getClass();
                        I2 i22 = (I2) obj;
                        C0475p3 c0475p3F = i22.zzb;
                        if (c0475p3F == c0475p3) {
                            c0475p3F = C0475p3.f();
                            i22.zzb = c0475p3F;
                        }
                        c0475p32 = c0475p3F;
                    }
                    j22.getClass();
                    c0475p32.c(i6 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return;
        }
        int size = r22.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Integer num = (Integer) r22.get(i8);
            int iIntValue2 = num.intValue();
            if (m22.d(iIntValue2)) {
                if (i8 != i7) {
                    r22.set(i7, num);
                }
                i7++;
            } else {
                if (c0475p32 == null) {
                    j22.getClass();
                    I2 i23 = (I2) obj;
                    C0475p3 c0475p3F2 = i23.zzb;
                    if (c0475p3F2 == c0475p3) {
                        c0475p3F2 = C0475p3.f();
                        i23.zzb = c0475p3F2;
                    }
                    c0475p32 = c0475p3F2;
                }
                j22.getClass();
                c0475p32.c(i6 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i7 != size) {
            r22.subList(i7, size).clear();
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int k(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I5 = A2.I(i6) * size;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int iJ = ((AbstractC0527y2) list.get(i7)).j();
            I5 += A2.K(iJ) + iJ;
        }
        return I5;
    }

    public static int l(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + n(list);
    }

    public static int m(int i6, List list, InterfaceC0457m3 interfaceC0457m3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I5 = A2.I(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            int iA = ((AbstractC0474p2) ((InterfaceC0403d3) list.get(i7))).a(interfaceC0457m3);
            I5 += A2.K(iA) + iA;
        }
        return I5;
    }

    public static int n(List list) {
        int iG;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L2) {
            L2 l22 = (L2) list;
            iG = 0;
            while (i6 < size) {
                iG += A2.G(l22.e(i6));
                i6++;
            }
        } else {
            iG = 0;
            while (i6 < size) {
                iG += A2.G(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iG;
    }

    public static void o(int i6, List list, C1243i c1243i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof U2)) {
            while (i7 < list.size()) {
                A2 a22 = (A2) c1243i.f12254x;
                String str = (String) list.get(i7);
                a22.w(i6, 2);
                a22.i(str);
                i7++;
            }
            return;
        }
        U2 u22 = (U2) list;
        while (i7 < list.size()) {
            Object objA = u22.a();
            if (objA instanceof String) {
                A2 a23 = (A2) c1243i.f12254x;
                a23.w(i6, 2);
                a23.i((String) objA);
            } else {
                A2 a24 = (A2) c1243i.f12254x;
                a24.w(i6, 2);
                a24.h((AbstractC0527y2) objA);
            }
            i7++;
        }
    }

    public static void p(int i6, List list, C1243i c1243i, InterfaceC0457m3 interfaceC0457m3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            c1243i.G(i6, interfaceC0457m3, list.get(i7));
        }
    }

    public static void q(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        if (list instanceof B2) {
            if (!z5) {
                throw null;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            throw null;
        }
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                A2 a22 = (A2) c1243i.f12254x;
                double dDoubleValue = ((Double) list.get(i7)).doubleValue();
                a22.getClass();
                a22.f(i6, Double.doubleToRawLongBits(dDoubleValue));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            Logger logger = A2.f6441h;
            i8 += 8;
        }
        ((A2) c1243i.f12254x).v(i8);
        while (i7 < list.size()) {
            A2 a23 = (A2) c1243i.f12254x;
            double dDoubleValue2 = ((Double) list.get(i7)).doubleValue();
            a23.getClass();
            a23.g(Double.doubleToRawLongBits(dDoubleValue2));
            i7++;
        }
    }

    public static int r(int i6, List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int I5 = A2.I(i6) * size;
        if (list instanceof U2) {
            U2 u22 = (U2) list;
            while (i7 < size) {
                Object objA = u22.a();
                if (objA instanceof AbstractC0527y2) {
                    int iJ = ((AbstractC0527y2) objA).j();
                    I5 = A2.K(iJ) + iJ + I5;
                } else {
                    I5 = A2.o((String) objA) + I5;
                }
                i7++;
            }
        } else {
            while (i7 < size) {
                Object obj = list.get(i7);
                if (obj instanceof AbstractC0527y2) {
                    int iJ2 = ((AbstractC0527y2) obj).j();
                    I5 = A2.K(iJ2) + iJ2 + I5;
                } else {
                    I5 = A2.o((String) obj) + I5;
                }
                i7++;
            }
        }
        return I5;
    }

    public static int s(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A2.C(i6) * size;
    }

    public static int t(List list) {
        return list.size() << 2;
    }

    public static void u(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).q(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int iG = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iG += A2.G(((Integer) list.get(i8)).intValue());
            }
            ((A2) c1243i.f12254x).v(iG);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).p(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                ((A2) c1243i.f12254x).q(i6, l22.e(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int iG2 = 0;
        for (int i9 = 0; i9 < l22.f6626y; i9++) {
            iG2 += A2.G(l22.e(i9));
        }
        ((A2) c1243i.f12254x).v(iG2);
        while (i7 < l22.f6626y) {
            ((A2) c1243i.f12254x).p(l22.e(i7));
            i7++;
        }
    }

    public static int v(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A2.t(i6) * size;
    }

    public static int w(List list) {
        return list.size() << 3;
    }

    public static void x(int i6, List list, C1243i c1243i, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1243i.getClass();
        int i7 = 0;
        if (!(list instanceof L2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    ((A2) c1243i.f12254x).e(i6, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            ((A2) c1243i.f12254x).w(i6, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                Logger logger = A2.f6441h;
                i8 += 4;
            }
            ((A2) c1243i.f12254x).v(i8);
            while (i7 < list.size()) {
                ((A2) c1243i.f12254x).d(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        L2 l22 = (L2) list;
        if (!z5) {
            while (i7 < l22.f6626y) {
                ((A2) c1243i.f12254x).e(i6, l22.e(i7));
                i7++;
            }
            return;
        }
        ((A2) c1243i.f12254x).w(i6, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < l22.f6626y; i11++) {
            l22.e(i11);
            Logger logger2 = A2.f6441h;
            i10 += 4;
        }
        ((A2) c1243i.f12254x).v(i10);
        while (i7 < l22.f6626y) {
            ((A2) c1243i.f12254x).d(l22.e(i7));
            i7++;
        }
    }

    public static int y(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A2.I(i6) * size) + z(list);
    }

    public static int z(List list) {
        int iG;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L2) {
            L2 l22 = (L2) list;
            iG = 0;
            while (i6 < size) {
                iG += A2.G(l22.e(i6));
                i6++;
            }
        } else {
            iG = 0;
            while (i6 < size) {
                iG += A2.G(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iG;
    }
}
