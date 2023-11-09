package com.example.navigationdemo.navigation

private const val BASE_DYNAMIC_FEATURE: String = "com.example"

enum class DynamicModule(val className: String) {
    A("${BASE_DYNAMIC_FEATURE}.dynamica.DynamicFeatureAActivity"),
    B("${BASE_DYNAMIC_FEATURE}.dynamicb.DynamicFeatureBActivity"),
    C("${BASE_DYNAMIC_FEATURE}.dynamicc.DynamicFeatureCActivity");
}
