package com.cursoandroid.intefacenubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursoandroid.intefacenubank.databinding.PagamentoItemBinding
import com.cursoandroid.intefacenubank.model.Pagamento

class AdapterPagamento(private val Context: Context, private val listaPagamento: MutableList<Pagamento>):
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        val itemLista = PagamentoItemBinding.inflate(LayoutInflater.from(Context), parent, false)
        return PagamentoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
      holder.iconePagamento.setBackgroundResource(listaPagamento[position].icone!!)
      holder.txtTituloPagamento.text = listaPagamento[position].titulo
    }

    override fun getItemCount() = listaPagamento.size


    inner class PagamentoViewHolder(binding: PagamentoItemBinding): RecyclerView.ViewHolder(binding.root){
        val iconePagamento = binding.icPagamento
        val txtTituloPagamento = binding.txtTituloPagamento
    }

}