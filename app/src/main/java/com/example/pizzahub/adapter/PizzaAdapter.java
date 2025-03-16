package com.example.pizzahub.adapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import com.example.pizzahub.classes.Produit;
import com.example.pizzahub.R;
public class PizzaAdapter extends BaseAdapter{
    List<Produit> produits;
    LayoutInflater inflater;
    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public int getCount() {
        return produits.size();
    }
    public Object getItem(int position) {
        return produits.get(position);
    }
    public long getItemId(int position) {
        return produits.get(position).getId();
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.view, null);
        }
        ImageView img = convertView.findViewById(R.id.imgPrinp);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView time = convertView.findViewById(R.id.time);
        TextView nbrIngr = convertView.findViewById(R.id.nbrIngr);

        img.setImageResource(produits.get(position).getPhoto());
        nom.setText(produits.get(position).getNom());
        time.setText(produits.get(position).getDuree()+" min");
        nbrIngr.setText(produits.get(position).getNb_ingredients()+" Ingrédients");

        return convertView;
    }

}
