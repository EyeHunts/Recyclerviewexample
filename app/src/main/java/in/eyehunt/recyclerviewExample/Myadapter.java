package in.eyehunt.recyclerviewExample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    private List<Users> mDataList;

    public Myadapter(List<Users> listOfusers) {
        mDataList = listOfusers;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_user, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_login.setText(mDataList.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_login;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_login = (TextView)itemView.findViewById(R.id.tv_login);
        }
    }
}
