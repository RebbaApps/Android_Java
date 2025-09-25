package com.dailytaskjava.day3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dailytaskjava.Day3Activity;
import com.dailytaskjava.databinding.Day3ItemCardBinding;

import java.util.ArrayList;

public class Day3Adapter extends RecyclerView.Adapter<Day3Adapter.ViewHolder> {


    ArrayList<UserDay3> userList = new ArrayList<>();
    Context context;
    OnUserClickListener listener ;

    public Day3Adapter(Day3Activity day3Activity, ArrayList<UserDay3> userDay3s,OnUserClickListener listener) {
        this.userList = userDay3s;
        this.context = day3Activity;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Day3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        Day3ItemCardBinding binding = Day3ItemCardBinding.inflate(layoutInflater,parent,false);
        //View view  = layoutInflater.inflate(R.layout.day3_item_card,parent,false);
        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Day3Adapter.ViewHolder holder, int position) {
        holder.binding.tvNameDay3.setText(userList.get(position).getName());
        holder.binding.tvAgeDay3.setText(userList.get(position).getAge());
        holder.binding.tvPhoneDay3.setText(userList.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        if (userList != null) {
            return userList.size();
        }
        return 0;
    }

    public interface OnUserClickListener{
        void onUserClick(UserDay3 userDay3);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        Day3ItemCardBinding binding;

        public ViewHolder(Day3ItemCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            //adding click listener
            binding.getRoot().setOnClickListener(v -> {
                int position = getAdapterPosition();

                if(position != RecyclerView.NO_POSITION)
                {
                   UserDay3 userDay3 = userList.get(position);
                    /*Toast.makeText(context, "Name : "+userDay3.getName()
                            +"\nPhone : "+userDay3.getPhone(), Toast.LENGTH_SHORT).show();*/
                    listener.onUserClick(userDay3);
                }
            });
        }
    }
}
