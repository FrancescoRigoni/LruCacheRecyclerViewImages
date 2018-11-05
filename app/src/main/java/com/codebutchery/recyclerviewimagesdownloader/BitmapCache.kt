package com.codebutchery.recyclerviewimagesdownloader

import android.graphics.Bitmap
import android.util.LruCache

class BitmapCache : LruCache<String, Bitmap>(16*1024*1024) {
    override fun sizeOf(key: String, value: Bitmap): Int {
        return value.byteCount
    }
}