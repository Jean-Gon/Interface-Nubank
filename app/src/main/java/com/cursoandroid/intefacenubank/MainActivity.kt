package com.cursoandroid.intefacenubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cursoandroid.intefacenubank.adapter.AdapterPagamento
import com.cursoandroid.intefacenubank.adapter.AdapterProduto
import com.cursoandroid.intefacenubank.databinding.ActivityMainBinding
import com.cursoandroid.intefacenubank.model.Pagamento
import com.cursoandroid.intefacenubank.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar!!.hide()

        val recycleIconesPagamento = binding.recycleIconesPagamento
        recycleIconesPagamento.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycleIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recycleIconesPagamento.adapter = adapterPagamento
        listaIconesPagamento()

        val  recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextoInformativo()


    }

    private fun listaIconesPagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix, "Area Pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar \n Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icone4)

        val icone5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_recarga_celular, "Recarga de calular")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.doacao, "Doacao")
        listaPagamento.add(icone8)
    }

    private fun listaTextoInformativo(){

        val textoInfomativo1 = Produto("Participe da promocao Tudo no Roxinho e concorra a...")
        listaProduto.add(textoInfomativo1)

        val textoInfomativo2 = Produto("Chegou o debito automatico da fatura do cartao...")
        listaProduto.add(textoInfomativo2)

        val textoInfomativo3 = Produto("Conheca a conta PJ: Pratica livre de burocracia para se...")
        listaProduto.add(textoInfomativo3)

        val textoInfomativo4 = Produto("Salve seus amigos da burocracia: faca um convite...")
        listaProduto.add(textoInfomativo4)


    }

}