package com.fanhl.library


@Retention(AnnotationRetention.RUNTIME) //这一行也可以省略
@Target(AnnotationTarget.FIELD)
annotation class Value(val value: String)