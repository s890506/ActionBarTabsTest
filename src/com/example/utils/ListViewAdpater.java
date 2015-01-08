package com.example.utils;


import java.util.List;

import com.example.tabsDemo.R;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdpater extends BaseAdapter {
	Context context;
	List<NewItem> items;

	/**
	 * Constructor of ListViewAdpater
	 * 
	 * @param context
	 * @param items
	 */
	public ListViewAdpater(Context context, List<NewItem> items) {
		this.context = context;
		this.items = items;
	}

	/**
	 * hold views for costomized listview
	 * 
	 * @author cho-hanwu
	 * 
	 */
	private class ViewHolder {
		TextView txtMemo;
		TextView txtTime;
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.fragment0_listitem, null);
			holder = new ViewHolder();
			holder.txtMemo = (TextView) convertView.findViewById(R.id.Memo);
			holder.txtTime = (TextView) convertView.findViewById(R.id.Time);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		NewItem items = (NewItem) getItem(position);
		
		holder.txtMemo.setText(items.getMemo());
		holder.txtTime.setText(items.getTime());
		
		return convertView;
	}

}

