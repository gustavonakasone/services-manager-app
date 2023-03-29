package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.app_servicesmanager.R
import model.Order

class OrderAdapter(context: Context, orders: List<Order>) :
    ArrayAdapter<Order>(context, R.layout.order_list_item, orders) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.order_list_item, parent, false)
        }
        val order = getItem(position)

        val nomeTextView = itemView!!.findViewById<TextView>(R.id.nome_pedido)
        nomeTextView.text = order?.getOrder()

        val statusTextView = itemView.findViewById<TextView>(R.id.status_pedido)
        statusTextView.text = order?.getStatus()

        return itemView
    }
}
