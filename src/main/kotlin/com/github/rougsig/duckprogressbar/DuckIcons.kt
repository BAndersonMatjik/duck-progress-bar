package com.github.rougsig.duckprogressbar

import com.intellij.openapi.util.IconLoader
import com.intellij.util.ui.JBUI
import java.awt.Color

val DUCK_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/duck.png") }
val RDUCK_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/rduck.png") }

val SATRIA_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/lsatria1.png") }
val RSATRIA_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/rsatria1.png") }



val DUCK_WIDTH by lazy(LazyThreadSafetyMode.NONE) { JBUI.scale(32) }

val SATRIA_WIDTH by lazy(LazyThreadSafetyMode.NONE) {JBUI.scale(32)}

val SATRIA_COLOR by lazy(LazyThreadSafetyMode.NONE) {Color(0xE21877)}

val DUCK_COLOR by lazy(LazyThreadSafetyMode.NONE) { Color(0xFFF176) }

