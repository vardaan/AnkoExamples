package com.example.vardansharma.ankoexample

import android.text.InputType
import android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LoginActivityUI : AnkoComponent<LoginActivity> {
    override fun createView(ui: AnkoContext<LoginActivity>) = with(ui) {
        verticalLayout {
            padding = dip(16)
            val email = editText {
                hint = "Email"
                inputType = TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            }.lparams(width = matchParent) {
                margin = dip(16)
            }

            val password = editText {
                hint = "Password"
                inputType = InputType.TYPE_NUMBER_VARIATION_PASSWORD
            }.lparams(width = matchParent) {
                margin = dip(16)
            }

            button("Login") {
                onClick { ctx.toast("You are logged in") }
            }
        }
    }
}