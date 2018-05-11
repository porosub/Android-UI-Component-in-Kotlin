package filkom.ub.androiduicomponentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast_snackbar.*

class ToastSnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_snackbar)

        btn_toast.setOnClickListener {
            Toast.makeText(this,"This is a Toast for you",Toast.LENGTH_SHORT).show()
        }

        btn_snack.setOnClickListener {
            Snackbar.make(snack_n_toast_layout,"Take your Snack for Snackbar",Snackbar.LENGTH_SHORT).show()
        }
    }
}
