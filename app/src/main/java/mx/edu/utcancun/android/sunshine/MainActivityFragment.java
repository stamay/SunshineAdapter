package mx.edu.utcancun.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        String [] datos= {
                "Lunes - Soleado - 2*/18*",
                "Martes - Soleado -25/18*",
                "Miercoles - Soleado -25/18*",
                "Jueves - Soleado -25/18*",
                "Viernes - Soleado -25/18*",
                "Sabado - Soleado -25/18*",
                "Domingo - Soleado -25/18*"
        };

        List<String> lista = new ArrayList<String>(Arrays.asList(datos));
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_texview,
                lista

        );
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);

        return rootView;

        
    }


}
