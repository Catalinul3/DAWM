package com.example.zoo.fragments;

import static androidx.navigation.Navigation.findNavController;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zoo.ItemClickListener;
import com.example.zoo.MainActivity;
import com.example.zoo.MainActivityJava;
import com.example.zoo.R;
import com.example.zoo.models.Africa;
import com.example.zoo.models.America;
import com.example.zoo.models.Asia;
import com.example.zoo.models.Australia;
import com.example.zoo.models.Continent;
import com.example.zoo.models.Type;
import com.example.zoo.models.Zoo;

import java.util.ArrayList;
import java.util.List;

import com.example.zoo.adapters.SpeciesItemAdapter;

public class FirstFragment extends Fragment implements ItemClickListener {

 private List<Zoo>species;
 @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.animals_and_continents, container, false);
  SpeciesItemAdapter adapter=new SpeciesItemAdapter(species,this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
       super.onViewCreated(view,savedInstanceState);
        RecyclerView recyclerView=view.findViewById(R.id.animals);
        species=new ArrayList<>();
        species.add(new Continent("Europe","Brown Bear"));
        species.add(new Asia("Asia","Asian Elephant"));
        species.add(new Africa("Africa","Aardvark"));
        species.add(new America("North-America","Grizzly Bear"));
        species.add(new Australia("Australia","Kangoroo"));
        species.add(new Continent("Europe","Gray Wolf"));
        species.add(new Asia("Asia","Gaur"));
        species.add(new Africa("Africa","African Buffalo"));
        species.add(new America("North-America","American Alligator"));
        species.add(new Australia("Australia","Crocodiles"));
        species.add(new Continent("Europe","European Bison"));
        species.add(new Asia("Asia","Giant Panda"));
        species.add(new Africa("Africa","Lion"));
        species.add(new America("North-America","Bufallo"));
        species.add(new Australia("Australia","Goanna"));
        species.add(new Continent("Europe","European Lynx"));
        species.add(new Asia("Asia","Indian Cobra"));
        species.add(new Africa("Africa","Antelope"));
        species.add(new America("North-America","Bald Eagle"));
        species.add(new Australia("Australia","Great White Shark"));
        species.add(new Continent("Europe","Red Deer"));
        species.add(new Asia("Asia","Komodo Dragon"));
        species.add(new Africa("Africa","Elephant"));
        species.add(new America("North-America","Coyote"));
        species.add(new Australia("Australia","Koala"));
        species.add(new Continent("Europe","Red Fox"));
        species.add(new Asia("Asia","Orangutans"));
        species.add(new Africa("Africa","Cheetah"));
        species.add(new America("South-America","Anaconda"));
        species.add(new Australia("Australia","Platypus"));
        species.add(new Continent("Europe","Golden Eagle"));
        species.add(new Asia("Asia","Saltwater Crocodile"));
        species.add(new Africa("Africa","Crocodile"));
        species.add(new America("South-America","Boa Constrictor"));
        species.add(new Australia("Australia","Possum"));
        species.add(new Continent("Europe","Eurasian Beaver"));
        species.add(new Asia("Asia","Yak"));
        species.add(new Africa("Africa","Giraffe"));
        species.add(new America("South-America","Capybara"));
        species.add(new Australia("Australia","Redback Spider"));
        species.add(new Continent("Europe","Alpine Ibex"));
        species.add(new Asia("Asia","Snow Leopard"));
        species.add(new Africa("Africa","Gorilla"));
        species.add(new America("South-America","Iguana"));
        species.add(new Australia("Australia","Tasmanian Devil"));
        species.add(new Continent("Europe","Eurasian Eagle-Owl"));
        species.add(new Asia("Asia","Sambar"));
        species.add(new Africa("Africa","Leopard"));
        species.add(new America(" South-America","Jaguar"));
        species.add(new Australia("Australia","Wombat"));
        species.add(new Continent("Europe","Red Squirrel"));
        SpeciesItemAdapter adapter=new SpeciesItemAdapter(species,this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);




    }


 @Override
 public void onItemClick(View view,int position) {
  Zoo zoo;
int val=species.get(position).getType().getKey();
if(val==Type.EUROPE.getKey())
{
 Continent continent= (Continent) species.get(position);
 String animal=continent.getAnimal();
 String cont=continent.getTitle();
 String color="#FF49B675";
 Bundle bundle= new Bundle();
 bundle.putString("Color",color);
 bundle.putString("continent",cont);
 bundle.putString("animal",animal);

 findNavController(view).navigate(R.id.action_animals_and_continents_to_secondFragment, bundle);


}
  if(val==Type.ASIA.getKey())
  {
   Asia continent= (Asia) species.get(position);
   String animal=continent.getAnimal();
   String cont=continent.getTitle();
   String color="#FFCC0000";
   Bundle bundle= new Bundle();
   bundle.putString("Color",color);
   bundle.putString("continent",cont);
   bundle.putString("animal",animal);

   findNavController(view).navigate(R.id.action_animals_and_continents_to_secondFragment, bundle);


  }
  if(val==Type.AMERICA.getKey())
  {
   America continent= (America) species.get(position);
   String animal=continent.getAnimal();
   String cont=continent.getTitle();
   String color="#FF0E4BEF";
   Bundle bundle= new Bundle();
   bundle.putString("Color",color);
   bundle.putString("continent",cont);
   bundle.putString("animal",animal);
   findNavController(view).navigate(R.id.action_animals_and_continents_to_secondFragment, bundle);


  }
  if(val==Type.AFRICA.getKey())
  {
   Africa continent= (Africa) species.get(position);
   String animal=continent.getAnimal();
   String cont=continent.getTitle();
   String color="#FFFCE903";
   Bundle bundle= new Bundle();
   bundle.putString("Color",color);
   bundle.putString("continent",cont);
   bundle.putString("animal",animal);
   findNavController(view).navigate(R.id.action_animals_and_continents_to_secondFragment, bundle);


  }
  if(val==Type.AUSTRALIA.getKey())
  {
   Australia continent= (Australia) species.get(position);
   String animal=continent.getAnimal();
   String cont=continent.getTitle();
   String color="#FFFF7B00";
   Bundle bundle= new Bundle();
   bundle.putString("Color",color);
   bundle.putString("continent",cont);
   bundle.putString("animal",animal);
   findNavController(view).navigate(R.id.action_animals_and_continents_to_secondFragment, bundle);


  }


 }
}
