package com.example.cssyllabus;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class customAdapter extends RecyclerView.Adapter<customAdapter.ViewHolder> {

    private String[] localDataSet;


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final Context context;

        public ViewHolder(View view) {
            super(view);
            context=view.getContext();
            // Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textView);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    /**
     * Initialize the dataset of the Adapter
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView
     */
    public customAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(localDataSet[position]);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final Intent intent;
                if (viewHolder.getAdapterPosition()==0){
                    intent=new Intent(view.getContext(),cActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==1){
                    intent=new Intent(view.getContext(),javaActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==2){
                    intent=new Intent(view.getContext(),pythonActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==3){
                    intent=new Intent(view.getContext(),databaseActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==4){
                    intent=new Intent(view.getContext(),cnActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==5){
                    intent=new Intent(view.getContext(),tocActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==6){
                    intent=new Intent(view.getContext(),sopActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==7){
                    intent=new Intent(view.getContext(),aiActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==8){
                    intent=new Intent(view.getContext(),microActivity.class);
                }
                else if(viewHolder.getAdapterPosition()==9){
                    intent=new Intent(view.getContext(),osActivity.class);
                }
                else{
                    intent=new Intent(view.getContext(),csaActivity.class);
                }
                view.getContext().startActivity(intent);
            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}

