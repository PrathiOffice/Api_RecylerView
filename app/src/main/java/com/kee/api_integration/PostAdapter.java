package com.kee.api_integration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {


    private List<Model> postList;

    public PostAdapter(List<Model> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {

        View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.list_item, parent,false );
        return new ViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder , int position) {

        holder.tvtitle.setText ( postList.get ( position).getName () );
        holder.tvbody.setText ( postList.get ( position ) .getBody ());

    }

    @Override
    public int getItemCount() {
        return postList.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvtitle,tvbody;
        public ViewHolder(@NonNull View itemView) {
            super ( itemView );

            tvtitle = itemView.findViewById ( R.id.title );
            tvbody = itemView.findViewById ( R.id.body );
        }
    }
}
