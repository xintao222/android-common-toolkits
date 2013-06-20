package com.lurencun.android.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author : 桥下一粒砂 chenyoca@gmail.com
 * @date   : 2012-12-3
 * 显示多少个，创建多少个。
 */
public class SimpleAdapter<T> extends AbstractAdapter<T> {

	public SimpleAdapter(LayoutInflater inflater, ViewCreator<T> creator) {
		super(inflater, creator);
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		if(null == convertView){
			convertView=  creator.createView(layoutInflater, pos, dataSetReference.get(pos));
		}
		return convertView;
	}
}
