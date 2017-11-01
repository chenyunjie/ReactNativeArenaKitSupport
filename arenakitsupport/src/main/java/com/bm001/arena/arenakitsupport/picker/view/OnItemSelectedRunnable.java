package com.bm001.arena.arenakitsupport.picker.view;

final class OnItemSelectedRunnable implements Runnable {

    final LoopView loopView;

    OnItemSelectedRunnable(LoopView loopview) {
        loopView = loopview;
    }

    @Override
    public final void run() {
        loopView.onItemSelectedListener.onItemSelected(loopView.getSelectedItem(),loopView.getSelectedIndex());
    }
}
