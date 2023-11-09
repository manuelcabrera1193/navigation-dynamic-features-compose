package com.example.navigationdemo.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle

fun Context.goActivity(dynamicModule: DynamicModule, bundle: Bundle? = null) {
    val intent = Intent(this, Class.forName(dynamicModule.className))
    bundle?.let(intent::putExtras)
    this.startActivity(intent)
}
