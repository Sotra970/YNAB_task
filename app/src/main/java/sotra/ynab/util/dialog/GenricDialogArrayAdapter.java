package sotra.ynab.util.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import sotra.ynab.R;

public abstract class GenricDialogArrayAdapter<T> extends RecyclerView.Adapter<GenricDialogArrayAdapter.ViewHolder>{

  // Vars
  private LayoutInflater mInflater;
  List<T> list ;
  public GenricDialogArrayAdapter(Context context, List<T> objects) {
    init(context);
    list = objects ;
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

  // Headers
  public abstract void drawText(TextView textView, T object);

  private void init(Context context) {
    this.mInflater = LayoutInflater.from(context);
  }
  GenericDialogFragment.GenricDialogFragmentClickListener genricDialogArrayAdapterClickListenr ;

  public void setGenricDialogArrayAdapterClickListenr(GenericDialogFragment.GenricDialogFragmentClickListener genricDialogArrayAdapterClickListenr) {
    this.genricDialogArrayAdapterClickListenr = genricDialogArrayAdapterClickListenr;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final ViewHolder vh;
    View convertView = mInflater.inflate(R.layout.simple_spinner_item, parent, false);
    vh = new ViewHolder(convertView);
    return vh;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, final  int position) {
    drawText(holder.textView, list.get(position));
    if (genricDialogArrayAdapterClickListenr != null)
      holder.itemView.setOnClickListener(v -> genricDialogArrayAdapterClickListenr.onGenericDialogItemClicked(list.get(position)));
  }





  static class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    View delete ;

    private ViewHolder(View rootView) {
      super(rootView);
      textView = (TextView) rootView.findViewById(R.id.row_text);
    }


  }



}