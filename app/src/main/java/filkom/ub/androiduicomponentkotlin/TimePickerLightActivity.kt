package filkom.ub.androiduicomponentkotlin

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_time_picker_light.*
import java.text.SimpleDateFormat
import java.util.*

class TimePickerLightActivity : AppCompatActivity() {

    var button_time: Button? = null
    var textview_time: TextView? = null
    var cal = Calendar.getInstance()

    var hrs:Int? = 0
    var mnt:Int? =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker_light)

        textview_time = text_time
        button_time = btn_time

        val timeSetListener = object : TimePickerDialog.OnTimeSetListener {
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
                hrs=hourOfDay
                mnt=minute
                updateDateInView()
            }
        }

        // when you click on the button, show DatePickerDialog that is set with OnDateSetListener
        button_time!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                TimePickerDialog(this@TimePickerLightActivity,R.style.Theme_AppCompat_Light_Dialog,
                        timeSetListener,
                        hrs!!,mnt!!,true).show()
                

            }

        })
    }
    private fun updateDateInView() {

        textview_time!!.text = "${hrs}:${mnt}"
    }
}
