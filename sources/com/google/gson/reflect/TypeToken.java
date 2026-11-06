package com.google.gson.reflect;

import S3.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TypeToken<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f7456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f7457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7458c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type typeG = a.g(parameterizedType.getActualTypeArguments()[0]);
                this.f7457b = typeG;
                this.f7456a = a.w(typeG);
                this.f7458c = typeG.hashCode();
                return;
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (a.p(this.f7457b, ((TypeToken) obj).f7457b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7458c;
    }

    public final String toString() {
        return a.R(this.f7457b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type typeG = a.g(type);
        this.f7457b = typeG;
        this.f7456a = a.w(typeG);
        this.f7458c = typeG.hashCode();
    }
}
