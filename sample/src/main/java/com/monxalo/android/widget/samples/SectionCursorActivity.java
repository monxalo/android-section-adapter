package com.monxalo.android.widget.samples;

import android.app.ListActivity;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SectionCursorActivity extends ListActivity {
	private static final int PLATFORM = 1;
	private static final int NAME = 2;
	
	private MatrixCursor mCursor;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestCursor();
		
		setListAdapter(new ItemSectionAdapter(this, mCursor));
    }
    
    private void requestCursor() {
		mCursor = new MatrixCursor(new String[] { "_id", "Section", "Name" });
		
		mCursor.addRow(new String []{ "3","Section 1", "Item 1" });
		mCursor.addRow(new String []{ "2", "Section 1", "Item 2" });
		mCursor.addRow(new String []{ "4","Section 2", "Item 3" });
		mCursor.addRow(new String []{ "5","Section 2", "Item 4" });
		mCursor.addRow(new String []{ "6","Section 2", "Item 5" });
		mCursor.addRow(new String []{ "7","Section 2", "Item 6" });
		mCursor.addRow(new String []{ "8","Section 2", "Item 7" });
		mCursor.addRow(new String []{ "9","Section 3", "Item 8" });
		mCursor.addRow(new String []{ "9","Section 3", "Item 9" });
		mCursor.addRow(new String []{ "9","Section 3", "Item 10" });
		mCursor.addRow(new String []{ "9","Section 3", "Item 11" });
		mCursor.addRow(new String []{ "9","Section 4", "Item 12" });
		mCursor.addRow(new String []{ "9","Section 4", "Item 13" });
		mCursor.addRow(new String []{ "9","Section 5", "Item 14" });
		mCursor.addRow(new String []{ "9","Section 5", "Item 15" });
		mCursor.addRow(new String []{ "9","Section 5", "Item 16" });
	}
    
    @Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Cursor c = (Cursor) getListAdapter().getItem(position);
		
		Toast.makeText(this, c.getString(NAME), Toast.LENGTH_SHORT).show();
    }		
    
    private class ItemSectionAdapter extends SectionCursorAdapter {

		public ItemSectionAdapter(Context context, Cursor c) {
			super(context, c, android.R.layout.preference_category, PLATFORM);
		}

		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			TextView text = (TextView) view;
			
			text.setText(cursor.getString(NAME));
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return getLayoutInflater().inflate(android.R.layout.simple_list_item_1, null);
		}
	}
}