package ru.znay.znay;

import com.badlogic.gdx.utils.Disposable;

import java.util.ArrayList;
import java.util.List;

public class Reg {
    private List<Disposable> disposables = new ArrayList<Disposable>();
    public static Reg i = new Reg();

    public <T extends Disposable> T add(T t) {
        disposables.add(t);
        return t;
    }

    public void dispose() {
        for (Disposable d : disposables) {
            d.dispose();
        }
    }
}
