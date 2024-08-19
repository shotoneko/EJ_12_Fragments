package modulo_04.ej_12_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import modulo_04.ej_12_fragments.databinding.FragmentQuestionBinding;


public class QuestionFragment extends Fragment {
    private FragmentQuestionBinding mBinding;
    public static final int YES = 0;
    public static final int NO = 1;

    public QuestionFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentQuestionBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }


    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(   view, savedInstanceState);
        mBinding.radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                int index = mBinding.radiogroup.indexOfChild(mBinding.radiogroup.findViewById(i));
                switch (index) {

                    case 0:
                        mBinding.TextviewRes.setText(R.string.no_message);
                        break;

                    case 1:
                        mBinding.TextviewRes.setText(R.string.yes_message);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
