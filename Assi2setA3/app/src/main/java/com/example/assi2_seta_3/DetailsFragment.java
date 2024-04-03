package com.example.assi2_seta_3;

import android.app.Fragment;

public class DetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        TextView detailsTextView = view.findViewById(R.id.detailsTextView);
        String selectedItem = getArguments().getString("selectedItem");
        if (selectedItem != null) {
            detailsTextView.setText(selectedItem);
        }
        return view;
    }
}
