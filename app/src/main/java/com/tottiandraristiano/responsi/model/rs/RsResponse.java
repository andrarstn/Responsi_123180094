package com.tottiandraristiano.responsi.model.rs;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RsResponse {

	@SerializedName("status_code")
	private int statusCode;

	@SerializedName("data")
	private ArrayList<RsDataItem> data;

	public int getStatusCode(){
		return statusCode;
	}

	public ArrayList<RsDataItem> getData(){
		return data;
	}
}