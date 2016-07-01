package es.co.rys.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/**
 * Created by HP1 on 29/06/2016.
 */
public class Seleccionando extends LinearLayout implements Checkable {


    //creo un widget
    private boolean mSeleccionado=false;

    private final int[] CHECKED_STATE_SET = {
            android.R.attr.state_checked
    };

    public Seleccionando(Context context) {
        super(context);
    }

    public Seleccionando(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void setChecked(boolean seleccion) {
        mSeleccionado = seleccion;
        refreshDrawableState();
        invalidate();
    }

    @Override
    public boolean isChecked() {
        return mSeleccionado;
    }

        @Override
    public void toggle() {
        setChecked(!mSeleccionado);
    }

    @Override
    public int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            mergeDrawableStates(drawableState, CHECKED_STATE_SET);
        }
        return drawableState;
    }
}

