package com.fanhl.kotlinannotationdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fanhl.library.Value
import com.fanhl.library.ValueExpression
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foo = Foo()
        ValueExpression(foo).expression()

        toast(foo.com)
    }
}

class Foo {
    @Value(value = "bar")
    lateinit var com: String
}