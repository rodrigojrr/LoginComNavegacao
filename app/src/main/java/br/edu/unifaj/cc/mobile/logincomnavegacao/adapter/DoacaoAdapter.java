package br.edu.unifaj.cc.mobile.logincomnavegacao.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.unifaj.cc.mobile.logincomnavegacao.R;
import br.edu.unifaj.cc.mobile.logincomnavegacao.model.Doacao;

/**
 * Adapter para o RecyclerView que exibe a lista de doações.
 * Responsável por criar e популировать cada item da lista.
 */
public class DoacaoAdapter extends RecyclerView.Adapter<DoacaoAdapter.DoacaoViewHolder> {
    
    private List<Doacao> listaDoacoes;
    
    /**
     * Construtor que recebe a lista de doações.
     */
    public DoacaoAdapter(List<Doacao> listaDoacoes) {
        this.listaDoacoes = listaDoacoes;
    }
    
    /**
     * Called when RecyclerView needs a new ViewHolder.
     */
    @NonNull
    @Override
    public DoacaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_doacao, parent, false);
        return new DoacaoViewHolder(view);
    }
    
    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    @Override
    public void onBindViewHolder(@NonNull DoacaoViewHolder holder, int position) {
        Doacao doacao = listaDoacoes.get(position);
        holder.txtData.setText("Data: " + doacao.getData());
        holder.txtLocal.setText("Local: " + doacao.getLocal());
        holder.txtQuantidade.setText("Quantidade: " + doacao.getQuantidade());
    }
    
    /**
     * Returns the total number of items in the list.
     */
    @Override
    public int getItemCount() {
        return listaDoacoes.size();
    }
    
    /**
     * ViewHolder para os itens da lista de doações.
     */
    static class DoacaoViewHolder extends RecyclerView.ViewHolder {
        
        TextView txtData;
        TextView txtLocal;
        TextView txtQuantidade;
        
        DoacaoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtData = itemView.findViewById(R.id.txtData);
            txtLocal = itemView.findViewById(R.id.txtLocal);
            txtQuantidade = itemView.findViewById(R.id.txtQuantidade);
        }
    }
}