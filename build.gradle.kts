// Plugins are declared here so the versions resolve once for the whole build.
// The app module applies them; google-services and crashlytics are applied
// conditionally there, only when a Firebase config file exists.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.google.services) apply false
    alias(libs.plugins.firebase.crashlytics) apply false
}
