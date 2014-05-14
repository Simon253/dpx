package com.example.carpool;

import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OfferInfoFragment extends ListFragment{
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
				Bundle saveInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_offer_info, container,false);
		
		return rootView;
	}
	
	
	  @Override
	  public void onActivityCreated(Bundle savedInstanceState) {
	    super.onActivityCreated(savedInstanceState);

	    //load data
	    String[] values = new String[] { "Peter", "James", "Bill",
	        "Jacobo", "Fourth", "Fifth", "Sixth", "Nineth", "Eleventh"};

	    CustomArrayAdapter myCustomArrayAdapter = new CustomArrayAdapter( getActivity(), R.layout.list_row, values) ;
	    
	    setListAdapter(myCustomArrayAdapter);
	  }
}
