package sg.edu.rp.c347.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var lastDigit = false
    var plus = false
    var minus = false
    var multiply = false
    var divide = false
    var calc = 0.0;
    var operation = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        var tvNum = tvCalculate.text.toString()
        val btnSelected = view as Button
        when (btnSelected.id) {
            btnAC.id -> {
                tvCalculate.text = "0"
                calc = 0.0
            }
            btnNum1.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "1"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "1"
                    plus = false
                    minus = false
                }
            }
            btnNum2.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "2"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "2"
                }
            }
            btnNum3.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "3"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "3"
                }
            }
            btnNum4.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "4"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "4"
                }
            }
            btnNum5.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "5"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "5"
                }
            }
            btnNum6.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "6"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "6"
                }
            }
            btnNum7.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "7"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "7"
                }
            }
            btnNum8.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "8"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "8"
                }
            }
            btnNum9.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "9"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "9"
                }
            }
            btnNum0.id -> {
                if (tvNum.equals("0") || lastDigit) {
                    tvCalculate.text = "0"
                    lastDigit = false
                } else {
                    tvCalculate.text = tvNum + "0"
                }
            }
            btnDot.id -> {
                if (tvCalculate.text.toString().contains(".")) {

                } else {
                    if (tvNum.equals("0") || lastDigit) {
                        tvCalculate.text = "0."
                        lastDigit = false
                    } else if (!lastDigit) {
                        tvCalculate.text = tvNum + "."
                    }
                }
            }
        }
    }//  End of Func

    fun btnOpOnClick(view: View) {
        var tvResult = tvCalculate.text.toString()
        val btnSelected = view as Button
        when (btnSelected.id) {
            btnPlus.id -> {
                if (operation.equals("")) {
                    calc = tvResult.toDouble()
                    operation = "+"
                    lastDigit = true
                    plus = true
                } else {
                    calc += tvResult.toDouble()
                    operation = "+"
                    lastDigit = true
                    plus = true
                }
            }
            btnMinus.id -> {
                if (operation.equals("")) {
                    calc = tvResult.toDouble()
                    operation = "-"
                    lastDigit = true
                    minus = true
                } else {
                    calc -= tvResult.toDouble()
                    operation = "-"
                    lastDigit = true
                    minus = true
                }
            }
            btnMultiply.id -> {
                if (operation.equals("")) {
                    calc = tvResult.toDouble()
                    operation = "*"
                    lastDigit = true
                    multiply = true
                } else {
                    calc *= tvResult.toDouble()
                    operation = "*"
                    lastDigit = true
                    multiply = true
                }
            }
            btnDivide.id -> {
                if (operation.equals("")) {
                    calc = tvResult.toDouble()
                    operation = "/"
                    lastDigit = true
                    divide = true
                } else {
                    calc = tvResult.toDouble()
                    operation = "/"
                    lastDigit = true
                    divide = true
                }
            }
            btnPlusMinus.id -> {
                calc = tvResult.toDouble() * -1
                tvCalculate.text = calc.toString()
            }
            btnPercent.id -> {
                calc = tvResult.toDouble() / 100
                tvCalculate.text = calc.toString()
            }
            btnEqual.id -> {
                if (plus) {
                    calc += tvResult.toDouble()
                    tvCalculate.text = calc.toString()
                    operation = ""
                    plus = false
                    lastDigit = true
                } else if (minus) {
                    calc -= tvResult.toDouble()
                    operation = ""
                    tvCalculate.text = calc.toString()
                    minus = false
                    lastDigit = true
                } else if (multiply) {
                    calc *= tvResult.toDouble()
                    tvCalculate.text = calc.toString()
                    operation = ""
                    multiply = false
                    lastDigit = true
                } else if (divide) {
                    calc /= tvResult.toDouble()
                    tvCalculate.text = calc.toString()
                    operation = ""
                    divide = false
                    lastDigit = true
                } else {
                    lastDigit = true
                }
                Log.d("calculated", calc.toString() + "")
            }
        }
    }

}
