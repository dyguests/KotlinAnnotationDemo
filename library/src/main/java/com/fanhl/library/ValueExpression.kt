package com.fanhl.library

class ValueExpression(val obj: Any) {
    fun expression() {
        val clazz = obj::class.java
        clazz.declaredFields.filter { it.isAnnotationPresent(Value::class.java) }.forEach {
            val value = it.getAnnotation(Value::class.java)
            it.set(obj, value.value)
        }
    }
}