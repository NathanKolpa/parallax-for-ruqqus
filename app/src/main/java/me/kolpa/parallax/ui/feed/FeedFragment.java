package me.kolpa.parallax.ui.feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import me.kolpa.parallax.R;
import me.kolpa.parallax.di.MyApplication;

public class FeedFragment extends Fragment
{
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		((MyApplication) getActivity().getApplicationContext()).appComponent.inject(this);
		View inflate = inflater.inflate(R.layout.fragment_feed, container, false);


		return inflate;
	}
}
