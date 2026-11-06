# Models are deserialised reflectively by Moshi.
-keep class com.xo.anilab.data.model.** { *; }
-keep class com.xo.anilab.data.remote.responses.** { *; }
-keepclassmembers class ** {
    @com.squareup.moshi.Json <fields>;
}
-keepattributes Signature, InnerClasses, *Annotation*

# Retrofit interfaces keep their annotations at runtime.
-keep,allowobfuscation,allowshrinking interface retrofit2.Call
-keep,allowobfuscation,allowshrinking class retrofit2.Response
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.Continuation

# OkHttp platform hooks referenced reflectively.
-dontwarn okhttp3.internal.platform.**
-dontwarn org.conscrypt.**
-dontwarn org.bouncycastle.**
-dontwarn org.openjsse.**

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule { <init>(...); }

# Keep line numbers for readable crash reports.
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile
