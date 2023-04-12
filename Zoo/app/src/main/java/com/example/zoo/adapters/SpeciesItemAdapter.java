package com.example.zoo.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoo.ItemClickListener;
import com.example.zoo.R;
import com.example.zoo.models.Africa;
import com.example.zoo.models.America;
import com.example.zoo.models.Asia;
import com.example.zoo.models.Australia;
import com.example.zoo.models.Continent;
import com.example.zoo.models.Type;
import com.example.zoo.models.Zoo;

import java.util.List;

public class SpeciesItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Zoo>species;
    private final ItemClickListener itemClickListener;
    public SpeciesItemAdapter(List<Zoo>species,ItemClickListener itemClickListener)
    {
        this.species=species;
        this.itemClickListener=itemClickListener;
    }

    @Override
    public int getItemViewType(int position){
        return species.get(position).getType().getKey();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if( viewType== Type.EUROPE.getKey())
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent,false);
            EuropeViewHolder viewHolder=new EuropeViewHolder(view,itemClickListener);
            Log.e("Adapter","onCreateViewHolder");
            return viewHolder;
        }
        else if( viewType== Type.ASIA.getKey())
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.asia,parent,false);
            AsiaViewHolder viewHolder=new AsiaViewHolder(view,itemClickListener);
            Log.e("Adapter","onCreateViewHolder");
            return viewHolder;
        }
        else if( viewType== Type.AUSTRALIA.getKey())
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.australia,parent,false);
            AustraliaViewHolder viewHolder=new AustraliaViewHolder(view,itemClickListener);
            Log.e("Adapter","onCreateViewHolder");
            return viewHolder;
        }
        else   if( viewType== Type.AFRICA.getKey())
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.africa,parent,false);
            AfricaViewHolder viewHolder=new AfricaViewHolder(view,itemClickListener);
            Log.e("Adapter","onCreateViewHolder");
            return viewHolder;
        }
        else   if( viewType== Type.AMERICA.getKey())
        {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.america,parent,false);
            AmericaViewHolder viewHolder=new AmericaViewHolder(view,itemClickListener);
            Log.e("Adapter","onCreateViewHolder");
            return viewHolder;
        }
        return null;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       if(holder instanceof EuropeViewHolder)
       {
           Continent continent=(Continent) species.get(position);
           ((EuropeViewHolder)holder).bind(continent);
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(itemClickListener!=null)
                   {
                       itemClickListener.onItemClick(v,position);
                   }
               }
           });
       }
       else if(holder instanceof AsiaViewHolder)
       {
           Asia spec=(Asia) species.get(position);
           ((AsiaViewHolder)holder).bind(spec);
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(itemClickListener!=null)
                   {
                       itemClickListener.onItemClick(v,position);
                   }
               }
           });
       }
       else if(holder instanceof AfricaViewHolder)
       {
           Africa spec=(Africa) species.get(position);
           ((AfricaViewHolder)holder).bind(spec);
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(itemClickListener!=null)
                   {
                       itemClickListener.onItemClick(v,position);
                   }
               }
           });
       }
       else if(holder instanceof AmericaViewHolder)
       {
           America spec=(America) species.get(position);
           ((AmericaViewHolder)holder).bind(spec);
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(itemClickListener!=null)
                   {
                       itemClickListener.onItemClick(v,position);
                   }
               }
           });
       }
       else if(holder instanceof AustraliaViewHolder)
       {
           Australia spec=(Australia) species.get(position);
           ((AustraliaViewHolder)holder).bind(spec);
           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(itemClickListener!=null)
                   {
                       itemClickListener.onItemClick(v,position);
                   }
               }
           });
       }
    }

    @Override
    public int getItemCount() {
        return species.size();
    }


    class EuropeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

        TextView continentTextView;
        TextView animalTextView;

        public EuropeViewHolder(@NonNull View itemView,ItemClickListener listener) {
            super(itemView);

            continentTextView= itemView.findViewById(R.id.europa);
            animalTextView=itemView.findViewById(R.id.europeanAnimal);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemClickListener!=null)
                    {
                         int pos=getAdapterPosition();
                         if(pos!=RecyclerView.NO_POSITION)
                         {
                             itemClickListener.onItemClick(v,pos);
                         }
                    }
                }
            });

        }

        public void bind(Continent continentModel) {
            continentTextView.setText(continentModel.getTitle());
            animalTextView.setText(continentModel.getAnimal());
        }
        @Override
        public void onClick(View view)
        {
            if(itemClickListener!=null)
            {
                itemClickListener.onItemClick(view,getAdapterPosition());
            }
        }


    }
    class AsiaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView continentTextView;
TextView animalTextView;
        public AsiaViewHolder(@NonNull View itemView,ItemClickListener listener) {
            super(itemView);

            continentTextView= itemView.findViewById(R.id.asia);
            animalTextView=itemView.findViewById(R.id.asianAnimal);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemClickListener!=null)
                    {
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            itemClickListener.onItemClick(v,pos);
                        }
                    }
                }
            });
        }
        @Override
        public void onClick(View view)
        {
            if(itemClickListener!=null)
            {
                itemClickListener.onItemClick(view,getAdapterPosition());
            }
        }

        public void bind(Asia continentModel) {
            continentTextView.setText(continentModel.getTitle());
            animalTextView.setText(continentModel.getAnimal());
        }
    }
    class AfricaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView continentTextView;
TextView animalTextView;
        public AfricaViewHolder(@NonNull View itemView,ItemClickListener listener) {
            super(itemView);

            continentTextView= itemView.findViewById(R.id.africa);
            animalTextView=itemView.findViewById(R.id.africanAnimal);
        }

        public void bind(Africa continentModel) {
            continentTextView.setText(continentModel.getTitle());
            animalTextView.setText(continentModel.getAnimal());
        }
        @Override
        public void onClick(View view)
        {
            if(itemClickListener!=null)
            {
                itemClickListener.onItemClick(view,getAdapterPosition());
            }
        }
    }
    class AmericaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView continentTextView;
        TextView animalTextView;
        public AmericaViewHolder(@NonNull View itemView,ItemClickListener listener) {
            super(itemView);

            continentTextView= itemView.findViewById(R.id.america);
            animalTextView=itemView.findViewById(R.id.americanAnimal);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemClickListener!=null)
                    {
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            itemClickListener.onItemClick(v,pos);
                        }
                    }
                }
            });
        }

        public void bind(America continentModel) {
            continentTextView.setText(continentModel.getTitle());
            animalTextView.setText(continentModel.getAnimal());
        }
        @Override
        public void onClick(View view)
        {
            if(itemClickListener!=null)
            {
                itemClickListener.onItemClick(view,getAdapterPosition());
            }
        }
    }
    class AustraliaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView continentTextView;
        TextView animalTextView;
        public AustraliaViewHolder(@NonNull View itemView,ItemClickListener listener) {
            super(itemView);

            continentTextView= itemView.findViewById(R.id.australia);
            animalTextView=itemView.findViewById((R.id.australianAnimal));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemClickListener!=null)
                    {
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            itemClickListener.onItemClick(v,pos);
                        }
                    }
                }
            });
        }
        @Override
        public void onClick(View view)
        {
            if(itemClickListener!=null)
            {
                itemClickListener.onItemClick(view,getAdapterPosition());
            }
        }

        public void bind(Australia continentModel) {
            continentTextView.setText(continentModel.getTitle());
            animalTextView.setText(continentModel.getAnimal());
        }
    }

}
