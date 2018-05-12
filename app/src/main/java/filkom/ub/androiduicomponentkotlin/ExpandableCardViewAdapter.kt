package filkom.ub.androiduicomponentkotlin

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.cardview_parent.view.*

class ExpandableCardViewAdapter(var items: MutableList<Item>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var context : Context? = null ;
    companion object {
        val PARENT = 0
        val CHILD = 1
        val OPEN = 0.0F
        val CLOSE = 180.0F
    }

    data class Item(val type: Int = 0,
                    var text: String = "Default",
                    var parent: String = "none",
                    var children: List<Item>? = null)

    inner class ItemHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textView = v.item_text
        val toggleImageView = v.item_toggle_button
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent?.context
        val inflater = LayoutInflater.from(parent?.context)
        var view: View? = null

        when (viewType) {
            PARENT -> view = inflater.inflate(R.layout.cardview_parent, parent, false)
            CHILD -> view = inflater.inflate(R.layout.cardview_child, parent, false)
        }

        return ItemHolder(view!!)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as? ItemHolder
        val item = items[position]

        itemHolder?.textView!!.setOnClickListener {
            when(item.parent){
                "Bottom Navigation"->{
                    when (itemHolder.textView.text) {
                        "Shifting" -> {context!!.startActivity(Intent(context, ShiftBottomNav::class.java))}
                        else -> {Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()}
                    }
                }
                "Pickers"->{
                    when (itemHolder.textView.text) {
                        "Date Light" -> {context!!.startActivity(Intent(context, DatePickerLightActivity::class.java))}
                        else -> {Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()}

                    }
                }
                "Snackbards & Toasts"->{
                    when (itemHolder.textView.text) {
                        "Basic"->{context!!.startActivity(Intent(context, ToastSnackbarActivity::class.java))}
                        else -> {Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()}
                    }
                }
                else -> {Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()}
            }
//            when (itemHolder.textView.text) {
//                "Basic" -> {
//                    context!!.startActivity(Intent(context, Main2Activity::class.java))
//                }
//                "Shifting" -> {
//                    context!!.startActivity(Intent(context, ShiftBottomNav::class.java))
//                }
//                "Date Light" -> {
//                    context!!.startActivity(Intent(context, DatePickerLightActivity::class.java))
//                }
//                "Basic Toast & Snackbar"->{
//                    context!!.startActivity(Intent(context, ToastSnackbarActivity::class.java))
//                }
//                else -> {
//                    Toast.makeText(context, "Coming soon", Toast.LENGTH_SHORT).show()
//                    Intent(context, Main2Activity::class.java)
//                }
//            }
        }

        itemHolder?.let {
            it.toggleImageView?.let {
                it.setImageResource(R.drawable.toggle)
                it.rotation = if (item.children == null) OPEN else CLOSE

                it.setOnClickListener { view ->
                    val start = items.indexOf(item) + 1
                    if (item.children == null) {
                        var count = 0
                        var nextHeader = items.indexOf(items.find {
                            (count++ >= start) && (it.type == item.type)
                        })

                        if (nextHeader == -1) nextHeader = items.size
                        item.children = items.slice(start..nextHeader - 1)

                        val end = item.children!!.size
                        if (end > 0) items.removeAll(item.children!!)

                        view.animate().rotation(CLOSE).start()
                        notifyItemRangeRemoved(start, end)
                    } else {
                        item.children?.let {
                            items.addAll(start, it)
                            view.animate().rotation(OPEN).start()
                            notifyItemRangeInserted(start, it.size)
                            item.children = null
                        }
                    }
                }
            }

            it.textView.text = item.text
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].type
}