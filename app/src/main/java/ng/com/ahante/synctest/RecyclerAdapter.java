package ng.com.ahante.synctest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<Contact> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(arrayList.get(position).getName());
        int Sync_Status = arrayList.get(position).getSync_status();
        if(Sync_Status == DbContract.SYNC_STATUS_OK){
            holder.Sync_Status.setImageResource(R.drawable.ic_ok);
        }else if(Sync_Status == DbContract.SYNC_STATUS_FAILED){
            holder.Sync_Status.setImageResource(R.drawable.ic_sync);
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView Sync_Status;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Sync_Status = itemView.findViewById(R.id.imgSync);
            name = itemView.findViewById(R.id.txtName);
        }
    }
}
