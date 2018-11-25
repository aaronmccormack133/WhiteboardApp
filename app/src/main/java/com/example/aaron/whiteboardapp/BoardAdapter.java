package com.example.aaron.whiteboardapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.MyViewHolder> {
    private Context mContext;
    private List<board> boardList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public TextView info;
        public ImageView preview;

        public MyViewHolder(View v){
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            info = (TextView) v.findViewById(R.id.info);
            preview = (ImageView) v.findViewById(R.id.thumbnail);
        }
    }

    public BoardAdapter(Context mContext, List<board> boardList){
        this.mContext = mContext;
        this.boardList = boardList;
    }

    @NonNull
    @Override
    public BoardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.whiteboard_card, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BoardAdapter.MyViewHolder myViewHolder, int i) {
        board board1 = boardList.get(i);
        myViewHolder.title.setText(board1.getBoardName());
        myViewHolder.info.setText(board1.getBoardInfo());

        Glide.with(mContext).load(board1.getPreview()).into(myViewHolder.preview);
    }

    @Override
    public int getItemCount() {
        return boardList.size();
    }
}
